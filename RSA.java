package com.company;

import java.math.BigInteger;

public class RSA {

    private int e = 5;

    private int n = 91;

    private int d = 29;

    private int k = 22;

    public void execute() {
        System.out.println("e = " + e);
        System.out.println("n = " + n);
        System.out.println("d = " + d);
        System.out.println("k = " + k);
        BigInteger r = BigInteger.valueOf(k).pow(e).mod(BigInteger.valueOf(n));
        System.out.println("B send to А -> r = " + r.intValue());
        BigInteger k1 = r.pow(d).mod(BigInteger.valueOf(n));
        System.out.println("А send k` = " + k1.intValue() + " and sending to B");
        System.out.println("B checking А and result " + (k1.intValue() == k));
        System.out.println("\n");
    }

}
