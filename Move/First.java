package Move;

import Intro.ProductsInfo;

import java.util.List;

import static Options.Display.display;

public class First {
    public static int first(List<ProductsInfo> products, int currentPage, int rowsPerPage) {
        if (currentPage == 1) {
            System.out.println("You are already on the first page.");
        } else {
            currentPage = 1;
            display(products, currentPage, rowsPerPage);
        }
        return currentPage;
    }
}
