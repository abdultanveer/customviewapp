package com.example.customviewapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {
    TextView detailsTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View layout_inflated = inflater.inflate(R.layout.details_fragment,container,false);
         detailsTextView = layout_inflated.findViewById(R.id.textViewDetails);
         return layout_inflated;
    }

    public void updateTextView(String headline) {
        detailsTextView.setText(headline);//6
    }
}
