/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/15/2021
 *   Time: 1:01 PM
 *   File: JavaStack.java
 */

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stack.isEmpty()) {

                    switch (input.charAt(i)) {
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                            }
                            break;
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                            }
                            break;
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                            }
                            break;
                        default:
                            stack.push(input.charAt(i));
                    }
                } else
                    stack.push(input.charAt(i));
            }
            System.out.println(stack.isEmpty());

        }
    }
}
