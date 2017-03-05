
package com.diana;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.diana package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertItemResponse_QNAME = new QName("http://diana.com/", "insertItemResponse");
    private final static QName _GetAllItemsRequest_QNAME = new QName("http://diana.com/", "getAllItemsRequest");
    private final static QName _InsertItemRequest_QNAME = new QName("http://diana.com/", "insertItemRequest");
    private final static QName _GetAllItemsResponse_QNAME = new QName("http://diana.com/", "getAllItemsResponse");
    private final static QName _DeleteItemResponse_QNAME = new QName("http://diana.com/", "deleteItemResponse");
    private final static QName _UpdateItemRequest_QNAME = new QName("http://diana.com/", "updateItemRequest");
    private final static QName _UpdateItemResponse_QNAME = new QName("http://diana.com/", "updateItemResponse");
    private final static QName _DeleteItemRequest_QNAME = new QName("http://diana.com/", "deleteItemRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.diana
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteItemRequest }
     * 
     */
    public DeleteItemRequest createDeleteItemRequest() {
        return new DeleteItemRequest();
    }

    /**
     * Create an instance of {@link InsertItemResponse }
     * 
     */
    public InsertItemResponse createInsertItemResponse() {
        return new InsertItemResponse();
    }

    /**
     * Create an instance of {@link GetAllItemsRequest }
     * 
     */
    public GetAllItemsRequest createGetAllItemsRequest() {
        return new GetAllItemsRequest();
    }

    /**
     * Create an instance of {@link InsertItemRequest }
     * 
     */
    public InsertItemRequest createInsertItemRequest() {
        return new InsertItemRequest();
    }

    /**
     * Create an instance of {@link GetAllItemsResponse }
     * 
     */
    public GetAllItemsResponse createGetAllItemsResponse() {
        return new GetAllItemsResponse();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link UpdateItemRequest }
     * 
     */
    public UpdateItemRequest createUpdateItemRequest() {
        return new UpdateItemRequest();
    }

    /**
     * Create an instance of {@link UpdateItemResponse }
     * 
     */
    public UpdateItemResponse createUpdateItemResponse() {
        return new UpdateItemResponse();
    }

    /**
     * Create an instance of {@link ItemModel }
     * 
     */
    public ItemModel createItemModel() {
        return new ItemModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "insertItemResponse")
    public JAXBElement<InsertItemResponse> createInsertItemResponse(InsertItemResponse value) {
        return new JAXBElement<InsertItemResponse>(_InsertItemResponse_QNAME, InsertItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "getAllItemsRequest")
    public JAXBElement<GetAllItemsRequest> createGetAllItemsRequest(GetAllItemsRequest value) {
        return new JAXBElement<GetAllItemsRequest>(_GetAllItemsRequest_QNAME, GetAllItemsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertItemRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "insertItemRequest")
    public JAXBElement<InsertItemRequest> createInsertItemRequest(InsertItemRequest value) {
        return new JAXBElement<InsertItemRequest>(_InsertItemRequest_QNAME, InsertItemRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "getAllItemsResponse")
    public JAXBElement<GetAllItemsResponse> createGetAllItemsResponse(GetAllItemsResponse value) {
        return new JAXBElement<GetAllItemsResponse>(_GetAllItemsResponse_QNAME, GetAllItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "deleteItemResponse")
    public JAXBElement<DeleteItemResponse> createDeleteItemResponse(DeleteItemResponse value) {
        return new JAXBElement<DeleteItemResponse>(_DeleteItemResponse_QNAME, DeleteItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "updateItemRequest")
    public JAXBElement<UpdateItemRequest> createUpdateItemRequest(UpdateItemRequest value) {
        return new JAXBElement<UpdateItemRequest>(_UpdateItemRequest_QNAME, UpdateItemRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "updateItemResponse")
    public JAXBElement<UpdateItemResponse> createUpdateItemResponse(UpdateItemResponse value) {
        return new JAXBElement<UpdateItemResponse>(_UpdateItemResponse_QNAME, UpdateItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteItemRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://diana.com/", name = "deleteItemRequest")
    public JAXBElement<DeleteItemRequest> createDeleteItemRequest(DeleteItemRequest value) {
        return new JAXBElement<DeleteItemRequest>(_DeleteItemRequest_QNAME, DeleteItemRequest.class, null, value);
    }

}
