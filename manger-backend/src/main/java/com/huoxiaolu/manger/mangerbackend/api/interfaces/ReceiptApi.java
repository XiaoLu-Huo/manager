package com.huoxiaolu.manger.mangerbackend.api.interfaces;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptListResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xiaolu.huo
 */
public interface ReceiptApi {
    /**
     * 创建一个存款单
     * @param request 创建存单的参数
     * @return ReceiptResponse
     */
    @PostMapping("/receipt/create")
    ReceiptResponse createReceipt(@Valid @RequestBody ReceiptCreateRequest request);

    /**
     * 分页查询存单列表
     * @param request 分页查询参数(身份证号码、姓名、存款结束日期区间)
     * @return 查询的结果(姓名、身份证号码、存款开始时间、结束时间、金额)
     */
    @GetMapping("/receipt/list")
    PageInfo<ReceiptListResponse> queryReceiptList(@RequestBody ReceiptQueryRequest request);


//    /**
//     * 更新用户信息
//     * @param request 更新用户信息的参数
//     * @return 用户信息
//     */
//    @PostMapping("/receipt/update")
//    UserInfoResponse updateReceipt(@Valid @RequestBody UserUpdateRequest request);
    // 创建一个存款单
    // 查询存款单列表
    // 查询存款单详情
    // 编辑存款单
    // 提交存款单
    // 删除存款单
}
