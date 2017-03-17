package imooc.com.learnmvc_model.newmvp;

import android.app.ProgressDialog;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import imooc.com.learnmvc_model.Base.BaseActivity;
import imooc.com.learnmvc_model.R;

/**
 * Created by 95262 on 2017/3/17.
 */

/*
    我们从中获取了契约的View，因为我们要将业务主体进行分层
 */
public class NewMVPLoginActivity extends BaseActivity<NewLoginPresenter,NewLoginModel> implements LoginContract.View, View.OnClickListener {

    /*
        此页面使用的具体控件
     */
    private EditText edit_username;
    private EditText edit_password;
    private AppCompatButton btn_login;
    private AppCompatButton btn_clear;
    //显示登录的进度
    private ProgressDialog progressDialog;
    //与页面进行协调的协调者


    @Override
    protected void initPresenter() {
        mPresenter.setViewAndModel(this,mModel);
    }

    //控制了View层一些现实的动画等资源的统一管理

    /**
     *
     * @return View层使用的可视化页面
     */
    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    /**
     * 初始化，此页面的监听器
     */
    @Override
    protected void initListener() {
        btn_login.setOnClickListener(this);
        btn_clear.setOnClickListener(this);

    }

    /**
     * 初始化，注册此页面的控件
     */
    @Override
    protected void initView() {
        //进度条的初始化信息
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("登录中，请稍后");
        progressDialog.setCancelable(false);

        edit_username = (EditText) findViewById(R.id.edit_account);
        edit_password = (EditText) findViewById(R.id.edit_pwd);
        btn_login = (AppCompatButton) findViewById(R.id.btn_login);
        btn_clear = (AppCompatButton) findViewById(R.id.btn_clear);


    }


    //实现了业务逻辑层面的业务管理
    @Override
    public void loginSuccess() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clear_edit() {
        edit_username.setText("");
        edit_password.setText("");
    }

    @Override
    public void show_Loading() {
        progressDialog.show();
    }

    @Override
    public void hide_Loading() {
        progressDialog.dismiss();
    }

    @Override
    public void onClick(View v) {
        int result = v.getId();
        if (result == R.id.btn_login){
            String username = edit_username.getText().toString();
            String password = edit_password.getText().toString();
            mPresenter.login(username,password);
        }
        else if (result == R.id.btn_clear){
            mPresenter.clear_edit();
        }
    }
}
