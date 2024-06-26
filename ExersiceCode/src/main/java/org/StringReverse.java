package org;

public class StringReverse {
    public static void main(String[] args) {
        String str = "This a String reverse excersice";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());

    }
}
