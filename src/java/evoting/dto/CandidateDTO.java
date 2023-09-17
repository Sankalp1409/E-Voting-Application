/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoting.dto;

import java.io.InputStream;

/**
 *
 * @author Dell
 */
public class CandidateDTO {

    @Override
    public String toString() {
        return "CandidateDTO{" + "candidateid=" + candidateid + ", party=" + party + ", userid=" + userid + ", symbol=" + symbol + ", city=" + city + '}';
    }

    public CandidateDTO(String candidateid, String party, String userid, InputStream symbol, String city) {
        this.candidateid = candidateid;
        this.party = party;
        this.userid = userid;
        this.symbol = symbol;
        this.city = city;
    }

    public CandidateDTO() {
    }
    private String candidateid;
    private String party;
    private String userid;
    private InputStream symbol;
    private String city;

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public InputStream getSymbol() {
        return symbol;
    }

    public void setSymbol(InputStream symbol) {
        this.symbol = symbol;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
