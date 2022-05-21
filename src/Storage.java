import java.util.Scanner;

public class Storage {
    private Product[] listOfProducts;
    private int numberOfProducts;

    public Storage() {
        listOfProducts = new Product[3];
    }

    public void addProduct(Scanner scanner) {
        if (numberOfProducts < listOfProducts.length) {
            System.out.println("Podaj nazwę produktu:");
            String productName = scanner.nextLine();
            System.out.println("Podaj cenę produktu:");
            double priceOfProduct = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj indeks tablicy, w którym chcesz umieścić produkt");
            int indexOfArray = scanner.nextInt();
            if (indexOfArray < 0 || indexOfArray >= listOfProducts.length) {
                System.out.println("Podany indeks wykracza poza rozmiar tablicy");
            } else if (listOfProducts[indexOfArray] != null) {
                System.out.println("Na podanym indeksie jest już produkt");
            } else {
                listOfProducts[indexOfArray] = new Product(productName, priceOfProduct);
                numberOfProducts++;
                System.out.println("Dodałeś produkt do magazynu! Aktualnie w magazynie znajdują się " + numberOfProducts + " produkt/y");
            }
        } else {
            System.out.println("Magazyn jest przepełniony. Musisz usunąć jakiś produkt");
        }
    }

    public void deleteProduct(Scanner scanner) {
        System.out.println("Podaj indeks produku, który chcesz usunąć. Podaj liczbę w zakresie od 0-2");
        int indexOfProductToDelete = scanner.nextInt();
        scanner.nextLine();
        if (indexOfProductToDelete >= listOfProducts.length || indexOfProductToDelete < 0) {
            System.out.println("Podałeś zły indeks produktu do usunięcia. Powinieneś podać liczbę 0-2");
        } else {
            listOfProducts[indexOfProductToDelete] = null;
            System.out.println("Produkt został usunięty!");
            numberOfProducts--;
        }
    }

    public void printProducts() {
        for (int i = 0; i < listOfProducts.length; i++) {
            if (listOfProducts[i] != null) {
                System.out.println("Nazwa produktu: " + listOfProducts[i].getProductName() + " " + "Cena produktu: " + listOfProducts[i].getPriceOfProduct());
            }
        }
    }

}
