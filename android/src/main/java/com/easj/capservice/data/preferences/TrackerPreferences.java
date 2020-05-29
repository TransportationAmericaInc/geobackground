package com.easj.capservice.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.easj.capservice.entities.SessionData;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class TrackerPreferences implements ITrackerPreferences {

    private static final String CLASS_NAME = TrackerPreferences.class.getName();

    private static final String TRACKER_PREFS_NAME = CLASS_NAME + ".preferences";
    private static final String DRIVER_ID = CLASS_NAME + ".driverId";
    private static final String DRIVER_NAME = CLASS_NAME + ".driverName";
    private static final String VEHICLE_ID = CLASS_NAME + ".vehicleId";
    private static final String VEHICLE_NAME = CLASS_NAME + ".driverName";
    private static final String ROUTE_ID = CLASS_NAME + ".routeId";
    private static final String ROUTE_NAME = CLASS_NAME + ".routeName";
    private static final String LATITUDE = CLASS_NAME + ".latitude";
    private static final String LONGITUDE = CLASS_NAME + ".longitude";
    private static final String SPEED = CLASS_NAME + ".speed";
    private static final String DATE = CLASS_NAME + ".date";
    private static final String STATE = CLASS_NAME + ".state";
    private static final String SOCKETURL = CLASS_NAME + ".socketUrl";
    private static final String EVENTNEWPOSITION = CLASS_NAME + ".eventNewPosition";
    private static final String TOKEN = CLASS_NAME + ".token";
    private static final String DRIVER_STATUS = CLASS_NAME + ".driverStatus";

    private static TrackerPreferences INSTANCE;
    private SharedPreferences preferences;

    public TrackerPreferences(Context context) {
        preferences = context.getApplicationContext().getSharedPreferences(TRACKER_PREFS_NAME,
                Context.MODE_PRIVATE);
    }

    public static TrackerPreferences getInstance(Context context){
        if (INSTANCE == null) {
            INSTANCE = new TrackerPreferences(context);
        }
        return INSTANCE;
    }

    @Override
    public void save(SessionData data) {
        if (data != null) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();
            editor.putString(DRIVER_ID, data.getDriverId());
            editor.putString(DRIVER_NAME, data.getDriverName());
            editor.putString(VEHICLE_ID, data.getVehicleId());
            editor.putString(VEHICLE_NAME, data.getDriverName());
            editor.putString(ROUTE_ID, data.getRouteId());
            editor.putString(ROUTE_NAME, data.getRouteName());
            editor.putString(SOCKETURL, data.getSocketUrl());
            editor.putString(EVENTNEWPOSITION, data.getEventNewPosition());
            editor.putString(TOKEN, data.getToken());
            editor.apply();
        }
    }

    @Override
    public void clearData() {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(TOKEN, "");
        editor.apply();
    }

    @Override
    public void setDriverStatus(JSONObject driverStatus) {
        if (driverStatus != null) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(DRIVER_STATUS, driverStatus.toString());
            editor.apply();
        }
    }

    @Override
    public JSONObject getDriverStatus() throws JSONException {
        return new JSONObject(preferences.getString(DRIVER_STATUS, ""));
    }

    @Override
    public SessionData getSessionData() {
        return new SessionData(
                preferences.getString(DRIVER_ID, ""),
                preferences.getString(DRIVER_NAME, ""),
                preferences.getString(VEHICLE_ID, ""),
                preferences.getString(VEHICLE_NAME, ""),
                preferences.getString(ROUTE_ID, ""),
                preferences.getString(ROUTE_NAME, ""),
                preferences.getString(SOCKETURL, ""),
                preferences.getString(EVENTNEWPOSITION, ""),
                preferences.getString(TOKEN, "")
        );
    }
}
