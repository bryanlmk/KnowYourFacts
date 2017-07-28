package com.myapplicationdev.android.knowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {
    Button btnColour;
    ImageView iv;
    TextView tv;

    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       final View view = inflater.inflate(R.layout.fragment_frag3,container,false);
        iv = (ImageView)view.findViewById(R.id.iv);
        String imageUrl = "http://square.github.io/picasso/static/sample.png";
        btnColour = (Button)view.findViewById(R.id.btnColour);
        tv = (TextView)view.findViewById(R.id.tv);
        tv.setText("The six official languages of the United Nations are: English, French, Arabic, Chinese, Russian and Spanish." +"\n" +"The placement of a donkey's eyes in its' heads enables it to see all four feet at all times!" +"\n" +"In 1386, a pig in France was executed by public hanging for the murder of a child" +"\n" +"What is called a \"French kiss\" in the English speaking world is known as an \"English kiss\" in France.");

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
