package imooc.com.praitice_mvp_002.Base;

import android.content.Context;

/**
 * Created by
 * auother ：Mr_林小贱
 * 邮箱：952622946@qq.com
 */

public abstract class BasePresenter<T,E> {
    private Context my_Context;
    private T my_View;
    private E my_Model;
    //通过构造函数进行绑定
    public void setViewAndModel (T View,E Model,Context context){
        this.my_Context = context;
        this.my_View = View;
        this.my_Model = Model;
    }

    public void setMy_Context(Context my_Context) {
        this.my_Context = my_Context;
    }

    public void setMy_Model(E my_Model) {
        this.my_Model = my_Model;
    }

    public void setMy_View(T my_View) {
        this.my_View = my_View;
    }

    public Context getMy_Context() {
        return my_Context;
    }

    public E getMy_Model() {
        return my_Model;
    }

    public T getMy_View() {
        return my_View;
    }
}
