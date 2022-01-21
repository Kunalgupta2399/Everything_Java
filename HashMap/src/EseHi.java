public class EseHi {
    public static void main(String[] args) {
    C c = new C();
    c.inc();
        System.out.println(c.x);

    }

    }
    class C{
    int x = 0 ;
    void inc(){
        x++;
        x++;
    }
    }
