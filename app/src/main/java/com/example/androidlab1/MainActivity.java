package com.example.androidlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { // Activity
    private static final String TAG = "Main activity";

    private Button btnSave;
    private Button btnNavigate;
    private TextView tvMessage;
    private EditText etAddress;
    private String userName;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.i(TAG, "onCreate: called successfully");

        tvMessage = findViewById(R.id.tv_message);
        btnSave = findViewById(R.id.btn_save);
        btnNavigate = findViewById(R.id.btn_navigate);
        etAddress = findViewById(R.id.et_address);

        btnSave.setOnClickListener(view -> {
            counter++;
//            tvMessage.setText("" + counter + " Clicks");
            tvMessage.setText(getString(R.string.clicks, counter));
        });

        btnNavigate.setOnClickListener(view -> {
//            Intent intent = new Intent(this, CategoriesActivity.class);
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(etAddress.getText().toString()));
//            intent.setData();
            startActivity(intent);
        });

        Log.i(TAG, "onCreate: " + btnSave.getText());
    }


//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                counter++;
//                tvMessage.setText("" + counter);
//            }
//        });

//    class ButtonListener implements View.OnClickListener {
//
//        @Override
//        public void onClick(View v) {
//            counter++;
//            tvMessage.setText("" + counter);
//            Log.i("Main activity", "onClick: button clicked");
//        }
//    }

    // Annonymous inner class

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: Pausing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Stopping");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Destroying");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: restarted");
    }


}

// Architecture patterns
// MVC (Model View Controller)
// R