package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor compressor = new JarCompressor();
        String[] jar = compressor.compressFiles("Hi Nanna", "Yevru");

        System.out.print("Jar files : ");
        for (String j : jar) {
            System.out.print(j);
        }

        System.out.println();

        compressor = new ZipCompressor();
        String[] zip = compressor.compressFiles("Daddy", "Veedu");
        System.out.print("Zip files : ");
        for (String j : zip){
            System.out.print(j);
        }

    }
}
