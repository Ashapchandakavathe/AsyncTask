package in.ac.bldeacet.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    RecyclerView ryList;
    StudAdpter studAdpter;
    List<Student> studentList =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ryList=findViewById(R.id.RecyclerView);

        studentList=getStudentList();
        studAdpter=new StudAdpter(studentList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( MainActivity.this);


        ryList.setLayoutManager(linearLayoutManager);
        ryList.setAdapter(studAdpter);


        studAdpter.notifyDataSetChanged();
    }
     List<Student> getStudentList(){
        List<Student> list = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            Student student=new Student(
                    R.drawable.ic_launcher_background,
                    "Student"+i,
                     (i+1)+"/28/07/2018");

            list.add(student);


         }
         return list;
     }
}
