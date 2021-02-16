package net.codejava;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "asset_copy")
public class Asset {
	
	@Id
	@Column(nullable = true)
	private int dep_code;
	
	@Column(nullable = true)
	private int org_code;
	
	@Column(nullable = true, length = 10)
	private String pwc_id;
	
	@Column(nullable = true, length = 10)
	private String e_code;
	
	@Column(nullable = true, length = 150)
	private String e_name;
	
	@Column(nullable = true, length = 10)
	private String asset_code;
	
	@Column(nullable = true, length = 10)
	private String code_change;
	
	@Column(nullable = false, length = 10)
	private String code_temp;
	
	@Column(nullable = true, length = 16)
	private String new_code;
	
	@Column(nullable = true, length = 22)
	private String asset_dans;
	
	@Column(nullable = true, length = 250)
	private String asset_name;
	
	@Column(nullable = true, length = 250)
	private String asset_mark;
	
	@Column(nullable = true)
	private int use_year;
	
	@JsonIgnore
	private Date doc_date = new Date();
	
	@JsonIgnore
	private Date use_date = new Date();
	
	@JsonIgnore
	private Date calc_date = new Date();
	
	@Column(nullable = true)
	private float eleg_2010;
	
	@Column(nullable = true)
	private float urt_2015;
	
	@Column(nullable = true)
	private float eleg_2015;
	
	@Column(nullable = true)
	private float eleg_month;
	
	@Column(nullable = true)
	private int du_norm_year;
	
	@Column(nullable = true)
	private int du_will_year;
	
	@Column(nullable = true)
	private float du_urt;
	
	@Column(nullable = true)
	private float du_to_eleg;
	
	@Column(nullable = true)
	private float du_bo_une;
	
	@Column(nullable = true)
	private int ajil;
	
	@Column(nullable = true)
	private float eleg1;
	
	@Column(nullable = true)
	private float eleg2;
	
	@Column(nullable = true)
	private float eleg3;
	
	@Column(nullable = true)
	private float eleg4;
	
	@Column(nullable = true)
	private float cost0;
	
	@Column(nullable = true)
	private float cost1;

	@Column(nullable = true)
	private float cost2;
	
	@Column(nullable = true)
	private float cost3;
	
	@Column(nullable = true)
	private float cost4;
	
	@Column(nullable = true)
	private float cost5;
	
	@Column(nullable = true)
	private float cost6;
	
	@Column(nullable = true)
	private float cost7;
	
	@Column(nullable = true)
	private float cost8;
	
	@Column(nullable = true)
	private float cost9;
	
	@Column(nullable = true)
	private float cost10;
	
	@Column(nullable = true)
	private float cost11;
	
	@Column(nullable = true)
	private float cost12;
	
	@Column(nullable = true)
	private float cost13;
	
	@Column(nullable = true)
	private float amor0;
	
	@Column(nullable = true)
	private float amor1;
	
	@Column(nullable = true)
	private float amor2;
	
	@Column(nullable = true)
	private float amor3;
	
	@Column(nullable = true)
	private float amor4;
	
	@Column(nullable = true)
	private float amor5;
	
	@Column(nullable = true)
	private float amor6;
	
	@Column(nullable = true)
	private float amor7;
	
	@Column(nullable = true)
	private float amor8;
	
	@Column(nullable = true)
	private float amor9;
	
	@Column(nullable = true)
	private float amor10;
	
	@Column(nullable = true)
	private float amor11;
	
	@Column(nullable = true)
	private float amor12;
	
	@Column(nullable = true)
	private float amor13;
	
	@Column(nullable = true)
	private float add1;
	
	@Column(nullable = true)
	private float add2;
	
	@Column(nullable = true)
	private float add3;
	
	@Column(nullable = true)
	private float add4;
	
	@Column(nullable = true)
	private float add5;
	
	@Column(nullable = true)
	private float add6;
	
	@Column(nullable = true)
	private float add7;
	
	@Column(nullable = true)
	private float add8;
	
	@Column(nullable = true)
	private float add9;
	
	@Column(nullable = true)
	private float add10;
	
	@Column(nullable = true)
	private float add11;
	
	@Column(nullable = true)
	private float add12;
	
	@Column(nullable = true)
	private float impar1;
	
	@Column(nullable = true)
	private float impar2;
	
