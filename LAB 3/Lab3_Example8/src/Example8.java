public class Example8 {
    abstract class animal
    {
        public abstract void sound();
        public void sleep()
        {
            System.out.println("Animal is sleeping");

        }

    }
    class dog extends animal
    {
       public void sound()
       {
           System.out.println("Dog is barking");
       }


    }

    public static void main(String[] args)
    {
        Example8 example8=new Example8();
        dog dog1=example8.new dog();
        dog1.sound();
        dog1.sleep();
    }
}
