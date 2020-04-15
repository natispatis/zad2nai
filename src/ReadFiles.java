import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFiles {
    private ArrayList<Iris> trainList = new ArrayList<>();
    private ArrayList<Iris> testList = new ArrayList<>();

    public void readData() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("train-set.csv"));
            String row;
            while ((row = bf.readLine()) != null) {
                String[] arr = row.split("\\s");
                String slowo = arr[arr.length - 1];
                Iris iris = new Iris();
                for (int i = 0; i < arr.length - 1; i++) {
                    iris.dodajDoListy(Double.parseDouble(arr[i]));
                }
                iris.setGatunekIris(slowo);
                trainList.add(iris);
            }
            bf.close();
            System.out.println(trainList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTest() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("test-set.csv"));
            String row;
            while ((row = bf.readLine()) != null) {
                String[] arr = row.split("\\s");
                String slowo = arr[arr.length - 1];
                Iris iris = new Iris();
                for (int i = 0; i < arr.length - 1; i++) {
                    iris.dodajDoListy(Double.parseDouble(arr[i]));
                }
                iris.setGatunekIris(slowo);
                testList.add(iris);
            }
            bf.close();
            System.out.println(testList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Iris> getTestLista(){
        return testList;
    }


    public int getSize() {
        return trainList.get(0).getArgumenty().size();
    }

    public ArrayList getList() {
        return trainList;
    }
}
