package com.blue.news;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.blue.export_news.bean.NewsInfo;
import com.blue.export_news.router.NewsRouterTable;
import com.blue.export_news.service.INewsService;

/**
 * Created by blue on 2021/03/30.
 * (*^▽^*)
 * 描述:
 */
@Route(path = NewsRouterTable.PATH_SERVICE_NEWS)
public class NewsServiceImpl implements INewsService {

    @Override
    public NewsInfo getProductCountInNews() {
        //这里实际项目中 应该是 请求接口 或查询数据库
        NewsInfo newsInfo = new NewsInfo();
        newsInfo.productCount = 888;
        return newsInfo;
    }

    @Override
    public void init(Context context) {
        //初始化工作，服务注入时会调用，可忽略
    }

}
