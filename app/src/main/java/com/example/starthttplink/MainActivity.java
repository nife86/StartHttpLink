package com.example.starthttplink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_linkMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    et_linkMsg = findViewById(R.id.et_linkMsg);
    }

    public void btnClick(View view) {
        String str = et_linkMsg.getText().toString();

        if (!str.startsWith("http://") && !str.startsWith("https://"))
            str = "http://" + str;

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(str.toString()));
        startActivity(browserIntent);
    }
}
