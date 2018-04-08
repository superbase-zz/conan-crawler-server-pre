package com.conan.crawler.server.pre.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.conan.crawler.server.pre.entity.ResponseResult;
import com.conan.crawler.server.pre.entity.SellerTb;
import com.conan.crawler.server.pre.mapper.SellerTbMapper;
import com.conan.crawler.server.pre.util.Utils;

@RestController
@RequestMapping("shop")
public class ShopController {
	@Autowired
	private SellerTbMapper sellerTbMapper;

	@Autowired
	private KafkaTemplate kafkaTemplate;

	@RequestMapping(value = "scan-start", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ResponseResult> postRateScanStart() throws Exception {
		List<SellerTb> sellerTbList = sellerTbMapper.selectAll();
		for (SellerTb sellerTb : sellerTbList) {
			System.out.println("start---rate-scan---"+sellerTb.getUserNumberId()+"---"+Utils.getShopUrl(sellerTb.getUserNumberId()));
			ListenableFuture future = kafkaTemplate.send("rate-scan", sellerTb.getUserNumberId(),Utils.getShopUrl(sellerTb.getUserNumberId()));
			System.out.println("end---rate-scan---"+sellerTb.getUserNumberId()+"---"+Utils.getShopUrl(sellerTb.getUserNumberId()));
		}

		return new ResponseEntity<ResponseResult>(
				new ResponseResult(HttpStatus.CREATED.toString(), sellerTbList),
				HttpStatus.CREATED);
	}
}