package Move;

import Intro.ProductsInfo;

import java.util.List;

import static Options.Display.display;

public class Previous {
    public static int previous(List<ProductsInfo> products, int currentPage, int rowsPerPage) {
        if (currentPage > 1) {
            currentPage--;
            display(products, currentPage, rowsPerPage);
        } else {
            System.out.println("You are already on the first page.");
        }
        return currentPage;
    }
}
