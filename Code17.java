import java.util.Scanner;

public class Code17 {
    /*
    문제17
    level1
    문제 : 자연수 N을 입력받고 N번째 피보나치 수를 출력하는 재귀함수를 작성하세요.

    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();

        
        System.out.println(Fibonacci(max));

        sc.close();
    }
    public static int Fibonacci(int max){
        if(max <= 0){
            return 0;
        }else if(max == 1){
            return 1;
        }else{
            return Fibonacci(max-1) + Fibonacci(max-2);
        }
    }
}