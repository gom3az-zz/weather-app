package com.example.mg.masterdetail.RecycleViewAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mg.masterdetail.R;
import com.example.mg.masterdetail.model.Weather10daysModel.ForecastBean.SimpleforecastBean.ForecastdayBeanX;
import com.example.mg.masterdetail.screens.dayDetail.dayDetailActivity;
import com.example.mg.masterdetail.screens.dayList.dayListActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimpleItemRecyclerViewAdapter
        extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

    private final dayListActivity mParentActivity;
    private final List<ForecastdayBeanX> mValues;
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Context context = view.getContext();
            Intent intent = new Intent(context, dayDetailActivity.class);
            //intent.putExtra(dayDetailFragment.ARG_ITEM_ID, item.id);

            context.startActivity(intent);
        }

    };

    public SimpleItemRecyclerViewAdapter(dayListActivity parent,
                                         List<ForecastdayBeanX> items) {
        mValues = items;
        mParentActivity = parent;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.day_list_content,
                                parent,
                                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.weatherDay.setText(String.format("%s %s",
                mValues.get(position).getDate().getWeekday_short(),
                mValues.get(position).getDate().getDay()
        ));
        Picasso.get()
                .load(mValues.get(position).getIcon_url())
                .into(holder.weatherIc);
        holder.weatherDegree.setText(String.format("%s / %s",
                mValues.get(position).getLow().getCelsius(),
                mValues.get(position).getHigh().getCelsius()));

        holder.itemView.setTag(mValues.get(position));
        holder.itemView.setOnClickListener(mOnClickListener);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.text_weather_day)
        TextView weatherDay;
        @BindView(R.id.image_weather)
        ImageView weatherIc;
        @BindView(R.id.text_weather_degree)
        TextView weatherDegree;


        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}