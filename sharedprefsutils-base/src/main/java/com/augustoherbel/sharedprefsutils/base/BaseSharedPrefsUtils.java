package com.augustoherbel.sharedprefsutils.base;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;
import java.util.Set;

public abstract class BaseSharedPrefsUtils {

    private static SharedPreferences sp;
    private static String spName;

    public static void initialize(Context context, String spName) {
        if(sp == null) sp = context.getSharedPreferences(spName, Context.MODE_PRIVATE);
        BaseSharedPrefsUtils.spName = spName;
    }

    public static SharedPreferences getSharedPreferences() {
        return sp;
    }

    public static String getSharedPreferencesName() {
        return spName;
    }

    public static int getInt(String key, int defaultValue) {
        return getSharedPreferences().getInt(key, defaultValue);
    }

    public static boolean getBoolean(String key, boolean defaultValue) {
        return getSharedPreferences().getBoolean(key, defaultValue);
    }

    public static String getString(String key, String defaultValue) {
        return getSharedPreferences().getString(key, defaultValue);
    }

    public static float getFloat(String key, float defaultValue) {
        return getSharedPreferences().getFloat(key, defaultValue);
    }

    public static long getLong(String key, long defaultValue) {
        return getSharedPreferences().getLong(key, defaultValue);
    }

    public static Set<String> getStringSet(String key, Set<String> defaultValue) {
        return getSharedPreferences().getStringSet(key, defaultValue);
    }

    public static void putInt(String key, int value) {
        getSharedPreferences().edit().putInt(key, value).apply();
    }

    public static void putBoolean(String key, boolean value) {
        getSharedPreferences().edit().putBoolean(key, value).apply();
    }

    public static void putString(String key, String value) {
        getSharedPreferences().edit().putString(key, value).apply();
    }

    public static void putFloat(String key, float value) {
        getSharedPreferences().edit().putFloat(key, value).apply();
    }

    public static void putLong(String key, long value) {
        getSharedPreferences().edit().putLong(key, value).apply();
    }

    public static void putStringSet(String key, Set<String> value) {
        getSharedPreferences().edit().putStringSet(key, value).apply();
    }

    public static Map<String, ?> getAll() {
        return getSharedPreferences().getAll();
    }

    public static void remove(String key) {
        getSharedPreferences().edit().remove(key).apply();
    }

    public static void clear() {
        getSharedPreferences().edit().clear().apply();
    }

    public static boolean contains(String key) {
        return getSharedPreferences().contains(key);
    }
}
