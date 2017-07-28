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
public class Frag1 extends Fragment {
    Button btnColour;
    TextView tv;


    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       final View view = inflater.inflate(R.layout.fragment_frag1,container,false);
        tv = (TextView)view.findViewById(R.id.tv);
        btnColour = (Button)view.findViewById(R.id.btnColour);

        tv.setText("Queen Elizabeth I regarded herself as a paragon of cleanliness. She declared that she bathed once every three months, whether she needed it or not" + "\n" + "The first known transfusion of blood was performed as early as 1667, when Jean-Baptiste, transfused two pints of blood from a sheep to a young man" +"\n" + "The present population of 5 billion plus people of the world is predicted to become 15 billion by 2080." +"\n" +"Adolf Hitler was a vegetarian, and had only ONE testicle");
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
