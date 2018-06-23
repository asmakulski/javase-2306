package com4;

import java.io.*;

public class MainStream {

    public static void main(String[] args) {

        File inputFile = new File("inputFile.txt");
        File outputFile = new File("outputFile.txt");


        try {
            FileReader fileReader = new FileReader(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                //bufferedWriter.flush();
            };

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {


        }


    }
}
