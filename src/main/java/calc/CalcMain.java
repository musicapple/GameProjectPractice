package calc;

import java.util.Scanner;

public class CalcMain {

    public static String eval;  //
    public static String x;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            String newEval = sc.next();
            if(newEval.equals("undo")){
                if(eval == null){
                    throw new IllegalStateException("error");
                }
                x = eval; // 이전식 현재식에 대입
            }else{
                eval = x;   // 현재식을 이전식에 저장
                x =  newEval;   // 입력받은 식을 현재식에 저장
            }
            System.out.println("이전식: "+eval);
            System.out.println("현재식: "+x);
        }
    }
}
