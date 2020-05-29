package com.ngocvm.example.all.jackson;

public class BoLogonRequest {
    private String loginId;
    private String ticketId;
    private String password;
    private LoginType loginType;
    private BoSourceType sourceType;

    public BoLogonRequest() {

    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public BoSourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(BoSourceType sourceType) {
        this.sourceType = sourceType;
    }
}
