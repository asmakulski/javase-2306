package ex_Stream;

import java.io.*;
import java.util.Scanner;

public class MainStream {

    public static void main(String[] args) {

        // Jesli widok w IDEA mam na Project to pathname: inputFile.txt
        // Jesli widok w IDEA mam na EmptyProject/Modules to pathname: javase-2306/inputFile.txt
        File inputFile = new File("javase-2306/inputFile.txt");
        File outputFile = new File("javase-2306/outputFile.txt");

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
                bufferedWriter.flush();
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
