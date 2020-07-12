import java.util.ArrayList;

public class Code8 {
    public static void main(final String[] args){
        final String expression = "999*999*999*999";
        long answer = solution(expression);
        System.out.println(answer);
    }
    public static long solution(final String expression){
        long answer = 0;

        final String[] number = expression.split("\\+|\\-|\\*");
        final String NumberSentenceTemp = expression.replaceAll("[0-9]", "");
        char[] NumberSentence = NumberSentenceTemp.toCharArray();

        // 모든 요소들을 나눈 배열
        ArrayList<String> newstr = new ArrayList<String>();

        for (int i = 0; i < number.length; i++) {
            newstr.add(number[i]);
            if (i != number.length - 1) {
                String temp = Character.toString(NumberSentence[i]);
                newstr.add(temp);
            }
        }

        //
        String[][] testCase = { { "+", "-", "*" }, { "+", "*", "-" }, { "-", "+", "*" }, { "-", "*", "+" },
                { "*", "+", "-" }, { "*", "-", "+" } };
        ArrayList<String> tempArr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            tempArr.clear();
            for (String temp : newstr) {

                tempArr.add(temp);
            }
            for (int j = 0; j < 3; j++) {
                String tempStr = testCase[i][j];
                for (int k = 0; k < tempArr.size(); k++) {

                    if (tempArr.get(k).equals(tempStr)) {
                        long first = Long.parseLong(tempArr.get(k - 1));
                        long second = Long.parseLong(tempArr.get(k + 1));
                        long result = 0;
                        if (tempArr.get(k).equals("+")) {
                            result = first + second;
                            tempArr.remove(k - 1);
                            tempArr.remove(k - 1);
                            tempArr.remove(k - 1);
                            tempArr.add(k - 1, Long.toString(result));
                            System.out.println(tempArr);
                            if (tempArr.size() == 1) {
                                long tempLong = Math.abs(Long.parseLong(tempArr.get(0)));
                                if(tempLong > answer){
                                    answer = tempLong;
                                }
                            }
                            k =0;
                        }else if(tempArr.get(k).equals("-")){
                            result = first - second;
                            tempArr.remove(k-1);
                            tempArr.remove(k-1);
                            tempArr.remove(k-1);
                            tempArr.add(k-1, Long.toString(result));
                            System.out.println(tempArr);
                            if (tempArr.size() == 1) {
                                long tempLong = Math.abs(Long.parseLong(tempArr.get(0)));
                                if(tempLong > answer){
                                    answer = tempLong;
                                }
                            }
                            k =0;
                        }else if(tempArr.get(k).equals("*")){
                            result = first * second;
                            tempArr.remove(k-1);
                            tempArr.remove(k-1);
                            tempArr.remove(k-1);
                            tempArr.add(k-1, Long.toString(result));
                            System.out.println(tempArr);
                            if (tempArr.size() == 1) {
                                long tempLong = Math.abs(Long.parseLong(tempArr.get(0)));
                                if(tempLong > answer){
                                    answer = tempLong;
                                }
                            }
                            k =0;
                        }

                    }
                }
            }
        }



        return answer;
    }
    
}