package net.apkkothon.recyclerview6;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by joy on 10/8/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Context context;
    private List<Model> list;

    public Adapter(Context context, List<Model> list) {

        this.context = context;
        this.list = list;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);

        MyViewHolder myViewHolder=new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.name.setText(list.get(position).name);
        holder.imageView.setImageResource(list.get(position).imageID);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView imageView;

        public MyViewHolder(View itemView) {

            super(itemView);

            name=(TextView)itemView.findViewById(R.id.name);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);

        }
    }

}
