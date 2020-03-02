/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author Admin
 */
public class StringFormat {

    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        int tong = x + y;
        int tich = x * y;
        int hieu = x - y;
        double thuong = (double) y / x;
        System.out.println("++ tong cua " + x + " va " + " y " + y + " la : " + tong);
        System.out.println("++ hieu cua " + x + " va " + " y " + y + " la : " + hieu);
        System.out.println("++ tich cua " + x + " va " + " y " + y + " la : " + tich);
        System.out.println("++ thuong cua " + x + " va " + " y " + y + " la : " + thuong);
    }
}
