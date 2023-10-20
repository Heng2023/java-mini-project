import Move.*;
import Options.*;
import Intro.Logo;
import Intro.ProductsInfo;
import Intro.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Options.Help.help;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logo logo = new Logo();
        logo.logo();

        int currentPage = 1;
        int rowsPerPage = 2;

        List<ProductsInfo> products = new ArrayList<>();
        products.add(new ProductsInfo(1,"Angkor",3000.0,70, LocalDate.now()));
        products.add(new ProductsInfo(2,"Anchor",3500.0,100, LocalDate.now()));
        products.add(new ProductsInfo(3,"Hanuman",3000.0,150, LocalDate.now()));
        products.add(new ProductsInfo(4,"Pepsi",2500.0,100, LocalDate.now()));
        products.add(new ProductsInfo(5,"Coca",2500.0,200, LocalDate.now()));
        products.add(new ProductsInfo(6,"Sting",2500.0,50, LocalDate.now()));

        do {
            Menu.menu();

            System.out.print("Command ---> ");
            String options = scanner.nextLine();

            switch (options) {
                case "*" -> Display.display(products, currentPage, rowsPerPage);
                case "w", "W" -> Write.write(products);
                case "r", "R" -> Read.read(products);
                case "u", "U" -> Update.update(products);
                case "d", "D" -> Delete.delete(products);
                case "f", "F" -> currentPage = First.first(products, currentPage, rowsPerPage);
                case "n", "N" -> currentPage = Next.next(products, currentPage, rowsPerPage);
                case "p", "P" -> currentPage =  Previous.previous(products, currentPage, rowsPerPage);
                case "l", "L" -> currentPage = Last.last(products, currentPage, rowsPerPage);
                case "g", "G" -> currentPage = Goto.goTo(products, currentPage, rowsPerPage);
                case "s", "S" -> Search.search(products, currentPage, rowsPerPage);
                case "se", "Se" -> rowsPerPage = SetRow.setRow(products, rowsPerPage);
                case "h", "H" -> help();
                case "e", "E" -> {
                    System.out.println("Good bye");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Option!");
            }
        } while (true);
    }
}