	@Column(nullable = true)
	private float impar3;
	
	@Column(nullable = true)
	private float impar4;
	
	@Column(nullable = true)
	private float impar5;
	
	@Column(nullable = true)
	private float impar6;
	
	@Column(nullable = true)
	private float impar7;
	
	@Column(nullable = true)
	private float impar8;
	
	@Column(nullable = true)
	private float impar9;
	
	@Column(nullable = true)
	private float impar10;
	
	@Column(nullable = true)
	private float impar11;
	
	@Column(nullable = true)
	private float impar12;
	
	@Column(nullable = true, length = 10)
	private String dans1;
	
	@Column(nullable = true, length = 10)
	private String dans2;
	
	@Column(nullable = true, length = 10)
	private String dans3;
	
	@Column(nullable = true, length = 10)
	private String dans4;
	
	@Column(nullable = true, length = 10)
	private String dans5;
	
	@Column(nullable = true, length = 10)
	private String dans6;
	
	@Column(nullable = true, length = 10)
	private String dans7;
	
	@Column(nullable = true, length = 10)
	private String dans8;
	
	@Column(nullable = true, length = 10)
	private String dans9;
	
	@Column(nullable = true, length = 10)
	private String dans10;
	
	@Column(nullable = true, length = 10)
	private String dans11;
	
	@Column(nullable = true, length = 10)
	private String dans12;
	
	@Column(nullable = true)
	private int ab1;
	
	@Column(nullable = true)
	private int ab2;
	
	@Column(nullable = true)
	private int ab3;
	
	@Column(nullable = true)
	private int ab4;
	
	@Column(nullable = true)
	private int ab5;
	
	@Column(nullable = true)
	private int ab6;
	
	@Column(nullable = true)
	private int ab7;
	
	@Column(nullable = true)
	private int ab8;
	
	@Column(nullable = true)
	private int ab9;
	
	@Column(nullable = true)
	private int ab10;
	
	@Column(nullable = true)
	private int ab11;
	
	@Column(nullable = true)
	private int ab12;
	
	@Column(nullable = true)
	private int ez1;
	
	@Column(nullable = true)
	private int ez2;
	
	@Column(nullable = true)
	private int ez3;

	@Column(nullable = true)
	private int ez4;
	
	@Column(nullable = true)
	private int ez5;
	
	@Column(nullable = true)
	private int ez6;
	
	@Column(nullable = true)
	private int ez7;
	
	@Column(nullable = true)
	private int ez8;
	
	@Column(nullable = true)
	private int ez9;
	
	@Column(nullable = true)
	private int ez10;
	
	@Column(nullable = true)
	private int ez11;
	
	@Column(nullable = true)
	private int ez12;
	
	@Column(nullable = true)
	private int owner;
	
	@Column(nullable = true)
	private int divis;
	
	@Column(nullable = true)
	private int c2;
	
	@Column(nullable = true)
	private int method;
	
	@JsonIgnore
	private Date mdf_date = new Date();
	
	@Column(nullable = true, length = 50)
	private String mdf_uname;
	
	@Column(nullable = false)
	private int sids;
	
	@Column(nullable = true)
	private int prob;
	
	@Column(nullable = true)
	private int nowbe;
	
	@Column(nullable = true, length = 1)
	private char lock;
	
	@JsonIgnore
	private Date lock_date = new Date();
	
	@Column(nullable = true)
	private int lock_id;
	
	@Column(nullable = true, length = 22)
	private String account1;
	
	@Column(nullable = true, length = 22)
	private String account2;
	
	@Column(nullable = true, length = 22)
	private String account3;
	
	@Column(nullable = true, length = 22)
	private String account4;
	
	@Column(nullable = true, length = 22)
	private String account5;
	
	@Column(nullable = true, length = 22)
	private String account6;
	
	@Column(nullable = true, length = 22)
	private String account7;
	
	@Column(nullable = true, length = 22)
	private String account8;
	
	@Column(nullable = true, length = 22)
	private String account9;
	
	@Column(nullable = true, length = 22)
	private String account10;
	
	@Column(nullable = true, length = 22)
	private String account11;
	
	@Column(nullable = true, length = 22)
	private String account12;
	
	@Column(nullable = true)
	private int ajil1;
	
	@Column(nullable = true)
	private int ajil2;
	
