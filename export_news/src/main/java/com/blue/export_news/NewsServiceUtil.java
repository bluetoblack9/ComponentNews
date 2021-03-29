package com.blue.export_news;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blue.export_news.bean.NewsInfo;
import com.blue.export_news.router.NewsRouterTable;
import com.blue.export_news.service.INewsService;

/**
 * Created by blue on 2021/03/29.
 * (*^▽^*)
 * 描述:
 */
public class NewsServiceUtil {

    /**
     * 跳转到新闻页面
     * @param param1
     * @param param2
     */
    public static void navigateCartPage(String param1, String param2){
        ARouter.getInstance()
                .build(NewsRouterTable.PATH_PAGE_NEWS)
                .withString("key1",param1)
                .withString("key2",param2)
                .navigation();
    }

    /**
     * 获取服务
     * @return
     */
    public static INewsService getService(){
        //return ARouter.getInstance().navigation(INewsService.class);//如果只有一个实现，这种方式也可以
        return (INewsService) ARouter.getInstance().build(NewsRouterTable.PATH_SERVICE_NEWS).navigation();
    }

    /**
     * 获取新闻页面的新闻数量
     * @return
     */
    public static NewsInfo getCartProductCount(){
        return getService().getProductCountInNews();
    }

}
