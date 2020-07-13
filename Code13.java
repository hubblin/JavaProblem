import java.util.ArrayList;
import java.util.Scanner;

public class Code13 {
    /*
    문제13
    level1
    피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로
    이루어지는 수열을 말한다.
    ex) 0,1,1,2,3,5,8,13
    인풋을 정수 n으로 받았을 때, n이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> pbh = new ArrayList<Integer>();
        pbh.add(0);
        pbh.add(1);
        
        int i =2;
        while(pbh.get(i-2)+ pbh.get(i-1) <= num){
            pbh.add(pbh.get(i-2) + pbh.get(i-1));
            i++;
        }
        System.out.println(pbh);
    }
}