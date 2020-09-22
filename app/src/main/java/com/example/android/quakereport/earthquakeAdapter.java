package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class earthquakeAdapter extends ArrayAdapter<earthquake> {

    public earthquakeAdapter(Context context, List<earthquake> earthquakes)
    {
        super(context,0,earthquakes);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview=convertView;
        if(listitemview==null)
        {
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_view,parent,false);
        }
        earthquake currentearthquake=getItem(position);

        TextView magnitudeView=(TextView)listitemview.findViewById(R.id.mag);
        magnitudeView.setText(currentearthquake.getnMagnitude());

        TextView LocationView=(TextView)listitemview.findViewById(R.id.loc);
        LocationView.setText(currentearthquake.getnLocation());

        TextView DateView=(TextView)listitemview.findViewById(R.id.date);
        DateView.setText(currentearthquake.getnDate());

        return listitemview;
    }
}
