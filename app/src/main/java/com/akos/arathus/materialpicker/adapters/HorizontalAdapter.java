package com.akos.arathus.materialpicker.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.akos.arathus.materialpicker.R;
import com.akos.arathus.materialpicker.picker_elements.Element;

import java.util.ArrayList;

/**
 * Created by arathus on 2017.08.27..
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalHolder> {


    private ArrayList<Element> elemlist;

    public HorizontalAdapter(ArrayList<Element> elemlist) {
        this.elemlist = elemlist;
    }


    @Override
    public HorizontalAdapter.HorizontalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.element_item, null);

        final HorizontalHolder horhold = new HorizontalHolder(v);

        horhold.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int adapterpos = horhold.getAdapterPosition();
                if (adapterpos != RecyclerView.NO_POSITION) {

                    Toast.makeText(view.getContext(), Integer.toString(adapterpos), Toast.LENGTH_LONG).show();



                    elemlist.remove(adapterpos);
                    notifyItemRemoved(adapterpos);
                    notifyItemRangeChanged(adapterpos, elemlist.size());
                }

            }
        });

        return horhold;
    }

    @Override
    public void onBindViewHolder(HorizontalAdapter.HorizontalHolder holder, int position) {
        Element elem = elemlist.get(position);
        holder.viewItem.setText(elem.getText());


    }

    @Override
    public int getItemCount() {
        return (null != elemlist ? elemlist.size() : 0);
    }

    class HorizontalHolder extends RecyclerView.ViewHolder {

        TextView viewItem;

        HorizontalHolder(View itemView) {
            super(itemView);

            this.viewItem = itemView.findViewById(R.id.textitem);


        }
    }


}
