package imooc.com.praitice_mvp_001.Controller_Presenter_Impl;

import android.text.TextUtils;
import android.widget.Toast;

import imooc.com.praitice_mvp_001.Controller.Login_Controller;
import imooc.com.praitice_mvp_001.Model.Login_Listener;

/**
 * Created by 95262 on 2017/3/18.
 */

public class LoginPresenter extends Login_Controller.Presenter {
    @Override
    public void Login_Commite(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            Toast.makeText(getmContext(),"请输入用户名或者密码",Toast.LENGTH_SHORT).show();
        }
        else
        {
            getmView().show_loading_Animation();
            getmModel().Login_commit(username, password, new Login_Listener() {
                @Override
                public void Login_Success() {
                    getmView().hide_loading_Animation();
                    Toast.makeText(getmContext(),"登录成功，即将转跳下一个页面",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void Login_Failed() {
                    getmView().hide_loading_Animation();
                    Toast.makeText(getmContext(),"登录失败，请重新登录",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void Clear_edit() {

    }
}
