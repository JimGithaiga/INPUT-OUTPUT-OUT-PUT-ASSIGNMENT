import java.util.Scanner;
public class gradingprogram{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int choice = 0;
		String[]course = new String[5];
		int Score[]=new int[5];
		double sum=0.0;

	do{
		System.out.println("1. Enter a course name and a Score");
		System.out.println("2. Display All Scores");
		System.out.println("3. Calculate the average Grade");
		System.out.println("4. Exit");
	
	choice = input.nextInt();

			if( choice==1)
			{
					Scanner scancourse = new Scanner(System.in);
				
	System.out.println("Enter 5 Courses and their corresponding Scores:");
	System.out.println();

	int i = 0;
		for(i=0;i<5;i++)
		{ 
                System.out.println("Course:");
                String temp = scancourse.nextLine();
                course[i] = temp.toLowerCase();
                System.out.println("Score:");
                Score[i] = input.nextInt();
               		 if( i == ( course.length - 1 ) )
                	{
                    	System.out.println("You have succesfully entered your course work in your results!");
                  
                	}
            	}
        }
        if ( choice == 2 )
        {
            System.out.println("Course" + "\tScore");
            System.out.println("---------------------");

            for(int p = 0; p < course.length; p++)
            {

                System.out.println(course[p] + "\t" + "\t" + Score[p]);
            }
        }

        if ( choice == 3 )
        {   
              System.out.println("Total of Scores: " + getSum(Score));
              System.out.println("Count of Score: " + Score.length);
              System.out.println("Average of grades: " + getAverage(Score));
              System.out.println();
        }

  } while ( choice != 4);


}

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i : array) sum += i;
        return ((double) sum)/array.length;
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