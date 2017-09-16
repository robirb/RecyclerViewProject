package com.linear.recyclerviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerView rvStudents;

    private StudentAdapter adapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();
        studentList.add(new Student("Sohel","Ten","1"));
        studentList.add(new Student("Robi","Ten","2"));
        studentList.add(new Student("Android","Ten","3"));
        studentList.add(new Student("Kobir","Ten","4"));
        studentList.add(new Student("Masud","Ten","5"));
        studentList.add(new Student("Harun","Ten","6"));
        studentList.add(new Student("Kabul","Ten","7"));
        studentList.add(new Student("Jobbar","Ten","8"));
        studentList.add(new Student("Jobdul","Ten","9"));
        studentList.add(new Student("Jonyyy","Ten","10"));

        adapter = new StudentAdapter(getApplicationContext(),studentList);
        adapter.setListener(this);



        rvStudents = (RecyclerView) findViewById(R.id.rv_students);
        rvStudents.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvStudents.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {

        Student student = studentList.get(position);

        Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
        intent.putExtra("student",student);
        intent.putExtra("position",position);

        startActivity(intent);

        Log.d("KKKK",position+"");

    }
}
