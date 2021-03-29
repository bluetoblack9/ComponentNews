package com.blue.news;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by blue on 2021/03/28.
 * (*^▽^*)
 * 描述:
 */
@Route(path = "/news/NewsActivity")
public class NewActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);
    }

}
