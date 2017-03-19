package imooc.com.praitice_mvp_002.BaseModelImpl;

import android.os.Handler;
import android.text.TextUtils;

import imooc.com.praitice_mvp_002.Contract.LoginContract;
import imooc.com.praitice_mvp_002.Listener.LoginListener;

/**
 * Created by
 * auother ：Mr_林小贱
 * 邮箱：952622946@qq.com
 */

public class LoginModelImpl implements LoginContract.login_Model {
    @Override
    public void User_Login(final String username, final String password, final LoginListener loginListener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (username.equals("linlin") && password.equals("123")){
                    loginListener.Login_Success();
                }
                else{
                    loginListener.Login_Failed();
                }
            }
        },2000);
    }
}
