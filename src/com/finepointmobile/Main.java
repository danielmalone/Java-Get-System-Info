package com.finepointmobile;

import java.io.File;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int processors = Runtime.getRuntime().availableProcessors();
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("Available processors: " + processors);
        System.out.println("Total Memory:: " + totalMemory);

        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println("File system root: " + root.getAbsolutePath());
            System.out.println("Total space (bytes): " + root.getTotalSpace());
            System.out.println("Free space (bytes): " + root.getFreeSpace());
            System.out.println("Usable space (bytes): " + NumberFormat.getInstance().format(root.getUsableSpace()));
        }
    }
}
