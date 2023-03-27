package BitWiseOperators;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(569));
    }

    public static int solution(int N) {

        int count = 0;
        int  discardTrailingZeros = N | N-1;

        while(Integer.toBinaryString(discardTrailingZeros).contains("0")){
            discardTrailingZeros = discardTrailingZeros | discardTrailingZeros >>> 1;
            count++;
        }

        return count;
    }
}
