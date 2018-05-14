package com.bbs.domitory.pojo.common;

import java.util.List;

/**
 * @author:wuci
 * @date:${date}
 * @version:1.0
 */
public class EasyUiResultParams {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "EasyUiResultParams{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
