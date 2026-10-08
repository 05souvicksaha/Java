class Bottle
{
    char colour;
    String shape ;
    String material ;
    Double height ;
    Double width ;
    Double depth ;

    void capacity ()
    {
      System.out.println("Capacity Result :"+ height*width*depth);
    } 
    void weight ()
    {
        if (material.equalsIgnoreCase("Metal"))
          System.out.println("Heavy weight");
        else 
         System.out.println("Light weight");
    }
     void display ()
    {
      System.out.println("Colour =" + colour);
      System.out.println("Material =" + material );
      System.out.println("Shape =" + shape);
    }
}
 class Testbottle
 {
    public static void main(String args[])
    {
        Bottle b1= new Bottle();
        b1.height = 10.0 ;
        b1.width = 20.0 ;
        b1.depth = 30.0 ;
        b1.colour = 'g';
        b1.material = "metal" ;
        b1.shape = "Cylinder" ;

        b1.capacity();
        b1.display();
        b1.weight();
        
        System.out.println("\n");

        Bottle b2= new Bottle();
        b2.height = 40.0 ;
        b2.width = 50.0 ;
        b2.depth = 60.0 ;
        b2.colour = 'r';
        b2.material = "plastic" ;
        b2.shape = "Oval" ;

        b2.capacity();
        b2.display();
        b2.weight();
    }
 }

