package Week03_260406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BOJ_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if(!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                }
                else
                    stack.push(c);
            }
            if(stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}


