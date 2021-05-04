import java.util.Scanner;

public class LettersByMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter text...");
        String input = scan.nextLine();

        for (int i = 0; i < 5 ; i++) {
            printAllLetters(input, i);
            System.out.println();
           }

        }


    /**
     *  Print all letters in some rows
      * @param str
     * @param rows
     */
    private static void printAllLetters(String str, int rows){
          String input = str.toUpperCase();

        for (int i = 0; i <input.length() ; i++) {
             printGivenLetter(input.charAt(i), rows);
        }
    }


    /**
     * Print given letter...
     * @param letter
     * @param rows
     */
    private static void printGivenLetter(char letter, int rows){
        switch (letter){
            case 'A': letterA(rows); break;
            case 'B': letterB(rows); break;
            case 'C': letterC(rows); break;
            case 'D': letterD(rows); break;
            case 'E': letterE(rows); break;
            case 'F': letterF(rows); break;
            case 'G': letterG(rows); break;
            case 'H': letterH(rows); break;

        }


    }

    // Print letter A
    private static void letterA(int number) {
        switch (number) {
            case 0:
                System.out.print("     XX      " + "        ");
                break;
            case 1:
                System.out.print("   XX   XX   " + "        ");
                break;
            case 2:
                System.out.print("  XXXXXXXXX  " + "        ");
                break;
            case 3:
                System.out.print(" XX       XX " + "        ");
                break;
            case 4:
                System.out.print("XX         XX" + "        ");
                break;
        }
    }

    // Print letter B
    private static void letterB(int number) {
        switch (number) {
            case 0:
                System.out.print("XXXXXX" + "        ");
                break;
            case 1:
                System.out.print("XX    XX" + "      ");
                break;
            case 2:
                System.out.print("XXXXXX" + "        ");
                break;
            case 3:
                System.out.print("XX    XX" + "      ");
                break;
            case 4:
                System.out.print("XXXXXX" + "        ");
                break;
        }
    }

    // Print letter C
    private static void letterC(int number) {
        switch (number) {
            case 0:
                System.out.print(" XXXXXXX" + "        ");
                break;
            case 1:
                System.out.print("XX" + "              ");
                break;
            case 2:
                System.out.print("XX" + "              ");
                break;
            case 3:
                System.out.print("XX" + "              ");
                break;
            case 4:
                System.out.print(" XXXXXXX" + "        ");
                break;
        }
    }

    // Print letter D
    private static void letterD(int number) {
        switch (number) {
            case 0:
                System.out.print("XXXXXX" + "          ");break;
            case 1:
                System.out.print("XX     XX" + "       ");break;
            case 2:
                System.out.print("XX       XX" + "     ");break;
            case 3:
                System.out.print("XX     XX" + "       ");break;
            case 4:
                System.out.print("XXXXXX" + "          ");break;
        }
    }

    // Print letter E
    private static void letterE(int number) {
        switch (number){
            case 0:
                System.out.print("XXXXXXXX" + "        ");  break;
            case 1:
                System.out.print("XXX" + "             "); break;
            case 2:
                System.out.print("XXXXX" + "           "); break;
            case 3:
                System.out.print("XXX" + "             "); break;
            case 4:
                System.out.print("XXXXXXXX" + "        "); break;
        }
    }

    // Print letter F
    private static void letterF(int number) {
        switch (number){
            case 0:
                System.out.print("XXXXXXXX" + "      ");  break;
            case 1:
                System.out.print("XXX" + "           "); break;
            case 2:
                System.out.print("XXXXX" + "         "); break;
            case 3:
                System.out.print("XX" + "            "); break;
            case 4:
                System.out.print("XX" + "            "); break;
        }
    }

    // Print letter G
    private static void letterG(int number) {
        switch (number) {
            case 0:
                System.out.print(" XXXXXX" + "          ");
                break;
            case 1:
                System.out.print("XX" + "               ");
                break;
            case 2:
                System.out.print("XX    XXXX" + "       ");
                break;
            case 3:
                System.out.print("XX     XX" + "        ");
                break;
            case 4:
                System.out.print(" XXXXXX" + "          ");
                break;
        }
    }

    // Print letter H
    private static void letterH(int number) {
            switch (number) {
                case 0:
                    System.out.print("XX     XX" + "     ");break;
                case 1:
                    System.out.print("XX     XX" + "     ");break;
                case 2:
                    System.out.print("XXXXXXXXX" + "     ");break;
                case 3:
                    System.out.print("XX     XX" + "     ");break;
                case 4:
                    System.out.print("XX     XX" + "     ");break;
            }

        }














    }
