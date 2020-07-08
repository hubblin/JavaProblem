import java.util.ArrayList;
import java.util.List;


public class Code4 {
    /*
    level1
    문제4
    주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하시오.
    이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김자완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
    
    1. 김씨와 이씨는 각각 몇 명 인가요?
    2. "이재영"이란 이름이 몇 번 반복되나요?
    3. 중복을 제거한 이름을 출력하세요.
    4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
     */
    public static void main(final String[] args) {
        final String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김자완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
        final String[] arr = names.split(",");

        // 1번
        number1(arr);

        // 2번
        number2(arr);

        // 3번
        String[] newArr =number3(arr);
        for(int i =0; i < newArr.length; i++)
            System.out.print(newArr[i] + ",");
        System.out.println();

        // 4번
        number4(arr);
    }

    // 1. 김씨와 이씨는 각각 몇 명 인가요?
    public static void number1(final String[] arr) {
        int kim = 0, lee = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].substring(0, 1).equals("김")) {
                kim++;
            } else if (arr[i].substring(0, 1).equals("이")) {
                lee++;
            }
        }
        System.out.println("김씨는" + kim + "명, 이씨는" + lee + "명 입니다.");
    }

    // 2. "이재영"이란 이름이 몇 번 반복되나요?
    public static void number2(final String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("이재영")) {
                count++;
            }
        }
        System.out.println(count + "번");
    }

    // 3. 중복을 제거한 이름을 출력하세요.
    public static String[] number3(final String[] arr) {
        List<String> newNames = new ArrayList<String>();
        String[] copyArr;
        newNames.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < newNames.size(); j++) {
                if (newNames.get(j).equals(arr[i])) {
                    break;
                }
                else if(j == newNames.size() -1){
                    newNames.add(arr[i]);
                }
            }
        }
        int i =0;
        copyArr = new String[newNames.size()];
        for (String temp : newNames) {
            copyArr[i] = temp;
            i++;
        }

        return copyArr;
        
    }

    // 4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
    public static void number4(final String[] arr) {
        String[] copyArr = number3(arr);
        for(int i =0; i < copyArr.length-1; i++){
            for(int j =i+1; j <copyArr.length; j++){
                if(copyArr[i].compareTo(copyArr[j])> 0){
                    String tempStr = copyArr[j];
                    copyArr[j] = copyArr[i];
                    copyArr[i] = tempStr;
                }
            }
        }
        for(int i =0; i < copyArr.length; i++){
            System.out.print(copyArr[i]+",");
        }
    }
}