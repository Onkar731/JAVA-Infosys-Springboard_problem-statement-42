import java.util.Scanner;

import javax.swing.ScrollPaneLayout;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int N = sc.nextInt();

        // printing pascal triangle
        PascalTriangle.printPascalTriangle(N);

        // closing resource
        sc.close();
    }    
}
