public class Example6 {
    class cal
    {
        public int add(int a,int b)
        {
            return a+b;
        }
        public double add(double a,double b)
        {
            return a+b;
        }
    }
    public static void main(String[] args)
    {
        Example6 example6=new Example6();
        cal cal1=example6.new cal();
        System.out.println("Adding Integers Values : "+cal1.add(12,13));
        System.out.println();
        System.out.println("Adding Double Values : "+cal1.add(12.1,13.1));
    }

}
