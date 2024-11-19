package ItP1.LabNov12;
import java.io.*;
import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args){
        try(FileInputStream input = new FileInputStream("input.txt");
            FileOutputStream output = new FileOutputStream("output.txt")) {
            Scanner scanner = new Scanner(input);
            int firstInt = scanner.nextInt();
            int secondInt = scanner.nextInt();
            byte[] sum = new byte[firstInt + secondInt];
            output.write(sum, 0, sum.length);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}