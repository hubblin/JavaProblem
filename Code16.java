import java.util.Scanner;

public class Code16 {
    /*
    문제16
    level0
    문제1. 정수를 1부터 n까지 출력하는 재귀함수를 작성하세요.
    문제2. 정수를 n부터 1까지 출력하는 재귀함수를 작성하세요.
     */
    static int n =1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Name(number, 1);
        Rname(number);
        sc.close();
    }

    public static void Name(int number, int i){
        
        if(i == number){
            System.out.println(i);
            return;
        }else{
            System.out.println(i);
            i++;
            Name(number, i);
        }
    }

    public static void Rname(int number){
        if(number == 0){
            return;
        }else{
            System.out.println(number);
            number--;
            Rname(number);
        }
    }
}