package com.blue.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * Created by blue on 2021/03/31.
 * (*^▽^*)
 * 描述:
 */
public class NewsFragment extends Fragment {
    public NewsFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //显示“news_fragment"
        return inflater.inflate(R.layout.fragment_news, container, false);
    }
}