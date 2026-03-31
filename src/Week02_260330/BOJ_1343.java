package Week02_260330;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int Xcount = 0;
        String answer = "";

        for(int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if(c == 'X') {
                Xcount++;
                if (Xcount == 4) {
                    answer += "AAAA";
                    Xcount = 0;
                }
            }
            else if (c == '.') {
                if(Xcount == 2) {
                    answer += "BB.";
                    Xcount = 0;
                }
                else if(Xcount == 1 || Xcount == 3) {
                    System.out.println("-1");
                    return;
                }
                else
                    answer += ".";
            }

        }

        if(Xcount == 2)
            answer += "BB";
        else if (Xcount == 1 || Xcount == 3) {
            System.out.print("-1");
            return;
        }

        System.out.print(answer);
    }
}

