package imooc.com.praitice_mvp_001.Controller;

import imooc.com.praitice_mvp_001.Base.BaseModel;
import imooc.com.praitice_mvp_001.Base.BasePresenter;
import imooc.com.praitice_mvp_001.Base.BaseView;
import imooc.com.praitice_mvp_001.Model.Login_Listener;

/**
 * Created by 95262 on 2017/3/18.
 */

public class Login_Controller {
    //因为中间的构建者是双向获取，我们可以认为，对于普通页面的操作，不涉及后台服务的层面，可以放置于此，
    //进行统一管理
    public interface view_con extends BaseView{
        void show_loading_Animation ();
        void hide_loading_Animation ();
        void Clear_edit ();

    }
    public interface model_con extends BaseModel{
        void Login_commit (String username, String password, Login_Listener login_listener);

    }
    public static abstract class Presenter extends BasePresenter<view_con,model_con>{
        public abstract void Login_Commite (String username,String password);
        public abstract void Clear_edit ();
    }
}
