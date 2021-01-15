package co.com.sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

import co.com.sale.data.SaleData;
import co.com.sale.service.SaleService;

/**
 * controlador para la operacion de venta
 * @author Administrador
 *
 */
@RestController
@RequestMapping("/sale")
public class SaleController {
	@Autowired
	SaleService service;

	@PutMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public String save(@Validated @NotNull @RequestBody SaleData sale) {
		service.add(sale);
		return "ok";
	}
}
