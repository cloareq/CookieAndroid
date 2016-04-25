package com.nutricloud.cloare_q.cookieandroid;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by cloare_q on 4/24/16.
 */
public class GetAsync  extends AsyncTask<String, String, JSONObject> {

    JSONParser jsonParser = new JSONParser();
    private static final String LOGIN_URL = "http://patient1:patient1@nutricloud.eu/NutriCloud/web/app_dev.php/patient/info";


    @Override
    protected void onPreExecute() {
    }

    @Override
    protected JSONObject doInBackground(String... args) {

        try {

            HashMap<String, String> params = null;

            Log.d("request", "starting");

            JSONObject json = jsonParser.makeHttpRequest(
                    LOGIN_URL, "GET", params);

            if (json != null) {
                Log.d("JSON result", json.toString());
                System.out.println("JSON --->" + json);
                return json;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    protected void onPostExecute(JSONObject json) {
    }

}