public class Example5 {
    class Vehicle
    {
        String model;
        String engine;

        Vehicle(String model,String engine)
        {
            this.model=model;
            this.engine=engine;
        }
        public void start()
        {
            System.out.println(model+"engine is starting");
        }


    }
    class car extends Vehicle
    {
        int door;
        car(String model,String engine,int door)
        {
            super(model,engine);
            this.door=door;
        }
        public void start()
        {
            super.start();
            System.out.println("Tha car has : "+door+" doors ");
        }
        public void display()
        {
            System.out.println("Model : "+super.model+"| Engine: "+super.engine+"| Door: "+door);
        }




    }

    public static void main(String[] args)
    {
      Example5 example5=new Example5();
      car car1=example5.new car("TESLA","Germany",2);
      car1.start();
      car1.display();
    }

}
