package com.diana;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-03-05T13:14:53.148-05:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://diana.com/", name = "StockManagementPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StockManagementPortType {

    @WebMethod
    @WebResult(name = "updateItemResponse", targetNamespace = "http://diana.com/", partName = "parameters")
    public UpdateItemResponse updateItem(
        @WebParam(partName = "parameters", name = "updateItemRequest", targetNamespace = "http://diana.com/")
        UpdateItemRequest parameters
    );

    @WebMethod
    @WebResult(name = "insertItemResponse", targetNamespace = "http://diana.com/", partName = "parameters")
    public InsertItemResponse insertItem(
        @WebParam(partName = "parameters", name = "insertItemRequest", targetNamespace = "http://diana.com/")
        InsertItemRequest parameters
    );

    @WebMethod
    @WebResult(name = "getAllItemsResponse", targetNamespace = "http://diana.com/", partName = "parameters")
    public GetAllItemsResponse getAllItems(
        @WebParam(partName = "parameters", name = "getAllItemsRequest", targetNamespace = "http://diana.com/")
        GetAllItemsRequest parameters
    );

    @WebMethod
    @WebResult(name = "deleteItemResponse", targetNamespace = "http://diana.com/", partName = "parameters")
    public DeleteItemResponse deleteItem(
        @WebParam(partName = "parameters", name = "deleteItemRequest", targetNamespace = "http://diana.com/")
        DeleteItemRequest parameters
    );
}