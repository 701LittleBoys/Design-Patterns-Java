package imooc.com.learnmvc_model.newmvp;

import android.view.View;

import imooc.com.learnmvc_model.Base.BaseModel;
import imooc.com.learnmvc_model.Base.BasePresenter;
import imooc.com.learnmvc_model.Base.BaseView;
import imooc.com.learnmvc_model.Model.UserLoginListener;



/**
 * Created by 95262 on 2017/3/17.
 */

/*
    登录状态的契约类
 */
public class LoginContract{
    /*
        登录状态的方法
     */
    interface Model extends BaseModel{
       void UserLogin (String username,String password,UserLoginListener userLoginListener);
        //void Clear_edit ();
    }

    interface View extends BaseView {
        void loginSuccess ();
        void loginFailed ();
        void clear_edit ();
    }

    abstract static class Presenter extends BasePresenter<View,Model> {
        abstract void login(String username, String password);
        abstract  void clear_edit();
    }
}
