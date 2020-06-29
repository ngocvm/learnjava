package com.ngocvm.example.all.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValueAsBytes(new BoLogonRequest());

            long startTime = System.currentTimeMillis();
            BoLogonRequest logonRequest = new BoLogonRequest();
            logonRequest.setLoginId("hung.vu.quang@nextop.asia");
            logonRequest.setTicketId("hung.vu.quang@nextop.asia_eVx8YkdCqqsxXUx3sy6ThIJ9KRJ6b9");
            logonRequest.setSourceType(BoSourceType.BACK_END);
            long elapsed1 = System.currentTimeMillis() - startTime;
            byte[] bytes = mapper.writeValueAsBytes(logonRequest);
            long elapsed2 = System.currentTimeMillis() - startTime;
            System.out.println("Time serialize 1: " + elapsed1);
            System.out.println("Time serialize 2: " + elapsed2);
        } catch (Exception ex) {
            System.err.println("Error: "+ ex);
        }
    }
}
