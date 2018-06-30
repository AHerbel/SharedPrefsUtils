package com.augustoherbel.sharedprefsutils.gson;

import android.content.Context;

import com.augustoherbel.sharedprefsutils.BaseSharedPrefUtils;
import com.google.gson.Gson;

public class SharedPrefUtils extends BaseSharedPrefUtils {

    private static final String STRING_EMPTY = "";
    private static Gson gson;

    public static void initialize(Context context, String spName) {
        initialize(context, spName);
        gson = new Gson();
    }

    public static void putObject(String keyName, Object keyValue) {
        try {
            putString(keyName, gson.toJson(keyValue));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Error x) {
            x.printStackTrace();
        }
    }

    public static <T> T getObject(String keyName, Class<T> keyValue) {
        try {
            return gson.fromJson(getString(keyName, STRING_EMPTY), keyValue);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (Error x) {
            return null;
        }
    }
}