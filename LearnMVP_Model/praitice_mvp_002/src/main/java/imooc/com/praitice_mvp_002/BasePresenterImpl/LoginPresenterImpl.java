package imooc.com.praitice_mvp_002.BasePresenterImpl;

import android.text.TextUtils;
import android.widget.Toast;

import imooc.com.praitice_mvp_002.Contract.LoginContract;
import imooc.com.praitice_mvp_002.Listener.LoginListener;

/**
 * Created by
 * auother ：Mr_林小贱
 * 邮箱：952622946@qq.com
 */

public class LoginPresenterImpl extends  LoginContract.Presenter {
    @Override
    public void UserLogin(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(getMy_Context(), "请填写用户名或者密码", Toast.LENGTH_SHORT).show();
        } else {
            getMy_View().show_Loading();
            getMy_Model().User_Login(username, password, new LoginListener() {
                @Override
                public void Login_Success() {
                    getMy_View().hide_Loading();
                    Toast.makeText(getMy_Context(),"登陆成功",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void Login_Failed() {
                    getMy_View().hide_Loading();
                    Toast.makeText(getMy_Context(),"登录失败",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void clear_all_edit() {
        getMy_View().clear_all_edit();
    }

}
