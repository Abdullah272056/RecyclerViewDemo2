package com.example.recyclerviewdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.renderscript.Sampler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> CountryNames=new ArrayList<String>(Arrays.asList("Albania","Afganistan","Andorra","Argentina","Bahrain","Bangladesh","Belgium","UAE"));
    ArrayList<String> CountryDesc=new ArrayList<String>(Arrays.asList("Albania","Afganistan","Andorra","Argentina","Bahrain","Bangladesh","Belgium","UAE"));
    ArrayList<Integer>images=new ArrayList<Integer>(Arrays.asList(R.drawable.albania,R.drawable.afganistan,R.drawable.ic_andorra,R.drawable.argentina
    ,R.drawable.bahrain,R.drawable.bangladesh,R.drawable.belgium,R.drawable.uae));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter=new MyAdapter(MainActivity.this,CountryNames,CountryDesc,images );


        recyclerView.setAdapter(adapter);

    }
}
