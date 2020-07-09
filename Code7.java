public class Code7 {

    /*카카오 신입
    level1
    키패드에서 왼쪽은 왼손, 오른쪽은 오른손, 중간은 가까운 손이 누르는데, 거리가 같을경우 오른손이든 왼손이든
    손잡이 쪽 손으로 누른다. 숫자를 입력받아 나오는 손들의 순서를 출력하시오.
    */
    public static void main(final String[] args){
        int[] numbers = {0,0,0};
        String hand = "left";
        String value = solution(numbers, hand);
        System.out.println(value);
    }


    public static String solution(int[] numbers, final String hand){
        String answer = "";
        final String[][] pad = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }, { " * ", "0", " # " } };
        String startL = " * ";
        String startR = " # ";
        for (int i = 0; i < numbers.length; i++) {
            String getnumber = Integer.toString(numbers[i]);

            if (getnumber.equals(pad[0][0]) || getnumber.equals(pad[1][0]) || getnumber.equals(pad[2][0])) {
                startL = getnumber;
                answer = answer + "L";
            }
            else if(getnumber.equals(pad[0][2]) || getnumber.equals(pad[1][2]) || getnumber.equals(pad[2][2])){
                startR = getnumber;
                answer = answer + "R";
            }else{
                int getx =0, gety=0;
                int getLx =0, getLy=0;
                int getRx =0, getRy=0;

                for(int j =0; j < 4; j++){
                    for(int k=0; k < 3; k++){
                        if(getnumber.equals(pad[j][k])){
                            getx = j;
                            gety = k;
                        }
                        if(startL.equals(pad[j][k])){
                            getLx = j;
                            getLy = k;
                        }
                        if(startR.equals(pad[j][k])){
                            getRx = j;
                            getRy = k;
                        }
                    }
                }
                int LValue = Math.abs(getx - getLx) + Math.abs(gety - getLy);
                int RValue = Math.abs(getx - getRx) + Math.abs(gety - getRy);

                if(LValue < RValue){
                    startL = getnumber;
                    answer = answer + "L";
                }else if(LValue > RValue){
                    startR = getnumber;
                    answer = answer + "R";
                }else if(LValue == RValue){
                    if(hand.equals("right")){
                        startR = getnumber;
                        answer = answer + "R";
                    }else if(hand.equals("left")){
                        startL = getnumber;
                        answer = answer + "L";
                    }
                }
            }
        }

        return answer;
    }

}