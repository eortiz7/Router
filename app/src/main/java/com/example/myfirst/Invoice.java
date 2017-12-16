package com.example.myfirst;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

import java.util.Date;

/**
 * Created by -- on 12/3/2017.
 */

public class Invoice implements Parcelable
{
    /*private int custNo;
    private String taxExemptNo,
                    custPONo,
                    shipVia,
                    payType,
                    salesPerson,
                    invoiceNo,
                    custPhone,
                    billTo,
                    shipTo;
    private Date invoiceDate;
    */


    public String getInvoiceNo() {
        return invoiceNo;
    }
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private String invoiceNo;
    private String address;
    private String customerName;

    public Invoice(Parcel parcel)
    {
        setInvoiceNo(parcel.readString());
        setAddress(parcel.readString());
        setCustomerName(parcel.readString());
    }

    public Invoice(String invoiceNo, String address, String customerName)
    {
        setInvoiceNo(invoiceNo);
        setAddress(address);
        setCustomerName(customerName);
    }

    public Invoice ()
    {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getInvoiceNo());
        dest.writeString(getAddress());
        dest.writeString(getCustomerName());
    }

    public static final Parcelable.Creator<Invoice> CREATOR = new Parcelable.Creator<Invoice>()
    {
        @Override
        public Invoice createFromParcel(Parcel parcel)
        {
            return new Invoice(parcel);
        }

        @Override
        public Invoice[] newArray(int size)
        {
            return new Invoice[0];
        }
    };



    /*
    //region getters_setters
    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getTaxExemptNo() {
        return taxExemptNo;
    }

    public void setTaxExemptNo(String taxExemptNo) {
        this.taxExemptNo = taxExemptNo;
    }

    public String getCustPONo() {
        return custPONo;
    }

    public void setCustPONo(String custPONo) {
        this.custPONo = custPONo;
    }

    public String getShipVia() {
        return shipVia;
    }

    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getBillTo() {
        return billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }
    //endregion
    */

}
