package CLASSES;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }
    // public MyPolynomial(String filename){

    // }
    public MyPolynomial(String filename) {
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));  // open file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int degree = in.nextInt();      // read the degree
        coeffs = new double[degree+1];  // allocate the array
        for (int i=0; i<coeffs.length; ++i) {
            coeffs[i] = in.nextDouble();
        }
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) { // Chỉ thêm vào chuỗi khi hệ số khác 0
                if (i == coeffs.length - 1) {
                    // Trường hợp đầu tiên không cần dấu +
                } else {
                    representation.append(" + ");
                }

                if (i > 0 && coeffs[i] != 1) { // Đối với các hệ số không phải là 1 và không phải hằng số
                    representation.append(coeffs[i]).append("x^").append(i);
                } else if (i == 1) { // Trường hợp hệ số của x
                    representation.append(coeffs[i]).append("x");
                } else { // Trường hợp hằng số
                    representation.append(coeffs[i]);
                }
            }
        }
        return representation.toString();
    }
    // public void evaluate(double x){
    // }
    // public double add(){

    // }
    // public double multiply(){

    // }
    


}
