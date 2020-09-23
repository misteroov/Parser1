

import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(int c)throws IOException {
       fileWriter.write(c);
    } public FileConsoleWriter(char[] cbuf, int off, int len)throws IOException {
        fileWriter.write(cbuf, off, len);
    }
    public FileConsoleWriter(char[] cbuf)throws IOException {
        fileWriter.write(cbuf);
    }
    public FileConsoleWriter(String str)throws IOException {
        fileWriter.write(str);
    }
    public FileConsoleWriter(String str,int off,int len)throws IOException {
        fileWriter.write(str,off,len);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for (int i = off; i <len ; i++) {
            System.out.println(cbuf[i]);
        }

    }


    public void close() throws IOException {
        fileWriter.close();
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for (char c:cbuf){
            System.out.println(c);
        }

    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str,int off,int len) throws IOException{
        fileWriter.write(str,off,len);
        System.out.println(str.subSequence(off,len));
    }

    public static void main(String[] args) {

    }
}