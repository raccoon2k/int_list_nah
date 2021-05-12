package com.company;

public class Main {

    static Boolean nho_hon_10(int x) {
        return x < 100;
    }
    static Boolean  nho_hon_100(int x){
        return x <100;
    }
}

    public static void main(String[] args) {
        // write your code here
        SoNguyen soNguyen = new SoNguyen(1000);
        soNguyen.add(100);
        soNguyen.add(1);
        soNguyen.remove(Main::nho_hon_10); // xoa het so nho hon 10
        soNguyen.remove(Main::nho_hon_100); //xoa het so nho hon 100
}
