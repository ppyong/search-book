package com.skp.book.common.error.handler;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Order(2)
@ControllerAdvice
public class GlobalErrorHandler
{
}
