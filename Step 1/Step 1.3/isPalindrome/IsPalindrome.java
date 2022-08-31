package isPalindrome;

public class IsPalindrome {

    public static void main(String[] args) {
        int mc = x;
        int rv = 0;
        if(mc<0){
            return false;
        }
        while(mc!=0){

            rv = rv*10+mc%10;
            mc = mc/10;

        }
        System.out.print(rv);
        if(x==rv){
            return true;
        }else{
            return false;
        }
    }
}
