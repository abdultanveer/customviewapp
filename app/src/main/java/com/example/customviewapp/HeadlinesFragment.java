package com.example.customviewapp;

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

    }
}
