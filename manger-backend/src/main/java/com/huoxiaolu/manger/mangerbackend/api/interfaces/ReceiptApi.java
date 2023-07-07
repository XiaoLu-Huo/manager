package com.huoxiaolu.manger.mangerbackend.api.interfaces;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptUpdateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptListResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author xiaolu.huo
 */
@RequestMapping
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
     * @return 查询的结果(姓名、身份证号码、存款开始时间、结束时间、金额)
     */
    @PostMapping("/receipt/list")
    PageInfo<ReceiptListResponse> queryReceiptList(@RequestBody ReceiptQueryRequest request);


    /**
     * 更新用户信息
     * @param request 更新存单信息的参数
     * @return 存单单号
     */
    @PostMapping("/receipt/update")
    ReceiptResponse updateReceipt(@Valid @RequestBody ReceiptUpdateRequest request);
    // 创建一个存款单
    // 查询存款单列表
    // 查询存款单详情
    // 编辑存款单
    // 提交存款单
    // 删除存款单
}
