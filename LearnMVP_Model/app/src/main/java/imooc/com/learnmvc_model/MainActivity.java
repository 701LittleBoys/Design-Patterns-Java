package imooc.com.learnmvc_model;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import imooc.com.learnmvc_model.Presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , LoginView{
    private EditText edit_username;
    private EditText edit_password;
    private AppCompatButton btn_login;
    private AppCompatButton btn_clear;
    //显示登录的进度
    private ProgressDialog progressDialog;
    //与页面进行协调的协调者
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
        initListener();
    }

    private void initView ()
    {
        //进度条的初始化信息
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("登录中，请稍后");
        progressDialog.setCancelable(false);



        edit_username = (EditText) findViewById(R.id.edit_account);
        edit_password = (EditText) findViewById(R.id.edit_pwd);
        btn_login = (AppCompatButton) findViewById(R.id.btn_login);
        btn_clear = (AppCompatButton) findViewById(R.id.btn_clear);

        //初始化页面的协调者
        loginPresenter = new LoginPresenter(this,this);
    }

    private void initListener ()
    {
        btn_login.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int result = v.getId();
        switch (result){
            case R.id.btn_login:
                String username = edit_username.getText().toString();
                String password = edit_password.getText().toString();
                loginPresenter.login(username,password);
                break;
            case R.id.btn_clear:
                /*
                edit_password.setText("");
                edit_username.setText("");
                */
                loginPresenter.clear();
                break;
        }
    }

    @Override
    public void show_logining() {
        progressDialog.show();
    }

    @Override
    public void hide_logining() {
        progressDialog.dismiss();
    }

    @Override
    public void success() {
        Toast.makeText(this,"登陆成功，即将转跳下一个页面",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failed() {
        Toast.makeText(this,"登陆失败，即将转跳下一个页面",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clear() {
        edit_password.setText("");
        edit_username.setText("");
    }
}
