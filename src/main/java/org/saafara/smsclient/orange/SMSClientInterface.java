package org.saafara.smsclient.orange;

public interface SMSClientInterface {
    String getToken(String authHeaderValue);
    String sendSMS(String sender, String receiver,String message);
    String showSMSBalance();
    String showSMSHistory();
    String getUsages();
    Integer getSMSCredits();
}
