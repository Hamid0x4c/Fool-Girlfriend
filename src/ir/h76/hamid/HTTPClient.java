/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.h76.hamid;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 *
 * @author A.I
 */
public class HTTPClient {
    private final String API_KEY = "c43f2e366c4c5678d1ae92bb2d422aa757db20c0d5ea35dfb507b0e9ab97e8a0";
    private final String BASE_URL = "https://min-api.cryptocompare.com";
    private final String fullURL = BASE_URL + "/data/price?fsym=BTC&tsyms=USD&api_key=" + API_KEY;
    private double bitCoinPrice = 0.0;
    private final String USER_AGENT = "Mozilla/5.0";
    public final int myLong = 2000;
    private Bitcoin bitcoin;
    
    public Bitcoin getData() {
        // get data from url
        try {
            URL url = new URL(fullURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);
            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            
            //print result
            String priceJson = response.toString();
            Gson gson = new Gson();
            bitcoin = gson.fromJson(priceJson, Bitcoin.class);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
        return bitcoin;
    }
}
