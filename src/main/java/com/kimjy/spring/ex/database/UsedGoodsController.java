package com.kimjy.spring.ex.database;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.kimjy.spring.ex.database.bo.UsedGoodsBO;
import com.kimjy.spring.ex.database.model.UsedGoods;

@Controller
public class UsedGoodsController {
	
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	@RequestMapping("/database/ex01")
	@ResponseBody
	public List<UsedGoods> ex01() {
		
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		
		return usedGoodsList;
	}
}
