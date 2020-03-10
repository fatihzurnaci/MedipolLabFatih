import java.util.Scanner;
    public class fatih {
        public static void main(String args[]) {
            int[] sayi = new int[5];

            Scanner keyboard = new Scanner(System.in);

            for (int i = 0; i < sayi.length; i++) {
                System.out.print((i+1) + ". Tam sayıyı giriniz: ");
                sayi[i] = keyboard.nextInt();
            }
            int temp = 0;
            for (int k = 0; k < sayi.length; k++) {
                for (int j = 1; j < sayi.length; j++) {
                    if (sayi[j - 1] > sayi[j]) {
                        temp = sayi[j];
                        sayi[j] = sayi[j - 1];
                        sayi[j - 1] = temp;
                    }
                }
            }
            for (int i = 0; i < sayi.length; i++) {
                System.out.print(i + 1 + ".Sayi:" + sayi[i] + " ");
            }
        }
    }
