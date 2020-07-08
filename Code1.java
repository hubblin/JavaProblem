public class Code1{
    /*
    level1 
    1. 문제
    10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
    1000미만의 자연수에서 3,5,의 배수의 총합을 구하라 */
    public static void main(String[] args){
        int sum = 0;
        for(int i =1; i < 1000; i++){
            if(three(i) == five(i) && three(i) != 0 && five(i) != 0){

                sum += i;
            }else if(three(i) != 0){

                sum += i;
            }else if(five(i) != 0){

                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static int three(int num){
        if(num % 3 == 0){
            return num;
        }
        return 0;
    } 
    public static int five(int num){
        if(num % 5 == 0){
            return num;
        }
        return 0;
    }
}