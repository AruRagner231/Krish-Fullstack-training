public class stringReverse(){
	
    public static void main (String[] args)
	
{
   
		String s1 = "hello there";
		System.out.println(reverser(s1));

     }

    public static String reverser(String s1)
    {
        String reversedString = "";

        for(int i = s1.length()-1; i >=0 ; i--)
        {

            reversedString+= s1.charAt(i);
        }
        return reversedString;

    }
	
      }