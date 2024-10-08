public class Example_2 {
    public static void print_stars(int blanks,int straightInLine)
    {

        for(int count=1;count<=blanks;count++)
        {
            System.out.println(" ");
        }

        for(int count=1;count<=straightInLine;count++)
        {
            System.out.println("*");
        }

        System.out.println();
}


    public static void main(String[] args)
    {
        print_stars(3,5);
    }


}
