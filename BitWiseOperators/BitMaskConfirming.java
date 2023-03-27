package BitWiseOperators;

import java.util.*;
public class BitMaskConfirming {
    public static void main(String[] args) {
        System.out.println(solution(1073741727, 1073741631, 1073741679));
    }

    public static int solution(int A, int B, int C) {
        int count = 0;
        int maxIntegerValue = 1073741823;
        int minIntegerValue = Math.min(Math.min(A, B), C);

        for(int i = minIntegerValue; i <= maxIntegerValue; i++){
            int aAndi = A&i;
            int bAndi = B&i;
            int cAndi = C&i;

            if(aAndi==A || bAndi==B || cAndi==C){
                count++;
            }
        }
        return count;

    }
}
