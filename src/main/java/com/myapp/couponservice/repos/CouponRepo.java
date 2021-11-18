package com.myapp.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.couponservice.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

	
}
