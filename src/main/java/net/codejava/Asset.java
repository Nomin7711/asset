package net.codejava;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "asset_copy")
public class Asset {
	
	@Id
	@Column(name="dep_code",nullable = true)
	private int depCode;
	
	@Column(name="org_code",nullable = true)
	private int orgCode;
	
	@Column(name="pwc_id",nullable = true, length = 10)
	private String pwcId;
	
	@Column(name="e_code",nullable = true, length = 10)
	private String eCode;
	
	@Column(name="e_name",nullable = true, length = 150)
	private String eName;
	
	@Column(name="asset_code",nullable = true, length = 10)
	private String assetCode;
	
	@Column(name="code_change",nullable = true, length = 10)
	private String codeChange;
	
	@Column(name="code_temp",nullable = false, length = 10)
	private String codeTemp;
	
	@Column(name="new_code",nullable = true, length = 16)
	private String newCode;
	
	@Column(name="asset_dans",nullable = true, length = 22)
	private String assetDans;
	
	@Column(name="asset_name",nullable = true, length = 250)
	private String assetName;
	
	@Column(name="asset_mark",nullable = true, length = 250)
	private String assetMark;
	
	@Column(name="use_year",nullable = true)
	private int useYear;
	
	@JsonIgnore
	private Date docDate = new Date();
	
	@JsonIgnore
	private Date useDate = new Date();
	
	@JsonIgnore
	private Date calcDate = new Date();
	
	@Column(name="eleg_2010",nullable = true)
	private float eleg2010;
	
	@Column(name="urt_2015",nullable = true)
	private float urt2015;
	
	@Column(name="eleg_2015",nullable = true)
	private float eleg2015;
	
	@Column(name="eleg_month",nullable = true)
	private float elegMonth;
	
	@Column(name="du_norm_year",nullable = true)
	private int duNormYear;
	
	@Column(name="du_will_year",nullable = true)
	private int duWillYear;
	
	@Column(name="du_urt",nullable = true)
	private float duUrt;
	
	@Column(name="du_to_eleg",nullable = true)
	private float duToEleg;
	
	@Column(name="du_bo_une",nullable = true)
	private float duBoUne;
	
	@Column(name="ajil",nullable = true)
	private int ajil;
	
	@Column(name="eleg1",nullable = true)
	private float eleg1;
	
	@Column(name="eleg2",nullable = true)
	private float eleg2;
	
	@Column(name="eleg3",nullable = true)
	private float eleg3;
	
	@Column(name="eleg4",nullable = true)
	private float eleg4;
	
	@Column(name="cost0",nullable = true)
	private float cost0;
	
	@Column(name="cost1",nullable = true)
	private float cost1;

	@Column(name="cost2",nullable = true)
	private float cost2;
	
	@Column(name="cost3",nullable = true)
	private float cost3;
	
	@Column(name="cost4",nullable = true)
	private float cost4;
	
	@Column(name="cost5",nullable = true)
	private float cost5;
	
	@Column(name="cost6",nullable = true)
	private float cost6;
	
	@Column(name="cost7",nullable = true)
	private float cost7;
	
	@Column(name="cost8",nullable = true)
	private float cost8;
	
	@Column(name="cost9",nullable = true)
	private float cost9;
	
	@Column(name="cost10",nullable = true)
	private float cost10;
	
	@Column(name="cost11",nullable = true)
	private float cost11;
	
	@Column(name="cost12",nullable = true)
	private float cost12;
	
	@Column(name="cost13",nullable = true)
	private float cost13;
	
	@Column(name="amor0",nullable = true)
	private float amor0;
	
	@Column(name="amor1",nullable = true)
	private float amor1;
	
	@Column(name="amor2",nullable = true)
	private float amor2;
	
	@Column(name="amor3",nullable = true)
	private float amor3;
	
	@Column(name="amor4",nullable = true)
	private float amor4;
	
	@Column(name="amor5",nullable = true)
	private float amor5;
	
	@Column(name="amor6",nullable = true)
	private float amor6;
	
	@Column(name="amor7",nullable = true)
	private float amor7;
	
	@Column(name="amor8",nullable = true)
	private float amor8;
	
	@Column(name="amor9",nullable = true)
	private float amor9;
	
	@Column(name="amor10",nullable = true)
	private float amor10;
	
	@Column(name="amor11",nullable = true)
	private float amor11;
	
	@Column(name="amor12",nullable = true)
	private float amor12;
	
	@Column(name="amor13",nullable = true)
	private float amor13;
	
	@Column(name="add1",nullable = true)
	private float add1;
	
	@Column(name="add2",nullable = true)
	private float add2;
	
	@Column(name="add3",nullable = true)
	private float add3;
	
	@Column(name="add4",nullable = true)
	private float add4;
	
	@Column(name="add5",nullable = true)
	private float add5;
	
	@Column(name="add6",nullable = true)
	private float add6;
	
	@Column(name="add7",nullable = true)
	private float add7;
	
	@Column(name="add8",nullable = true)
	private float add8;
	
	@Column(name="add9",nullable = true)
	private float add9;
	
	@Column(name="add10",nullable = true)
	private float add10;
	
	@Column(name="add11",nullable = true)
	private float add11;
	
	@Column(name="add12",nullable = true)
	private float add12;
	
	@Column(name="impar1",nullable = true)
	private float impar1;
	
