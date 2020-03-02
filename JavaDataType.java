/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.javacore18.main;

/**
 *
 * @author Admin
 */
public class JavaDataType {

    //kieu du lieu java
    public static void main(String[] args) {
        //kieu so : 
        //so nguyen:
        int x = 10; // kieu du lieu , ten bien , = gia tri
        int y = 22;
        int tong = x + y;
        int tich = x * y;
        double thuong = y / (double) x;
        int phanDu = y % x;
        long k = 1000000000l;
        long tongLong = k + x;
        System.out.println("tongLong = " + tongLong);
        System.out.println("Tong = " + tong + "\ntich = " + tich + "\nthuong = " + thuong + "\nphan du = " + phanDu);
        byte b = 127;
        double d = 56666.444;//8byte
        float f = 555.555f;//4byte
        double epKieu = 566 / (double) 100;
        System.out.println(epKieu);
        // ky tu :
        char e = 'E';

        int keyCodeAsciiOfE = (int) e;
        char n = (char) 78;
        System.out.println(n);
        System.out.println(keyCodeAsciiOfE);
        //kieu boolean true false
        boolean check = true;
        check = false;
        //String
        String chuoi= "Hello java";
        String chuoi2=chuoi+" .easy! "+tong;
        System.out.println(chuoi2);
    }
}
