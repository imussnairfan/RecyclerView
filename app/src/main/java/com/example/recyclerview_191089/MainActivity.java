package com.example.recyclerview_191089;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView_1;
    List<Student> studentList = new ArrayList<>();
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_1 = findViewById(R.id.rv_1);

        studentList.add(new Student("Mussna","191089"));
        studentList.add(new Student("Abrar","191149"));
        studentList.add(new Student("Zubaida","191131"));
        studentList.add(new Student("Saad","191200"));
        studentList.add(new Student("Abdullah","191107"));
        studentList.add(new Student("Hammad","191071"));
        studentList.add(new Student("Eisha","192023"));

        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, studentList);
        recyclerView_1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_1.hasFixedSize();
        recyclerView_1.setAdapter(recyclerViewAdapter);

    }
}