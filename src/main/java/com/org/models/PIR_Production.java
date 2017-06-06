package com.org.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PIR_Production")
public class PIR_Production {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column private long pr_ID;
	@Column private String pr_Variety;
	@Column private char pr_Corb;
	@Column private Integer pr_Opcode;
	@Column private char pr_Stage;
	@Column private Integer pr_Week;
	@Column private Integer pr_Day;
	@Column private Integer pr_Shift;
	@Column private Integer pr_Inoculation;
	@Column private Integer pr_Bottles;
	@Column private char pr_Date;
	@Column private char pr_Time;
	@Column private Integer pr_Year;
	@Column private char pr_Brachcode;
	@Column private Integer plant_loc;
	@Column private String block_code;
	public long getPr_ID() {
		return pr_ID;
	}
	public void setPr_ID(long pr_ID) {
		this.pr_ID = pr_ID;
	}
	public String getPr_Variety() {
		return pr_Variety;
	}
	public void setPr_Variety(String pr_Variety) {
		this.pr_Variety = pr_Variety;
	}
	public char getPr_Corb() {
		return pr_Corb;
	}
	public void setPr_Corb(char pr_Corb) {
		this.pr_Corb = pr_Corb;
	}
	public Integer getPr_Opcode() {
		return pr_Opcode;
	}
	public void setPr_Opcode(Integer pr_Opcode) {
		this.pr_Opcode = pr_Opcode;
	}
	public char getPr_Stage() {
		return pr_Stage;
	}
	public void setPr_Stage(char pr_Stage) {
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
	public Integer getPr_Inoculation() {
		return pr_Inoculation;
	}
	public void setPr_Inoculation(Integer pr_Inoculation) {
		this.pr_Inoculation = pr_Inoculation;
	}
	public Integer getPr_Bottles() {
		return pr_Bottles;
	}
	public void setPr_Bottles(Integer pr_Bottles) {
		this.pr_Bottles = pr_Bottles;
	}
	public char getPr_Date() {
		return pr_Date;
	}
	public void setPr_Date(char pr_Date) {
		this.pr_Date = pr_Date;
	}
	public char getPr_Time() {
		return pr_Time;
	}
	public void setPr_Time(char pr_Time) {
		this.pr_Time = pr_Time;
	}
	public Integer getPr_Year() {
		return pr_Year;
	}
	public void setPr_Year(Integer pr_Year) {
		this.pr_Year = pr_Year;
	}
	public char getPr_Brachcode() {
		return pr_Brachcode;
	}
	public void setPr_Brachcode(char pr_Brachcode) {
		this.pr_Brachcode = pr_Brachcode;
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
