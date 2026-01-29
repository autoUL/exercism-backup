    public class LogLevels {
    
    public static String message(String logLine) {

        logLine = logLine.replaceAll("\\[.*?\\]\\:","");
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


        String logStandIn = logLine.substring(logLine.indexOf("["), logLine.indexOf("]")+1).toLowerCase().replace("[","(").replace("]",")");

        logLine = logLine.substring(logLine.indexOf("]")+1,logLine.length()).replace(":","");
        logLine = logLine.trim();

        logLine = logLine + " " + logStandIn;


        return logLine;
        
    }
}
