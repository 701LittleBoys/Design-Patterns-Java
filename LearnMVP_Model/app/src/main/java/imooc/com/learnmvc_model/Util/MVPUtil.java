package imooc.com.learnmvc_model.Util;

import java.lang.reflect.ParameterizedType;

/**
 * Created by 95262 on 2017/3/17.
 */

/*
    通过泛型，强制获取一些内容
 */
public class MVPUtil {

    public static <T>T getT (Object o , int i){
        /*
            首先获取超类的type,然后将其强制转换为ParameterizedType
         */
        try {
            return ((Class<T>) ((ParameterizedType)(o.getClass().getGenericSuperclass())).getActualTypeArguments()[i]).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
