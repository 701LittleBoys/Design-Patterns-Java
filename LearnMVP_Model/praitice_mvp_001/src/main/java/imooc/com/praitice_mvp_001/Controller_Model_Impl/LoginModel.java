package imooc.com.praitice_mvp_001.Controller_Model_Impl;

import android.os.Handler;
import android.text.TextUtils;

import imooc.com.praitice_mvp_001.Controller.Login_Controller;
import imooc.com.praitice_mvp_001.Model.Login_Listener;

/**
 * Created by 95262 on 2017/3/18.
 */

public class LoginModel implements Login_Controller.model_con {
    @Override
    public void Login_commit(final String username, final String password, final Login_Listener login_listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
                    login_listener.Login_Failed();
                }
                else{
                    login_listener.Login_Success();
                }
            }
        }, 2000);
    }
}
