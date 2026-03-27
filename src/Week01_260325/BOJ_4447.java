package Week01_260325;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_4447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            int Gcount = 0;
            int Bcount = 0;

            String input = br.readLine();
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j) == 'g' || input.charAt(j) == 'G') {
                    Gcount++;
                }
                else if(input.charAt(j) == 'b' || input.charAt(j) == 'B') {
                    Bcount++;
                }
            }

            if(Gcount > Bcount)
                System.out.println(input + " is GOOD");
            else if(Bcount > Gcount)
                System.out.println(input + " is A BADDY");
            else
                System.out.println(input + " is NEUTRAL");
        }

    }
}

