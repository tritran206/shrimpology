package com.example.tritran.shrimpology;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<Shrimp> mData;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView shrimp_photo;
        TextView shrimp_name;
        TextView shrimp_parameters;

        public ViewHolder (View itemView) {
            super(itemView);

            shrimp_photo = itemView.findViewById(R.id.shrimp_photo);
            shrimp_name = itemView.findViewById(R.id.shrimp_name);
            shrimp_parameters = itemView.findViewById(R.id.shrimp_parameters);
        }
    }

    public RecyclerViewAdapter(Context mContext, List<Shrimp> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.shrimp_name.setText(mData.get(i).getName());
        viewHolder.shrimp_photo.setImageResource(mData.get(i).getThumbnail());
        viewHolder.shrimp_parameters.setText(mData.get(i).getParameters());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
