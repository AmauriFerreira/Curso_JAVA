package br.com.paxtecnologia;

import javax.jws.WebMethod;
import javax.jws.WebParm;
import javax.jws.WebService;


/**
 *
 *@author AmauriFerreira
 */
 @WebService()
 public class NameWS{
 
 
@WebMethod(operationName = "returnName")
public String returnName(@WebParm(name="nameIn") String nameIn){
String arrRetorno[] = new String[2];
arrRetorno[0]=nameIn;
arrRetorno[1]="10";

return arrRetorno;

}

 }