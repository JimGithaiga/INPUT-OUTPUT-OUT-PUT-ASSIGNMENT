import java.util.Scanner;
public class Catalogue{
	public static void main(String[]args){
		//decralation fo all my variables that i`ll use in my catalogue
		Scanner input = new Scanner(System.in);
		int choice = 0;
		String[]bookname= new String[5];
		int quantity[]=new int[5];
		double sum=0.0;
//beggining of the structure to display and modify my code from the user inter face part
	do{
	 System.out.println("---------------------");
		System.out.println("1. Enter book name and Quantity");
		System.out.println("2. Display All Books");
		System.out.println("3. Total books");
		System.out.println("4. Exit");
	 System.out.println("---------------------");
	//the reading of the user interface keys, and the adding of new books and the quantity required,also displaying the total books and also calculating the total books entered
		// and also displaying the total number of books recorded via the catalogue
	choice = input.nextInt();

			if( choice==1)
			{
					Scanner scancourse = new Scanner(System.in);
				
	System.out.println("Enter 5 Courses and their corresponding Scores:");
	System.out.println();

	int i = 0;
		for(i=0;i<5;i++)
		{ 
	 System.out.println("**************");
                System.out.println("book name:");
                String temp = scancourse.nextLine();
                bookname[i] = temp.toLowerCase();
                System.out.println("quantity:");
                quantity[i] = input.nextInt();
               		 if( i == ( bookname.length - 1 ) )
                	{
                    	System.out.println("You have succesfully stored your books in the Catalogue!");
                  
                	}
            	}
        }
        if ( choice == 2 )
        {
            System.out.println("Book" + "\tquantity");
            System.out.println("---------------------");

            for(int p = 0; p < bookname.length; p++)
            {
	
	 

                System.out.println(bookname[p] + "\t" + "\t" + quantity[p]);
            }
        }

        if ( choice == 3 )
        {   
	 System.out.println("---------------------");
              System.out.println("Total of books: " + getSum(quantity));
              System.out.println("Total order: " + quantity.length);
              System.out.println();
        }

  } while ( choice != 4);


}
    public static double getSum(int[] array)
    {
        int sum = 0;
        for (int i : array) 
        {
         sum += i;
        }
        return sum;
    }

}
