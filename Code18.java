public class Code18 {
    /*
     * level1 팩토리얼 문제 팩토리얼이란 1*2*3 = 3! 과 같이 1에서 부터 n 까지 수를 곱하는 것을 의미한다. 하지만 int 형의
     * 최대 표현 범위는 2,147,483,647까지이다. 배열과 int형을 사용해서 50!를 출력하시오.
     */

    static int count = 1;
    static int[] fac = new int[100000];
    static int fPoint = 0;

    public static void main(String[] args) {
        fac[0] = 1;
        for(int i =0; i < 50; i++){
            mul(fac, count, fPoint);
            count++;
        }
        for(int j =0; j <= fPoint; j++){
            System.out.print(fac[j]);
        }

    }
    static void mul(int[] f, int c, int p){
        int temp = 0;
        for(int i = p; i >= 0; i--){
            f[i] = f[i]*c + temp;
            if(f[i] >= 10){
                if(i == 0){
                    check(f, p, f[i]);
                }
                else{
                    temp = f[i]/10;
                    f[i] = f[i]%10;
                }
            }else{
                temp =0;
            }
        }
    }
    static void check(int[] f, int p, int temp){
        if(temp < 10){
            
        }else{
            temp = f[0]/10;
            f[0] = f[0]%10;
            for(int i = p; i >=0; i--){
                f[i+1] = f[i];
            }   
            f[0] = temp;
            fPoint++;
            p = fPoint;
            check(f, p, temp);
        }
    }
}