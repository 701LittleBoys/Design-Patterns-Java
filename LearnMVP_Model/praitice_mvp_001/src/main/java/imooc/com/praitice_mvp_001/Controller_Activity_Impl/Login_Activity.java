package imooc.com.praitice_mvp_001.Controller_Activity_Impl;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import imooc.com.praitice_mvp_001.Base.BaseActivity;
import imooc.com.praitice_mvp_001.Controller.Login_Controller;
import imooc.com.praitice_mvp_001.Controller_Model_Impl.LoginModel;
import imooc.com.praitice_mvp_001.Controller_Presenter_Impl.LoginPresenter;
import imooc.com.praitice_mvp_001.R;

/**
 * Created by 95262 on 2017/3/18.
 */

public class Login_Activity extends BaseActivity<LoginPresenter,LoginModel> implements View.OnClickListener {
    //此处设置，我们需要的页面的控件
    private EditText edit_username;
    private EditText edit_password;
    private Button action_login;
    private Button action_clear;
    //我们需要显示的进度条
    private ProgressDialog progressDialog;



    //进行主要的页面布置和处理
    @Override
    protected void initPresenter() {
        //进行页面协调者的初始化
        mPresenter.setViewAndModel((Login_Controller.view_con) this,mModel);
    }

    @Override
    protected void initListener() {
        action_login.setOnClickListener(this);
        action_clear.setOnClickListener(this);

    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        edit_username = (EditText) findViewById(R.id.edit_account);
        edit_password = (EditText) findViewById(R.id.edit_pwd);
        action_clear = (Button) findViewById(R.id.btn_clear);
        action_login = (Button) findViewById(R.id.btn_login);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("登录中，请稍后");
        progressDialog.setCancelable(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                String username = edit_username.getText().toString();
                String password = edit_password.getText().toString();
                mPresenter.Login_Commite(username,password);
                break;
            case R.id.btn_clear:
                mPresenter.Clear_edit();
                break;
        }
    }

}
