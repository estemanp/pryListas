package com.programacion.movil.estemanp.prylistas.View.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.programacion.movil.estemanp.prylistas.Model.Student;
import com.programacion.movil.estemanp.prylistas.R;

import java.util.List;

/**
 * Created by estemanp on 10/09/17.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private List<Student> studentList;
    Context context;


    public StudentAdapter(Context context, List<Student> studentList){
        this.context=context;
        this.studentList=studentList;
    }

    //crea una nueva vista
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_students, parent, false);
        // set the view's size, margins, paddings and layout parameters

        StudentViewHolder vh = new StudentViewHolder(v);
        return vh;
    }

    //reemplaza el contenido de una vista.
    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.txtName.setText(studentList.get(position).getName());
        holder.txtIdStudent.setText(studentList.get(position).getId());
        holder.txtAge.setText(studentList.get(position).getAge());

    }

    //retorna el tamaño del data set
    @Override
    public int getItemCount() {
        if(studentList!= null){
            return studentList.size();
        }
        return 0;
    }

    //provee una referencia a las vistas por cada item
    class StudentViewHolder extends RecyclerView.ViewHolder {


        public TextView txtName;
        public TextView txtIdStudent;
        public TextView txtAge;

        public StudentViewHolder(View v) {
            super(v);
            txtName=(TextView) v.findViewById(R.id.txtNameStudent);
            txtIdStudent=(TextView) v.findViewById(R.id.txtIdStudent);
            txtAge=(TextView) v.findViewById(R.id.txtAge);
        }
    }


}
