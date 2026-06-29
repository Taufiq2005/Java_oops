package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryDAO dao = new LibraryDAO();

        while (true) {

            System.out.println("\n1.Add Book");
            System.out.println("2.View Books");
            System.out.println("3.Exit");

            System.out.println("Enter Choice:");
            int ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.println("Enter Id:");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter Book Name:");
                String name = sc.nextLine();

                System.out.println("Enter Author:");
                String author = sc.nextLine();

                Book b = new Book(id, name, author);

                dao.addbook(b);

                break;

            case 2:

                dao.viewBooks();

                break;

            case 3:

                System.exit(0);
            }
        }
    }
}