package com.example.myfirst;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by -- on 12/13/2017.
 */

public class InvoiceAdapter extends ArrayAdapter<Invoice> {
    public InvoiceAdapter(@NonNull Context context, ArrayList<Invoice> aInvoices) {
        super(context, 0, aInvoices);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Invoice invoice = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.invoice_list_item_layout, null);
        }

         //Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvAddress = (TextView) convertView.findViewById(R.id.tvAddress);

        tvName.setText(invoice.getCustomerName());
        tvAddress.setText(invoice.getAddress());
        // Return the completed view to render on screen

        return convertView;
    }
}
