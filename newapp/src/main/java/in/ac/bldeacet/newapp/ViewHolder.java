package in.ac.bldeacet.newapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView text;
    TextView text1;



    public  ViewHolder(View itemView){
        super(itemView);
        image=itemView.findViewById(R.id.image);
        text=itemView.findViewById(R.id.text1);
        text1=itemView.findViewById(R.id.text2);
    }

}
