package com.example.maskot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMaskotAdapter extends RecyclerView.Adapter<ListMaskotAdapter.ListViewHolder> {
    private ArrayList<Maskot> listMaskot;
    private Context context;

    public ListMaskotAdapter(ArrayList<Maskot> list, Context context) {
        this.listMaskot = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_maskot, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Maskot maskot = listMaskot.get(position);
        Glide.with(holder.itemView.getContext())
                .load(maskot.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(maskot.getName());
        holder.tvInfo.setText(maskot.getInfo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);
                Bundle bundle = new Bundle();

                bundle.putString("nama", maskot.getName());
                bundle.putString("deskripsi", maskot.getInfo());
                bundle.putInt("gambar", maskot.getPhoto());
                bundle.putString("detail", maskot.getDetail());
                intent.putExtras(bundle);
                context.startActivity(intent);

                Toast.makeText(holder.itemView.getContext(), "" + listMaskot.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return listMaskot.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvInfo;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvInfo = itemView.findViewById(R.id.tv_item_info);
        }
    }
}
