package springconfiguration;

/**
 * Created by VietNV on 6/4/2019.
 */
public class HelloWorld
{
    private String name;

    public HelloWorld()
    {
    }

    public HelloWorld(String name)
    {
        this.name = name;
    }

    public void print()  {
        System.out.print("Hello World!"+name);
    }
}
