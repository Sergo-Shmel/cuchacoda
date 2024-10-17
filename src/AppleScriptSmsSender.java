import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppleScriptSmsSender {

    public static void main(String[] args) {
        String phoneNumber = "+79131475273";
        String messageText = "Привет, это сообщение отправлено с помощью Java!";

        try {
            sendSms(phoneNumber, messageText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendSms(String phoneNumber, String messageText) throws Exception {
        String script = String.format("osascript -e 'tell application \"Messages\" to send \"%s\" to buddy \"%s\"'", messageText, phoneNumber);

        Process process = Runtime.getRuntime().exec(script);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        int exitCode = process.waitFor();
        System.out.println("Exit Code: " + exitCode);
    }
}