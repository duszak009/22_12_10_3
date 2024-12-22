package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("originFile.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("editedFile.txt"));) {
            String line = null;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll(" ", "-");
                bw.write(line+"\r\n");
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}