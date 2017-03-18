package imooc.com.praitice_mvp_001.Base;

import android.content.Context;

/**
 * Created by 95262 on 2017/3/18.
 */

public abstract class BasePresenter<T,E> {
    public Context mContext;
    public T mView;
    public E mModel;


    //进行视图和Model 层的绑定，实现一个中间调度者的角色
    public void setViewAndModel(T view,E model){
        this.mView = view;
        this.mModel = model;
    }

    //对抽象的BasePresenter进行进一步封装
    public Context getmContext() {
        return mContext;
    }

    public E getmModel() {
        return mModel;
    }

    public T getmView() {
        return mView;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }
}
