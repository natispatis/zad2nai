import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReadFiles fr = new ReadFiles();
        fr.readData();
        fr.readTest();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your alpha: ");
        double alpha = Double.parseDouble(scanner.next());
        Perceptron p = new Perceptron(fr.getSize(), alpha);
        Teaching t = new Teaching(p, fr.getList(), 40);
        t.teach();
        Checking ch = new Checking(fr.getTestLista(), p);
        double wynik = ch.checkAll();
        System.out.println("Dokladnosc= " + wynik);
        Iris irisKlawiatura = czytanieZKlawiatury();
        ch.chechOne(irisKlawiatura);
    }

    public static Iris czytanieZKlawiatury() {
        System.out.println("Podaj argumenty Iris: ");
        Scanner s = new Scanner(System.in);
        double d1 = s.nextDouble();
        double d2 = s.nextDouble();
        double d3 = s.nextDouble();
        double d4 = s.nextDouble();
        Iris iris = new Iris();
        iris.dodajDoListy(d1);
        iris.dodajDoListy(d2);
        iris.dodajDoListy(d3);
        iris.dodajDoListy(d4);
        return iris;
    }

}

