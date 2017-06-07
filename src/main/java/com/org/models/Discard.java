package com.org.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Discard")
public class Discard {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column private Integer dc_ID;
	@Column private String Pgr_No;
	@Column private char Rack_Code;
	@Column private String Shelf_Code;
	@Column private String dc_Variety;
	@Column private char dc_Corb;
	@Column private Integer dc_Opcode;
	@Column private char dc_Stage;
	@Column private Integer dc_Week;
	@Column private Integer dc_Day;
	@Column private Integer dc_Shift;
	@Column private Integer dc_Inoculation;
	@Column private Integer dc_Bottles;
	@Column private String dc_Date;
	@Column private String dc_Time;
	@Column private Integer dc_prweek;
	@Column private Integer dc_prday;
	@Column private Integer dc_pryear;
	@Column private Integer dc_Year;
	@Column private String dc_branch_code;
	@Column private Integer plant_loc;
	@Column private String block_code;	
	public Integer getDc_ID() {
		return dc_ID;
	}
	public void setDc_ID(Integer dc_ID) {
		this.dc_ID = dc_ID;
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
	public String getDc_Variety() {
		return dc_Variety;
	}
	public void setDc_Variety(String dc_Variety) {
		this.dc_Variety = dc_Variety;
	}
	public char getDc_Corb() {
		return dc_Corb;
	}
	public void setDc_Corb(char dc_Corb) {
		this.dc_Corb = dc_Corb;
	}
	public Integer getDc_Opcode() {
		return dc_Opcode;
	}
	public void setDc_Opcode(Integer dc_Opcode) {
		this.dc_Opcode = dc_Opcode;
	}
	public char getDc_Stage() {
		return dc_Stage;
	}
	public void setDc_Stage(char dc_Stage) {
		this.dc_Stage = dc_Stage;
	}
	public Integer getDc_Week() {
		return dc_Week;
	}
	public void setDc_Week(Integer dc_Week) {
		this.dc_Week = dc_Week;
	}
	public Integer getDc_Day() {
		return dc_Day;
	}
	public void setDc_Day(Integer dc_Day) {
		this.dc_Day = dc_Day;
	}
	public Integer getDc_Shift() {
		return dc_Shift;
	}
	public void setDc_Shift(Integer dc_Shift) {
		this.dc_Shift = dc_Shift;
	}
	public Integer getDc_Inoculation() {
		return dc_Inoculation;
	}
	public void setDc_Inoculation(Integer dc_Inoculation) {
		this.dc_Inoculation = dc_Inoculation;
	}
	public Integer getDc_Bottles() {
		return dc_Bottles;
	}
	public void setDc_Bottles(Integer dc_Bottles) {
		this.dc_Bottles = dc_Bottles;
	}
	public String getDc_Date() {
		return dc_Date;
	}
	public void setDc_Date(String dc_Date) {
		this.dc_Date = dc_Date;
	}
	public String getDc_Time() {
		return dc_Time;
	}
	public void setDc_Time(String dc_Time) {
		this.dc_Time = dc_Time;
	}
	public Integer getDc_prweek() {
		return dc_prweek;
	}
	public void setDc_prweek(Integer dc_prweek) {
		this.dc_prweek = dc_prweek;
	}
	public Integer getDc_prday() {
		return dc_prday;
	}
	public void setDc_prday(Integer dc_prday) {
		this.dc_prday = dc_prday;
	}
	public Integer getDc_pryear() {
		return dc_pryear;
	}
	public void setDc_pryear(Integer dc_pryear) {
		this.dc_pryear = dc_pryear;
	}
	public Integer getDc_Year() {
		return dc_Year;
	}
	public void setDc_Year(Integer dc_Year) {
		this.dc_Year = dc_Year;
	}
	public String getDc_branch_code() {
		return dc_branch_code;
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
	public void setDc_branch_code(String dc_branch_code) {
		this.dc_branch_code = dc_branch_code;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
