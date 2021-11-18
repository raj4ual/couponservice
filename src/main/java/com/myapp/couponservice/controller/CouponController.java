package com.myapp.couponservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.couponservice.model.Coupon;
import com.myapp.couponservice.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponController {

	@Autowired
	private CouponRepo repo;
	
	@RequestMapping(value="/coupons",method=RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {
		
		return repo.save(coupon);
	}
	
	@RequestMapping(value="/coupon/{code}", method=RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		
		return repo.findByCode(code);
	}
}
