package Week01_260325;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_24568 {
    // 자바 프로그램의 시작점 (C++의 int main()과 동일한 역할)
    public static void main(String[] args) throws IOException {
        // 1. 빠른 입력을 위한 BufferedReader 세팅 (C++의 cin.tie(NULL) 같은 최적화 역할)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = a * 8 + b * 3;

        if(sum < 28)
            System.out.println(0);
        else
            System.out.println(sum - 28);


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

