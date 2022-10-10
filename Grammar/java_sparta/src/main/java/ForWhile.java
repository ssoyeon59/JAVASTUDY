public class ForWhile {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : days) {
            System.out.println(day);
        }

        int i = 1;
        int result = 0;
        do {
            result += i;
            i += 1;
        } while (i < 2 );
        System.out.println(result);

    }
}
