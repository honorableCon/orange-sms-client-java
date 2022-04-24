package org.saafara.smsclient.orange;

public interface SMSClientInterface {
    String getToken(String authHeaderValue);
    String getToken();
    String sendSMS(String sender, String receiver,String message);
    String getSMSBalance();
    String getSMSPurchaseHistory();
    String getSMSUsages();
    Integer getSMSCredits();
}
