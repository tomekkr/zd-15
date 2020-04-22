import java.util.Scanner;

class NamesService {
    private static Scanner sc = new Scanner(System.in);

    public static String[] addNamesToArray() {
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        sc.close();
        return names;
    }

    public static void reverseNamesAndSayHello(String[] names) {
        String[] reversedNames = reverseNames(names);
        NamesPrinter.sayHello(reversedNames);
    }

    private static String[] reverseNames(String[] names) {
        String[] reversedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversedNames[i] = names[names.length - 1 - i];
        }
        return reversedNames;
    }
}
