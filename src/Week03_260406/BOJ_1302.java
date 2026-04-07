package Week03_260406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BOJ_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        int maxCount = 0;
        String maxBook = "";

        for(String bookName : map.keySet()) {
            int currentCount = map.get(bookName);
            if(currentCount > maxCount) {
                maxCount = currentCount;
                maxBook = bookName;
            }
            else if (currentCount == maxCount) {
                if(bookName.compareTo(maxBook) < 0) {
                    maxBook = bookName;
                }
            }
        }
        System.out.println(maxBook);

    }
}


