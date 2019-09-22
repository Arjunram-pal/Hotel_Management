import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args){
        
        try
        {           
        File f = new File("backup");
        if(f.exists())
        {
            FileInputStream fin=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fin);
            Hotel.ob=(holder)ois.readObject();
        }
        Scanner sc = new Scanner(System.in);
        int ch,ch2;
        char wish;
        x:
        do{
            
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|     |  -----  -------  ------- |      	   ----- -----		 	");
        System.out.println("|     |  |    |    |     |       |      	  |	|     |	 |-	   |	");
        System.out.println("|     |  |    |    |     |       |      	  |	|     |	 |  -	   |	");
        System.out.println("|-----|  |    |    |     ------- |      ===== |	|     |	 |   -     |	");
        System.out.println("|     |  |    |    |     |       |      	  |	      |	 |    -    |	");
        System.out.println("|     |  |    |    |     |       |      	  |	      |	 |     -   |	");
        System.out.println("|     |   ----     |     ------- -------	  |	      |	 |	-  |	");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\nEnter your choice :\n1.Display room details\n2.Book\n3.Order food\n4.Checkout\n5.Exit\n");
                ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
                    Hotel.features(ch2);
                break;
            case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                     ch2 = sc.nextInt();
                     Hotel.bookroom(ch2);                     
                break;
            case 3:
                 System.out.print("Room Number -");
                     ch2 = sc.nextInt();
                     if(ch2>60)
                         System.out.println("Room doesn't exist");
                     else if(ch2>40)
                         Hotel.order(ch2-41,4);
                     else if(ch2>30)
                         Hotel.order(ch2-31,3);
                     else if(ch2>10)
                         Hotel.order(ch2-11,2);
                     else if(ch2>0)
                         Hotel.order(ch2-1,1);
                     else
                         System.out.println("Room doesn't exist");
                     break;
            case 4:                 
                System.out.print("Room Number -");
                     ch2 = sc.nextInt();
                     if(ch2>60)
                         System.out.println("Room doesn't exist");
                     else if(ch2>40)
                         Hotel.deallocate(ch2-41,4);
                     else if(ch2>30)
                         Hotel.deallocate(ch2-31,3);
                     else if(ch2>10)
                         Hotel.deallocate(ch2-11,2);
                     else if(ch2>0)
                         Hotel.deallocate(ch2-1,1);
                     else
                         System.out.println("Room doesn't exist");
                     break;
            case 5:break x;
                
        }
           
            System.out.println("\nContinue : (y/n)");
            wish=sc.next().charAt(0); 
            if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
            {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0); 
            }
            
        }while(wish=='y'||wish=='Y');    
        
        Thread t=new Thread(new write(Hotel.ob));
        t.start();
        }        
            catch(Exception e)
            {
                System.out.println("Not a valid input");
            }
    }

}




