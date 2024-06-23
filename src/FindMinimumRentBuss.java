import java.util.*;
import java.util.stream.Collectors;

public class FindMinimumRentBuss {
    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("\nInput the number of families : ");
            String numOfFamily = scanner.nextLine();
            System.out.print("Input the number of members in the family (separated by a space) : ");
            String familySeq = scanner.nextLine();
            //covert each data of families to integer
            List<Integer> familyArr = List.of(familySeq.split(" ")).stream()
                    .map(data -> Integer.parseInt(data)).toList();

            if (familyArr.size() != Integer.parseInt(numOfFamily)) {
                System.out.println("Input must be equal with count of family");
                return;
            }

            Integer minimumBus = countBus(familyArr);
            System.out.printf("Minimum bus required is : %s", minimumBus);

            System.out.print("\nDo you want to continue(Y/N)? ");
            String decision = scanner.nextLine();
            if (decision.toLowerCase().equals("n")) break;
        }

    }

    public static Integer countBus(List<Integer> familyArr) {

        //Sorting
        List<Integer> arr = new ArrayList<>(familyArr);
        Collections.sort(arr);

        Integer minimumBus = 0;
        int i = 0;
        int j = arr.size() - 1;

        // Check with between smaller and larger member
        while (i <= j) {
            //Check if family can fit in one minibus
            if (arr.get(i) + arr.get(j) <= 4) {
                i++;
                j--;
                //When larger family can fit in one bus
            } else {
                j--;
            }
            minimumBus++;
        }

        return minimumBus;
    }

}
