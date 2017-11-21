package com.abjr.p2p.service.jf.impl;

import com.abjr.p2p.dao.MpRuleDao;
import com.abjr.p2p.model.MpRule;
import com.abjr.p2p.service.jf.IJiuFuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ab054857 on 2017/11/21.
 */
@Service
public class JiuFuServiceImpl implements IJiuFuService {

	@Autowired
	private MpRuleDao mpRuleDao;

	public MpRule getRuleList() {
		return mpRuleDao.getRuleList();
	}
}
