# Orange SMS API 📬

[![Made-In-Senegal](https://github.com/GalsenDev221/made.in.senegal/blob/master/assets/badge.svg)](https://github.com/GalsenDev221/made.in.senegal)

> Orange SMS is a client library that allow you to send SMS with Java using the [Orange SMS API](https://developer.orange.com/apis/sms-sn/overview)

## Disclaimer ⛔

This gem is not an official client of Orange, in order to use the client you need to create a [Orange SMS API](https://developer.orange.com/apis/sms-sn/overview) and to register an app in the developer dashboard that orange provide to you.  
After registering your app you can ask for SMS integration approval (this process can take time :)  
The registration process is detailed [here](https://developer.orange.com/apis/sms-sn/overview)

Instead of reading and trying to understand once again how the Orange SMS API work this package aims to let you quickly send SMS from Java using the [Orange SMS API](https://developer.orange.com/apis/sms-sn/overview).

Check this [link](https://developer.orange.com/apis/sms-sn/overview) to find the steps of app creation.

## Install 📥
### Maven

## Usage ✅

1. Copy your Authorization header value [here](https://developer.orange.com/myapps)
(if you have already create an app)
2. generate token with `getToken` function
3. send sms with `sendSMS` function


Exemple : [usageExample.java](/src/main/java/org/saafara/smsclient/orange/UsageExample.java)

### Java 📦  


```java
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
```

### Interfaces 📚 


- **sendSMS** : for sending SMS
  - params : 
      - senderAddress
      - receiverAddress
      - message
  - return (String)
      - response
 

 - **showSMSBalance** : to show balance
     - return (String)
        - balance

 - **getUsageStats** : to get usage stats
     - return (String)
        - stats

- **getPurchaseHistory** : to get purchase history
     - return (String)
        - history
       
#### Contributing 🤝

Bug reports and Pull Requests are welcome 👋🏽  
You can tell me **[HERE](https://github.com/honorableCon/OrangeSMS-API/issues)**

#### License 🔖

This project is under **[MIT License](https://opensource.org/licenses/MIT)**.
