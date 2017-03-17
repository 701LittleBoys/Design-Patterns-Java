package imooc.com.learnmvc_model.Model;

import android.os.Handler;

/**
 * Created by 95262 on 2017/3/15.
 */

public class UserLoginImpl implements UserLoginModel {
    @Override
    public void UserLogin(final String username, final String password, final UserLoginListener userLoginListener) {
        /*
            因为请求网络是一个很耗时的状态，所以采用多线程的方式进行模拟
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (username.equals("linlin") && password.equals("123")){
                    userLoginListener.loginSuccess();
                }else{
                    userLoginListener.loginFailed();
                }

            }
        },2000);

    }
}
