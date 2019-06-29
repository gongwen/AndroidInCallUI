package com.android.incallui.sample;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.android.incallui.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final int REQUEST_CODE_PERMISSION = 0;
    private static final int REQUEST_CODE_CHANGE_DEFAULT_DIALER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void grantPermissions(View view) {
        requestPermissions(new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_CONTACTS}, REQUEST_CODE_PERMISSION);
    }

    public void setAsDefaultDialer(View view) {
        if (isDefaultDialer(this)) {
            Toast.makeText(this, "The AndroidInCallUI has been set as default dialer.", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            Intent intent = new Intent(TelecomManager.ACTION_CHANGE_DEFAULT_DIALER);
            intent.putExtra(TelecomManager.EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME,
                    getPackageName());
            startActivityForResult(intent, REQUEST_CODE_CHANGE_DEFAULT_DIALER);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, e.toString());
        }
    }

    private boolean isDefaultDialer(Context context) {
        TelecomManager manger = (TelecomManager) context.getSystemService(Context.TELECOM_SERVICE);
        return manger != null && TextUtils.equals(manger.getDefaultDialerPackage(), context.getPackageName());
    }

}
