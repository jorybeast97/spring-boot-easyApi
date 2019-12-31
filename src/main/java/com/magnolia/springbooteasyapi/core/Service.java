package com.magnolia.springbooteasyapi.core;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author 范昊
 * service层抽象方法
 */
@org.springframework.stereotype.Service
@Transactional(rollbackFor = Exception.class)
public interface Service {



}
