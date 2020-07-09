import java.util.Scanner;

public class Code6 {
    /*
    문제6
    level1
    아서 왕이 천장에 삼각형 창이 있는 방에 원탁을 놓을 계획을 세우고 있다. 그는 햇빛이 원탁 위에 비추게 하고 싶다.
    특히 정오에 태양이 바로 머리 위에 있을 때는 원탁 전체에 햇빛이 비추도록 하려고 한다.

    그래서 그 원탁은 방 안의 특정한 삼각형 영역 안에 자리잡아야 한다. 물론 아서 왕은 주어진 조건 내에서 최대한 큰 
    원탁을 만들고 싶어한다.
    
    멀린이 점심을 먹으러 나간 사이에 해가 비추는 영역에 들어갈 수 있는 가장 큰 원탁의 반지름을 계산하는 프로그램을 
    만들어야 한다.

    input
    테스트 케이스의 개수에는 제한이 없으며, 각 테스트 케이스마다 삼각형의 세 변의 길이를 나타내는 실수 세 개(a,b,c)가
    입력된다. 어떤 변의 길이도 1,000,000을 넘지 않으며, max(a,b,c) <= (a+b+c)/2라고 가정해도 된다.

    파일 끝에 다다를 때까지 계속 입력을 받는다.

    output
    각 테스트 케이스마다 다음과 같은 결과를 출력한다.
    The radius of the round table is : r
    여기에서 r은 정오에 해가 비추는 영역에 들어갈 수 있는 원탁의 최대 반지름이며, 소수점 셋째 자리까지 반올림한 값을 출력한다.


    ex)
    12.0 12.0 8.0

    The radisu of thr round table is : 2.828
    */
    //그냥 삼각형의 세 변의 길이가 주어졌을때 내접원이구나
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Float A = scanner.nextFloat();
        Float B = scanner.nextFloat();
        Float C = scanner.nextFloat();
        float p = (A+B+C)/2;
        float s = (float) Math.sqrt(p * (p - A) * (p - B) * (p - C));
        
        float r = (2*s) / (A+B+C);
        
        System.out.println("The radius of the round table is : " + String.format("%,.3f", r));

        scanner.close();
    }

}