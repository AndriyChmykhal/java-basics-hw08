import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        Pattern pattern = Pattern.compile("[0-2]?[0-9]?[0-9][.][0-2]?[0-9]?[0-9][.][0-2]?[0-9]?[0-9][.][0-2]?[0-9]?[0-9]");
        Matcher matcher = pattern.matcher(text);
        String ipAdress = "";
        if (matcher.find()) {
            ipAdress = matcher.group(0);
        }
        System.out.println(ipAdress);
        return ipAdress;
    }
}