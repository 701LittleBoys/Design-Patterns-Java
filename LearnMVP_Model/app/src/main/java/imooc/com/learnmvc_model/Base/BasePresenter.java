package imooc.com.learnmvc_model.Base;

import android.content.Context;

/**
 * Created by 95262 on 2017/3/17.
 */
/*
    使用泛型进行封装:
        T:代表对象
        E：代表element数据
 */

public abstract class BasePresenter<T,E> {
    public Context mContext;
    public T mView;
    public E mModel;

    //进行初始化
    public void setViewAndModel (T view,E model){
        this.mView = view;
        this.mModel = model;
    }
    /*
        集合RXJAVA的时候可能会使用到的一些方法
     */

//    public void onStart (){
//    }
//    public void onDestory (){
//
//    }

}
