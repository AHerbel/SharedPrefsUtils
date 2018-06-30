package com.augustoherbel.sharedprefsutils.gson;

import com.augustoherbel.sharedprefsutils.base.BaseSharedPrefsUtils;
import com.google.gson.Gson;

public class SharedPrefsUtils extends BaseSharedPrefsUtils {

    public static void putObject(String keyName, Object keyValue) {
        try {
            putString(keyName, new Gson().toJson(keyValue));
        } catch (Exception | Error e) {
            e.printStackTrace();
        }
    }

    public static <T> T getObject(String keyName, Class<T> keyValue) {
        try {
            return new Gson().fromJson(getString(keyName, ""), keyValue);
        } catch (Exception | Error e) {
            e.printStackTrace();
            return null;
        }
    }
}