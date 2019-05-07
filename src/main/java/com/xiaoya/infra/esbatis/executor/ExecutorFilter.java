package com.xiaoya.infra.esbatis.executor;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:31
 */
public interface ExecutorFilter {

    void before(FilterContext context);

    void after(FilterContext context);

    void exception(FilterContext context);

}
