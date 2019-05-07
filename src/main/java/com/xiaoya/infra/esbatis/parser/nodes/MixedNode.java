package com.xiaoya.infra.esbatis.parser.nodes;

import com.xiaoya.infra.esbatis.parser.DynamicContext;

import java.util.List;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:33
 */
public class MixedNode implements XmlNode {
    private final List<XmlNode> contents;

    public MixedNode(List<XmlNode> contents) {
        this.contents = contents;
    }

    @Override
    public boolean apply(DynamicContext context) {
        for (XmlNode sqlNode : contents) {
            sqlNode.apply(context);
        }
        return true;
    }
}
