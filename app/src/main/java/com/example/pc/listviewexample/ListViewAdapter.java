package com.example.pc.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by pc on 2016-02-16.
 */
public class ListViewAdapter extends BaseAdapter{

    private Context context;
    private List<String> titlelist;

    public ListViewAdapter(Context context, List<String> titlelist){
        this.context = context;
        this.titlelist = titlelist;
    }

    @Override
    public int getCount() {
        return titlelist.size();
    } // 총 listview 개수를 미리 알려줌. 메모리 미리 준비.

    @Override
    public Object getItem(int position) {
        return titlelist.get(position);
    } // list의 위치를 알려줌.

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview, null);
        }

            TextView textView = (TextView) convertView.findViewById(R.id.textview);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);

            textView.setText(titlelist.get(position));
            imageView.setBackgroundResource(R.mipmap.listview_item_image);


        return convertView;
    } //
}
