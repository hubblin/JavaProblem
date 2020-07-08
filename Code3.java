import java.util.Scanner;

public class Code3 {
    /*
    level1
    문제3
    A씨는 게시판 프로그렘을 작성하고 있다.

    A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로
    주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.

    Ex) 
    입력 : 총건수(m), 한페이지에 보여줄 게시물 수(n) (단 n은 1보다 크거나 같다. n >= 1)
    출력 : 총페이지수
     */
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        int totalNum = m.nextInt();
        int pageNum = n.nextInt();
        
        int paging = totalNum / pageNum;
        if(totalNum%pageNum !=0){
            paging++;
        }
        System.out.println(paging);

        m.close();
        n.close();
    }
}