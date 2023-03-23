import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String rep = "";
   do {
       String nameArt = null, referenceArt = null, categoryArt = null;
       Scanner tc = new Scanner(System.in);
       ArrayList<Article> stock = new ArrayList<>();
       Article article = new Article("12AK47", "Wipes", "Hygiene", 500.46);
    //   System.out.println(article);
       Article article1 = new Article("12AK45", "Eau de cologne Dove", "Perfumery", 3500.98);
       Article article4 = new Article("12AK49", "Food Paws", "Food ", 550.18);
       Article article6 = new Article("13AK78", "Gel De Douche le Marseilles", "Perfumery", 8769.67);
       Article article7 = new Article("28NB01", "Exfoliating cream Alby", "Body care", 7541.8);
       Article article8 = new Article("34TY34", "Creamy milk Beti", "Food", 1000.0);
       stock.add(0, article1);
       stock.add(1, article);
       stock.add(2, article4);
       stock.add(3, article6);
       stock.add(4, article7);
       stock.add(5, article8);
       int cx;
       String ref = "";

       Util utils = new Util();
       //utils.add_art_reference(stock,);
       System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("                                                                WELCOME TO OUR PLATFORM");
       System.out.println("");
       System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("");
       System.out.println("1-Search an item by reference ");
       System.out.println("");
       System.out.println("2-Add an item to the stock by checking the reference unit");
       System.out.println("");
       System.out.println("3-Delete an item by reference ");
       System.out.println("");
       System.out.println("4-Modify an item by reference ");
       System.out.println("");
       System.out.println("5-Search an item by name ");
       System.out.println("");
       System.out.println("6-Search for an item by category*");
       System.out.println("");
       System.out.println("7-Get the categories present in a stock");
       System.out.println("");
       System.out.println("8-Get the number of items in a given category");
       System.out.println("");
       System.out.println("9-Display all items");
       System.out.println("");
       System.out.println("10- Search for an item by selling price range");
       System.out.println("");
       System.out.println("11- Exit");
       System.out.println("");
       System.out.println("");
       cx = tc.nextInt();
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------s--------------------------");
       switch (cx) {
           case 1:

               System.out.println("please enter the reference id");
               Scanner scannerRef = new Scanner(System.in);
               ref = scannerRef.nextLine();
               utils.search_art_reference(stock, ref);
               break;

           case 2:

               Scanner scannerArt = new Scanner(System.in);
               System.out.println("Enter the reference");
               ref = scannerArt.nextLine();
               System.out.println("Enter the name");
               String name = scannerArt.nextLine();
               System.out.println("Enter the category");
               String category = scannerArt.nextLine();
               System.out.println("Enter the price");
               double price = scannerArt.nextDouble();
               Article article3 = new Article(ref, name, category, price);
               utils.add_art_reference(stock, ref, article3);
               break;

           case 3:
               System.out.println("please enter the reference id");
               Scanner scannerDel = new Scanner(System.in);
               ref = scannerDel.nextLine();
               utils.delete_art_reference(stock, ref);
               break;

           case 4:

               Scanner scannerMod = new Scanner(System.in);
               System.out.println("Enter the reference");
               ref = scannerMod.nextLine();
               System.out.println("Enter the name");
               String nameMod = scannerMod.nextLine();
               System.out.println("Enter the category");
               String categoryMod = scannerMod.nextLine();
               System.out.println("Enter the price");
               double priceMod = scannerMod.nextDouble();
               Article article5 = new Article(ref, nameMod, categoryMod, priceMod);
               utils.modify_art_reference(stock, ref, article5);
               break;

           case 5:
               Scanner scannerSearch = new Scanner(System.in);
               System.out.println("Enter the name");
               String nameSearch = scannerSearch.nextLine();
               utils.search_art_name(stock, nameSearch);
               break;

           case 6:
               System.out.println("please enter the category");
               Scanner scannerCat = new Scanner(System.in);
               categoryArt = scannerCat.nextLine();
               utils.search_art_category(stock, categoryArt);
               break;

           case 7:
               utils.category_stock(stock);
               break;

           case 8:
               System.out.println("please enter the category");
               Scanner scannerNbCat = new Scanner(System.in);
               categoryArt = scannerNbCat.nextLine();
               utils.nbItem_category(stock, categoryArt);
               break;

           case 9:
               utils.display_art(stock);
               break;

           case 10:
               Scanner scannerPrice = new Scanner(System.in);
               System.out.println("Enter the price 1 ");
               double price1 = scannerPrice.nextDouble();
               System.out.println("Enter the price 2 ");
               double price2 = scannerPrice.nextDouble();
               utils.search_art_ranging_price(stock, price1, price2);
               break;

           case 11:
               Scanner scannerRep = new Scanner(System.in);
               System.out.println("Do you want to do another operation?(yes/no)");
               rep = scannerRep.nextLine();

               if(rep != "yes")
               {
                   System.exit(1);
                   break;
               }

       }

   } while ( true);
    }
}