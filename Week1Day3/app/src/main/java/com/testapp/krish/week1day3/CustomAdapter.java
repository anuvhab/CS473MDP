package com.testapp.krish.week1day3;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Krishna on 4/9/2018.
 */
public class CustomAdapter extends BaseAdapter{

    String[] lists = {"Blue Jeans", "White t-shirt", "Black Shorts", "Yellow Shirts"};
    @Override
    public int getCount() {
        return lists.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(CustomListActivity.customList);

//        View v = inflater.inflate(R.layout.custom_view,null);
//
//        ImageView imgView = (ImageView) v.findViewById(R.id.image_food);
//        TextView fileName = (TextView) v.findViewById(R.id.file_name);
//        TextView fileSize = (TextView) v.findViewById(R.id.file_size);
//
//        String image_path = path + fileList[i];
//        final File new_file = new File(image_path);
//        imgView.setImageURI(Uri.fromFile(new_file));
//
//        fileName.setText(fileList[i]);
//        fileSize.setText(new_file.length()+" bytes");
//
//        return v;
//    }
        return null;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
