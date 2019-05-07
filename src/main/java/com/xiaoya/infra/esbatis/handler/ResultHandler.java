package com.xiaoya.infra.esbatis.handler;


/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:31
 */
public interface ResultHandler<T> {

    T handleResult(String result);

}
