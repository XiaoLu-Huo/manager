package com.huoxiaolu.manger.mangerbackend.common;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * @author xiaolu.huo
 */
public class PageUtils {

    public static <T> PageInfo<T> warpPage(Page<T> page) {
        PageInfo<T> pageInfo = new PageInfo<>();
        pageInfo.setPageNum(page.getPageNum());
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setList(page.getResult());
        pageInfo.setTotal(page.getTotal());
        return pageInfo;
    }
}
