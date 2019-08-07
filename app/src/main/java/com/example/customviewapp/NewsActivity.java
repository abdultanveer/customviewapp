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
        if (detailsFragment != null) {//it means app is running on tablet

            detailsFragment.updateTextView(headline);
        }
        else{  //app is launched on phone---A
            DetailsFragment detailsFragment1 = new DetailsFragment();
            Bundle args = new Bundle();
            args.putString(detailsFragment1.ARG_POSITION, headline);
            detailsFragment1.setArguments(args);

            getSupportFragmentManager()
                    .beginTransaction().replace(R.id.news_container,detailsFragment1)
                    .commit();
        }


    }
}
