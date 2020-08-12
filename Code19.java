import java.util.Scanner;

public class Code19 {
    /*
    다이아몬드 만들기
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 != 0){
            int space = num /2;
            int star = 1;
            for(int i =0 ; i < num; i++){
                for(int j =0; j < space; j++){
                    System.out.print(" ");
                }
                for(int k =0; k < star; k++){
                    System.out.print("*");
                }
                if(i < num/2){
                    space--;
                    star = star + 2;
                }else{
                    space++;
                    star = star - 2;
                }
                System.out.println();
            }
        }else{
            int space = num -1;
            int star = 1;
            for(int i =0; i < (num*2)-1; i++){
                for(int j=0 ; j < space; j++){
                    System.out.print(" ");
                }
                for(int k =0; k < star; k++){
                    System.out.print("*");
                    if(k == star-1){
                        
                    }else{
                        System.out.print(" ");
                    }
                }
                if(i < ((num*2)-1)/2){
                    space--;
                    star++;
                }else{
                    space++;
                    star--;
                }
                System.out.println();
            }
            
        }

        sc.close();
    }
}