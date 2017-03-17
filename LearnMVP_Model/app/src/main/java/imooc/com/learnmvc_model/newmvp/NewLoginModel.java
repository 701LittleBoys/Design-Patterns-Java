package imooc.com.learnmvc_model.newmvp;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;

import imooc.com.learnmvc_model.Model.UserLoginListener;

/**
 * Created by 95262 on 2017/3/17.
 */

public class NewLoginModel implements LoginContract.Model {
    @Override
    public void UserLogin(final String username, final String password, final UserLoginListener userLoginListener) {
        /*
            因为请求网络是一个很耗时的状态，所以采用多线程的方式进行模拟
         */

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (("linlin").equals(username) && ("123").equals(password)) {
                    userLoginListener.loginSuccess();
                } else {
                    userLoginListener.loginFailed();
                }

            }
        }, 2000);
    }
}
