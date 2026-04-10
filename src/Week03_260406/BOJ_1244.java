package Week03_260406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class BOJ_1244 {
    public static void boy(int[] arr, int k) {
        int index = k;
        while (index < arr.length)
        {
            if(arr[index] == 0)
                arr[index] = 1;
            else
                arr[index] = 0;
            index += k;
        }
    }

    public static void girl(int[] arr, int k) {
        int n = 1;

        while (k - n > 0 && k + n < arr.length) {
            if(arr[k - n] == arr[k + n]) {
                n++;
            }
            else {
                break;
            }
        }

        n--;

        for(int i = k-n; i <= k+n; i++) {
            if(arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int students = Integer.parseInt(br.readLine());

        for(int j = 0; j < students; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st2.nextToken());
            if (gender == 1)
                boy(arr, Integer.parseInt(st2.nextToken()));
            else if (gender == 2)
                girl(arr, Integer.parseInt(st2.nextToken()));
            else return;

        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if(i % 20 == 0)
                System.out.println();
        }
    }
}


