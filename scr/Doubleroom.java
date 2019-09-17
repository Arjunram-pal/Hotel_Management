import java.io.Serializable;
public class Doubleroom extends Singleroom implements Serializable 
{ 
    String name2;
    String contact2;
    String gender2;  
    
    Doubleroom()
    {
        this.name="";
        this.name2="";
    }
    Doubleroom(String name,String contact,String gender,String name2,String contact2,String gender2)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }
}
class NotAvailable extends Exception
{
    @Override
    public String toString()
    {
        return "Not Available !";
    }
}

class holder implements Serializable
{
    Doubleroom arr1[]=new Doubleroom[10]; //Luxury
    Doubleroom arr2[]=new Doubleroom[20]; //Deluxe
    Singleroom arr3[]=new Singleroom[10]; //Luxury
    Singleroom arr4[]=new Singleroom[20]; //Deluxe
}
