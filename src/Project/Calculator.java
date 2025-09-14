package Project;

// project sederhana calculatorr cli
public class Calculator {
    public double calculate(double a, double b, String Operator) { // membuat method bernama calculate
        double hasil = 0; // hasil awal dari 0

        switch(Operator) {
            case "+":
                hasil = a + b;
            break;
            case "-":
                hasil = a - b;
            break;
            case "*":
                hasil = a * b;
            break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("error : divided by zero"); // menandakan kesalahan di operasi aritmatika, menghentikan program
                }
                hasil = a / b;
            break;
            case "%":
                hasil = a % b;
            break;
            case "^":
                hasil = Math.pow(a, b);
            break;
            default:
                throw new IllegalArgumentException(Operator + "operator tidak dikenali"); // untuk input yang tidak valid di hentikan 
        }
        return hasil;
    }
}
    