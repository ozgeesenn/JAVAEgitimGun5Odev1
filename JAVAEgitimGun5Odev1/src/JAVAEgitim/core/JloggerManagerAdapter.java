package JAVAEgitim.core;

import JAVAEgitim.jLogger.jLoggerManager;

public class JloggerManagerAdapter implements LoggerService {
    @Override
    public void logtoSystem(String message) {
        jLoggerManager jLoggerManager=new jLoggerManager();
        jLoggerManager.log(message);
    }
}
