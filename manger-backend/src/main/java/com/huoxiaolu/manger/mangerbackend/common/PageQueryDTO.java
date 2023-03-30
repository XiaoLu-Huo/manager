package com.huoxiaolu.manger.mangerbackend.common;

/**
 * @author xiaolu.huo
 */
public abstract class PageQueryDTO {

    private static final long serialVersionUID = 1L;
    private static final String DIRECTION_ASC = "ASC";
    private static final String DIRECTION_DESC = "DESC";
    private static final int DEFAULT_PAGE_SIZE = 10;
    private Integer pageNumber;
    private Integer pageSize;
    private String orderBy;
    private String orderDirection;

    public PageQueryDTO() {
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        if (pageNumber != null && pageNumber >= 1) {
            this.pageNumber = pageNumber;
        } else {
            this.pageNumber = 1;
        }
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null && pageSize >= 1) {
            this.pageSize = pageSize;
        } else {
            this.pageSize = DEFAULT_PAGE_SIZE;
        }
    }

    public Integer getOffset() {
        return (this.pageNumber - 1) * this.pageSize;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        return this.orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        if (DIRECTION_ASC.equalsIgnoreCase(orderDirection)) {
            this.orderDirection = DIRECTION_ASC;
        } else {
            this.orderDirection = DIRECTION_DESC;
        }
    }
}
