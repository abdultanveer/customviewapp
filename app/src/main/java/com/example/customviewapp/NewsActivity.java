package com.example.customviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewsActivity extends AppCompatActivity implements HeadlinesFragment.OnHeadlineSelectedListener{//3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    @Override //appliance/implementation
    public void onArticleSelected(String headline) {
        //5
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetails);
        detailsFragment.updateTextView(headline);


    }
}
