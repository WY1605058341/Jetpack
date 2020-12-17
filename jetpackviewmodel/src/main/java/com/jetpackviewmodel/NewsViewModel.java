package com.jetpackviewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright: Copyright (c) 常州好开心网络科技有限公司.All rights reserved.
 * @ClassName: NewsViewModel
 * @Description:
 * @CreateDate: 2020/12/15 下午1:28
 */
public class NewsViewModel extends ViewModel {

    private NewsModel newsModel;

    //adapter数据源
    private List<ItemNews> mList = new ArrayList<>();

    public MutableLiveData<List<ItemNews>> itemNewsLiveData = new MutableLiveData<>();


    public NewsViewModel() {
        newsModel = new NewsModel();
    }


    public void getNews() {
        mList = newsModel.getNews();
        //通知活跃的观察者更新数据
        itemNewsLiveData.setValue(mList);
    }


}
