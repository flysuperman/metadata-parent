package com.sailing.bdip.metadata.filter;

import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.StatementProxy;

public class TestFilter extends  FilterEventAdapter {
    @Override
    protected void statementExecuteAfter(StatementProxy statement, String sql, boolean result) {
        System.out.println("haha");
        super.statementExecuteAfter(statement, sql, result);
    }
}
