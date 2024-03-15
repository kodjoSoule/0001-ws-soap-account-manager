package com.javaws.services;
import java.util.ArrayList;
import java.util.List;
import com.javaws.entities.Account;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
@WebService
public class WSAccount {	
	//creer un compte
	@WebMethod
	public boolean createAccount(@WebParam(name = "numero") String numero,
	@WebParam(name = "titulaire") String titulaire, @WebParam(name = "solde") double solde) {
		return true;
	}
	//crediter un compte
	@WebMethod
	public void creditAccount(@WebParam(name = "numero") String numero, @WebParam(name = "amount") double amount) {
	}
	//debiter un compte
	@WebMethod
	public void debitAccount(@WebParam(name = "numero") String numero, @WebParam(name = "amount") double amount) {
	}
	//connaitre le solde d'un solde
	@WebMethod
	public double getSolde(@WebParam(name = "numero") String numero) {
		return 0;
	}
}
