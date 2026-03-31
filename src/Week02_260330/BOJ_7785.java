package Week02_260330;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if(action.equals("enter"))
                set.add(name);
            else if(action.equals("leave"))
                set.remove(name);
        }

        List<String> list = new ArrayList<>(set);

        list.sort(Collections.reverseOrder());

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}


