
package evoting.dto;

import java.util.Objects;

public class CandidateDetailDTO {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.candidatename);
        hash = 17 * hash + Objects.hashCode(this.candidateid);
        hash = 17 * hash + Objects.hashCode(this.party);
        hash = 17 * hash + Objects.hashCode(this.userid);
        hash = 17 * hash + Objects.hashCode(this.symbol);
        hash = 17 * hash + Objects.hashCode(this.city);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CandidateDetailDTO other = (CandidateDetailDTO) obj;
        if (!Objects.equals(this.candidatename, other.candidatename)) {
            return false;
        }
        if (!Objects.equals(this.candidateid, other.candidateid)) {
            return false;
        }
        if (!Objects.equals(this.party, other.party)) {
            return false;
        }
        if (!Objects.equals(this.userid, other.userid)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CandidateDetailDTO{" + "candidatename=" + candidatename + ", candidateid=" + candidateid + ", party=" + party + ", userid=" + userid + ", symbol=" + symbol + ", city=" + city + '}';
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }

    public CandidateDetailDTO(String candidatename, String candidateid, String party, String userid, String symbol, String city) {
        this.candidatename = candidatename;
        this.candidateid = candidateid;
        this.party = party;
        this.userid = userid;
        this.symbol = symbol;
        this.city = city;
    }

    

    public CandidateDetailDTO() {
    }

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    private String candidatename;
    private String candidateid;
    private String party;
    private String userid;
    private String symbol;
    private String city;
}
