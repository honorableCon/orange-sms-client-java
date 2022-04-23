package org.saafara.smsclient.orange;

public class UsageExample {
    public static void main(String[] args) {
        // create client
        SmsClient client = new SmsClient();
        String authHeaderValue = System.getenv("SMS_AUTH_HEADER_VALUE");
        String token = client.getToken(authHeaderValue);

        System.out.println("Token: " + token);

    }
}
