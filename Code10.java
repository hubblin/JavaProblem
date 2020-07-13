import java.util.ArrayList;

public class Code10 {
    public static void main(String[] args) {
        String[] gems = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};
        solution(gems);
    }

    public static int[] solution(String[] gems) {
        int[] answer = new int[2];
        ArrayList<String> temp = new ArrayList<String>();
        temp.add(gems[0]);
        for (int i = 0; i < gems.length; i++) {
            for (int j = 0; j < temp.size(); j++) {
                if (temp.get(j).equals(gems[i])) {
                    break;
                } else if (j == temp.size() - 1) {
                    temp.add(gems[i]);
                    
                }
            }
        }
    
        if(temp.size() == 1){
            answer[0] = 1;
            answer[1] = 1;
        }else{
            answer[0] = 1;
            answer[1] = gems.length +1;
        }
        int start = 1;
        int end = 1;
        ArrayList<String> temp2 = new ArrayList<String>();
        
        for (int h = 0; h < gems.length; h++) {
            temp2.clear();
            temp2.add(gems[start-1]);
            for (int i = start - 1; i < gems.length; i++) {
                for (int j = 0; j < temp2.size(); j++) {
                    if (temp2.get(j).equals(gems[i])) {
                        break;
                    } else if (j == temp2.size() - 1) {
                        temp2.add(gems[i]);
                        if(temp2.size() == temp.size()){
                            end = i + 1;
                            int result = end - start;
                            if(result < (answer[1] - answer[0])){
                                answer[0] = start;
                                answer[1] = end;
                                break;
                            }
                            
                        }
                    }
                }

            }
            start++;
            if(gems.length - start < temp.size()){
                break;
            }
        }

        return answer;
    }
}