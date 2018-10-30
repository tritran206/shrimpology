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

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    public final static String EXTRA_SHRIMP = "com.example.tritran.shrimpology.SHRIMP";

    // member variables
    private Context mContext;
    private List<Shrimp> mData;



    /**
     * Constructor that passes in the sports data and the context
     * @param mData ArrayList containing the data
     * @param mContext Context of the application
     */
    public RecyclerViewAdapter(Context mContext, List<Shrimp> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }



    /**
     * Required method for creating the viewholder objects.
     * @param viewGroup The ViewGroup into which the new View will be added after it is bound to an adapter position.
     * @param i The view type of the new View.
     * @return The newly create ViewHolder.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item, viewGroup, false);

        return new ViewHolder(view);
    }



    /**
     * Required method that binds the data to the viewholder.
     * @param viewHolder The viewholder into which the data should be put.
     * @param position The adapter position.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

        Log.d(TAG, "onBindViewHolder: called");
        //get current shrimp
        Shrimp currentShrimp = mData.get(position);
        //populates the views with data
        viewHolder.bindTo(currentShrimp);

        viewHolder.mParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + mData.get(position));
                Shrimp currentShrimp = mData.get(position);
                //creates intents, add data as extra and starts shrimpdetails activity
                Intent intent = new Intent(mContext, ShrimpDetails.class);
                intent.putExtra(EXTRA_SHRIMP, currentShrimp);
                mContext.startActivity(intent);
            }
        });
    }



    /**
     * Required method for determining the size of the data set.
     * @return Size of the data set.
     */
    @Override
    public int getItemCount() {
        return mData.size();
    }



    /**
     * ViewHolder class that represents each row of data in the RecyclerView
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        //member variables for views
        ImageView mShrimpPhoto;
        TextView mShrimpName;
        TextView mShrimpParameters;
        LinearLayout mParentLayout;



        /**
         * Constructor for the ViewHolder, used in onCreateViewHolder().
         * @param itemView The rootview of the list_item.xml layout file
         */
        public ViewHolder (View itemView) {
            super(itemView);

            mShrimpPhoto = itemView.findViewById(R.id.shrimp_photo);
            mShrimpName = itemView.findViewById(R.id.shrimp_name);
            mShrimpParameters = itemView.findViewById(R.id.shrimp_parameters);
            mParentLayout = itemView.findViewById(R.id.parent_layout);
        }

        void bindTo(Shrimp currentShrimp){
            //Populate the textviews with data
            mShrimpName.setText(currentShrimp.getName());
            mShrimpParameters.setText(currentShrimp.getParameters());
            Glide.with(mContext).load(currentShrimp.getPicture()).into(mShrimpPhoto);

        }
    }





}
