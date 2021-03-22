package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.FileNameMap;

public class FileWriter {
String info;
    public void save(String s) {
    info =s;
        java.io.FileWriter fw = null;

        try {
            fw = new java.io.FileWriter("answer.txt");
        } catch (
                IOException e) {
            System.out.println("Blad przy otwieraniu!");
        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(s);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Blad przy zapisie!");
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Blad przy zamknieciu!");
        }
    }
}
