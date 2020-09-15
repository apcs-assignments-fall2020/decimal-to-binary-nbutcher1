import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int lengths = binary.length();
        int total = 0;
        int x = 1;
        for (int i = 0; i < lengths; i ++) {
            if (binary.charAt(lengths-i - 1) == '1') {
                if (i == 0) {
                    total += 1;
                }
                else {
                    total += x;
                }
                
            }
            x *= 2;

        }
        return total;
    }
    
    
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("1111"));
    }
}
