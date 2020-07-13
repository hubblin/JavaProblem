public class Code14 {
    /*
     * 문제14 
     * level1 
     * 디지털 시계에 하루동안(00:00~23:59)3이 표시되는 시간을 초로 환산하면 총 몇 초 일까요?
     */
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j < 60; j++) {
                if(i % 10 == 3 || j % 10 == 3 || j/10 == 3){
                    answer += 60;
                }
            }
        }
        System.out.println(answer);
    }
}