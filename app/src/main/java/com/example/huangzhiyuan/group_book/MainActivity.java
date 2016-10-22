package com.example.huangzhiyuan.group_book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Button btn_tel;
    Button btn_mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = (ListView) findViewById(R.id.listView1);

        btn_tel=(Button) findViewById(R.id.btn_tel);
        btn_tel=(Button) findViewById(R.id.btn_mes);

        //1.构建数据,创建实体类，把实体类放到集合
        List<MemberBean> list = new ArrayList<MemberBean>();
        MemberBean student = new MemberBean(R.drawable.david,"David","111111111","5888888");
        list.add(student);
        list.add(new MemberBean(R.drawable.king,"King","222222222","5222222"));
        list.add(new MemberBean(R.drawable.malfoy,"Malfoy","333333333","5333333"));
        list.add(new MemberBean(R.drawable.george,"George","444444444","5555555"));
        list.add(new MemberBean(R.drawable.harry,"Harry","555555555","5666666"));
        list.add(new MemberBean(R.drawable.tim,"Tim","666666666","5777777"));



        //2.创建适配器
        MyAdapter adapter = new MyAdapter(this,list);

        //3.绑定适配器
        lv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }




}
