package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
        public static boolean isPalindrome(int number) {
            // Sayıyı pozitif hale getiriyoruz
            number = Math.abs(number);

            // Sayıyı string'e çevir
            String numberStr = Integer.toString(number);

            // Baş ve sonu karşılaştırmak için iki değişken
            int start = 0;
            int end = numberStr.length() - 1;

            // Baş ve sondaki karakterleri karşılaştırma
            while (start < end) {
                if (numberStr.charAt(start) != numberStr.charAt(end)) {
                    return false; // Eğer eşleşmiyorsa, palindrom değil
                }
                // Karakterler eşleşiyorsa, bir adım içeri kaydır
                start++;
                end--;
            }

            return true; // Eğer karşılaştırmalar geçildiyse, palindromdur
        }

         public static boolean isPerfectNumber(int number) {
        // Eğer sayı 0'dan küçükse false döndür
        if (number < 1) {
            return false;
        }

        int sum = 0;  // Bölenlerin toplamını tutmak için

        // 1'den başlayarak sayının yarısına kadar olan bölenleri bul
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {  // Eğer i sayıya tam bölünüyorsa
                sum += i;  // Böleni topla
            }
        }

        // Bölenlerin toplamı sayıya eşitse mükemmel sayıdır
        return sum == number;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();

        // Get each digit of the number
        while (number > 0) {
            int digit = number % 10;
            result.insert(0, words[digit] + " ");
            number /= 10;
        }

        // Remove the last space
        return result.toString().trim();
    }


}
