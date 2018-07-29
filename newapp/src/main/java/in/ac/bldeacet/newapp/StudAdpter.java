package in.ac.bldeacet.newapp;

import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StudAdpter  extends RecyclerView.Adapter<ViewHolder> {

    List<Student> studentList;

    public StudAdpter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_view,null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student s1 = studentList.get(holder.getAdapterPosition());
        holder.image.setImageResource(s1.image);
        holder.text.setText(s1.getName());
        holder.text1.setText(s1.getDob());
   }

    @Override
    public int getItemCount() {
        if (studentList != null) {
            return studentList.size();
        } else {

            return 0;
        }
    }
}