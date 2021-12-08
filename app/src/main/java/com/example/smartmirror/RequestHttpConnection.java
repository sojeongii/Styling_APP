package com.example.smartmirror;

import android.content.ContentValues;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class RequestHttpConnection {
    public String request(String _url, ContentValues _params) {
        HttpURLConnection urlConn = null;
        StringBuffer sbParams = new StringBuffer();

        //1. StringBuffer에 파라미터연결
        if (_params == null) // 보낼 데이터가 없으면 파라미터 비움
        {
            sbParams.append("");
        } else {
            boolean isAnd = false;

            //파라미터 값
            String key;
            String value;

            for (Map.Entry<String, Object> parameter : _params.valueSet()) {
                key = parameter.getKey();
                value = parameter.getValue().toString();

                //파라미터가 두 개 이상이면 파라미터 사이에 &
                if (isAnd) {
                    sbParams.append("&");
                }
                sbParams.append(key).append("=").append(value);
                if (!isAnd) {
                    if (_params.size() >= 2) {
                        isAnd = true;
                    }
                }
            }
        }
        try {
            URL url = new URL(_url);
            urlConn = (HttpURLConnection) url.openConnection();

            urlConn.setRequestMethod("GET");
            urlConn.setRequestProperty("Accept-Charset", "UTF-8");
            urlConn.setDoOutput(false);

            if (urlConn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                Log.d("HTTP_OK", "연결 요청 실패");
                return null;
            }

            BufferedReader reader = new BufferedReader((new InputStreamReader(urlConn.getInputStream())));

            String line;
            String page = "";

            while ((line = reader.readLine()) != null) {
                page += line;
            }
            return page;
        } catch (MalformedURLException e) {
            Log.d("MalformedURLException", String.valueOf(e));
            e.printStackTrace();
        } catch (IOException e) {
            Log.d("IOException", String.valueOf(e));
            e.printStackTrace();
        } finally {
            if (urlConn != null) {
                urlConn.disconnect();
            }

        }
        return null;
    }

}

