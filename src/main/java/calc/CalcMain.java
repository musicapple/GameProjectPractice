package calc;

import java.util.Scanner;

public class CalcMain {

    public static String eval;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            String newEval = sc.next();
            if(newEval.equals("undo")){
                if(eval == null){
                    throw new IllegalStateException("error");
                }
                newEval = eval;
            }
            if(eval!=null)
            eval = newEval;

            System.out.println("eval: "+eval);
            System.out.println("newEval: "+newEval);
        }
    }
}
