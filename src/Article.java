import java.util.Scanner;

public class Article {

    private String ref, name, category;
    private double price;
    Scanner scannerArt = new Scanner(System.in);

    public Article(String ref, String name, String category, double price) {
        this.ref = ref;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getRef()
    {
        return ref;
    }

    public void setRef(String ref1)
    {
        ref = ref1;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name1)
    {
        name = name1;
    }


    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category1 )
    {
        category = category1;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price1)
    {
        price = price1;
    }

    public String toString()
    {
        return "Item name: " + name + " item Reference: " + ref + " item category " + category + " item price " + price;
    }




}
