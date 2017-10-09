package net.apkkothon.recyclerview6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List list=new ArrayList();
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);


        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));
        list.add(new Model("Mark",R.drawable.asus));


        adapter=new Adapter(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}
