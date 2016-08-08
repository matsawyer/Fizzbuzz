//Solution to the infamous Fizz-buzz test.
public class fizzbuzz 
{
    public static void main(String[] args)
    {	
        for(int j = 1; j <= 100; j++)   //Loop using ternary operators
        {
            String spacetest = ""; //Empty string initialized at each number.
            spacetest += (j % 3) == 0 ? "FIZZ" : "";//number divisible by 3?
            spacetest += (j % 5) == 0 ? "BUZZ" : "";//number divisible by 5?
            System.out.println(spacetest.isEmpty() ?  j : spacetest);
            //If our empty string is empty, then our number which was not divisible by 3 or 5 is output.
            //otherwise, the contents of the string are output in place of the number iteration. Fizzbuzz.
        }
    }
}
