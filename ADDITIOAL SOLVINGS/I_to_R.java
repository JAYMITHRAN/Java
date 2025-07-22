import java.util.*;

class Friday {
    public static String intToRoman(int num) {
        
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) 
        {
            while (num >= values[i]) 
            {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        System.out.print("Enter an integer (1 - 3999): ");
        int number = jarvis.nextInt();

        if (number < 1 || number > 3999) {
            System.out.println("Invalid input!");
        } 
        else {
          
            System.out.println(intToRoman(number));
        }

        jarvis.close();
    }
}
