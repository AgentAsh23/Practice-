class TryAndCatch
{
    public static void main(String[] args) 
    {
        int j=10;
        for(int i=-3;i<10;i++)
        {
            try
            {
                int k=j/i;
                System.out.println(k);
            }
            catch(Exception e)
            {
                System.out.println("Exception,Reason:");
                System.out.println(e);
            }
        }
    }
}
