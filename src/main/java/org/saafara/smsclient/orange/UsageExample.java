package org.saafara.smsclient.orange;

// Example of usage of the SMSClient
public class UsageExample {
    public static void main(String[] args) {
        String authHeaderValue = System.getenv("SMS_AUTH_HEADER_VALUE");

        // create client
        SMSClient client = new SMSClient(authHeaderValue);

        // Show balance
        System.out.println(client.getSMSBalance());

        // Get purchase history
        System.out.println(client.getSMSPurchaseHistory());

        // Get SMS usage
        System.out.println(client.getSMSUsages());

        // Send SMS
        client.sendSMS("2210000", "221771234569", "Hello world!");

    }
}
