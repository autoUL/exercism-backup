    public class LogLevels {
    
    public static String message(String logLine) {

        logLine = logLine.substring(logLine.indexOf(":")+1,logLine.length());
        logLine = logLine.trim();
        return logLine;
    }

    public static String logLevel(String logLine) {

        logLine = logLine.toLowerCase();
        logLine = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]"));
        logLine = logLine.trim();
        return logLine;
    }

    public static String reformat(String logLine) {

        String logMessage = LogLevels.message(logLine);
        String logLevelV = LogLevels.logLevel(logLine);
        return logMessage + " " + "(" + logLevelV + ")";

        
    }
}