	@Column(name="impar2",nullable = true)
	private float impar2;
	
	@Column(name="impar3",nullable = true)
	private float impar3;
	
	@Column(name="impar4",nullable = true)
	private float impar4;
	
	@Column(name="impar5",nullable = true)
	private float impar5;
	
	@Column(name="impar6",nullable = true)
	private float impar6;
	
	@Column(name="impar7",nullable = true)
	private float impar7;
	
	@Column(name="impar8",nullable = true)
	private float impar8;
	
	@Column(name="impar9",nullable = true)
	private float impar9;
	
	@Column(name="impar10",nullable = true)
	private float impar10;
	
	@Column(name="impar11",nullable = true)
	private float impar11;
	
	@Column(name="impar12",nullable = true)
	private float impar12;
	
	@Column(name="dans1",nullable = true, length = 10)
	private String dans1;
	
	@Column(name="dans2",nullable = true, length = 10)
	private String dans2;
	
	@Column(name="dans3",nullable = true, length = 10)
	private String dans3;
	
	@Column(name="dans4",nullable = true, length = 10)
	private String dans4;
	
	@Column(name="dans5",nullable = true, length = 10)
	private String dans5;
	
	@Column(name="dans6",nullable = true, length = 10)
	private String dans6;
	
	@Column(name="dans7",nullable = true, length = 10)
	private String dans7;
	
	@Column(name="dans8",nullable = true, length = 10)
	private String dans8;
	
	@Column(name="dans9",nullable = true, length = 10)
	private String dans9;
	
	@Column(name="dans10",nullable = true, length = 10)
	private String dans10;
	
	@Column(name="dans11",nullable = true, length = 10)
	private String dans11;
	
	@Column(name="dans12",nullable = true, length = 10)
	private String dans12;
	
	@Column(name="ab1",nullable = true)
	private int ab1;
	
	@Column(name="ab2",nullable = true)
	private int ab2;
	
	@Column(name="ab3",nullable = true)
	private int ab3;
	
	@Column(name="ab4",nullable = true)
	private int ab4;
	
	@Column(name="ab5",nullable = true)
	private int ab5;
	
	@Column(name="ab6",nullable = true)
	private int ab6;
	
	@Column(name="ab7",nullable = true)
	private int ab7;
	
	@Column(name="ab8",nullable = true)
	private int ab8;
	
	@Column(name="ab9",nullable = true)
	private int ab9;
	
	@Column(name="ab10",nullable = true)
	private int ab10;
	
	@Column(name="ab11",nullable = true)
	private int ab11;
	
	@Column(name="ab12",nullable = true)
	private int ab12;
	
	@Column(name="ez1",nullable = true)
	private int ez1;
	
	@Column(name="ez2",nullable = true)
	private int ez2;
	
	@Column(name="ez3",nullable = true)
	private int ez3;

	@Column(name="ez4",nullable = true)
	private int ez4;
	
	@Column(name="ez5",nullable = true)
	private int ez5;
	
	@Column(name="ez6",nullable = true)
	private int ez6;
	
	@Column(name="ez7",nullable = true)
	private int ez7;
	
	@Column(name="ez8",nullable = true)
	private int ez8;
	
	@Column(name="ez9",nullable = true)
	private int ez9;
	
	@Column(name="ez10",nullable = true)
	private int ez10;
	
	@Column(name="ez11",nullable = true)
	private int ez11;
	
	@Column(name="ez12",nullable = true)
	private int ez12;
	
	@Column(name="owner",nullable = true)
	private int owner;
	
	@Column(name="divis",nullable = true)
	private int divis;
	
	@Column(name="c2",nullable = true)
	private int c2;
	
	@Column(name="method",nullable = true)
	private int method;
	
	@JsonIgnore
	private Date mdf_date = new Date();
	
	@Column(name="mdf_uname",nullable = true, length = 50)
	private String mdfUname;
	
	@Column(name="sids",nullable = false)
	private int sids;
	
	@Column(name="prob",nullable = true)
	private int prob;
	
	@Column(name="nowbe",nullable = true)
	private int nowbe;
	
	@Column(name="lock",nullable = true, length = 1)
	private char lock;
	
	@JsonIgnore
	private Date lockDate = new Date();
	
	@Column(name="lockId",nullable = true)
	private int lock_id;
	
	@Column(name="account1",nullable = true, length = 22)
	private String account1;
	
	@Column(name="account2",nullable = true, length = 22)
	private String account2;
	
	@Column(name="account3",nullable = true, length = 22)
	private String account3;
	
	@Column(name="account4",nullable = true, length = 22)
	private String account4;
	
	@Column(name="account5",nullable = true, length = 22)
	private String account5;
	
	@Column(name="account6",nullable = true, length = 22)
	private String account6;
	
	@Column(name="account7",nullable = true, length = 22)
	private String account7;
	
	@Column(name="account8",nullable = true, length = 22)
	private String account8;
	
	@Column(name="account9",nullable = true, length = 22)
	private String account9;
	
	@Column(name="account10",nullable = true, length = 22)
	private String account10;
	
	@Column(name="account11",nullable = true, length = 22)
	private String account11;
	
	@Column(name="account12",nullable = true, length = 22)
	private String account12;
	
	@Column(name="ajil1",nullable = true)
	private int ajil1;
	
	@Column(name="ajil2",nullable = true)
	private int ajil2;
	
	@Column(name="ajil3",nullable = true)
	private int ajil3;
	
