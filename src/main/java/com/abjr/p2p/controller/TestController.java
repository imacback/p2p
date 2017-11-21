package com.abjr.p2p.controller;

import com.abjr.p2p.model.MpRule;
import com.abjr.p2p.service.jf.IJiuFuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ab054857 on 2017/11/21.
 */
@Controller
@RequestMapping("/test")
public class TestController {


	@Autowired
	private IJiuFuService jiuFuService;

	@RequestMapping("/index")
	@ResponseBody
	public String index(HttpServletRequest request, HttpServletResponse response) {

		MpRule mpRule = new MpRule();
		mpRule.setId(123L);

		mpRule = jiuFuService.getRuleList();

		return JSON.toJSONString(mpRule);
	}
}
