package netbeanjavaclinic;

import java.sql.Date;


public class PatientVO {
    int reg;
    Date d1;
    String name;
    String adr;
    String phone;
	String gender;
	String MarSt;
	String child;
	String age;
	String educt;
	String occup;
	String refby;
	String durill;
	String pastfh;
     //rev2 
        // Date sfdt;
	@Override
	public String toString() {
		return "PatientVO [MarSt=" + MarSt + ", adr=" + adr + ", age=" + age
				+ ", aptit=" + aptit + ", child=" + child + ", cstate="
				+ cstate + ", d1=" + d1 + ", delu=" + delu + ", digno=" + digno
				+ ", dreaming=" + dreaming + ", durill=" + durill + ", educt="
				+ educt + ", fd2=" + fd2 + ", fd3=" + fd3 + ", fd4=" + fd4
				+ ", fd5=" + fd5 + ", fd6=" + fd6 + ", followc=" + followc
				+ ", followdt=" + followdt + ", gender=" + gender + ", hallu="
				+ hallu + ", insight=" + insight + ", judg=" + judg + ", m1="
				+ m1 + ", m2=" + m2 + ", m3=" + m3 + ", medh=" + medh
				+ ", mood=" + mood + ", name=" + name + ", occup=" + occup
				+ ", orien=" + orien + ", others=" + others + ", palpi="
				+ palpi + ", pastfh=" + pastfh + ", pers1=" + pers1
				+ ", pers2=" + pers2 + ", pers3=" + pers3 + ", pers4=" + pers4
				+ ", pers5=" + pers5 + ", pers6=" + pers6 + ", phone=" + phone
				+ ", recentm=" + recentm + ", refby=" + refby + ", reg=" + reg
				+ ", remotm=" + remotm + ", sleep=" + sleep + ", trem=" + trem
				+ "]";
	}


       public String toPrint() {
		return ("PatientDetails:\n"
                        + "Personal:\n" +
                        " name=" + name + "refby=" + refby + " reg=" + reg + "Date=" + d1 +
                        "\nMarSt=" + MarSt + "adr=" + adr + "age=" + age +"\noccup=" + occup
				+"\neduct="	+ educt + " child=" + child + "," +"\n delusion=" + delu 
				+ ", dreaming=" + dreaming + ", duration illness=" + durill+ 
                                 "\n ,aptite=" + aptit + ", hallu="+ hallu + ", medical History=" + medh
				+ "\n, mood=" + mood + ",others=" + others + ", palpi="
				+ palpi + "\n, past family history=" + pastfh + ",sleep=" + sleep + ", tremers=" + trem
				+ ", digno=" + digno+
	                       "\n, followup dt=" + followdt +" followc=" + followc);}



	String medh;
	String sleep;
	String aptit;
	String palpi;
	String trem;
	String hallu;
        
      /*  public void setSfdt(Date d2)
        {
            sfdt=d2;
            
        }
        public Date getSfdt()
        {
           return sfdt; 
        }*/
	public int getReg() {
		return reg;
	}





	public void setReg(int reg) {
		this.reg = reg;
	}





	public Date getD1() {
		return d1;
	}





