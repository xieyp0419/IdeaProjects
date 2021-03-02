package io;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @auther xieyp
 * @createTime 2021/2/25 12:41.
 * TODO:
 */
public class InputStreamTest {

    public static void main(String[] args) throws IOException {

//      InputStream is  = new FileInputStream(new File("d:\\test\\1.txt"));
        InputStream is = new FileInputStream("d:\\test\\1.txt");

//        fileInputStreamMethod(is);

        byteArrayInputStreamMethod();
    }

    /**
     * 文件输入流，它通常用于对文件进行读取操作
     * @param inputStream
     * @throws IOException
     */
    public static void fileInputStreamMethod(InputStream inputStream)  throws IOException {

        int i = 0;
        //一次读取一个字节，若读到文件末尾则返回-1
        while ((i = inputStream.read()) != -1) {
            System.out.println((char) i);
        }
        //释放资源
        inputStream.close();
    }

    /**
     * 字节数组输入流在内存中创建一个字节数组缓冲区，从输入流读取的数据保存在该字节数组缓冲区中。
     * @param
     * @throws IOException
     */
    public static void byteArrayInputStreamMethod() throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(12);

        while(byteArrayOutputStream.size() != 10){
            //获取控制台输入
            byteArrayOutputStream.write(System.in.read());
        }

        byte b[] = byteArrayOutputStream.toByteArray();

        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i] + "  ");
        }
        System.out.println("    ");
        int c ;

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        for(int y = 0 ; y < 1; y++ ) {
            while ((c = byteArrayInputStream.read()) != -1) {
                  System.out.println(Character.toUpperCase((char) c));
            }
        }

        byteArrayInputStream.close();
        byteArrayOutputStream.close();
    }
}
