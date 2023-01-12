import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Scanner scannerLength = new Scanner(System.in);
        Scanner scannerArray = new Scanner(System.in);

        List<String> sameElementsArray = new ArrayList<>();

        System.out.println("Digite a quantidade de elementos do primeiro Array");
        int arrayElements = scannerLength.nextInt();
        String[] firstArray = new String[arrayElements];
        for (int i = 0; i < arrayElements; i++) {
            firstArray[i] = scannerArray.nextLine();
        }

        System.out.println("Digite a quantidade de elementos do segundo Array");
        arrayElements = scannerLength.nextInt();
        String[] secondArray = new String[arrayElements];
        for (int i = 0; i < arrayElements; i++) {
            secondArray[i] = scannerArray.nextLine();
        }

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (Objects.equals(firstArray[i], secondArray[j])) {
                    sameElementsArray.add(firstArray[i]);
                }
            }
        }

        System.out.println(sameElementsArray);
    }
}
