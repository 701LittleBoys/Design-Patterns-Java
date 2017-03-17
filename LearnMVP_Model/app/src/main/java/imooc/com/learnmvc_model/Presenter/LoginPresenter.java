package imooc.com.learnmvc_model.Presenter;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import imooc.com.learnmvc_model.LoginView;
import imooc.com.learnmvc_model.Model.UserLoginImpl;
import imooc.com.learnmvc_model.Model.UserLoginListener;
import imooc.com.learnmvc_model.Model.UserLoginModel;

/**
 * Created by 95262 on 2017/3/15.
 */

public class LoginPresenter {
    private LoginView loginView;
    private UserLoginModel userLoginModel;
    private Context mcontext;

    public LoginPresenter(Context context,LoginView loginView) {
        this.mcontext = context;
        this.loginView = loginView;
        userLoginModel = new UserLoginImpl();
    }

    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(mcontext,"请输入用户名或者密码",Toast.LENGTH_SHORT).show();
        } else {
            //进行开场动画的主要控制
            loginView.show_logining();

            //进行登录页面的协调者的主要操作
            userLoginModel.UserLogin(username, password, new UserLoginListener() {
                @Override
                public void loginSuccess() {
                    loginView.success();
                    loginView.hide_logining();
                }

                @Override
                public void loginFailed() {
                    loginView.failed();
                }
            });
        }
    }

    public void clear (){
        loginView.clear();
    }

}
