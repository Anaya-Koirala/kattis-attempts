import java.util.Scanner;

public class biladlyklabord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        char[] stringArr = input.nextLine().toCharArray();
        result.append(stringArr[0]);
        for (int i = 1; i < stringArr.length; i++) {
            if (stringArr[i] != stringArr[i - 1]) {
                result.append(stringArr[i]);
            }
        }
        System.out.println(result);
        input.close();
    }
}
