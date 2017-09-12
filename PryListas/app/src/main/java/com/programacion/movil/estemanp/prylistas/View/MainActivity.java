package com.programacion.movil.estemanp.prylistas.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.programacion.movil.estemanp.prylistas.Controller.AppController;
import com.programacion.movil.estemanp.prylistas.R;
import com.programacion.movil.estemanp.prylistas.View.adapter.StudentAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerStudents;
    private RecyclerView.LayoutManager mLayoutManager;
    private StudentAdapter studentAdapter;
    private AppController appController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set AppController
        appController= (AppController) getApplication();

        recyclerStudents= (RecyclerView) findViewById(R.id.recyclerStudents);
        recyclerStudents.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);

        recyclerStudents.setLayoutManager(mLayoutManager);

        //specify an adapter
        studentAdapter=new StudentAdapter(this,appController.getStudents());
        recyclerStudents.setAdapter(studentAdapter);

    }
}
