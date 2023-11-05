public class sumofremainders{
    public static void main(String[]args){
    int n=12;
    int d=4;
    int sumofdivisor=d*(d+1)/2;
    int reminder=n%d;
    int q=n/d;
    int sumofreminder=reminder*(reminder+1)/2;
    System.out.println((q*sumofdivisor)+sumofreminder);
    }
}
