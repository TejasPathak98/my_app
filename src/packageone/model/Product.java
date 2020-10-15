package packageone.model;

public class Product
{
    private  String name;
    int x,y,z;


    public Product(String name)
    {
        super();
        this.name = name;
    }

    public Product(int x)
    {
        super();
        this.x = x;
    }

    public Product(int x,int y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    public Product(int x,int y,int z)
    {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return name;
    }
}
