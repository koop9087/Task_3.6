import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 1;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chr = line.toCharArray();
        for(int i = 0, j  = 1; i < chr.length && j < chr.length; i++,j++) {
            if(chr[i] == ' ' && chr[j] == ' ') {
                result++;
            }
            if(result > count) {
                count = result;
                result = 1;
            }
        }
        System.out.println(count);
    }
}
