package com.xiaoya.infra.esbatis.executor;

import com.xiaoya.infra.esbatis.mapper.MappedStatement;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:31
 */
public interface Executor {

    <T> T execute(MappedStatement ms, Object[] args);

}
