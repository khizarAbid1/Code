public class Example9 {
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
        Example9 example9=new Example9();
        Example9.dog dog1=example9.new dog();
        dog1.sound();
        dog1.sleep();
    }
}

