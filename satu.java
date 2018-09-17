/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package asis2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;



public class satu {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String tugas= "d:/tugas.txt";
       FileOutputStream m= new FileOutputStream(tugas);

        try{
            FileReader a= new FileReader("d:/chusna.txt");
            BufferedReader b= new BufferedReader(a);
            FileWriter c= new FileWriter(tugas);
            BufferedWriter d= new BufferedWriter(c);
            String e;
            e=b.readLine();
            while (e != null) {
                try {
                    d.write(e, 0, e.length());
                    d.newLine();
                    e=b.readLine();
                    System.out.println("data berhasil dikopi");

                } catch (Exception r) {
                    System.out.println("data tidak berhasil");
                }
        }
            b.close();
            d.close();

        } catch (Exception t){
            t.printStackTrace();
            
        }
    }
}
