package Week02_260330;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;

public class BOJ_4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Character> set = Set.of('a','e','i','o','u');

        while(true) {
            String input = br.readLine();
            boolean moum = false;
            int Xcount = 0;
            int Ycount = 0;
            char prev = ' ';
            boolean test = true;

            if(input == null || input.equals("end")) {
                break;
            }

            for(int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if(c != 'e' && c != 'o' && prev == c) {
                    //System.out.println("<" + input + ">" + "is not acceptable : same");
                    test = false;
                    break;
                }

                if(set.contains(c)) {
                    moum = true;
                    Xcount++;
                    Ycount = 0;

                    if(Xcount == 3) {
                        //System.out.println("<" + input + ">" + " is not acceptable : m3");
                        test = false;
                        break;
                    }
                }
                else {
                    Ycount++;
                    Xcount = 0;
                    if(Ycount == 3) {
                        //System.out.println("<" + input + ">" + " is not acceptable j3");
                        test = false;
                        break;
                    }
                }

                prev = input.charAt(i);

            }
            if(!moum) {
                //System.out.println("<" + input + ">" + " is not acceptable: no moum");
                test = false;
            }


            if(test)
                System.out.println("<" + input + ">" + " is acceptable.");
            else
                System.out.println("<" + input + ">" + " is not acceptable.");
        }
    }
}


