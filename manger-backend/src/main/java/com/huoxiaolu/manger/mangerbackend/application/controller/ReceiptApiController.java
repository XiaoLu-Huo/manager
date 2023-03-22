package com.huoxiaolu.manger.mangerbackend.application.controller;

import com.huoxiaolu.manger.mangerbackend.api.interfaces.ReceiptApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolu.huo
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
public class ReceiptApiController implements ReceiptApi {
}
