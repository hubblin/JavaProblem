import java.util.Arrays;

public class Code15 {
    /*
    문제15
    level1
    수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든
    선수가 마라톤을 완주하였습니다.
    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴
    배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를
    작성해주세요

    ex)
    ["leo","kiki","eden"] ["eden","kiki"] "leo"
    ["marina","josipa","nikola","vinko","filipa"] ["josipa","filipa","marina","nikola"] "vinko"
    ["mislav","stanko","mislav","ana"] ["stanko","ana","mislav"] "mislav"
    */
    public static void main(final String[] args){
        final String[] participant = {"leo","kiki","eden"};
        final String[] completion = {"eden","kiki"};
        solution(participant, completion);
    }
    public static String solution(final String[] participant, final String[] completion){
        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i =0;
        while(i < completion.length){
            if(!participant[i].equals(completion[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }
        if(temp == ""){
            answer = participant[i];
        }else{
            answer = temp;
        }
        System.out.println(answer);
        return answer;
    }
}