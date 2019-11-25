package com.example.nrqnrq.http.persenter;

import com.example.nrqnrq.http.HttpMethods;
import com.example.nrqnrq.http.entity.CategroyEntity;

import java.util.List;

import rx.Observable;
import rx.Subscriber;

public class CategroyPresenter extends HttpMethods {
    /**
     * 获取一级分类列表
     *
     * @param subscriber
     */
    public static void getTopList(Subscriber<List<CategroyEntity>> subscriber) {
        Observable<List<CategroyEntity>> observable = categoryService.getTopList()
                .map(new HttpResultFunc<List<CategroyEntity>>());
        toSubscribe(observable, subscriber);
    }

    /**
     * 获取二级分类列表
     *
     * @param parentId
     */
    public static void getSecondList(Subscriber<List<CategroyEntity>> subscriber, int parentId) {
        Observable<List<CategroyEntity>> observable = categoryService.getSecondList(parentId)
                .map(new HttpResultFunc<List<CategroyEntity>>());
        toSubscribe(observable, subscriber);
    }

}
