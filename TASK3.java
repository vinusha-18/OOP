package basicjavaprograms;

import java.util.*;


public class TASK3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "JAVA";
        String s2 = "JAVA";
        String s3 = new String("JAVA");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        String text = "WRITE";
        String result = text.concat("CODE");
        System.out.println("After concatination: " + result);

        System.out.print("\ncount of words: ");
        int count = sc.nextInt();
        sc.nextLine();

        String[] list = new String[count];
        System.out.println("Enter " + count + " strings:");
        for (int i = 0; i < count; i++) {
            list[i] = sc.nextLine();
        }

        System.out.println("\nOriginal List:");
        for (String item : list) {
            System.out.print(item + " ");
        }

        Arrays.sort(list);
        System.out.println("\nSorted List:");
        for (String item : list) {
            System.out.print(item + " ");
        }

        System.out.println("\nReversed List:");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }

        StringBuilder wo = new StringBuilder();
        for (String item : list) {
            wo.append(item).append(" ");
        }

        System.out.println("\n\nMerged Text: " + wo.toString().trim());
        sc.close();
    }
}


