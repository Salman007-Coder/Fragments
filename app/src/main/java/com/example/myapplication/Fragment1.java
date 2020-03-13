package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragment_1, container, false);
         Button btnNext=view.findViewById(R.id.btn1);
         btnNext.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 FragmentTransaction fr=getFragmentManager().beginTransaction();
                 fr.replace(R.id.fragment_container,new Fragment2());
                 fr.commit();
             }
         });
         Button btnBack=view.findViewById(R.id.btn2);
         btnBack.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast toast=Toast.makeText(getActivity(),"Yor are at 1(First)Fragment..So you can't go Back..GO NEXT",Toast.LENGTH_LONG);
                 toast.show();
             }
         });

        return view;
    }




}

