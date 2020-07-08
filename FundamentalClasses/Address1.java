public class Address1 implements Cloneable{

   int flatNo=1;
   String colony="Ameerpet";
   String city="Hyd";


   public Address1 clone() throws CloneNotSupportedException{
        return (Address1)super.clone();
   }

}