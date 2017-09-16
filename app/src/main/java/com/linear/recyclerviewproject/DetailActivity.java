package com.linear.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Student student;
    private int position;

    private ImageView ivPhoto;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        student = (Student) getIntent().getSerializableExtra("student");
        position = getIntent().getIntExtra("position",-1);

        ivPhoto = (ImageView) findViewById(R.id.photo);
        tvName = (TextView) findViewById(R.id.name);

        if(position%2==0){
            ivPhoto.setImageResource(R.drawable.photo_2);
        }else{
            ivPhoto.setImageResource(R.drawable.photo_1);
        }

        tvName.setText(student.getName());


    }
}
