package com.nutricloud.cloare_q.cookieandroid;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;

class PostAsync extends AsyncTask<String, String, JSONObject> {

    JSONParser jsonParser = new JSONParser();
    private static final String LOGIN_URL = "http://nutricloud.eu/NutriCloud/web/app_dev.php/login_check";


    @Override
    protected void onPreExecute() {
    }

    @Override
    protected JSONObject doInBackground(String... args) {

        try {

            HashMap<String, String> params = new HashMap<>();
            params.put("_username", args[0]);
            params.put("_password", args[1]);

            Log.d("request", "starting");

            JSONObject json = jsonParser.makeHttpRequest(
                    LOGIN_URL, "POST", params);

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