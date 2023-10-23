package perfectNumber;

public class perfectNumber {
    public static void main(String[] args) {
        int number = 1;
        int total = 0;

        if (number <=0) {
            System.out.println("Number cannot be 0 or negative !");
            return;
        }
        if (number == 1) {
            System.out.println(number + " is not a perfect number.");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                total += i;
        }
        if (total==number){
            System.out.println(number+" is the perfect number.");
        }else {
            System.out.println(number+" is not a perfect number.");
        }
    }
}
