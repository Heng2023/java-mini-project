package Move;

import Intro.ProductsInfo;

import java.util.List;

import static Options.Display.display;

public class Last {
    public static int last(List<ProductsInfo> products, int currentPage, int rowsPerPage) {
        int totalPages = (int) Math.ceil((double) products.size() / rowsPerPage);
        if (currentPage == totalPages) {
            System.out.println("You are already on the last page.");
        } else {
            currentPage = totalPages;
            display(products, currentPage, rowsPerPage);
        }
        return currentPage;
    }
}
