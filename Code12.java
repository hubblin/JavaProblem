import java.util.Scanner;

public class Code12 {
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