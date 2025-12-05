import java.util.Scanner;

public class Tugas {
    static int totalIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan junlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int total = 0;
        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }

        System.out.print("Total dari " + N + " angka yang dimasukkan adalah: " + total);
    }
}
