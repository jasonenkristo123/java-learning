package Project;

// project sederhana calculatorr cli
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka pertama: ");
        int angka1 = Integer.parseInt(input.nextLine());
        System.out.println("masukkan angka kedua: ");
        int angka2 = Integer.parseInt(input.nextLine());
        System.out.println("Pilih Operator (+, -, x, /, %): ");
        String operator = input.nextLine();

        int hasil = 0;

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
            break;
            case "-":
                hasil = angka1 - angka2;
            break;
            case "x":
                hasil = angka1 * angka2;
            break;
            case "/":
                hasil = angka1 / angka2;
            break;
            case "%":
                hasil = angka1 % angka2;
            break;
            default:
                System.out.println("input invalid");
        }
        System.out.println("hasilnya adalah: " + hasil);
    }
}
