package com.company;

public class YummyFood {
    public static void main(String[] args) {
        System.out.println("YUMMMMMMMMMMY!");
        iceCream();
    }

    public static void chocolate() {
        for (int i=0; i<20; i++) {
            if (i % 2 == 0) {
                System.out.println("\u001B[35m" + "Chocolate");
            } else if (i % 2 != 0) {
                System.out.println("\u001B[32m" + "Chocolate");
            }
        }

    }

    public  static  void iceCream() {
        System.out.println("\u001B[34m" + "Chunky Chocolate Pudding");
        chocolate();
        System.out.println("\u001B[31m" + "that was yummy");
    }
}
