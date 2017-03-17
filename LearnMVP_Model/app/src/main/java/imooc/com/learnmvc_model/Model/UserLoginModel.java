package imooc.com.learnmvc_model.Model;

/**
 * Created by 95262 on 2017/3/15.
 */

public interface UserLoginModel {
    void UserLogin (String username,String password,UserLoginListener userLoginListener);
}
