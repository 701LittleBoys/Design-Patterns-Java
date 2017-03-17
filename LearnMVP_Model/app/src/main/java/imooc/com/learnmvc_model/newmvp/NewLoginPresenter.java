package imooc.com.learnmvc_model.newmvp;

import android.text.TextUtils;
import android.widget.Toast;

import imooc.com.learnmvc_model.Model.UserLoginListener;

/**
 * Created by 95262 on 2017/3/17.
 */

public class NewLoginPresenter extends LoginContract.Presenter {
    @Override
    void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(mContext, "请填写用户名或者密码", Toast.LENGTH_SHORT).show();
        } else {
            mView.show_Loading();
            mModel.UserLogin(username, password, new UserLoginListener() {
                @Override
                public void loginSuccess() {
                    mView.loginSuccess();
                    mView.hide_Loading();
                }

                @Override
                public void loginFailed() {
                    mView.loginFailed();
                    mView.hide_Loading();
                }
            });
        }
    }

    @Override
    void clear_edit() {
        mView.clear_edit();
    }
}
