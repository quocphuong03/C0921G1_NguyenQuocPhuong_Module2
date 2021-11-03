package ss1_Introduction_to_Java.bai_tap.CurrencyConversion.java;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập trị giá USD : ");
        int usd = scanner.nextInt();
        System.out.println("VND : " + (usd * 23000));
    }
}

