import java.util.Scanner;

public class Code12 {
    /*
    문제12
    level1
    창문의 창과 거기에 빗금이 쳐지는데 그 빗금이 오른쪽 위에서 왼쪽 아래로 내려갈 때, 빗금이 입력한 수 만큼 떨어져서
    생긴다고 하면, 그 모양을 출력하는 코드를 작성하시오(모양은 *로 찍어 만들면 된다.)
    입력: 창문의 크기, 빗금의 길이
    출력: 빗금의 이 그려진 창문모양
     */
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); 
        Scanner sc2 = new Scanner(System.in);
        int k = sc2.nextInt();
        int location = k;
        for(int i =0; i < n; i++){
            int buffer = location;
            for(int j =0; j < n; j++){    
                if(i == 0 || i == n-1){
                    System.out.print("*");
                }else{
                    if(j == 0 || j == n-1){
                        System.out.print("*");
                    }else if(j == buffer-1){
                        System.out.print("*");
                        buffer += k;
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            location--;
            if(location <= 1){
                location = k+1;
            }
            System.out.println();
        }

        sc1.close();
        sc2.close();
    }
}