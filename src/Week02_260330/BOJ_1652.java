package Week02_260330;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        int Xcount = 0;
        int Ycount = 0;
        int dot = 0;

        for(int i =0; i< n; i++) {
            String input = br.readLine();
            arr[i] = input.toCharArray();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == '.') {
                    dot++;
                }
                else if (arr[i][j] == 'X') {
                    if(dot >= 2)
                        Xcount++;
                    dot = 0;

                }
            }
            if(dot >= 2)
                Xcount++;
            dot = 0;
        }

        System.out.print(Xcount + " ");

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < n; i++) {
                if(arr[i][j] == '.') {
                    dot++;
                }
                else if (arr[i][j] == 'X') {
                    if(dot >= 2)
                        Ycount++;
                    dot = 0;

                }
            }
            if(dot >= 2)
                Ycount++;
            dot = 0;
        }

        System.out.println(Ycount);

    }
}


