package com.example.vincenthernandez_ceng319_lab01_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListFragment;


public class List extends ListFragment {

    Intent i;

    String[]  listfragment = {
            "\n\nAiActivity",
            "VrActivity"
    };

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }


    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listfragment));
    }


    public void onListItemClick(ListView l, View v, int position, long id){

        switch(position){
            case 0:
                i = new Intent(getActivity(), AiActivity.class);
                break;
            case 1:
                i = new Intent(getActivity(), VrActivity.class);
                break;

        }
        startActivity(i);
    }

}