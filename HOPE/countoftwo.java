public class countoftwo {
    public static void main(String[] args) {
        int start = 1;
        int end = 25;
        int count = 0;
        
        for (int i = start; i <= end; i++) {
            int number = i;
            while (number > 0) {
                int digit = number % 10;
                if (digit == 2) {
                    count++;
                }
                number /= 10;
            }
        }

        System.out.println(count);
    }
}
