package com.blue.export_news.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.blue.export_news.bean.NewsInfo;

/**
 * Created by blue on 2021/03/29.
 * (*^▽^*)
 * 描述: 新闻
 */
public interface INewsService extends IProvider {

    NewsInfo getProductCountInNews();

}
