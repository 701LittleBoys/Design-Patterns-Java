package imooc.com.praitice_mvp_002.Base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import imooc.com.praitice_mvp_002.MVP_Util.MVP_util;

/**
 * Created by
 * auother ：Mr_林小贱
 * 邮箱：952622946@qq.com
 */

public abstract class BaseActivity<T extends BasePresenter,E extends BaseModel> extends AppCompatActivity {
    public Context activity_context;
    public T my_Presenter;
    public E my_Model;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(get_MyLayoutID());
        activity_context = this;
        my_Presenter = MVP_util.getT(this,0);
        my_Model = MVP_util.getT(this,1);
        if (my_Presenter == null){
            my_Presenter.setMy_Context(this);
        }

        initView();
        initViewListener();
        initPresenter ();
    }

    protected abstract int get_MyLayoutID();

    protected abstract void initViewListener();

    protected abstract void initView();

    protected abstract void initPresenter();

}
