package com.example.anarbekuulunursultan31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText subject;
    EditText body;
    Button btn_to_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.edit_text);
        subject = findViewById(R.id.edit_text2);
        body = findViewById(R.id.text_view3);
        btn_to_send = findViewById(R.id.btn_send);
        btn_to_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if (!email.getText().toString().isEmpty() && subject.getText().toString().isEmpty() && body.getText().toString().isEmpty() )
//                {
                    Intent  intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("mailto:" + email.getText().toString()));
//                    intent.putExtra(intent.EXTRA_EMAIL, new String[]{
//                            email.getText().toString()});
                    intent.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
                    intent.putExtra(Intent.EXTRA_TEXT, body.getText().toString());
//                    intent.setType("message/rvc822");
//                    intent.setData(Uri.parse("mailto:"));
//                    if (intent.resolveActivity(getPackageManager() ) != null) {
                        startActivity(intent);
//                    }
//                    else {
//                        Toast.makeText(MainActivity.this, "There is no Application that support this action", Toast.LENGTH_SHORT).show();
//                    }
//                    }
//                else {
//                    Toast.makeText(MainActivity.this, "please fill the fields", Toast.LENGTH_SHORT).show();
//                }

             }

        });
    }
}