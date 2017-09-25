package edu.achougulsyr.su_app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Akshay on 2/12/2017.
 */

public class
RecycleAdopter extends RecyclerView.Adapter<RecycleAdopter.ViewHolder> {
    static OnItemClickListener mItemClickListener;
    private Context mContext;
    Context mcontent;
    public static List<Map<String, ?>> mdataset;
    HashMap data = new HashMap();
    String[] temp;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);

        public void onItemLongClick(View view, int position);

        public void onOverflowMenuClick(View v, final int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }


    public RecycleAdopter(HashMap map, Context context) {
//        mcontent = mycontext;
//        mdataset = mydataset;
        data=map;
        String urls = (String) data.get("imgurl");
        temp =urls.split(",");
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
                v = LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.cardview1, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        HashMap<String, ?> movie = (HashMap<String, ?>) mdataset.get(position);
//        holder.movieImage.setImageResource((Integer)
//                movie.get("image"));
//        holder.movieName.setText((String) movie.get("name"));
//        holder.movieDesc.setText((String) movie.get("description"));
//        //  holder.movieCheck.setChecked ((Boolean)movie.get("selection"));
//        Double ratingb = (Double) movie.get("rating");
//        Double ratbar = ratingb / 2;
//        holder.ratingBar.setRating(ratbar.floatValue());
//        holder.ratingnum.setText(((Double) movie.get("rating")).toString());
//        //setAnimation( holder.movieImage,position );
        Picasso.with(mContext).load(temp[position]).into(holder.movieImage);

    }

    @Override
    public int getItemCount() {

        return temp.length;
    }

    @Override
    public int getItemViewType(int position) {
        if (position < 5)
            return 0;
        else if (position >= 25)
            return 2;
        else
            return 1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView movieImage;
        public TextView movieName;
        public TextView movieDesc;
        public CheckBox movieCheck;
        public RatingBar ratingBar;
        public TextView ratingnum;
        public ImageView OverflowImg;

        public ViewHolder(View view) {
            super(view);
            movieImage = (ImageView)
                    view.findViewById(R.id.rv_icon);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mItemClickListener != null) {
                        mItemClickListener.onItemClick(v, getAdapterPosition());
                    }
                }
            });
            }
        }


    }


