import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        runStorageApp();
    }
    private static void runStorageApp(){
        Scanner scanner = new Scanner(System.in);
        Storage myStorage = new Storage();
        int chosenOption;
        System.out.println("Witaj w aplikacji zarządzającej magazynem");
        do{
            System.out.println("0 - Wyjdź z programu");
            System.out.println("1 - Dodaj produkt");
            System.out.println("2 - Usuń produkt");
            System.out.println("3 - Wydrukuj produkty");
            chosenOption = scanner.nextInt();
            scanner.nextLine();
            switch (chosenOption){
                case 1:
                    myStorage.addProduct(scanner);
                    break;
                case 2:
                    myStorage.deleteProduct(scanner);
                    break;
                case 3:
                    myStorage.printProducts();
                    break;
                default:
                    if(chosenOption != 0){
                        System.out.println("Pod podanym numerem nie ma żadnej akcji");
                    }
                    break;
            }
        } while (chosenOption != 0);
        System.out.println("Do widzenia!");
    }
}
