package com.caaboos.mediamount;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.os.Environment;
import android.net.Uri;

public class MediaMount extends CordovaPlugin {
    public static final String UPDATE = "update";
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (UPDATE.equals(action)) {
                this.cordova.getActivity().sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED, Uri.parse("file://" + Environment.getExternalStorageDirectory())));

               callbackContext.success();
               return true;
            }

            callbackContext.error("Invalid action");
            return false;
        } catch(Exception e) {
            callbackContext.error(e.getMessage());
            return false;
        } 
    }
}