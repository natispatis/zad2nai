import java.util.ArrayList;

public class Teaching {
    private Perceptron perceptron;
    private ArrayList<Iris> trainList;
    private int iloscEpok;

     public Teaching(Perceptron perceptron, ArrayList<Iris> trainList, int iloscEpok){
         this.perceptron = perceptron;
         this.trainList = trainList;
         this.iloscEpok = iloscEpok;
     }

     public void epoka() {
         for(Iris i : trainList) {
             int y = perceptron.getyResult(i.getArgumenty());
             perceptron.teachPerceptron(i.getArgumenty(), y, i.oczekiwanaWart());
         }
     }

     public void teach() {
         for(int i = 0; i < iloscEpok; i++) {
             epoka();
             System.out.println(perceptron);
         }
     }


}
