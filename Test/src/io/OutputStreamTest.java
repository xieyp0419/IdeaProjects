package io;

import java.io.*;

/**
 * @auther xieyp
 * @createTime 2021/2/25 11:50.
 * TODO:
 */
public class OutputStreamTest {

    public static void main(String[] args) throws IOException {

        OutputStream outputStream = new FileOutputStream(new File("d:\\test\\1.txt"));
        outputStream.write(11);
        outputStream.close();
    }
}
