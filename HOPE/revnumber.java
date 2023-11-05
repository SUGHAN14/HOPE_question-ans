public class revnumber {
    public static void main(String[] args, double d) {
        int n=3456;
        int odd=0;
        int even=0;
        int count=0;
        int rev=0;
        while(n>0){
            rev=(rev*10)+n%10;
            n/=10;
        }while(rev>0){
            if((rev%10)%2==0){
                even=even*10+rev%10;
                count++;
            }else{
                odd=odd*10+rev%10;
            }
            rev/=10;
        }System.out.println((int)d);
    }
}
