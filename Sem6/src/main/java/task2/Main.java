package task2;

public class Main {
    public static void main(String[] args) {
        int[] referense = new int[]{1, 2, 3, 4, 5, 6};
        int[] madgic = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(mse(referense, madgic));

    }

    public static double mse(int[] referense, int[] madgic) {
        double sumSquare = 0;
        for (int i = 0; i < referense.length; i++) {
            sumSquare = Math.pow((referense[i] - madgic[i]), 2);
        }
        return sumSquare / referense.length;
    }
}
