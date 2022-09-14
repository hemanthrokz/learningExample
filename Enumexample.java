

public class Enumexample
{
    enum Mobile
    {
        APPLE,
        SAMSUNG,
        HTC
    }
    public static void main(String[]args)
    {
        Mobile m=Mobile.APPLE;
        switch (m)
        {
            case HTC:
                System.out.println("outdated mobiles");
                break;
            case APPLE:
                System.out.println("best mobile ");
                break;
            case SAMSUNG:
                System.out.println("best display");
                break;

        }

    }
}