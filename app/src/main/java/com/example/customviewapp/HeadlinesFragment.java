package com.example.customviewapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HeadlinesFragment extends Fragment implements AdapterView.OnItemClickListener {
    OnHeadlineSelectedListener callback;//2


    public interface OnHeadlineSelectedListener {//switchboard--1
        public void onArticleSelected(String headline);//switch--1a
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (OnHeadlineSelectedListener) getActivity();//newsactivity --- wiring--3a

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View layout_inflated = inflater.inflate(R.layout.headlines_fragment,container,false);
         ListView headlinesListView = layout_inflated.findViewById(R.id.headlineslistview);
         headlinesListView.setOnItemClickListener(this);

         return  layout_inflated;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String itemClicked = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(getActivity(), itemClicked, Toast.LENGTH_SHORT).show();
        callback.onArticleSelected(itemClicked); //switching on---4

    }
}
