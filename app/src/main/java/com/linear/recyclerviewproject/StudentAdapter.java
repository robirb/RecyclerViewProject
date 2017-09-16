package com.linear.recyclerviewproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by IMAT PC-01 on 9/16/2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentHolder> {

    private Context context;
    private List<Student> studentList;
    private LayoutInflater inflater;

    private ItemClickListener listener;


    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public StudentHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.single_student,parent,false);

        StudentHolder holder = new StudentHolder(view);
        return holder;
    }

    public void setListener(ItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(StudentHolder holder, int position) {
        Student student = studentList.get(position);

        holder.tvName.setText(student.getName());
        holder.tvClass.setText(student.getClassName());
        holder.tvRoll.setText(student.getRoll());

        if(position%2==0){
            holder.imageView.setImageResource(R.drawable.photo_2);
        }else{
            holder.imageView.setImageResource(R.drawable.photo_1);
        }

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class StudentHolder extends RecyclerView.ViewHolder{

        TextView tvName,tvClass,tvRoll;
        ImageView imageView;

        public StudentHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.name);
            tvClass = itemView.findViewById(R.id.class_name);
            tvRoll = itemView.findViewById(R.id.roll);

            imageView = itemView.findViewById(R.id.photo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener!=null){
                        listener.onItemClick(getAdapterPosition());
                    }
                }
            });
        }
    }


}
