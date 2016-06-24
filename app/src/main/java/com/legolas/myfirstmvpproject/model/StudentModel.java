package com.legolas.myfirstmvpproject.model;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/6/24.
 */
public class StudentModel {

    /*这里是保存数据的方法*/
    public void save(Context context, String username, String password) {
        //将获取到的数据保存
        SharedPreferences sp = context.getSharedPreferences("UserInfo", Context.MODE_PRIVATE | Context.MODE_APPEND);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("username", username);
        editor.putString("password", password);
        editor.commit();

    }

    public void load(Context context) {
        //获取存储的数据
        SharedPreferences sp  = context.getSharedPreferences("UserInfo",Context.MODE_PRIVATE | Context.MODE_APPEND);
        String username = sp.getString("username","null");
        String password = sp.getString("password","null");



    }
}
