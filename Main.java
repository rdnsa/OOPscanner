import java.util.Scanner;

class ContohScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        int hasil = a + b;

        System.out.println("Hasil penjumlahan a dan b adalah: " + hasil);
    }
}
