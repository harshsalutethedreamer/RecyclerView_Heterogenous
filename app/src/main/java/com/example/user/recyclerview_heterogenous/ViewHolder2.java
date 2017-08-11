package com.example.user.recyclerview_heterogenous;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by user on 8/12/2017.
 */

public class ViewHolder2 extends RecyclerView.ViewHolder {
    ImageView imageView;

    public ViewHolder2(View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.ivExample);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
