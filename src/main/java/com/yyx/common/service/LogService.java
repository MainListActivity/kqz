package com.yyx.common.service;

import org.springframework.stereotype.Service;

import com.yyx.common.domain.LogDO;
import com.yyx.common.domain.PageDO;
import com.yyx.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
