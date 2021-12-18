package com.company;

public class Main {

    void Task_One(){
        int K = 128+256;
        Number[] a;
        Byte[] aByte = new Byte[K];
        Integer[] aInteger = new Integer[K];
        int[] aInt = new int[K];
        String aString;
        StringBuilder aStringBuf = new StringBuilder(K);

        a = getEvenlyDistributedArray(Byte.MIN_VALUE,Byte.MAX_VALUE,K);
        for(int i = 0; i < K; ++i) {
            aByte[i] = a[i].byteValue();//перевод в Byte
            aInteger[i] = aByte[i].intValue(); //перевод в Integer
            aInt[i] = aInteger[i]; //перевод в int
            aStringBuf.append(aInteger[i].toString()).append(" ");
        }
        aString = aStringBuf.toString(); //перевод в String
        System.out.println(aString);
    }

    private Number[] getEvenlyDistributedArray(int minValue, int maxValue, int K){
        Number[] a = new Number[K];
        // максимальное значение, если бы число было не отрицательным
        double maxValidValue = Math.abs(minValue - maxValue) + 1; //учитывая 0
        double stepReal = maxValidValue/K;

        for(int i = 0; i < K; ++i){
            a[i] = minValue + (int) Math.floor(stepReal * (i + 0.5));
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
