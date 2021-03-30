package com.blue.news;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.blue.common.BaseActivity;
import com.blue.export_news.router.NewsRouterTable;

/**
 * Created by blue on 2021/03/28.
 * (*^▽^*)
 * 描述:
 */
@Route(path = NewsRouterTable.PATH_PAGE_NEWS)
public class NewActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);
    }

}
