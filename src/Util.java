import java.util.ArrayList;
import java.util.Objects;


public class Util {

    public void search_art_reference(ArrayList<Article> stock, String reference)
    {
        int foundindex = 0;
        boolean notFound = true;
        for(int j= 0; j < stock.size();j++ )
        {

            if (Objects.equals(stock.get(j).getRef(), reference))
            {
              //  stock.get(j);
                notFound = false;
                foundindex = j;
                break;
            }
        }
        if (!notFound)
        {
            System.out.println("The item with this reference is available in our stock ");
            System.out.println(stock.get(foundindex));
        }
        else {System.out.println("The item with this reference isn't available in our stock ");}
    }

    public void add_art_reference(ArrayList<Article> stock, String reference, Article article)
    {

       // int foundIndex = 0;
        boolean notFound = true;

        for(int i = 0; i < stock.size(); i++)
        {
            if (Objects.equals(stock.get(i).getRef(), reference)) {
                notFound = false;
                break;
            }

        }
        if(notFound){
            stock.add(article);
        }
        else { System.out.println("We already have an article with this reference");}

        System.out.println(stock);
    }

    public void delete_art_reference(ArrayList<Article> stock, String reference)
    {
        int foundIndex = 0;
        boolean notFound = true;
        for (int i = 0; i < stock.size(); i++)
        {
            if (Objects.equals(stock.get(i).getRef(), reference))
            {
                notFound = false;
                break;
            }
        }
        if (notFound == false)
        {
            stock.remove(foundIndex);
            System.out.println(stock);
        }
        else {
            System.out.println("This item does not exist in our stock");
             }
    }

    public void modify_art_reference(ArrayList<Article> stock, String reference, Article article)
    {
        int foundIndex = 0;
        boolean notFound = true;
        for(int i = 0; i < stock.size(); i++)
        {
            if(Objects.equals(stock.get(i).getRef(), reference))
            {
                notFound = false;
                foundIndex = i;
                break;
            }
        }

        if (notFound == false)
        {
           stock.set(foundIndex, article);
           System.out.println(stock);
        }
        else {System.out.println("We cannot make any changes because we do not have this item");}

    }

    public void search_art_name(ArrayList<Article> stock, String name)
    {
        int foundIndex = 0;
        boolean notFound = true;
        for(int i =0; i < stock.size(); i++)
        {
            if(Objects.equals(stock.get(i).getName(), name))
            {
                notFound = false;
                foundIndex = i;
                break;
            }
        }
        if (notFound == false)
        {
            System.out.println("The item with this reference is available in our stock");
            System.out.println(stock.get(foundIndex));
        }
        else {System.out.println("The item with this reference isn't available in our stock ");}
    }



    public void search_art_category(ArrayList<Article> stock, String category)
    {
        int foundIndex = 0;
        boolean notFound = true;
        ArrayList<Article> artCategory = new ArrayList<>();
        for(int i =0; i < stock.size(); i++)
        {
            if(Objects.equals(stock.get(i).getCategory(), category))
            {
                artCategory.add(stock.get(i));
                notFound = false;
                foundIndex = i;
            }
        }
        if (notFound == false)
        {
            System.out.println("This category of item is available in our stock");
            System.out.println(artCategory);
           // System.out.println(stock.get(foundIndex));
        }
        else {System.out.println("We do not have this product category");}
    }

    public void category_stock(ArrayList<Article> stock)
    {
        ArrayList<String> categories = new ArrayList<>();
        String inst_category;
        int i, j ;
        for(i = 0; i < stock.size(); i++ )
        {
            inst_category = stock.get(i).getCategory();
           /* if (!Objects.equals(categories.get(i), categories.get(i + 1)))
            {
                categories.add(i,inst_category);
            }*/
            categories.add(i, inst_category);
            System.out.println(categories.get(i));
        }
    }

    public void nbItem_category(ArrayList<Article> stock, String category)
    {
        int nbItem = 0;
        for(int i = 0; i < stock.size(); i++)
        {
            if(Objects.equals(stock.get(i).getCategory(), category))
            {
                nbItem++;
            }
        }
        System.out.println(nbItem + " item(s)");
    }

    public void display_art(ArrayList<Article> stock)
    {
        for(int i = 0; i < stock.size(); i++)
        {
            System.out.println(stock.get(i));
        }
    }

    public void search_art_ranging_price(ArrayList<Article> stock, double price1, double price2)
    {
        boolean notFound = true;
      //  int j = 0;
        ArrayList<Article> artPrice = new ArrayList<>();
        for(int i = 0; i < stock.size(); i++)
        {
            if ((stock.get(i).getPrice() <= price2 && stock.get(i).getPrice() >= price1) ||(stock.get(i).getPrice() <= price1 && stock.get(i).getPrice() >= price2))
            {
               notFound = false;
              // j = i;
               artPrice.add(stock.get(i));
            }
        }

        if (notFound == false)
        {
            System.out.println(artPrice);
        }
        else {System.out.println("We have no products in this price range");}

    }



}
