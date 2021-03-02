package algorithm;

public class StringReverse {
    /**
     * 字符串反转
     * @param cArr
     * @param front
     * @param end
     */
    public static void swap(char[] cArr,int front,int end){
        while(front<end){
            char tmp = cArr[end];
            cArr[end]=cArr[front];
            cArr[front]=tmp;
            front++;
            end--;
        }
    }

    public static String swapWords(String s){
        char[] cArr = s.toCharArray();
        //对整个字符串进行反转
        swap(cArr,0,cArr.length-1);
        int begin = 0;
        //对每个字符进行反转
        for (int i=1;i<cArr.length;i++){
            if (cArr[i] == ' '){
                swap(cArr,begin,i-1);
                begin=i+1;
            }
        }
        swap(cArr,begin,cArr.length-1);
        return new String(cArr);
    }

    public static void main(String[] args){
        String string = "how are you";
        System.out.println(swapWords(string));
    }
}
