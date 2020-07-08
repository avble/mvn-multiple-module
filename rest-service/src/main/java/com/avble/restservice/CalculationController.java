package com.avble.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avble.calculation.Calculation;

@RestController
public class CalculationController {

	@GetMapping("/calculation")
	public int greeting() {
		Calculation cal = new Calculation();
		return cal.add(1, 2);
	}
}