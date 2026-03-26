package Week01_260325;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_14626 {
    // 자바 프로그램의 시작점 (C++의 int main()과 동일한 역할)
    public static void main(String[] args) throws IOException {
        // 1. 빠른 입력을 위한 BufferedReader 세팅 (C++의 cin.tie(NULL) 같은 최적화 역할)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int index = -1;
        int digit;
        String s = br.readLine();

        for(int i = 0; i < 13; i++) {
            if(s.charAt(i) != '*') {
                digit = s.charAt(i) - '0';
                if (i % 2 == 0) {
                    sum += digit;
                    //System.out.println("홀수자리, 현재 sum 값 : " + sum +" "+ i);
                } else {
                    sum += 3 * digit;
                    //System.out.println("짝수자리, 현재 sum 값 : " + sum +" "+ i);
                }
            }
            else {
                index = i + 1;
            }
        }

        //System.out.println(check);
        //System.out.println(index);
        //System.out.println(sum);

        for(int j = 0; j < 10; j++)
        {
            if(index % 2 == 0) {
                if ((3 * j + sum) % 10 == 0) {
                    System.out.println(j);
                    return;
                }
            }
            else {
                if((j + sum) % 10 == 0){
                   System.out.println(j);
                   return;
                }
            }
        }


        /* 2. 한 줄 입력받기
        // 예: 백준에서 "10 20" 처럼 공백을 두고 숫자가 들어올 때
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 3. 입력받은 문자열을 정수(int)로 변환하기
        int a = Integer.parseInt(st.nextToken()); // 10
        int b = Integer.parseInt(st.nextToken()); // 20

        // 4. 출력하기 (C++의 cout 역할)
        System.out.println(a + b); // 30 출력*/
    }
}