	@Column(name="ajil4",nullable = true)
	private int ajil4;
	
	@Column(name="ajil5",nullable = true)
	private int ajil5;
	
	@Column(name="ajil6",nullable = true)
	private int ajil6;
	
	@Column(name="ajil7",nullable = true)
	private int ajil7;
	
	@Column(name="ajil8",nullable = true)
	private int ajil8;
	
	@Column(name="ajil9",nullable = true)
	private int ajil9;
	
	@Column(name="ajil10",nullable = true)
	private int ajil10;
	
	@Column(name="ajil11",nullable = true)
	private int ajil11;
	
	@Column(name="ajil12",nullable = true)
	private int ajil12;
	
	@Column(name="hur1",nullable = true, length = 22)
	private String hur1;
	
	@Column(name="hur2",nullable = true, length = 22)
	private String hur2;
	
	@Column(name="hur3",nullable = true, length = 22)
	private String hur3;
	
	@Column(name="hur4",nullable = true, length = 22)
	private String hur4;
	
	@Column(name="hur5",nullable = true, length = 22)
	private String hur5;
	
	@Column(name="hur6",nullable = true, length = 22)
	private String hur6;
	
	@Column(name="hur7",nullable = true, length = 22)
	private String hur7;
	
	@Column(name="hur8",nullable = true, length = 22)
	private String hur8;
	
	@Column(name="hur9",nullable = true, length = 22)
	private String hur9;
	
	@Column(name="hur10",nullable = true, length = 22)
	private String hur10;
	
	@Column(name="hur11",nullable = true, length = 22)
	private String hur11;
	
	@Column(name="hur12",nullable = true, length = 22)
	private String hur12;
	
	@Column(name="nomer",nullable = true, length = 50)
	private String nomer;
	
	@JsonIgnore
	private Date nomerdate = new Date();
	
	@Column(name="hemjee",nullable = true)
	private float hemjee;
	
	@Column(name="kadaster",nullable = true, length = 1)
	private char kadaster;
	
	@Column(name="zoriulalt",nullable = true, length = 400)
	private String zoriulalt;
	
	@Column(name="etaj")
	private int etaj	;
	
	@Column(name="kvar",nullable = true)
	private int kvar;
	
	@Column(name="metho",nullable = true)
	private int metho;
	
	@Column(name="hurungu",nullable = true)
	private int hurungu;
	
	@Column(name="posit",nullable = true, length = 500)
	private String posit;
	
	@Column(name="nomereng",nullable = true, length = 25)
	private String nomereng;
	
	@Column(name="ramno",nullable = true, length = 25)
	private String ramno;
	
	@Column(name="source",nullable = true)
	private int source;
	
	@Column(name="ktdans",nullable = true, length = 22)
	private String ktdans;
	
	@Column(name="postav",nullable = true, length = 22)
	private String postav;
	
//	@Column(name="postavName",nullable = true, length = 500)
//	private String postavName;
	
	@Column(name="calcelegstate",nullable = true, length = 1)
	private char calcelegstate;

	public int getDepCode() {
		return depCode;
	}

	public void setDepCode(int depCode) {
		this.depCode = depCode;
	}

	public int getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(int orgCode) {
		this.orgCode = orgCode;
	}

	public String getPwcId() {
		return pwcId;
	}

	public void setPwcId(String pwcId) {
		this.pwcId = pwcId;
	}

	public String geteCode() {
		return eCode;
	}

