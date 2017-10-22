package com.xterstar.www.placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment{


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final Button mainButton = (Button) rootView.findViewById(R.id.School_button);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Subjects.class);
                //mainButton.setBackgroundColor(getContext().getResources().getColor(R.color.colorAccent));
                startActivity(intent);


            }
        });

        final Button LifeButton = (Button) rootView.findViewById(R.id.Life_button);
        LifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PostTest.class);
                //mainButton.setBackgroundColor(getContext().getResources().getColor(R.color.colorAccent));
                startActivity(intent);


            }
        });
        // Inflate the layout for this fragment
        return rootView;

    }

}
