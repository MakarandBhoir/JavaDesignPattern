package version2;
 
import java.io.IOException;
 
public class CommandExecutorImpl implements CommandExecutor {
 
    @Override
    public void runCommand(String cmd) throws IOException 
    {
    	if(cmd.endsWith(".jar"))
    	{
    		Runtime.getRuntime().exec("java -jar "+cmd);
    	}    	
    	else
    	{
    		Runtime.getRuntime().exec(cmd);
    	}
        System.out.println("'" + cmd + "' command executed.");
    }
 
}