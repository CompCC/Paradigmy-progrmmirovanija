package Homework4;

public class EnumArr {

    public static double[] averValXY(double[][] data) {
        double tempX = 0;
        double tempY = 0;
        double[] tempArr = new double[2];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (j == 0) {
                    tempX += data[i][j];
                } else {
                    tempY += data[i][j];
                }
            }
        }
        tempArr[0] = tempX / data.length;
        tempArr[1] = tempY / data.length;
        return tempArr;
    }

    public static double sumAll(double[][] data, double[] averValXY) {
        double xMean = averValXY[0];
        double yMean = averValXY[1];
        double temp = 0;
        double[] sum = new double[]{0, 0, 0};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (j == 0) {
                    sum[1] += (data[i][j] - xMean) * (data[i][j] - xMean);
                    temp = data[i][j] - xMean;
                } else {
                    sum[0] += temp * (data[i][j] - yMean);
                    sum[2] += (data[i][j] - yMean) * (data[i][j] - yMean);
                }
            }
        }
        return sum[0] / Math.sqrt(sum[1] * sum[2]);
    }

}
