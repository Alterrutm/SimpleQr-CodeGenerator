package org.example;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class QRGenerator{
    public static void generator(String data, String path, String format, int width, int height) throws WriterException, IOException {
        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, width, height); //BarcodeFormat. - qr-code format
        MatrixToImageWriter.writeToPath(matrix, format, Paths.get(path));
    }
}
