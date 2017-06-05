package com.org.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PGR_Production")
public class PGR_Production {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column private long cr_ID;
	@Column private String Pgr_No;
	@Column private char Rack_Code;
	@Column private String Shelf_Code;
	@Column private String cr_Variety;
	@Column private char cr_Corb;
	@Column private Integer cr_Opcode;
	@Column private char cr_Stage;
	@Column private Integer cr_Week;
	@Column private Integer cr_Day;
	@Column private Integer cr_Shift;
	@Column private Double cr_Inoculation;
	@Column private Double cr_Bottles;
	@Column private char pr_Date;
	@Column private String pr_Time;
	@Column private Integer pr_Year;
	@Column private char pr_Branchcode;
	@Column private Integer plant_loc;
	@Column private String block_code;	
	public long getCr_ID() {
		return cr_ID;
	}
	public void setCr_ID(long cr_ID) {
		this.cr_ID = cr_ID;
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
	public String getCr_Variety() {
		return cr_Variety;
	}
	public void setCr_Variety(String cr_Variety) {
		this.cr_Variety = cr_Variety;
	}
	public char getCr_Corb() {
		return cr_Corb;
	}
	public void setCr_Corb(char cr_Corb) {
		this.cr_Corb = cr_Corb;
	}
	public Integer getCr_Opcode() {
		return cr_Opcode;
	}
	public void setCr_Opcode(Integer cr_Opcode) {
		this.cr_Opcode = cr_Opcode;
	}
	public char getCr_Stage() {
		return cr_Stage;
	}
	public void setCr_Stage(char cr_Stage) {
		this.cr_Stage = cr_Stage;
	}
	public Integer getCr_Week() {
		return cr_Week;
	}
	public void setCr_Week(Integer cr_Week) {
		this.cr_Week = cr_Week;
	}
	public Integer getCr_Day() {
		return cr_Day;
	}
	public void setCr_Day(Integer cr_Day) {
		this.cr_Day = cr_Day;
	}
	public Integer getCr_Shift() {
		return cr_Shift;
	}
	public void setCr_Shift(Integer cr_Shift) {
		this.cr_Shift = cr_Shift;
	}
	public Double getCr_Inoculation() {
		return cr_Inoculation;
	}
	public void setCr_Inoculation(Double cr_Inoculation) {
		this.cr_Inoculation = cr_Inoculation;
	}
	public Double getCr_Bottles() {
		return cr_Bottles;
	}
	public void setCr_Bottles(Double cr_Bottles) {
		this.cr_Bottles = cr_Bottles;
	}
	public char getPr_Date() {
		return pr_Date;
	}
	public void setPr_Date(char pr_Date) {
		this.pr_Date = pr_Date;
	}
	public String getPr_Time() {
		return pr_Time;
	}
	public void setPr_Time(String pr_Time) {
		this.pr_Time = pr_Time;
	}
	public Integer getPr_Year() {
		return pr_Year;
	}
	public void setPr_Year(Integer pr_Year) {
		this.pr_Year = pr_Year;
	}
	public char getPr_Branchcode() {
		return pr_Branchcode;
	}
	public void setPr_Branchcode(char pr_Branchcode) {
		this.pr_Branchcode = pr_Branchcode;
	}
	public Integer getPlant_loc() {
		return plant_loc;
	}
	public void setPlant_loc(Integer plant_loc) {
		this.plant_loc = plant_loc;
	}
	public String getBlock_code() {
		return block_code;
	}
	public void setBlock_code(String block_code) {
		this.block_code = block_code;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
}
