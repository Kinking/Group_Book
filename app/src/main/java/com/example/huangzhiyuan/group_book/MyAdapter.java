package com.example.huangzhiyuan.group_book;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by huangzhiyuan on 16/7/29.
 */
public class MyAdapter extends BaseAdapter {

    List mList;
    Context mContext;

    public MyAdapter(Context mContext, List mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //LayoutInflater 视图构造器
        //每一个元素的视图
        widget w = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.list_item,
                    null);
            //得到控件
            w = new widget();
            w.iv_icon = (ImageView) convertView.findViewById(R.id.iv_icon);
            w.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            w.tv_tel = (TextView) convertView.findViewById(R.id.tv_tel);
            w.tv_qq = (TextView) convertView.findViewById(R.id.tv_qq);
            convertView.setTag(w);//getTag:得到对象里面的控件

        } else {
            w = (widget) convertView.getTag();
        }

        //获得实体类
        MemberBean mb = (MemberBean) mList.get(position);
        //填充数据
        w.iv_icon.setImageResource(mb.getIconId());
        w.tv_name.setText(mb.getName());
        w.tv_tel.setText(mb.getTel());
        w.tv_qq.setText(mb.getQqNum());

        return convertView;
    }

    public class widget {
        ImageView iv_icon;
        TextView tv_name;
        TextView tv_tel;
        TextView tv_qq;
    }

}