	@Column(nullable = true)
	private int ajil3;
	
	@Column(nullable = true)
	private int ajil4;
	
	@Column(nullable = true)
	private int ajil5;
	
	@Column(nullable = true)
	private int ajil6;
	
	@Column(nullable = true)
	private int ajil7;
	
	@Column(nullable = true)
	private int ajil8;
	
	@Column(nullable = true)
	private int ajil9;
	
	@Column(nullable = true)
	private int ajil10;
	
	@Column(nullable = true)
	private int ajil11;
	
	@Column(nullable = true)
	private int ajil12;
	
	@Column(nullable = true, length = 22)
	private String hur1;
	
	@Column(nullable = true, length = 22)
	private String hur2;
	
	@Column(nullable = true, length = 22)
	private String hur3;
	
	@Column(nullable = true, length = 22)
	private String hur4;
	
	@Column(nullable = true, length = 22)
	private String hur5;
	
	@Column(nullable = true, length = 22)
	private String hur6;
	
	@Column(nullable = true, length = 22)
	private String hur7;
	
	@Column(nullable = true, length = 22)
	private String hur8;
	
	@Column(nullable = true, length = 22)
	private String hur9;
	
	@Column(nullable = true, length = 22)
	private String hur10;
	
	@Column(nullable = true, length = 22)
	private String hur11;
	
	@Column(nullable = true, length = 22)
	private String hur12;
	
	@Column(nullable = true, length = 50)
	private String nomer;
	
	@JsonIgnore
	private Date nomerdate = new Date();
	
	@Column(nullable = true)
	private float hemjee;
	
	@Column(nullable = true, length = 1)
	private char kadaster;
	
	@Column(nullable = true, length = 400)
	private String zoriulalt;
	
	@Column(nullable = true)
	private int etaj	;
	
	@Column(nullable = true)
	private int kvar;
	
	@Column(nullable = true)
	private int metho;
	
	@Column(nullable = true)
	private int hurungu;
	
	@Column(nullable = true, length = 500)
	private String posit;
	
	@Column(nullable = true, length = 25)
	private String nomereng;
	
	@Column(nullable = true, length = 25)
	private String ramno;
	
	@Column(nullable = true)
	private int source;
	
	@Column(nullable = true, length = 22)
	private String ktdans;
	
	@Column(nullable = true, length = 22)
	private String postav;
	
	@Column(nullable = true, length = 500)
	private String postavName;
	
	@Column(nullable = true, length = 1)
	private char calcelegstate;

	public int getDep_code() {
		return dep_code;
	}

	public void setDep_code(int dep_code) {
		this.dep_code = dep_code;
	}

	public int getOrg_code() {
		return org_code;
	}

	public void setOrg_code(int org_code) {
		this.org_code = org_code;
	}

	public String getPwc_id() {
		return pwc_id;
	}

	public void setPwc_id(String pwc_id) {
		this.pwc_id = pwc_id;
	}

	public String getE_code() {
		return e_code;
	}

