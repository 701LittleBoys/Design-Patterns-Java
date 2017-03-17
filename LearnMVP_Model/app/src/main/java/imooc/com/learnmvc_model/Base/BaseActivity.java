package imooc.com.learnmvc_model.Base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import imooc.com.learnmvc_model.Util.MVPUtil;

/**
 * Created by 95262 on 2017/3/17.
 */
/*
    此处为MVP架构的典型封装
 */

public abstract class BaseActivity<T extends BasePresenter,E extends BaseModel> extends AppCompatActivity {
    public Context activity;
    public T mPresenter;
    public E mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());

        activity = this;
        mPresenter = MVPUtil.getT(this,0);
        mModel = MVPUtil.getT(this,1);
        if (mPresenter != null){
            mPresenter.mContext = this;
        }

        initView ();
        initListener();
        initPresenter();
    }

    protected abstract void initPresenter();

    protected abstract int initLayout();

    protected abstract void initListener();

    protected abstract void initView();
}

