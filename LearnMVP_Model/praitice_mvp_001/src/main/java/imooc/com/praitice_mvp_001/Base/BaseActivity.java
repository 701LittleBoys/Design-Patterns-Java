package imooc.com.praitice_mvp_001.Base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import imooc.com.praitice_mvp_001.MVP_Utils.MVP_util;


/**
 * 实现对Activity的全部统一管理
 * Created by 95262 on 2017/3/18.
 */

public abstract class BaseActivity<T extends BasePresenter,E extends BaseModel> extends AppCompatActivity{
    public Context activity_context;
    public T mPresenter;
    public E mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        activity_context = this;
        mPresenter = MVP_util.getT(this,0);
        mModel = MVP_util.getT(this,1);
        if (mPresenter != null){
            mPresenter.mContext = this;
        }
        initView();
        initListener ();
        initPresenter();
    }
    //初始化每个页面所需要的控件，进行注册
    protected abstract void initView();
    //初始化每个页面的中间的所需要的业务逻辑的调度者
    protected abstract void initPresenter();
    //初始化每个页面的所需要的监听器
    protected abstract void initListener();
    //获取每个页面的ID
    protected abstract int getLayoutID();

}
