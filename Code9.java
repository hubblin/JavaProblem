public class Code9 {
    /*
    문제9 
    level2
    카카오 인턴쉽 2번 문제
    수식이 적힌 문자열을 연산의 우선순위를 다르게 해서 절댓값이 가장 큰 수를 출력하라
     */
    public static void main(String[] args){
        int[] arr = {1,2,3};
        perm(arr, 0, 3,3);
    }
    public static void perm(int[] arr, int depth, int n, int k){
        if(depth == k){
            print(arr,k);
            return;
        }
        for(int i = depth; i < n; i++){
            swap(arr, i, depth);
            perm(arr, depth + 1, n,k);
            swap(arr, i, depth);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr, int k){
        for(int i =0; i <k; i++){
            if(i ==k -1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
    }
}