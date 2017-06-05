package com.org.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PGR_Returnnew")
public class PGR_ReturnNew {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column private long pr_ID;
	@Column private String Pgr_No;
	@Column private char Rack_Code;
	@Column private String Shelf_Code;
	@Column private String pr_Variety;
	@Column private String pr_CorB;
	@Column private Integer pr_Opcode;
	@Column private String pr_Stage;
	@Column private Integer pr_Week;
	@Column private Integer pr_Day;
	@Column private Integer pr_Shift;
	@Column private Double pr_Inoculation;
	@Column private Double pr_Bottles;
	@Column private String pr_Date;
	@Column private Date pr_Time;
	@Column private Integer pr_prWeek;
	@Column private Integer pr_prDay;
	@Column private Integer pr_prShift;
	@Column private Double pr_prYear;
	@Column private Integer pr_Year;
	@Column private char pr_BranchCode;
	public long getPr_ID() {
		return pr_ID;
	}
	public void setPr_ID(long pr_ID) {
		this.pr_ID = pr_ID;
	}
	public String getPgr_No() {
		return Pgr_No;
	}
	public void setPgr_No(String pgr_No) {
		Pgr_No = pgr_No;
	}
	public char getRack_Code() {
		return Rack_Code;
	}
	public void setRack_Code(char rack_Code) {
		Rack_Code = rack_Code;
	}
	public String getShelf_Code() {
		return Shelf_Code;
	}
	public void setShelf_Code(String shelf_Code) {
		Shelf_Code = shelf_Code;
	}
	public String getPr_Variety() {
		return pr_Variety;
	}
	public void setPr_Variety(String pr_Variety) {
		this.pr_Variety = pr_Variety;
	}
	public String getPr_CorB() {
		return pr_CorB;
	}
	public void setPr_CorB(String pr_CorB) {
		this.pr_CorB = pr_CorB;
	}
	public Integer getPr_Opcode() {
		return pr_Opcode;
	}
	public void setPr_Opcode(Integer pr_Opcode) {
		this.pr_Opcode = pr_Opcode;
	}
	public String getPr_Stage() {
		return pr_Stage;
	}
	public void setPr_Stage(String pr_Stage) {
		this.pr_Stage = pr_Stage;
	}
	public Integer getPr_Week() {
		return pr_Week;
	}
	public void setPr_Week(Integer pr_Week) {
		this.pr_Week = pr_Week;
	}
	public Integer getPr_Day() {
		return pr_Day;
	}
	public void setPr_Day(Integer pr_Day) {
		this.pr_Day = pr_Day;
	}
	public Integer getPr_Shift() {
		return pr_Shift;
	}
	public void setPr_Shift(Integer pr_Shift) {
		this.pr_Shift = pr_Shift;
	}
	public Double getPr_Inoculation() {
		return pr_Inoculation;
	}
	public void setPr_Inoculation(Double pr_Inoculation) {
		this.pr_Inoculation = pr_Inoculation;
	}
	public Double getPr_Bottles() {
		return pr_Bottles;
	}
	public void setPr_Bottles(Double pr_Bottles) {
		this.pr_Bottles = pr_Bottles;
	}
	public String getPr_Date() {
		return pr_Date;
	}
	public void setPr_Date(String pr_Date) {
		this.pr_Date = pr_Date;
	}
	public Date getPr_Time() {
		return pr_Time;
	}
	public void setPr_Time(Date pr_Time) {
		this.pr_Time = pr_Time;
	}
	public Integer getPr_prWeek() {
		return pr_prWeek;
	}
	public void setPr_prWeek(Integer pr_prWeek) {
		this.pr_prWeek = pr_prWeek;
	}
	public Integer getPr_prDay() {
		return pr_prDay;
	}
	public void setPr_prDay(Integer pr_prDay) {
		this.pr_prDay = pr_prDay;
	}
	public Integer getPr_prShift() {
		return pr_prShift;
	}
	public void setPr_prShift(Integer pr_prShift) {
		this.pr_prShift = pr_prShift;
	}
	public Double getPr_prYear() {
		return pr_prYear;
	}
	public void setPr_prYear(Double pr_prYear) {
		this.pr_prYear = pr_prYear;
	}
	public Integer getPr_Year() {
		return pr_Year;
	}
	public void setPr_Year(Integer pr_Year) {
		this.pr_Year = pr_Year;
	}
	public char getPr_BranchCode() {
		return pr_BranchCode;
	}
	public void setPr_BranchCode(char pr_BranchCode) {
		this.pr_BranchCode = pr_BranchCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}
