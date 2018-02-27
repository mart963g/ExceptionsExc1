// Exercise 1
/** Exception Exercise file Start */
public class ExceptionsExercise
{
    public static void main(String[] args)
    {
        //Unchecked exception / runtime exception
        //Checked exceptions
        /*
        Catch the exceptions and be specific
         */
        try
        {
            testException();
        } catch (ArrayIndexOutOfBoundsException Ie)
        {
            System.out.println("Fucking kælling!");
        } catch(InterruptedException e)
        {
            System.out.println("Fuck dig din so!");
        }

        try
        {
            Thread.sleep(1000);
        } catch(InterruptedException e)
        {
            System.out.println("Interrupted again bitch!");
        }


        //Nested catch
        String[] strings =  {"første string på plads 0", "anden string på plads 1"};

        try
        {
            System.out.println(strings[2]);
            Thread.sleep(1000);
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Din cunt!");
        } catch(InterruptedException e)
        {
            System.out.println("Kæmpe cunt");
        }

        System.out.println("Hej");
        try
        {
            int a = 10;
            int b = 0;
            double result = a / b;
        } catch (ArithmeticException e)
        {
            System.out.println("Du kan ikke dividere med nul din so!");
        }

        try
        {
            validateAge(17);
        } catch (AgeValidationException e)
        {
            System.out.println("Hun er ikke gammel nok dit klamme svin!");
        }
        try
        {
            validateName("Bo");
        }catch (NameValidationException e)
        {
            e.printStackTrace();
        }

    }

    public static void testException() throws InterruptedException
    {
        String[] strings = {"første string på plads 0", "anden string på plads 1"};
        System.out.println(strings[2]);
    }

    public static void validateAge(int age) throws AgeValidationException
    {
        if(age<18)
        {
            throw new AgeValidationException();
        }
        else
        {
            System.out.print("All good");
        }
    }

    public static void validateName(String name) throws NameValidationException
    {
        if(name.length()<3)
        {
            throw new NameValidationException();
        }
    }
}
    /** Exception Exercise file Slut */

// Exercise 2
            /*
    Create your own exception it could be Gender-/Age-/-Name-Exception.
        extend exception and override the printStackTrace() method
        catch the Exception and print the message you created!?!
        */