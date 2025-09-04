package Basic;
// belajar user input java

import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Siapa nama kamu? ");
        String name = input.nextLine();

        System.out.print("Wow nama kamu keren sekali, berapa umur kamu " + name + "? ");
        int age = Integer.parseInt(input.nextLine()); // konversi string ke integer dari pada menambahkan input.nextLine atau input.nextInt


        System.out.print("Oke cukup tau, " + "Kamu sukanya ngapain aja? ");

        String language = input.nextLine(); 
        System.out.println("keren banget kamu srius deh sayang");
        input.close();

    }
}

