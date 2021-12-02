package com.example.personagens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter{

    Context context;
    String[] PerName;
    int[] Per;

    com.example.personagens.layoutInflater inflater;

    public GridAdapter(Context context, String[] perName, int[] per) {
        this.context = context;
        PerName = perName;
        Per = per;
    }

    @Override
    public int getCount() {
        return PerName.length;
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
        return null;
    }






}