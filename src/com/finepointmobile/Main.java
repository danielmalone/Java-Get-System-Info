package com.finepointmobile;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int processors = Runtime.getRuntime().availableProcessors();
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("Available processors: " + processors);
        System.out.println("Total Memory:: " + totalMemory);
    }
}
