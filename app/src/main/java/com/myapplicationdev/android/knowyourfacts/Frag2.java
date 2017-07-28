package com.myapplicationdev.android.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {
    Button btnColour;
    TextView tv;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_frag2,container,false);
        tv = (TextView)view.findViewById(R.id.tv);
        btnColour = (Button)view.findViewById(R.id.btnColour);
        tv.setText("Fingernails grow nearly 4 times faster than toenails!" +"\n" +"Right handed people live, on average, nine years longer than left-handed people" +"\n" +"The skeleton of Jeremy Bentham is present at all important meetings of the University of London" +"\n" +"Horatio Nelson, one of England's most illustrious admirals was throughout his life, never able to find a cure for his sea-sickness.");

        btnColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int colour = Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
                view.setBackgroundColor(colour);
            }
        });
        return view;
    }

}
