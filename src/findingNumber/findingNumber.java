package findingNumber;

public class findingNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 4, 5, 9, 12, 32, 55, 21, 46};
        int search = 55;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == search) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            System.out.println(search + " there is a number.");
        } else {
            System.out.println(search + " there is no number.");
        }
    }
}
