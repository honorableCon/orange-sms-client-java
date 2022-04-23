package org.saafara.smsclient.orange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SmsClient {
    public String getToken(String authHeaderValue) {
        try {
            URL url = new URL("https://api.orange.com/oauth/v3/token");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("Authorization", "Basic " + authHeaderValue);

            con.setDoOutput(true);
            con.getOutputStream().write("grant_type=client_credentials".getBytes());
            con.getOutputStream().flush();
            con.getOutputStream().close();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String content = response.toString().split(",")[1];
            String token = content.toString().split(":")[1].trim().replace("\"", "");

            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
