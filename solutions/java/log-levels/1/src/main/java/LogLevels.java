public class LogLevels {
    
    public static String message(String logLine) {
        if(logLine.contains("[INFO]:")){
            return logLine.substring(7).trim();   
        } else if(logLine.contains("[WARNING]:")){
            return logLine.substring(10).trim();   
        } else if(logLine.contains("[ERROR]:")){
            return logLine.substring(8).trim();   
        } else {
            return logLine;
        }
    }

    public static String logLevel(String logLine) {
        if(logLine.contains("[INFO]:")){
            return "info";   
        } else if(logLine.contains("[WARNING]:")){
            return "warning";   
        } else if(logLine.contains("[ERROR]:")){
            return "error";   
        } else {
            return logLine;
        }
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
