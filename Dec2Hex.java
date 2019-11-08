
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int inputnumber = 0;
        do {
            System.out.println("Please enter a number to convert to Hexidecimal");
            while (inputnumber != 0) {
                System.out.println("Sorry, your number must be an integer that is not zero.");
                sc.next(); 
            }
              inputnumber = sc.nextInt();
        }
        while (inputnumber <= 0); 
        if (args.length > 0) 
        {
            try 
            {
                Arg1 = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexadecimal="";
 
        System.out.println("Converting the Decimal Value " + inputnumber + " to Hex...");
        
        while(inputnumber > 0)
        {
	    rem = inputnumber%16;
	    hexadecimal= ch[rem] + hexadecimal;
        inputnumber = inputnumber/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }
}


