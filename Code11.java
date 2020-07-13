import java.util.ArrayList;
public class Code11 {
    /*
    문제11
    level1
    카카오 2019 겨울 인턴 1번문제
    
     */
    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},
            {4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        solution(board, moves);
    }
    public static int solution(int[][] board, int[] moves){
        int answer =0;
        ArrayList<Integer> buffer = new ArrayList<Integer>();
        int k =0;
        int count =0;
        for(int i =0; i < moves.length; i++){
            while(board[k][moves[i]-1] == 0){
                k++;
                if(k >= board[0].length){
                    k--;
                    break;
                }
            }
            if(board[k][moves[i]-1] != 0){
                buffer.add(board[k][moves[i]-1]);
                board[k][moves[i]-1] = 0;
                
                if(count > 0 && buffer.get(count) == buffer.get(count-1)){
                    buffer.remove(count);
                    buffer.remove(count-1);
                    count -= 2;
                    answer += 2;
                }
                count++;
                k =0;
            }
        }
        return answer;
    }
}