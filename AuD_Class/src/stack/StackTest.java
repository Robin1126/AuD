package stack;

import java.util.Scanner;

/**
 * Author : Binbin Luo
 * Date : 08.11.2023
 */
public class StackTest {
    public static void main(String args[]) {
        /**
         * 通过栈来检测是否为回文 比如aba
         */
        System.out.print("Please enter a string which is going to be judged(max 20 chars): ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("The result of " + str + " is " + judge(str));
//       judge("aba");
    }

    public static boolean judge(String str) {
        ArrayStack arrayStack = new ArrayStack(20);
        for (int i = 0; i < str.length(); i++) {
            // 读取每一个字符并且压入栈中
            arrayStack.push(str.charAt(i));
        }
        // 然后依次读取出来组成字符串，比较两者是否相同
        String newStr = "";
        int length = arrayStack.length();
        for (int i = 0; i < length ; i++) {
            char pop = (char)arrayStack.pop();
            newStr = newStr + pop;
        }

        return newStr.equals(str);
    }
}
