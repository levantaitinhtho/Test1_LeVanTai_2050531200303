package com.example.singerapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticRVViewHolder>{

    private ArrayList<StaticRvModel> items;
    int row_index = -1;
    UpdateRecyclerView updateRecyclerView;
    Activity activity;
    boolean check = true;
    boolean selected = true;

    public StaticRvAdapter(ArrayList<StaticRvModel> items, Activity activity, UpdateRecyclerView updateRecyclerView) {
        this.items = items;
        this.activity = activity;
        this.updateRecyclerView = updateRecyclerView;
    }

    @NonNull
    @Override
    public StaticRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Lien ket xml
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item,parent,false);
        StaticRVViewHolder staticRVViewHolder = new StaticRVViewHolder(view);
        return  staticRVViewHolder;
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull StaticRVViewHolder holder, int position) {
        StaticRvModel currentItem = items.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView.setText(currentItem.getText());

        if (check){

            ArrayList<PoliceRVModel> items =  new ArrayList<PoliceRVModel>();
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan, 0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));
            items.add(new PoliceRVModel("Nguyễn Văn Trụng","Đại tá","Đà Nẵng",R.drawable.congan,0));

            updateRecyclerView.callback(position, items);

            check   = false;
        }

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

                if (position==0){
                    ArrayList<PoliceRVModel> items =  new ArrayList<PoliceRVModel>();
                    items.add(new PoliceRVModel("Tài AT","Đại tá","Đà Nẵng",R.drawable.congan, 0));
                    items.add(new PoliceRVModel("Nguyễn Văn Tú","Đại tá","Đà Nẵng",R.drawable.congan,0));
                    items.add(new PoliceRVModel("Nguyễn Sơn Thạch","Đại tá","Đà Nẵng",R.drawable.congan,0));
                    items.add(new PoliceRVModel("Nguyễn Tú Sơn","Đại tá","Đà Nẵng",R.drawable.congan,0));
                    items.add(new PoliceRVModel("Nguyễn Bá Nhật","Đại tá","Đà Nẵng",R.drawable.congan,0));
                    items.add(new PoliceRVModel("Nguyễn Văn Bá","Đại tá","Đà Nẵng",R.drawable.congan,0));
                    items.add(new PoliceRVModel("Nguyễn Văn ","Đại tá","Đà Nẵng",R.drawable.congan,0));
                    items.add(new PoliceRVModel("Nguyễn Văn ","Đại tá","Đà Nẵng",R.drawable.congan,0));
                    items.add(new PoliceRVModel("Nguyễn Văn ","Đại tá","Đà Nẵng",R.drawable.congan,0));

                    updateRecyclerView.callback(position, items);

                }

                else if (position==1){
                    ArrayList<PoliceRVModel> items =  new ArrayList<PoliceRVModel>();
                    items.add(new PoliceRVModel("Lê Văn Tài","Trung tá","Quảng Nam",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Văn Sơn","Đại tá","Quảng Ngãi",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Phúc Sang","Đại tá","Hà Nội",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Sĩ Tử","Đại tá","Hà Nội",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Bắc Mộ","Đại tá","Hà Nội",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Thiên Mậc","Đại tá","Hà Nội",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Sơn Tinh","Đại tá","Hà Nội",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Đại Sơn","Đại tá","Hà Nội",R.drawable.congan,1));
                    items.add(new PoliceRVModel("Tà Long","Đại tá","Hà Nội",R.drawable.congan,1));

                    updateRecyclerView.callback(position, items);
                }

                else if (position==2){
                    ArrayList<PoliceRVModel> items =  new ArrayList<PoliceRVModel>();
                    items.add(new PoliceRVModel("David","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Tocas","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Vocas","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Resa","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Peti","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Tys","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Under","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Ost","Đại tá","Hà Nội",R.drawable.congan2,2));
                    items.add(new PoliceRVModel("Psb","Đại tá","Hà Nội",R.drawable.congan2,2));

                    updateRecyclerView.callback(position, items);
                }

                else if (position==3){
                    ArrayList<PoliceRVModel> items =  new ArrayList<PoliceRVModel>();
                    items.add(new PoliceRVModel("Park Sa","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("See Yon","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("Lon Kim","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("Soong Yon","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("Park Seo","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("Yea Sia","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("Park Ta","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("Tan Se Yo","Đại tá","Hà Nội",R.drawable.congan3,3));
                    items.add(new PoliceRVModel("Lee Min Ho","Đại tá","Hà Nội",R.drawable.congan3,3));

                    updateRecyclerView.callback(position, items);
                }
            }
        });
//
        if (selected){
            if (position==0)
                holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected_bg);
            selected = false;
        }
        else {
            if (row_index == position){
                holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected_bg);
            }
            else{
                holder.linearLayout.setBackgroundResource(R.drawable.static_rv_bg);
            }
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class StaticRVViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;

        public StaticRVViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
