import java.util.ArrayList;

public class Checking {
    private ArrayList<Iris> listTest;
    private Perceptron perceptron;

    public Checking(ArrayList<Iris> listTest, Perceptron perceptron) {
        this.listTest = listTest;
        this.perceptron = perceptron;
    }

    public double checkAll() {
        int iloscPrawidlowych = 0;
        int iloscNieprawislowcyh = 0;
        double accuracy;

        for(Iris i : listTest) {
            int result = chechOne(i);
            if(result == i.oczekiwanaWart()) {
                iloscPrawidlowych++;
            } else {
                iloscNieprawislowcyh++;
            }
        }
        accuracy = iloscPrawidlowych / (double)(iloscNieprawislowcyh + iloscPrawidlowych);
        return accuracy;
    }

    public int chechOne(Iris i) {
        int result = perceptron.getyResult(i.getArgumenty());
        String gatunek = i.obliczonyGatunek(result);
        System.out.println(i + " " + gatunek);
        return result;
    }


}
