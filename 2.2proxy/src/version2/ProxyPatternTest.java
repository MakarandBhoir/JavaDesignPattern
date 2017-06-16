package version2;
 
 
public class ProxyPatternTest 
{
    public static void main(String[] args)
    {
        CommandExecutor executor = new CommandExecutorProxy("Makarand", "Admin123");
        try 
        {
            executor.runCommand("D:/flyweight.jar");
        	//executor.runCommand("mspaint");
        }
        catch (Exception e) 
        {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}