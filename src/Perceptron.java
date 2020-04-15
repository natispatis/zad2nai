import java.util.ArrayList;

public class Perceptron {

        ArrayList<Double> weights = new ArrayList<>();
        double t;
        double alpha;

        public Perceptron(int size, double alpha) {
            for (int i = 1; i <= size; i++) {
                double w;
                w = (double) Math.random()*10 - 5;
                weights.add(w);
                System.out.println("w : " + w);
            }

            t = (double) Math.random()*10 - 5;
            this.alpha = alpha;
            System.out.println("weights : " + weights);
        }

        public int getyResult(ArrayList<Double> vector) {
            int yResult =0;
            double net =0;

            for (int i = 0; i < weights.size(); i++){
                net+= weights.get(i) * vector.get(i);
            }

            if(net >= t) {
                yResult= 1;
            }
            else if(net < t) {
                yResult= 0;
            }

            return yResult;
        }


        public void teachPerceptron(ArrayList<Double> vector, int zwracana_wart, int oczekiwana_wart){
            double number = (oczekiwana_wart - zwracana_wart)* alpha;
            vector.add((double)-1);
            weights.add(t);

            ArrayList<Double> newWeights = new ArrayList<>();
            for (int i =0; i< vector.size(); i++) {
                double weightChange = number * vector.get(i);
                double newWeight = weights.get(i) + weightChange;
                newWeights.add(newWeight);
            }
            //weights.clear();
            weights = newWeights;
            //t = weights.get(weights.size()-1)*vector.get(vector.size()-1);
        }

        public String toString() {
            return "Perceptron: " + weights + " t: " + t;
        }
    }