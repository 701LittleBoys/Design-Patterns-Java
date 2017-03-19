package imooc.com.praitice_mvp_002.Contract;

import imooc.com.praitice_mvp_002.Base.BaseModel;
import imooc.com.praitice_mvp_002.Base.BasePresenter;
import imooc.com.praitice_mvp_002.Base.BaseView;
import imooc.com.praitice_mvp_002.Listener.LoginListener;

/**
 * Created by
 * auother ：Mr_林小贱
 * 邮箱：952622946@qq.com
 */

public class LoginContract {
    public interface login_View extends BaseView{
        void show_Loading ();
        void hide_Loading ();
        void clear_all_edit ();
    }
    public interface login_Model extends BaseModel{
        void User_Login (String username, String password, LoginListener loginListener);
    }
    public abstract static class Presenter extends BasePresenter<login_View,login_Model>{
        protected abstract void UserLogin(String username, String password);
        public abstract void clear_all_edit();
    }
}