	public void seteCode(String eCode) {
		this.eCode = eCode;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAssetCode() {
		return assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getCodeChange() {
		return codeChange;
	}

	public void setCodeChange(String codeChange) {
		this.codeChange = codeChange;
	}

	public String getCodeTemp() {
		return codeTemp;
	}

	public void setCodeTemp(String codeTemp) {
		this.codeTemp = codeTemp;
	}

	public String getNewCode() {
		return newCode;
	}

	public void setNewCode(String newCode) {
		this.newCode = newCode;
	}

	public String getAssetDans() {
		return assetDans;
	}

	public void setAssetDans(String assetDans) {
		this.assetDans = assetDans;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetMark() {
		return assetMark;
	}

	public void setAssetMark(String assetMark) {
		this.assetMark = assetMark;
	}

	public int getUseYear() {
		return useYear;
	}

	public void setUseYear(int useYear) {
		this.useYear = useYear;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public Date getUseDate() {
		return useDate;
	}

	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}

	public Date getCalcDate() {
		return calcDate;
	}

	public void setCalcDate(Date calcDate) {
		this.calcDate = calcDate;
	}

	public float getEleg2010() {
		return eleg2010;
	}

	public void setEleg2010(float eleg2010) {
		this.eleg2010 = eleg2010;
	}

	public float getUrt2015() {
		return urt2015;
	}

	public void setUrt2015(float urt2015) {
		this.urt2015 = urt2015;
	}

	public float getEleg2015() {
		return eleg2015;
	}

	public void setEleg2015(float eleg2015) {
		this.eleg2015 = eleg2015;
	}

	public float getElegMonth() {
		return elegMonth;
	}

	public void setElegMonth(float elegMonth) {
		this.elegMonth = elegMonth;
	}

	public int getDuNormYear() {
		return duNormYear;
	}

	public void setDuNormYear(int duNormYear) {
		this.duNormYear = duNormYear;
	}

	public int getDuWillYear() {
		return duWillYear;
	}

	public void setDuWillYear(int duWillYear) {
		this.duWillYear = duWillYear;
	}

	public float getDuUrt() {
		return duUrt;
	}

	public void setDuUrt(float duUrt) {
		this.duUrt = duUrt;
	}

	public float getDuToEleg() {
		return duToEleg;
	}

	public void setDuToEleg(float duToEleg) {
		this.duToEleg = duToEleg;
	}

	public float getDuBoUne() {
		return duBoUne;
	}

	public void setDuBoUne(float duBoUne) {
		this.duBoUne = duBoUne;
	}

	public int getAjil() {
		return ajil;
	}

	public void setAjil(int ajil) {
		this.ajil = ajil;
	}

	public float getEleg1() {
		return eleg1;
	}

	public void setEleg1(float eleg1) {
		this.eleg1 = eleg1;
	}

	public float getEleg2() {
		return eleg2;
	}

	public void setEleg2(float eleg2) {
		this.eleg2 = eleg2;
	}

	public float getEleg3() {
		return eleg3;
	}

	public void setEleg3(float eleg3) {
		this.eleg3 = eleg3;
	}

	public float getEleg4() {
		return eleg4;
	}

	public void setEleg4(float eleg4) {
		this.eleg4 = eleg4;
	}

	public float getCost0() {
		return cost0;
	}

	public void setCost0(float cost0) {
		this.cost0 = cost0;
	}

	public float getCost1() {
		return cost1;
	}

	public void setCost1(float cost1) {
		this.cost1 = cost1;
	}

	public float getCost2() {
		return cost2;
	}

	public void setCost2(float cost2) {
		this.cost2 = cost2;
	}

	public float getCost3() {
		return cost3;
	}

	public void setCost3(float cost3) {
		this.cost3 = cost3;
	}

	public float getCost4() {
		return cost4;
	}

	public void setCost4(float cost4) {
		this.cost4 = cost4;
	}

	public float getCost5() {
		return cost5;
	}

	public void setCost5(float cost5) {
		this.cost5 = cost5;
	}

	public float getCost6() {
		return cost6;
	}

	public void setCost6(float cost6) {
		this.cost6 = cost6;
	}

	public float getCost7() {
		return cost7;
	}

	public void setCost7(float cost7) {
		this.cost7 = cost7;
	}

	public float getCost8() {
		return cost8;
	}

	public void setCost8(float cost8) {
		this.cost8 = cost8;
	}

	public float getCost9() {
		return cost9;
	}

	public void setCost9(float cost9) {
		this.cost9 = cost9;
	}

	public float getCost10() {
		return cost10;
	}

	public void setCost10(float cost10) {
		this.cost10 = cost10;
	}

	public float getCost11() {
		return cost11;
	}

	public void setCost11(float cost11) {
		this.cost11 = cost11;
	}

	public float getCost12() {
		return cost12;
	}

	public void setCost12(float cost12) {
		this.cost12 = cost12;
	}

	public float getCost13() {
		return cost13;
	}

	public void setCost13(float cost13) {
		this.cost13 = cost13;
	}

	public float getAmor0() {
		return amor0;
	}

	public void setAmor0(float amor0) {
		this.amor0 = amor0;
	}

	public float getAmor1() {
		return amor1;
	}

	public void setAmor1(float amor1) {
		this.amor1 = amor1;
	}

	public float getAmor2() {
		return amor2;
	}

	public void setAmor2(float amor2) {
		this.amor2 = amor2;
	}

	public float getAmor3() {
		return amor3;
	}

	public void setAmor3(float amor3) {
		this.amor3 = amor3;
	}

	public float getAmor4() {
		return amor4;
	}

	public void setAmor4(float amor4) {
		this.amor4 = amor4;
	}

	public float getAmor5() {
		return amor5;
	}

	public void setAmor5(float amor5) {
		this.amor5 = amor5;
	}

	public float getAmor6() {
		return amor6;
	}

	public void setAmor6(float amor6) {
		this.amor6 = amor6;
	}

	public float getAmor7() {
		return amor7;
	}

	public void setAmor7(float amor7) {
		this.amor7 = amor7;
	}

	public float getAmor8() {
		return amor8;
	}

	public void setAmor8(float amor8) {
		this.amor8 = amor8;
	}

	public float getAmor9() {
		return amor9;
	}

	public void setAmor9(float amor9) {
		this.amor9 = amor9;
	}

	public float getAmor10() {
		return amor10;
	}

	public void setAmor10(float amor10) {
		this.amor10 = amor10;
	}

	public float getAmor11() {
		return amor11;
	}

	public void setAmor11(float amor11) {
		this.amor11 = amor11;
	}

	public float getAmor12() {
		return amor12;
	}

	public void setAmor12(float amor12) {
		this.amor12 = amor12;
	}

	public float getAmor13() {
		return amor13;
	}

	public void setAmor13(float amor13) {
		this.amor13 = amor13;
	}

	public float getAdd1() {
		return add1;
	}

	public void setAdd1(float add1) {
		this.add1 = add1;
	}

	public float getAdd2() {
		return add2;
	}

	public void setAdd2(float add2) {
		this.add2 = add2;
	}

	public float getAdd3() {
		return add3;
	}

	public void setAdd3(float add3) {
		this.add3 = add3;
	}

	public float getAdd4() {
		return add4;
	}

	public void setAdd4(float add4) {
		this.add4 = add4;
	}

	public float getAdd5() {
		return add5;
	}

	public void setAdd5(float add5) {
		this.add5 = add5;
	}

	public float getAdd6() {
		return add6;
	}

	public void setAdd6(float add6) {
		this.add6 = add6;
	}

	public float getAdd7() {
		return add7;
	}

	public void setAdd7(float add7) {
		this.add7 = add7;
	}

	public float getAdd8() {
		return add8;
	}

	public void setAdd8(float add8) {
		this.add8 = add8;
	}

	public float getAdd9() {
		return add9;
	}

	public void setAdd9(float add9) {
		this.add9 = add9;
	}

	public float getAdd10() {
		return add10;
	}

	public void setAdd10(float add10) {
		this.add10 = add10;
	}

	public float getAdd11() {
		return add11;
	}

	public void setAdd11(float add11) {
		this.add11 = add11;
	}

	public float getAdd12() {
		return add12;
	}

	public void setAdd12(float add12) {
		this.add12 = add12;
	}

	public float getImpar1() {
		return impar1;
	}

	public void setImpar1(float impar1) {
		this.impar1 = impar1;
	}

	public float getImpar2() {
		return impar2;
	}

	public void setImpar2(float impar2) {
		this.impar2 = impar2;
	}

	public float getImpar3() {
		return impar3;
	}

	public void setImpar3(float impar3) {
		this.impar3 = impar3;
	}

	public float getImpar4() {
		return impar4;
	}

	public void setImpar4(float impar4) {
		this.impar4 = impar4;
	}

	public float getImpar5() {
		return impar5;
	}

	public void setImpar5(float impar5) {
		this.impar5 = impar5;
	}

	public float getImpar6() {
		return impar6;
	}

	public void setImpar6(float impar6) {
		this.impar6 = impar6;
	}

	public float getImpar7() {
		return impar7;
	}

	public void setImpar7(float impar7) {
		this.impar7 = impar7;
	}

	public float getImpar8() {
		return impar8;
	}

	public void setImpar8(float impar8) {
		this.impar8 = impar8;
	}

	public float getImpar9() {
		return impar9;
	}

	public void setImpar9(float impar9) {
		this.impar9 = impar9;
	}

	public float getImpar10() {
		return impar10;
	}

	public void setImpar10(float impar10) {
		this.impar10 = impar10;
	}

	public float getImpar11() {
		return impar11;
	}

	public void setImpar11(float impar11) {
		this.impar11 = impar11;
	}

	public float getImpar12() {
		return impar12;
	}

	public void setImpar12(float impar12) {
		this.impar12 = impar12;
	}

	public String getDans1() {
		return dans1;
	}

	public void setDans1(String dans1) {
		this.dans1 = dans1;
	}

	public String getDans2() {
		return dans2;
	}

	public void setDans2(String dans2) {
		this.dans2 = dans2;
	}

	public String getDans3() {
		return dans3;
	}

	public void setDans3(String dans3) {
		this.dans3 = dans3;
	}

	public String getDans4() {
		return dans4;
	}

	public void setDans4(String dans4) {
		this.dans4 = dans4;
	}

	public String getDans5() {
		return dans5;
	}

	public void setDans5(String dans5) {
		this.dans5 = dans5;
	}

	public String getDans6() {
		return dans6;
	}

	public void setDans6(String dans6) {
		this.dans6 = dans6;
	}

	public String getDans7() {
		return dans7;
	}

	public void setDans7(String dans7) {
		this.dans7 = dans7;
	}

	public String getDans8() {
		return dans8;
	}

	public void setDans8(String dans8) {
		this.dans8 = dans8;
	}

	public String getDans9() {
		return dans9;
	}

	public void setDans9(String dans9) {
		this.dans9 = dans9;
	}

	public String getDans10() {
		return dans10;
	}

	public void setDans10(String dans10) {
		this.dans10 = dans10;
	}

	public String getDans11() {
		return dans11;
	}

	public void setDans11(String dans11) {
		this.dans11 = dans11;
	}

	public String getDans12() {
		return dans12;
	}

	public void setDans12(String dans12) {
		this.dans12 = dans12;
	}

	public int getAb1() {
		return ab1;
	}

	public void setAb1(int ab1) {
		this.ab1 = ab1;
	}

	public int getAb2() {
		return ab2;
	}

	public void setAb2(int ab2) {
		this.ab2 = ab2;
	}

	public int getAb3() {
		return ab3;
	}

	public void setAb3(int ab3) {
		this.ab3 = ab3;
	}

	public int getAb4() {
		return ab4;
	}

	public void setAb4(int ab4) {
		this.ab4 = ab4;
	}

	public int getAb5() {
		return ab5;
	}

	public void setAb5(int ab5) {
		this.ab5 = ab5;
	}

	public int getAb6() {
		return ab6;
	}

	public void setAb6(int ab6) {
		this.ab6 = ab6;
	}

	public int getAb7() {
		return ab7;
	}

	public void setAb7(int ab7) {
		this.ab7 = ab7;
	}

	public int getAb8() {
		return ab8;
	}

	public void setAb8(int ab8) {
		this.ab8 = ab8;
	}

	public int getAb9() {
		return ab9;
	}

	public void setAb9(int ab9) {
		this.ab9 = ab9;
	}

	public int getAb10() {
		return ab10;
	}

	public void setAb10(int ab10) {
		this.ab10 = ab10;
	}

	public int getAb11() {
		return ab11;
	}

	public void setAb11(int ab11) {
		this.ab11 = ab11;
	}

	public int getAb12() {
		return ab12;
	}

	public void setAb12(int ab12) {
		this.ab12 = ab12;
	}

	public int getEz1() {
		return ez1;
	}

	public void setEz1(int ez1) {
		this.ez1 = ez1;
	}

	public int getEz2() {
		return ez2;
	}

	public void setEz2(int ez2) {
		this.ez2 = ez2;
	}

	public int getEz3() {
		return ez3;
	}

	public void setEz3(int ez3) {
		this.ez3 = ez3;
	}

	public int getEz4() {
		return ez4;
	}

	public void setEz4(int ez4) {
		this.ez4 = ez4;
	}

	public int getEz5() {
		return ez5;
	}

	public void setEz5(int ez5) {
		this.ez5 = ez5;
	}

	public int getEz6() {
		return ez6;
	}

	public void setEz6(int ez6) {
		this.ez6 = ez6;
	}

	public int getEz7() {
		return ez7;
	}

	public void setEz7(int ez7) {
		this.ez7 = ez7;
	}

	public int getEz8() {
		return ez8;
	}

	public void setEz8(int ez8) {
		this.ez8 = ez8;
	}

	public int getEz9() {
		return ez9;
	}

	public void setEz9(int ez9) {
		this.ez9 = ez9;
	}

	public int getEz10() {
		return ez10;
	}

	public void setEz10(int ez10) {
		this.ez10 = ez10;
	}

	public int getEz11() {
		return ez11;
	}

	public void setEz11(int ez11) {
		this.ez11 = ez11;
	}

	public int getEz12() {
		return ez12;
	}

	public void setEz12(int ez12) {
		this.ez12 = ez12;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public int getDivis() {
		return divis;
	}

	public void setDivis(int divis) {
		this.divis = divis;
	}

	public int getC2() {
		return c2;
	}

	public void setC2(int c2) {
		this.c2 = c2;
	}

	public int getMethod() {
		return method;
	}

	public void setMethod(int method) {
		this.method = method;
	}

	public Date getMdf_date() {
		return mdf_date;
	}

	public void setMdf_date(Date mdf_date) {
		this.mdf_date = mdf_date;
	}

	public String getMdfUname() {
		return mdfUname;
	}

	public void setMdfUname(String mdfUname) {
		this.mdfUname = mdfUname;
	}

	public int getSids() {
		return sids;
	}

	public void setSids(int sids) {
		this.sids = sids;
	}

	public int getProb() {
		return prob;
	}

	public void setProb(int prob) {
		this.prob = prob;
	}

	public int getNowbe() {
		return nowbe;
	}

	public void setNowbe(int nowbe) {
		this.nowbe = nowbe;
	}

	public char getLock() {
		return lock;
	}

	public void setLock(char lock) {
		this.lock = lock;
	}

	public Date getLockDate() {
		return lockDate;
	}

	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}

	public int getLock_id() {
		return lock_id;
	}

	public void setLock_id(int lock_id) {
		this.lock_id = lock_id;
	}

	public String getAccount1() {
		return account1;
	}

	public void setAccount1(String account1) {
		this.account1 = account1;
	}

	public String getAccount2() {
		return account2;
	}

	public void setAccount2(String account2) {
		this.account2 = account2;
	}

	public String getAccount3() {
		return account3;
	}

	public void setAccount3(String account3) {
		this.account3 = account3;
	}

	public String getAccount4() {
		return account4;
	}

	public void setAccount4(String account4) {
		this.account4 = account4;
	}

	public String getAccount5() {
		return account5;
	}

	public void setAccount5(String account5) {
		this.account5 = account5;
	}

	public String getAccount6() {
		return account6;
	}

	public void setAccount6(String account6) {
		this.account6 = account6;
	}

	public String getAccount7() {
		return account7;
	}

	public void setAccount7(String account7) {
		this.account7 = account7;
	}

	public String getAccount8() {
		return account8;
	}

	public void setAccount8(String account8) {
		this.account8 = account8;
	}

	public String getAccount9() {
		return account9;
	}

	public void setAccount9(String account9) {
		this.account9 = account9;
	}

	public String getAccount10() {
		return account10;
	}

	public void setAccount10(String account10) {
		this.account10 = account10;
	}

	public String getAccount11() {
		return account11;
	}

	public void setAccount11(String account11) {
		this.account11 = account11;
	}

	public String getAccount12() {
		return account12;
	}

	public void setAccount12(String account12) {
		this.account12 = account12;
	}

	public int getAjil1() {
		return ajil1;
	}

	public void setAjil1(int ajil1) {
		this.ajil1 = ajil1;
	}

	public int getAjil2() {
		return ajil2;
	}

	public void setAjil2(int ajil2) {
		this.ajil2 = ajil2;
	}

	public int getAjil3() {
		return ajil3;
	}

	public void setAjil3(int ajil3) {
		this.ajil3 = ajil3;
	}

	public int getAjil4() {
		return ajil4;
	}

	public void setAjil4(int ajil4) {
		this.ajil4 = ajil4;
	}

	public int getAjil5() {
		return ajil5;
	}

	public void setAjil5(int ajil5) {
		this.ajil5 = ajil5;
	}

	public int getAjil6() {
		return ajil6;
	}

	public void setAjil6(int ajil6) {
		this.ajil6 = ajil6;
	}

	public int getAjil7() {
		return ajil7;
	}

	public void setAjil7(int ajil7) {
		this.ajil7 = ajil7;
	}

	public int getAjil8() {
		return ajil8;
	}

	public void setAjil8(int ajil8) {
		this.ajil8 = ajil8;
	}

	public int getAjil9() {
		return ajil9;
	}

	public void setAjil9(int ajil9) {
		this.ajil9 = ajil9;
	}

	public int getAjil10() {
		return ajil10;
	}

	public void setAjil10(int ajil10) {
		this.ajil10 = ajil10;
	}

	public int getAjil11() {
		return ajil11;
	}

	public void setAjil11(int ajil11) {
		this.ajil11 = ajil11;
	}

	public int getAjil12() {
		return ajil12;
	}

	public void setAjil12(int ajil12) {
		this.ajil12 = ajil12;
	}

	public String getHur1() {
		return hur1;
	}

	public void setHur1(String hur1) {
		this.hur1 = hur1;
	}

	public String getHur2() {
		return hur2;
	}

	public void setHur2(String hur2) {
		this.hur2 = hur2;
	}

	public String getHur3() {
		return hur3;
	}

	public void setHur3(String hur3) {
		this.hur3 = hur3;
	}

	public String getHur4() {
		return hur4;
	}

	public void setHur4(String hur4) {
		this.hur4 = hur4;
	}

	public String getHur5() {
		return hur5;
	}

	public void setHur5(String hur5) {
		this.hur5 = hur5;
	}

	public String getHur6() {
		return hur6;
	}

	public void setHur6(String hur6) {
		this.hur6 = hur6;
	}

	public String getHur7() {
		return hur7;
	}

	public void setHur7(String hur7) {
		this.hur7 = hur7;
	}

	public String getHur8() {
		return hur8;
	}

	public void setHur8(String hur8) {
		this.hur8 = hur8;
	}

	public String getHur9() {
		return hur9;
	}

	public void setHur9(String hur9) {
		this.hur9 = hur9;
	}

	public String getHur10() {
		return hur10;
	}

	public void setHur10(String hur10) {
		this.hur10 = hur10;
	}

	public String getHur11() {
		return hur11;
	}

	public void setHur11(String hur11) {
		this.hur11 = hur11;
	}

	public String getHur12() {
		return hur12;
	}

	public void setHur12(String hur12) {
		this.hur12 = hur12;
	}

	public String getNomer() {
		return nomer;
	}

	public void setNomer(String nomer) {
		this.nomer = nomer;
	}

	public Date getNomerdate() {
		return nomerdate;
	}

	public void setNomerdate(Date nomerdate) {
		this.nomerdate = nomerdate;
	}

	public float getHemjee() {
		return hemjee;
	}

	public void setHemjee(float hemjee) {
		this.hemjee = hemjee;
	}

	public char getKadaster() {
		return kadaster;
	}

	public void setKadaster(char kadaster) {
		this.kadaster = kadaster;
	}

	public String getZoriulalt() {
		return zoriulalt;
	}

	public void setZoriulalt(String zoriulalt) {
		this.zoriulalt = zoriulalt;
	}

	public int getEtaj() {
		return etaj;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	public int getKvar() {
		return kvar;
	}

	public void setKvar(int kvar) {
		this.kvar = kvar;
	}

	public int getMetho() {
		return metho;
	}

	public void setMetho(int metho) {
		this.metho = metho;
	}

	public int getHurungu() {
		return hurungu;
	}

	public void setHurungu(int hurungu) {
		this.hurungu = hurungu;
	}

	public String getPosit() {
		return posit;
	}

	public void setPosit(String posit) {
		this.posit = posit;
	}

	public String getNomereng() {
		return nomereng;
	}

	public void setNomereng(String nomereng) {
		this.nomereng = nomereng;
	}

	public String getRamno() {
		return ramno;
	}

	public void setRamno(String ramno) {
		this.ramno = ramno;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public String getKtdans() {
		return ktdans;
	}

	public void setKtdans(String ktdans) {
		this.ktdans = ktdans;
	}

	public String getPostav() {
		return postav;
	}

	public void setPostav(String postav) {
		this.postav = postav;
	}

	public char getCalcelegstate() {
		return calcelegstate;
	}

	public void setCalcelegstate(char calcelegstate) {
		this.calcelegstate = calcelegstate;
	}

	public Asset() {
		super();
	}

	@Override
	public String toString() {
		return "Asset [depCode=" + depCode + ", orgCode=" + orgCode + ", pwcId=" + pwcId + ", eCode=" + eCode
				+ ", eName=" + eName + ", assetCode=" + assetCode + ", codeChange=" + codeChange + ", codeTemp="
				+ codeTemp + ", newCode=" + newCode + ", assetDans=" + assetDans + ", assetName=" + assetName
				+ ", assetMark=" + assetMark + ", useYear=" + useYear + ", docDate=" + docDate + ", useDate=" + useDate
				+ ", calcDate=" + calcDate + ", eleg2010=" + eleg2010 + ", urt2015=" + urt2015 + ", eleg2015="
				+ eleg2015 + ", elegMonth=" + elegMonth + ", duNormYear=" + duNormYear + ", duWillYear=" + duWillYear
				+ ", duUrt=" + duUrt + ", duToEleg=" + duToEleg + ", duBoUne=" + duBoUne + ", ajil=" + ajil + ", eleg1="
				+ eleg1 + ", eleg2=" + eleg2 + ", eleg3=" + eleg3 + ", eleg4=" + eleg4 + ", cost0=" + cost0 + ", cost1="
				+ cost1 + ", cost2=" + cost2 + ", cost3=" + cost3 + ", cost4=" + cost4 + ", cost5=" + cost5 + ", cost6="
				+ cost6 + ", cost7=" + cost7 + ", cost8=" + cost8 + ", cost9=" + cost9 + ", cost10=" + cost10
				+ ", cost11=" + cost11 + ", cost12=" + cost12 + ", cost13=" + cost13 + ", amor0=" + amor0 + ", amor1="
				+ amor1 + ", amor2=" + amor2 + ", amor3=" + amor3 + ", amor4=" + amor4 + ", amor5=" + amor5 + ", amor6="
				+ amor6 + ", amor7=" + amor7 + ", amor8=" + amor8 + ", amor9=" + amor9 + ", amor10=" + amor10
				+ ", amor11=" + amor11 + ", amor12=" + amor12 + ", amor13=" + amor13 + ", add1=" + add1 + ", add2="
				+ add2 + ", add3=" + add3 + ", add4=" + add4 + ", add5=" + add5 + ", add6=" + add6 + ", add7=" + add7
				+ ", add8=" + add8 + ", add9=" + add9 + ", add10=" + add10 + ", add11=" + add11 + ", add12=" + add12
				+ ", impar1=" + impar1 + ", impar2=" + impar2 + ", impar3=" + impar3 + ", impar4=" + impar4
				+ ", impar5=" + impar5 + ", impar6=" + impar6 + ", impar7=" + impar7 + ", impar8=" + impar8
				+ ", impar9=" + impar9 + ", impar10=" + impar10 + ", impar11=" + impar11 + ", impar12=" + impar12
				+ ", dans1=" + dans1 + ", dans2=" + dans2 + ", dans3=" + dans3 + ", dans4=" + dans4 + ", dans5=" + dans5
				+ ", dans6=" + dans6 + ", dans7=" + dans7 + ", dans8=" + dans8 + ", dans9=" + dans9 + ", dans10="
				+ dans10 + ", dans11=" + dans11 + ", dans12=" + dans12 + ", ab1=" + ab1 + ", ab2=" + ab2 + ", ab3="
				+ ab3 + ", ab4=" + ab4 + ", ab5=" + ab5 + ", ab6=" + ab6 + ", ab7=" + ab7 + ", ab8=" + ab8 + ", ab9="
				+ ab9 + ", ab10=" + ab10 + ", ab11=" + ab11 + ", ab12=" + ab12 + ", ez1=" + ez1 + ", ez2=" + ez2
				+ ", ez3=" + ez3 + ", ez4=" + ez4 + ", ez5=" + ez5 + ", ez6=" + ez6 + ", ez7=" + ez7 + ", ez8=" + ez8
				+ ", ez9=" + ez9 + ", ez10=" + ez10 + ", ez11=" + ez11 + ", ez12=" + ez12 + ", owner=" + owner
				+ ", divis=" + divis + ", c2=" + c2 + ", method=" + method + ", mdf_date=" + mdf_date + ", mdfUname="
				+ mdfUname + ", sids=" + sids + ", prob=" + prob + ", nowbe=" + nowbe + ", lock=" + lock + ", lockDate="
				+ lockDate + ", lock_id=" + lock_id + ", account1=" + account1 + ", account2=" + account2
				+ ", account3=" + account3 + ", account4=" + account4 + ", account5=" + account5 + ", account6="
				+ account6 + ", account7=" + account7 + ", account8=" + account8 + ", account9=" + account9
				+ ", account10=" + account10 + ", account11=" + account11 + ", account12=" + account12 + ", ajil1="
				+ ajil1 + ", ajil2=" + ajil2 + ", ajil3=" + ajil3 + ", ajil4=" + ajil4 + ", ajil5=" + ajil5 + ", ajil6="
				+ ajil6 + ", ajil7=" + ajil7 + ", ajil8=" + ajil8 + ", ajil9=" + ajil9 + ", ajil10=" + ajil10
				+ ", ajil11=" + ajil11 + ", ajil12=" + ajil12 + ", hur1=" + hur1 + ", hur2=" + hur2 + ", hur3=" + hur3
				+ ", hur4=" + hur4 + ", hur5=" + hur5 + ", hur6=" + hur6 + ", hur7=" + hur7 + ", hur8=" + hur8
				+ ", hur9=" + hur9 + ", hur10=" + hur10 + ", hur11=" + hur11 + ", hur12=" + hur12 + ", nomer=" + nomer
				+ ", nomerdate=" + nomerdate + ", hemjee=" + hemjee + ", kadaster=" + kadaster + ", zoriulalt="
				+ zoriulalt + ", etaj=" + etaj + ", kvar=" + kvar + ", metho=" + metho + ", hurungu=" + hurungu
				+ ", posit=" + posit + ", nomereng=" + nomereng + ", ramno=" + ramno + ", source=" + source
				+ ", ktdans=" + ktdans + ", postav=" + postav + ", calcelegstate=" + calcelegstate + "]";
	}

	
	
	
}
