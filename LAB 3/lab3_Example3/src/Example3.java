public class Example3 {
    class car
    {
        String model;
        String Color;
        int year;
        car(String model,String Color,int year)
        {
            this.model=model;
            this.Color=Color;
            this.year=year;
        }
        void display_details()
        {
            System.out.print("Model : "+model+" | Color: "+Color+" | Year "+year);

        }


    }
    public static void main(String[] args)
    {
        Example3 example3=new Example3();
        car car1 = example3.new car("Toyota", "White", 2023);
        car1.display_details();
    }

}
