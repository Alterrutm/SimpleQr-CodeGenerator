package org.example;

import com.google.zxing.WriterException;

import java.io.IOException;

public class Main {
    private static String data = "URL";
    private static String path = "Path";
    private static String format = "ImageFormat";
    private static int width = 500;
    private static int height = 500;
    public static void main(String[] args) {
        try {
            QRGenerator.generator(data, path, format, width, height);
        } catch (WriterException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}