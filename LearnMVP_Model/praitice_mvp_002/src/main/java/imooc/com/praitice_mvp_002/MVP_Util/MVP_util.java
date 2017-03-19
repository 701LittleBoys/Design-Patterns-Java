package imooc.com.praitice_mvp_002.MVP_Util;

import java.lang.reflect.ParameterizedType;

/**
 * Created by
 * auother ：Mr_林小贱
 * 邮箱：952622946@qq.com
 */

public class MVP_util {
    public static <T>T getT (Object o,int i){
        try {
            return  ((Class<T>)((ParameterizedType)(o.getClass().getGenericSuperclass())).getActualTypeArguments()[i]).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
