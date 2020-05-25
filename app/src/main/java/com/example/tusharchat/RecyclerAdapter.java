package com.example.tusharchat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter {


    private ArrayList<ChatArray> chatList;
    private static final String TAG = "RecyclerAdapter";

    public RecyclerAdapter(ArrayList<ChatArray> chatList) {
        this.chatList = chatList;
    }

    @Override
    public int getItemViewType(int position) {
        if(chatList.get(position).getMsgtype()==1){
            if(chatList.get(position).getUser()==1){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
            if(chatList.get(position).getUser()==1){
                return 2;
            }
            else{
                return 3;
            }
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;

        if(viewType==0)
        {
            view = layoutInflater.inflate(R.layout.leftuser,parent,false);
            return new ViewHolder1(view);
        }
        else if (viewType==1)
        {
            view = layoutInflater.inflate(R.layout.rightuser,parent,false);
            return new ViewHolder2(view);
        }
        else if (viewType==2)
        {
            view = layoutInflater.inflate(R.layout.image_layout,parent,false);
            return new ImageViewHolder1(view);
        }
        view = layoutInflater.inflate(R.layout.image_layout2,parent,false);
        return new ImageViewHolder2(view);


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(chatList.get(position).getMsgtype()==1){
            if(chatList.get(position).getUser()==1){
                ViewHolder1 viewHolder1 = (ViewHolder1) holder;
                viewHolder1.textView.setText(chatList.get(position).getMsg());
            }
            else{
                ViewHolder2 viewHolder2 = (ViewHolder2) holder;
                viewHolder2.textView.setText(chatList.get(position).getMsg());
            }
        }
        else{
            if(chatList.get(position).getUser()==1){
                ImageViewHolder1 imageViewHolder1 = (ImageViewHolder1)holder;
                imageViewHolder1.imageView.setImageResource(chatList.get(position).getImage());
            }
            else{
                ImageViewHolder2 imageViewHolder2 = (ImageViewHolder2)holder;
                imageViewHolder2.imageView.setImageResource(chatList.get(position).getImage());
            }
        }

    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    class ViewHolder1 extends RecyclerView.ViewHolder{

        TextView textView;
        public ViewHolder1(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.left_user);
        }
    }

    class ViewHolder2 extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.right_user);

        }
    }

    class ImageViewHolder1 extends RecyclerView.ViewHolder{

        ImageView imageView;

        public ImageViewHolder1(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.chatimage);
        }
    }

    class ImageViewHolder2 extends RecyclerView.ViewHolder{

        ImageView imageView;

        public ImageViewHolder2(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.chatimage2);
        }

    }

}
