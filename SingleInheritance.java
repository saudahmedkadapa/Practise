
class car{
    void model()
    {
        System.out.println("1.4x4 \n 2.Suv \n 3. luxury Cars ");
    }
}
class RollsRoyce extends car
{
    void model()
    {
        System.out.println("Luxury Car");
    }

}
class Thar extends car{
    void model(){
        System.out.println("4x4");

    }
}




public class SingleInheritance {

    public static void main(String[] args) {
      Thar obj=new Thar();
      obj.model();
        
    }
}



