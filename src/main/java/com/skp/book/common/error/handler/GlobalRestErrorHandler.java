package com.skp.book.common.error.handler;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Order(1)
@RestControllerAdvice
public class GlobalRestErrorHandler {
}
