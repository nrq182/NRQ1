package com.example.nrqnrq.http.service;

import com.example.nrqnrq.http.entity.CategroyEntity;
import com.example.nrqnrq.http.entity.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface CategroyService {
    /**
     * 加载一级分类
     *
     * @return
     */
    @GET("cat/show")
    Observable<HttpResult<List<CategroyEntity>>> getTopList();

    /**
     * 加载二级分类
     *
     * @param parentId
     * @return
     */
    @GET("cat/show/{parentId}")
    Observable<HttpResult<List<CategroyEntity>>> getSecondList(
            @Path("parentId") int parentId
    );
}
