package com.caaboos.mediamount;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.os.Environment;
import android.net.Uri;
import android.media.MediaScannerConnection;

public class MediaMount extends CordovaPlugin {
    public static final String UPDATE = "update";
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            JSONObject arg_object = args.getJSONObject(0);
            String filePath = arg_object.has("file");

            if (UPDATE.equals(action)) {

              //MediaScannerConnection.scanFile(path);
            }

            callbackContext.error("Invalid action");
            return false;
        } catch(Exception e) {
            callbackContext.error(e.getMessage());
            return false;
        } 
    }
}