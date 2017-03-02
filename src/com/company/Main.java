package com.company;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        double t1 = .5;
        double t2 = .75;
        double std1 = Math.sqrt(t1 * (1 - t1)), std2 = Math.sqrt(t2 * (1 - t2));
        double z = (t1 - t2) / (Math.sqrt(Math.exp(std1) + Math.sqrt(Math.exp(std2))));
        System.out.println(CDF_Normal.normp(z));
    }

}
