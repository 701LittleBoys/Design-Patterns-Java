package imooc.com.praitice_mvp_002.BaseActivityImpl;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import imooc.com.praitice_mvp_002.Base.BaseActivity;
import imooc.com.praitice_mvp_002.BaseModelImpl.LoginModelImpl;
import imooc.com.praitice_mvp_002.BasePresenterImpl.LoginPresenterImpl;
import imooc.com.praitice_mvp_002.Contract.LoginContract;
import imooc.com.praitice_mvp_002.R;

/**
 * Created by
 * auother ：Mr_林小贱
 * 邮箱：952622946@qq.com
 */

public class LoginActivityImpl extends BaseActivity<LoginPresenterImpl,LoginModelImpl> implements LoginContract.login_View, View.OnClickListener {

    private EditText edit_username;
    private EditText edit_password;
    private ProgressDialog progressDialog;
    private Button action_login;
    private Button action_clear;

    @Override
    protected int get_MyLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewListener() {
        action_login.setOnClickListener(this);
        action_clear.setOnClickListener(this);

    }

    @Override
    protected void initView() {
        this.edit_username = (EditText) findViewById(R.id.edit_account);
        this.edit_password = (EditText) findViewById(R.id.edit_pwd);
        this.action_login = (Button) findViewById(R.id.btn_login);
        this.action_clear = (Button) findViewById(R.id.btn_clear);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("登录中，请稍后");
        progressDialog.setCancelable(false);
    }

    @Override
    protected void initPresenter() {
        my_Presenter.setViewAndModel(this,my_Model,this);
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
    public void clear_all_edit() {
        edit_password.setText("");
        edit_username.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                my_Presenter.UserLogin(edit_username.getText().toString(),edit_password.getText().toString());
                break;
            case R.id.btn_clear:
                my_Presenter.clear_all_edit();
                break;
        }
    }
}