	public void setE_code(String e_code) {
		this.e_code = e_code;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getAsset_code() {
		return asset_code;
	}

	public void setAsset_code(String asset_code) {
		this.asset_code = asset_code;
	}

	public String getCode_change() {
		return code_change;
	}

	public void setCode_change(String code_change) {
		this.code_change = code_change;
	}

	public String getCode_temp() {
		return code_temp;
	}

	public void setCode_temp(String code_temp) {
		this.code_temp = code_temp;
	}

	public String getNew_code() {
		return new_code;
	}

	public void setNew_code(String new_code) {
		this.new_code = new_code;
	}

	public String getAsset_dans() {
		return asset_dans;
	}

	public void setAsset_dans(String asset_dans) {
		this.asset_dans = asset_dans;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public String getAsset_mark() {
		return asset_mark;
	}

	public void setAsset_mark(String asset_mark) {
		this.asset_mark = asset_mark;
	}

	public int getUse_year() {
		return use_year;
	}

	public void setUse_year(int use_year) {
		this.use_year = use_year;
	}

	public Date getDoc_date() {
		return doc_date;
	}

	public void setDoc_date(Date doc_date) {
		this.doc_date = doc_date;
	}

	public Date getUse_date() {
		return use_date;
	}

	public void setUse_date(Date use_date) {
		this.use_date = use_date;
	}

	public Date getCalc_date() {
		return calc_date;
	}

	public void setCalc_date(Date calc_date) {
		this.calc_date = calc_date;
	}

	public float getEleg_2010() {
		return eleg_2010;
	}

	public void setEleg_2010(float eleg_2010) {
		this.eleg_2010 = eleg_2010;
	}

	public float getUrt_2015() {
		return urt_2015;
	}

	public void setUrt_2015(float urt_2015) {
		this.urt_2015 = urt_2015;
	}

	public float getEleg_2015() {
		return eleg_2015;
	}

	public void setEleg_2015(float eleg_2015) {
		this.eleg_2015 = eleg_2015;
	}

	public float getEleg_month() {
		return eleg_month;
	}

	public void setEleg_month(float eleg_month) {
		this.eleg_month = eleg_month;
	}

	public int getDu_norm_year() {
		return du_norm_year;
	}

	public void setDu_norm_year(int du_norm_year) {
		this.du_norm_year = du_norm_year;
	}

	public int getDu_will_year() {
		return du_will_year;
	}

	public void setDu_will_year(int du_will_year) {
		this.du_will_year = du_will_year;
	}

	public float getDu_urt() {
		return du_urt;
	}

	public void setDu_urt(float du_urt) {
		this.du_urt = du_urt;
	}

	public float getDu_to_eleg() {
		return du_to_eleg;
	}

	public void setDu_to_eleg(float du_to_eleg) {
		this.du_to_eleg = du_to_eleg;
	}

	public float getDu_bo_une() {
		return du_bo_une;
	}

	public void setDu_bo_une(float du_bo_une) {
		this.du_bo_une = du_bo_une;
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

	public String getMdf_uname() {
		return mdf_uname;
	}

	public void setMdf_uname(String mdf_uname) {
		this.mdf_uname = mdf_uname;
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

	public Date getLock_date() {
		return lock_date;
	}

	public void setLock_date(Date lock_date) {
		this.lock_date = lock_date;
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

	public String getPostavName() {
		return postavName;
	}

	public void setPostavName(String postavName) {
		this.postavName = postavName;
	}

	public char getCalcelegstate() {
		return calcelegstate;
	}

	public void setCalcelegstate(char calcelegstate) {
		this.calcelegstate = calcelegstate;
	}

	public Asset(int dep_code, int org_code, String pwc_id, String e_code, String e_name, String asset_code,
			String code_change, String code_temp, String new_code, String asset_dans, String asset_name,
			String asset_mark, int use_year, Date doc_date, Date use_date, Date calc_date, float eleg_2010,
			float urt_2015, float eleg_2015, float eleg_month, int du_norm_year, int du_will_year, float du_urt,
			float du_to_eleg, float du_bo_une, int ajil, float eleg1, float eleg2, float eleg3, float eleg4,
			float cost0, float cost1, float cost2, float cost3, float cost4, float cost5, float cost6, float cost7,
			float cost8, float cost9, float cost10, float cost11, float cost12, float cost13, float amor0, float amor1,
			float amor2, float amor3, float amor4, float amor5, float amor6, float amor7, float amor8, float amor9,
			float amor10, float amor11, float amor12, float amor13, float add1, float add2, float add3, float add4,
			float add5, float add6, float add7, float add8, float add9, float add10, float add11, float add12,
			float impar1, float impar2, float impar3, float impar4, float impar5, float impar6, float impar7,
			float impar8, float impar9, float impar10, float impar11, float impar12, String dans1, String dans2,
			String dans3, String dans4, String dans5, String dans6, String dans7, String dans8, String dans9,
			String dans10, String dans11, String dans12, int ab1, int ab2, int ab3, int ab4, int ab5, int ab6, int ab7,
			int ab8, int ab9, int ab10, int ab11, int ab12, int ez1, int ez2, int ez3, int ez4, int ez5, int ez6,
			int ez7, int ez8, int ez9, int ez10, int ez11, int ez12, int owner, int divis, int c2, int method,
			Date mdf_date, String mdf_uname, int sids, int prob, int nowbe, char lock, Date lock_date, int lock_id,
			String account1, String account2, String account3, String account4, String account5, String account6,
			String account7, String account8, String account9, String account10, String account11, String account12,
			int ajil1, int ajil2, int ajil3, int ajil4, int ajil5, int ajil6, int ajil7, int ajil8, int ajil9,
			int ajil10, int ajil11, int ajil12, String hur1, String hur2, String hur3, String hur4, String hur5,
			String hur6, String hur7, String hur8, String hur9, String hur10, String hur11, String hur12, String nomer,
			Date nomerdate, float hemjee, char kadaster, String zoriulalt, int etaj, int kvar, int metho, int hurungu,
			String posit, String nomereng, String ramno, int source, String ktdans, String postav, String postavName,
			char calcelegstate) {
		super();
		this.dep_code = dep_code;
		this.org_code = org_code;
		this.pwc_id = pwc_id;
		this.e_code = e_code;
		this.e_name = e_name;
		this.asset_code = asset_code;
		this.code_change = code_change;
		this.code_temp = code_temp;
		this.new_code = new_code;
		this.asset_dans = asset_dans;
		this.asset_name = asset_name;
		this.asset_mark = asset_mark;
		this.use_year = use_year;
		this.doc_date = doc_date;
		this.use_date = use_date;
		this.calc_date = calc_date;
		this.eleg_2010 = eleg_2010;
		this.urt_2015 = urt_2015;
		this.eleg_2015 = eleg_2015;
		this.eleg_month = eleg_month;
		this.du_norm_year = du_norm_year;
		this.du_will_year = du_will_year;
		this.du_urt = du_urt;
		this.du_to_eleg = du_to_eleg;
		this.du_bo_une = du_bo_une;
		this.ajil = ajil;
		this.eleg1 = eleg1;
		this.eleg2 = eleg2;
		this.eleg3 = eleg3;
		this.eleg4 = eleg4;
		this.cost0 = cost0;
		this.cost1 = cost1;
		this.cost2 = cost2;
		this.cost3 = cost3;
		this.cost4 = cost4;
		this.cost5 = cost5;
		this.cost6 = cost6;
		this.cost7 = cost7;
		this.cost8 = cost8;
		this.cost9 = cost9;
		this.cost10 = cost10;
		this.cost11 = cost11;
		this.cost12 = cost12;
		this.cost13 = cost13;
		this.amor0 = amor0;
		this.amor1 = amor1;
		this.amor2 = amor2;
		this.amor3 = amor3;
		this.amor4 = amor4;
		this.amor5 = amor5;
		this.amor6 = amor6;
		this.amor7 = amor7;
		this.amor8 = amor8;
		this.amor9 = amor9;
		this.amor10 = amor10;
		this.amor11 = amor11;
		this.amor12 = amor12;
		this.amor13 = amor13;
		this.add1 = add1;
		this.add2 = add2;
		this.add3 = add3;
		this.add4 = add4;
		this.add5 = add5;
		this.add6 = add6;
		this.add7 = add7;
		this.add8 = add8;
		this.add9 = add9;
		this.add10 = add10;
		this.add11 = add11;
		this.add12 = add12;
		this.impar1 = impar1;
		this.impar2 = impar2;
		this.impar3 = impar3;
		this.impar4 = impar4;
		this.impar5 = impar5;
		this.impar6 = impar6;
		this.impar7 = impar7;
		this.impar8 = impar8;
		this.impar9 = impar9;
		this.impar10 = impar10;
		this.impar11 = impar11;
		this.impar12 = impar12;
		this.dans1 = dans1;
		this.dans2 = dans2;
		this.dans3 = dans3;
		this.dans4 = dans4;
		this.dans5 = dans5;
		this.dans6 = dans6;
		this.dans7 = dans7;
		this.dans8 = dans8;
		this.dans9 = dans9;
		this.dans10 = dans10;
		this.dans11 = dans11;
		this.dans12 = dans12;
		this.ab1 = ab1;
		this.ab2 = ab2;
		this.ab3 = ab3;
		this.ab4 = ab4;
		this.ab5 = ab5;
		this.ab6 = ab6;
		this.ab7 = ab7;
		this.ab8 = ab8;
		this.ab9 = ab9;
		this.ab10 = ab10;
		this.ab11 = ab11;
		this.ab12 = ab12;
		this.ez1 = ez1;
		this.ez2 = ez2;
		this.ez3 = ez3;
		this.ez4 = ez4;
		this.ez5 = ez5;
		this.ez6 = ez6;
		this.ez7 = ez7;
		this.ez8 = ez8;
		this.ez9 = ez9;
		this.ez10 = ez10;
		this.ez11 = ez11;
		this.ez12 = ez12;
		this.owner = owner;
		this.divis = divis;
		this.c2 = c2;
		this.method = method;
		this.mdf_date = mdf_date;
		this.mdf_uname = mdf_uname;
		this.sids = sids;
		this.prob = prob;
		this.nowbe = nowbe;
		this.lock = lock;
		this.lock_date = lock_date;
		this.lock_id = lock_id;
		this.account1 = account1;
		this.account2 = account2;
		this.account3 = account3;
		this.account4 = account4;
		this.account5 = account5;
		this.account6 = account6;
		this.account7 = account7;
		this.account8 = account8;
		this.account9 = account9;
		this.account10 = account10;
		this.account11 = account11;
		this.account12 = account12;
		this.ajil1 = ajil1;
		this.ajil2 = ajil2;
		this.ajil3 = ajil3;
		this.ajil4 = ajil4;
		this.ajil5 = ajil5;
		this.ajil6 = ajil6;
		this.ajil7 = ajil7;
		this.ajil8 = ajil8;
		this.ajil9 = ajil9;
		this.ajil10 = ajil10;
		this.ajil11 = ajil11;
		this.ajil12 = ajil12;
		this.hur1 = hur1;
		this.hur2 = hur2;
		this.hur3 = hur3;
		this.hur4 = hur4;
		this.hur5 = hur5;
		this.hur6 = hur6;
		this.hur7 = hur7;
		this.hur8 = hur8;
		this.hur9 = hur9;
		this.hur10 = hur10;
		this.hur11 = hur11;
		this.hur12 = hur12;
		this.nomer = nomer;
		this.nomerdate = nomerdate;
		this.hemjee = hemjee;
		this.kadaster = kadaster;
		this.zoriulalt = zoriulalt;
		this.etaj = etaj;
		this.kvar = kvar;
		this.metho = metho;
		this.hurungu = hurungu;
		this.posit = posit;
		this.nomereng = nomereng;
		this.ramno = ramno;
		this.source = source;
		this.ktdans = ktdans;
		this.postav = postav;
		this.postavName = postavName;
		this.calcelegstate = calcelegstate;
	}

	public Asset() {
		super();
	}

	@Override
	public String toString() {
		return "Asset [dep_code=" + dep_code + ", org_code=" + org_code + ", pwc_id=" + pwc_id
				+ ", e_code=" + e_code + ", e_name=" + e_name + ", asset_code=" + asset_code + ", code_change="
				+ code_change + ", code_temp=" + code_temp + ", new_code=" + new_code + ", asset_dans=" + asset_dans
				+ ", asset_name=" + asset_name + ", asset_mark=" + asset_mark + ", use_year=" + use_year + ", doc_date="
				+ doc_date + ", use_date=" + use_date + ", calc_date=" + calc_date + ", eleg_2010=" + eleg_2010
				+ ", urt_2015=" + urt_2015 + ", eleg_2015=" + eleg_2015 + ", eleg_month=" + eleg_month
				+ ", du_norm_year=" + du_norm_year + ", du_will_year=" + du_will_year + ", du_urt=" + du_urt
				+ ", du_to_eleg=" + du_to_eleg + ", du_bo_une=" + du_bo_une + ", ajil=" + ajil + ", eleg1=" + eleg1
				+ ", eleg2=" + eleg2 + ", eleg3=" + eleg3 + ", eleg4=" + eleg4 + ", cost0=" + cost0 + ", cost1=" + cost1
				+ ", cost2=" + cost2 + ", cost3=" + cost3 + ", cost4=" + cost4 + ", cost5=" + cost5 + ", cost6=" + cost6
				+ ", cost7=" + cost7 + ", cost8=" + cost8 + ", cost9=" + cost9 + ", cost10=" + cost10 + ", cost11="
				+ cost11 + ", cost12=" + cost12 + ", cost13=" + cost13 + ", amor0=" + amor0 + ", amor1=" + amor1
				+ ", amor2=" + amor2 + ", amor3=" + amor3 + ", amor4=" + amor4 + ", amor5=" + amor5 + ", amor6=" + amor6
				+ ", amor7=" + amor7 + ", amor8=" + amor8 + ", amor9=" + amor9 + ", amor10=" + amor10 + ", amor11="
				+ amor11 + ", amor12=" + amor12 + ", amor13=" + amor13 + ", add1=" + add1 + ", add2=" + add2 + ", add3="
				+ add3 + ", add4=" + add4 + ", add5=" + add5 + ", add6=" + add6 + ", add7=" + add7 + ", add8=" + add8
				+ ", add9=" + add9 + ", add10=" + add10 + ", add11=" + add11 + ", add12=" + add12 + ", impar1=" + impar1
				+ ", impar2=" + impar2 + ", impar3=" + impar3 + ", impar4=" + impar4 + ", impar5=" + impar5
				+ ", impar6=" + impar6 + ", impar7=" + impar7 + ", impar8=" + impar8 + ", impar9=" + impar9
				+ ", impar10=" + impar10 + ", impar11=" + impar11 + ", impar12=" + impar12 + ", dans1=" + dans1
				+ ", dans2=" + dans2 + ", dans3=" + dans3 + ", dans4=" + dans4 + ", dans5=" + dans5 + ", dans6=" + dans6
				+ ", dans7=" + dans7 + ", dans8=" + dans8 + ", dans9=" + dans9 + ", dans10=" + dans10 + ", dans11="
				+ dans11 + ", dans12=" + dans12 + ", ab1=" + ab1 + ", ab2=" + ab2 + ", ab3=" + ab3 + ", ab4=" + ab4
				+ ", ab5=" + ab5 + ", ab6=" + ab6 + ", ab7=" + ab7 + ", ab8=" + ab8 + ", ab9=" + ab9 + ", ab10=" + ab10
				+ ", ab11=" + ab11 + ", ab12=" + ab12 + ", ez1=" + ez1 + ", ez2=" + ez2 + ", ez3=" + ez3 + ", ez4="
				+ ez4 + ", ez5=" + ez5 + ", ez6=" + ez6 + ", ez7=" + ez7 + ", ez8=" + ez8 + ", ez9=" + ez9 + ", ez10="
				+ ez10 + ", ez11=" + ez11 + ", ez12=" + ez12 + ", owner=" + owner + ", divis=" + divis + ", c2=" + c2
				+ ", method=" + method + ", mdf_date=" + mdf_date + ", mdf_uname=" + mdf_uname + ", sids=" + sids
				+ ", prob=" + prob + ", nowbe=" + nowbe + ", lock=" + lock + ", lock_date=" + lock_date + ", lock_id="
				+ lock_id + ", account1=" + account1 + ", account2=" + account2 + ", account3=" + account3
				+ ", account4=" + account4 + ", account5=" + account5 + ", account6=" + account6 + ", account7="
				+ account7 + ", account8=" + account8 + ", account9=" + account9 + ", account10=" + account10
				+ ", account11=" + account11 + ", account12=" + account12 + ", ajil1=" + ajil1 + ", ajil2=" + ajil2
				+ ", ajil3=" + ajil3 + ", ajil4=" + ajil4 + ", ajil5=" + ajil5 + ", ajil6=" + ajil6 + ", ajil7=" + ajil7
				+ ", ajil8=" + ajil8 + ", ajil9=" + ajil9 + ", ajil10=" + ajil10 + ", ajil11=" + ajil11 + ", ajil12="
				+ ajil12 + ", hur1=" + hur1 + ", hur2=" + hur2 + ", hur3=" + hur3 + ", hur4=" + hur4 + ", hur5=" + hur5
				+ ", hur6=" + hur6 + ", hur7=" + hur7 + ", hur8=" + hur8 + ", hur9=" + hur9 + ", hur10=" + hur10
				+ ", hur11=" + hur11 + ", hur12=" + hur12 + ", nomer=" + nomer + ", nomerdate=" + nomerdate
				+ ", hemjee=" + hemjee + ", kadaster=" + kadaster + ", zoriulalt=" + zoriulalt + ", etaj=" + etaj
				+ ", kvar=" + kvar + ", metho=" + metho + ", hurungu=" + hurungu + ", posit=" + posit + ", nomereng="
				+ nomereng + ", ramno=" + ramno + ", source=" + source + ", ktdans=" + ktdans + ", postav=" + postav
				+ ", postavName=" + postavName + ", calcelegstate=" + calcelegstate + "]";
	}
	
	
}
