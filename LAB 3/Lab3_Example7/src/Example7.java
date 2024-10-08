public class Example7 {
    class animal
    {
        public void start()
        {
            System.out.println("Animal Sounds Start");
        }
    }
    class dog extends animal
    {
    public void start()
    {
        System.out.println("Dogs Barks :- ");
    }
    }
    public static void main(String[] args)
    {
        Example7 example7=new Example7();
        animal animal1=example7.new animal();
        animal1.start();
        dog dog1=example7.new dog();
        dog1.start();
        animal anotheranimal=example7.new dog();
        anotheranimal.start();
    }
}
