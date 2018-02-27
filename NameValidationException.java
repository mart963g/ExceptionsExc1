public class NameValidationException extends Exception
{

    public NameValidationException()
    {
        super();
    }

    public NameValidationException(String s)
    {
        super(s);
    }

    @Override
    public void printStackTrace()
    {
        System.out.println("Fucking pis!");
    }



}
