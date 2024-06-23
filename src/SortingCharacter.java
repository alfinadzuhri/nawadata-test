import java.util.Scanner;

public class SortingCharacter {
    public static void main(String[] args) {

        while (true){
            //initiate variables
            StringBuilder vowels = new StringBuilder();
            StringBuilder consonants = new StringBuilder();

            //initiate scanner for input data
            Scanner scanner = new Scanner(System.in);

            //input sample sentences
            System.out.print("\nInput one line of words (S) : ");
            String input = scanner.nextLine();

            //check kind of character
            for (int i = 0; i < input.length(); i++) {
                //Avoiding whitespace
                if (input.charAt(i) != ' '){
                    if(vowelsCheck(input.toLowerCase().charAt(i))){
                        vowels.append(input.charAt(i));
                    } else {
                        consonants.append(input.toLowerCase().charAt(i));
                    }
                }
            }

            //print result
            System.out.println("Vowel Characters : ");
            System.out.println(vowels);
            System.out.println("Consonant Characters : ");
            System.out.println(consonants);

            System.out.print("\nDo you want to continue(Y/N)? ");
            String decision = scanner.nextLine();
            if (decision.toLowerCase().equals("n")) break;
        }

    }

    //method for checking vocal character
    public static boolean vowelsCheck(Character character){
        String vowels = "aiueo";
        Boolean result = false;
        for (int i = 0; i < vowels.length(); i++) {
            if(character == vowels.charAt(i)){
                result = true;
                break;
            }
        }
        return result;
    }
}
