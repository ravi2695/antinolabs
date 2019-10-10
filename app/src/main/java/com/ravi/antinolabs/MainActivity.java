package com.ravi.antinolabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    UserAdapter adapter;
    List<User> userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userList=new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userList.add(
                new User(1,
                        "Sofia",
                        20,
                        "New York",
                        R.drawable.sofia)
        );
        userList.add(
                new User(1,
                        "Zoya",
                        23,
                        "Atlantic City",
                        R.drawable.zoya)
        );


        userList.add(
                new User(1,
                        "Daisy",
                        23,
                        "Atlantic City",
                        R.drawable.zoya)
        );
        userList.add(
                new User(1,
                        "David",
                        20,
                        "New York",
                        R.drawable.sofia)
        );

        adapter=new UserAdapter(this,userList);
        recyclerView.setAdapter(adapter);
    }
}