	public void setD1(Date d1) {
		this.d1 = d1;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getAdr() {
		return adr;
	}





	public void setAdr(String adr) {
		this.adr = adr;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getMarSt() {
		return MarSt;
	}





	public void setMarSt(String marSt) {
		MarSt = marSt;
	}





	public String getChild() {
		return child;
	}





	public void setChild(String child) {
		this.child = child;
	}





	public String getAge() {
		return age;
	}





	public void setAge(String age) {
		this.age = age;
	}





	public String getEduct() {
		return educt;
	}





	public void setEduct(String educt) {
		this.educt = educt;
	}





	public String getOccup() {
		return occup;
	}





	public void setOccup(String occup) {
		this.occup = occup;
	}





	public String getRefby() {
		return refby;
	}





	public void setRefby(String refby) {
		this.refby = refby;
	}





	public String getDurill() {
		return durill;
	}





	public void setDurill(String durill) {
		this.durill = durill;
	}





	public String getPastfh() {
		return pastfh;
	}





	public void setPastfh(String pastfh) {
		this.pastfh = pastfh;
	}





	public String getMedh() {
		return medh;
	}





	public void setMedh(String medh) {
		this.medh = medh;
	}





	public String getSleep() {
		return sleep;
	}





	public void setSleep(String sleep) {
		this.sleep = sleep;
	}





	public String getAptit() {
		return aptit;
	}





	public void setAptit(String aptit) {
		this.aptit = aptit;
	}





	public String getPalpi() {
		return palpi;
	}





	public void setPalpi(String palpi) {
		this.palpi = palpi;
	}





	public String getTrem() {
		return trem;
	}





	public void setTrem(String trem) {
		this.trem = trem;
	}





	public String getHallu() {
		return hallu;
	}





	public void setHallu(String hallu) {
		this.hallu = hallu;
	}





	public String getDelu() {
		return delu;
	}





	public void setDelu(String delu) {
		this.delu = delu;
	}





	public String getInsight() {
		return insight;
	}





	public void setInsight(String insight) {
		this.insight = insight;
	}





	public String getJudg() {
		return judg;
	}





	public void setJudg(String judg) {
		this.judg = judg;
	}





	public String getOthers() {
		return others;
	}





	public void setOthers(String others) {
		this.others = others;
	}





	public String getDreaming() {
		return dreaming;
	}





	public void setDreaming(String dreaming) {
		this.dreaming = dreaming;
	}





	public String getPers1() {
		return pers1;
	}





	public void setPers1(String pers1) {
		this.pers1 = pers1;
	}





	public String getPers2() {
		return pers2;
	}





	public void setPers2(String pers2) {
		this.pers2 = pers2;
	}





	public String getPers3() {
		return pers3;
	}





	public void setPers3(String pers3) {
		this.pers3 = pers3;
	}





	public String getPers4() {
		return pers4;
	}





	public void setPers4(String pers4) {
		this.pers4 = pers4;
	}





	public String getPers5() {
		return pers5;
	}





	public void setPers5(String pers5) {
		this.pers5 = pers5;
	}





	public String getPers6() {
		return pers6;
	}





	public void setPers6(String pers6) {
		this.pers6 = pers6;
	}





	public String getOrien() {
		return orien;
	}





	public void setOrien(String orien) {
		this.orien = orien;
	}





	public String getRemotm() {
		return remotm;
	}





	public void setRemotm(String remotm) {
		this.remotm = remotm;
	}





	public String getRecentm() {
		return recentm;
	}





	public void setRecentm(String recentm) {
		this.recentm = recentm;
	}





	public String getCstate() {
		return cstate;
	}





	public void setCstate(String cstate) {
		this.cstate = cstate;
	}





	public String getMood() {
		return mood;
	}





	public void setMood(String mood) {
		this.mood = mood;
	}





	public String getDigno() {
		return digno;
	}





	public void setDigno(String digno) {
		this.digno = digno;
	}





	public String getM1() {
		return m1;
	}





	public void setM1(String m1) {
		this.m1 = m1;
	}





	public String getM2() {
		return m2;
	}





	public void setM2(String m2) {
		this.m2 = m2;
	}





	public String getM3() {
		return m3;
	}





	public void setM3(String m3) {
		this.m3 = m3;
	}





	public Date getFollowdt() {
		return followdt;
	}





	public void setFollowdt(Date followdt) {
		this.followdt = followdt;
	}





	public String getFollowc() {
		return followc;
	}





	public void setFollowc(String followc) {
		this.followc = followc;
	}





	public Date getFd2() {
		return fd2;
	}





	public void setFd2(Date fd2) {
		this.fd2 = fd2;
	}





	public int getFd3() {
		return fd3;
	}





	public void setFd3(int fd3) {
		this.fd3 = fd3;
	}





	public Date getFd4() {
		return fd4;
	}





	public void setFd4(Date fd4) {
		this.fd4 = fd4;
	}





	public Date getFd5() {
		return fd5;
	}





	public void setFd5(Date fd5) {
		this.fd5 = fd5;
	}





	public Date getFd6() {
		return fd6;
	}





	public void setFd6(Date fd6) {
		this.fd6 = fd6;
	}





	String delu;
	String insight;
	String judg;
	String others;
	String dreaming;
	String pers1;
	String pers2;
	String pers3;
	String pers4;
	String pers5;
	String pers6;
	String orien;
	String remotm;
	String recentm;
	String cstate;
	String mood;
	String digno;
	String m1;
	String m2;
	String m3;
	Date followdt;
	String followc;
	Date fd2;
	int fd3;
	Date fd4;
	Date fd5;
	Date fd6;
	
	
	
	
	
	public PatientVO() {
		// TODO Auto-generated constructor stub
	}

}
