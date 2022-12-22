package com.example.task0_delegation;

public class Percent {
    double countPR(double sum, double pr) {
        double finalpr;
        finalpr = (sum / 100) * pr;
        return finalpr;
    }
    double countSum(double sum, double pr){
        double finalsum;
        finalsum = sum + pr;
        return finalsum;
    }
    int countSumTrunc(double sum){
        int finalsum;
        finalsum = (int) sum;
        return finalsum;
    }
    int fincount(double sum, double pr) {
        int finsum = 0;
        Percent count1 = new Percent();
        pr = count1.countPR(sum,pr);
        sum = count1.countSum(sum, pr);
        finsum = count1.countSumTrunc(sum);
        return finsum;
    }
}
