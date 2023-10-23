package vowels;

public class vowels {
    public static void main(String[] args) {
        char harf = 'e';

        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Kalın veya İnce sesli harf değildir !");
        }
    }
}
