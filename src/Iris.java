import java.util.ArrayList;

public class Iris {
    private ArrayList<Double> argumenty;
    private String gatunekIris;

    public Iris(ArrayList<Double> argumenty, String gatunekIris) {
        this.argumenty = argumenty;
        this.gatunekIris = gatunekIris;
    }

    public Iris() {
        this.argumenty = new ArrayList<>();
    }

    public void setGatunekIris(String gatunekIris) {
        this.gatunekIris = gatunekIris;
    }

    public void dodajDoListy(double liczba) {
        argumenty.add(liczba);
    }

    public ArrayList<Double> getArgumenty() {
        return argumenty;
    }

    public int oczekiwanaWart() {
        if(gatunekIris.equals("Iris-setosa")) {
            return 0;
        } else {
            return 1;
        }
    }

    public String obliczonyGatunek(int result) {
        if (result == 0) {
            return "Iris-setosa";
        } else if (result == 1) {
            return "Iris-versicolor";
        }
        return null;
    }

    public String toString() {
        return "Iris: " + argumenty + " " + gatunekIris;
    }
}