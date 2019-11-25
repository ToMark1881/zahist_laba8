package com.company;

import java.math.BigInteger;

public class Shnor {

    private int g;

    private int x;

    private int p;

    private int q;

    private int y;

    public Shnor() {
        //p = EncryptionHelper.getPrimeNumber(30, 10);
        p = 23;
        q = EncryptionHelper.getQShnor(p).intValue();
        x = EncryptionHelper.getRandomNumber(q - 1, 5);
        g = EncryptionHelper.getGShnor(p, q).intValue();
        y = EncryptionHelper.getYShnor(g, x, p).intValue();
    }

    public void execute() {
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("x = " + x);
        System.out.println("g = " + g);
        System.out.println("y = " + y);
        System.out.println();
        int k = 9;
        int r = BigInteger.valueOf(g).pow(k).mod(BigInteger.valueOf(p)).intValue();
        System.out.println("A send to B -> r = " + r);
        int e = 4;
        System.out.println("B send to A -> e = " + e);
        int s = BigInteger.valueOf(k).add(BigInteger.valueOf(x).multiply(BigInteger.valueOf(e))).mod(BigInteger.valueOf(q)).intValue();
        System.out.println("A send to B -> s = " + s);
        System.out.println("B checking А and result " + (BigInteger.valueOf(g).pow(s).multiply(BigInteger.valueOf(y).pow(e).mod(BigInteger.valueOf(p))).intValue() == r));
        System.out.println("\n");
    }

}
