package com.cumulations.intentdemo;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void search(View view) {
        String q = "Cumulations";
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
        intent.putExtra(SearchManager.QUERY, q);
        startActivity(intent);
    }

    public void sendMail(View view) {
        Intent email = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","abc1@gmail.com",null));
        email.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        email.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.body));
        startActivity(email);
//        startActivity(Intent.createChooser(email, "Choose an email client from..."));
    }

    public void searchChooser(View view) {
        String q = "Cumulations";
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
        intent.putExtra(SearchManager.QUERY, q);
        startActivity(Intent.createChooser(intent,"Open With:"));
    }
}
