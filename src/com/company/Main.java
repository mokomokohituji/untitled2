package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("テスト中");
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += 1;
        }
        System.out.println("変更が反映されていれば成功！");
        System.out.println(sum);

        System.out.println("yobidasi");
        hello("こんにちは");
        hello("こんばんわ");


    }

    private static void hello(String konnitiwa) {
    System.out.println(konnitiwa);
    }
}
