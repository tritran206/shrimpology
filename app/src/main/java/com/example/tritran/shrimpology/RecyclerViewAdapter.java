package com.example.tritran.shrimpology;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    public final static String EXTRA_PHOTO = "com.example.tritran.shrimpology.PHOTO";
    public final static String EXTRA_NAME = "com.example.tritran.shrimpology.NAME";
    public final static String EXTRA_PARAMETERS = "com.example.tritran.shrimpology.PARAMETERS";

    private Context mContext;
    private List<Shrimp> mData;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView shrimp_photo;
        TextView shrimp_name;
        TextView shrimp_parameters;
        LinearLayout parent_layout;

        public ViewHolder (View itemView) {
            super(itemView);

            shrimp_photo = itemView.findViewById(R.id.shrimp_photo);
            shrimp_name = itemView.findViewById(R.id.shrimp_name);
            shrimp_parameters = itemView.findViewById(R.id.shrimp_parameters);
            parent_layout = itemView.findViewById(R.id.parent_layout);
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
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        viewHolder.shrimp_name.setText(mData.get(position).getName());
        viewHolder.shrimp_photo.setImageResource(mData.get(position).getThumbnail());
        viewHolder.shrimp_parameters.setText(mData.get(position).getParameters());

        viewHolder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + mData.get(position));

                Shrimp currentShrimp = mData.get(position);

                Intent intent = new Intent(mContext, ShrimpDetails.class);
                intent.putExtra(EXTRA_NAME, currentShrimp.getName());
                //intent.putExtra(EXTRA_PHOTO, currentShrimp.getThumbnail());

                intent.putExtra(EXTRA_PARAMETERS, currentShrimp.getParameters());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
