package version2;
 
public class CommandExecutorProxy implements CommandExecutor {
 
    private boolean isAdmin;
    private CommandExecutor executor;
     
    public CommandExecutorProxy(String user, String pwd)
    {
        if("Makarand".equals(user) && "Admin123".equals(pwd))
        {
        	isAdmin=true;
        }
        executor = new CommandExecutorImpl();
    }
     
    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin)
        {
            executor.runCommand(cmd);
        }
        else
        {
            if(cmd.trim().startsWith("ms"))
            {
                throw new Exception(cmd + " command is not allowed for non-admin users.");
            }
            else
            {
                executor.runCommand(cmd);
            }
        }
    }
}