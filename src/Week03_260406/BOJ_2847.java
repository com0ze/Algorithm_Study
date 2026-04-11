package Week03_260406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[n-1];

        for(int j = n - 2; j >= 0; j--) {
            while (arr[j] >= max) {
                arr[j]--;
                count++;
            }
            max = arr[j];
        }


        System.out.println(count);
    }
}


