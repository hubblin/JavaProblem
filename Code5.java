public class Code5 {
    /*문제5
    level1
    n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수르 모두 가지고 있다. 이제 당신은 이 배열을 좀 
    특별한 방법으로 정렬해야 한다.

    정렬이 되고 나 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 병함이 
    없어야 한다.
    Ex)-1,1,3,-2,2 --> -1,-2,1,3,2
     */

    public static void main(final String[] args){
        int[] number = {-1,1,3,-3,-2};
        int count =0;
        for(int i =0; i < number.length; i++){
            if(number[i] < 0){
                int temp = number[count];
                number[count] = number[i];
                number[i] = temp;
                count++;
            }
        }
        for(int i =0; i < number.length; i++){
            System.out.print(number[i] + ",");
        }

    }
}