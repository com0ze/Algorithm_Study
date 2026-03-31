package Week02_260330;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int count = 0;

        for(int i = 0; i < input.length() - 1; i++) {
            char c = input.charAt(i);
            char next = input.charAt(i + 1);

            if(c != next)
                count++;
        }

        System.out.println((count+ 1) / 2);

    }
}


