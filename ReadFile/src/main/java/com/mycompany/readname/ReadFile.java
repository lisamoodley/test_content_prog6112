/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.readname;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class ReadFile {

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");

            Scanner sc = new Scanner(file);
            int countLines = 0;
            int countWords = 0;

            while (sc.hasNext()) {
                countLines++;

                String line = sc.next();
                String trimmedLine = line.trim();
                if (!trimmedLine.isEmpty()) {
                    String[] words = trimmedLine.split("\\s+");
                    countWords += words.length;
                }

            }
            System.out.println("Total lines: " + countLines);
            System.out.println("Total words: " + countWords);

        } catch (FileNotFoundException e) {
            System.err.println("The file was not found.");
        } catch (IOException e) {
            System.err.println("An error occured while reading the file.");
        }
    }
}
