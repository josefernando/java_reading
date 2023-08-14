package br.com.bicam;

import java.util.*;
import java.io.*;


public class ReadWithScannerFile {

    public static void main(String[] args){
        try{
        BufferedReader br = new BufferedReader(new FileReader("java_reading/src/main/resources/input.txt"));
        Scanner sc = new Scanner(new FileReader("java_reading/src/main/resources/input.txt"));
        String line = sc.nextLine();
        System.out.println(line);
    }catch (FileNotFoundException fne){
            fne.printStackTrace();
            System.err.println("Arquivo não encontrado: " + "resources/input.txt");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
    
}
