package com.org.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contamination")
public class Contamination {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long cn_ID;
	@Column
	private String Pgr_no;
	@Column
	private char Rack_Code;
	@Column
	private String Shelf_Code;
	@Column
	private long Block_Code;
	@Column
	private String cn_Variety;
	@Column
	private char cn_Corb;
	@Column
	private Integer cn_Opcode;
	@Column
	private char cn_Stage;
	@Column
	private Integer cn_Week;
	@Column
	private Integer cn_Day;
	@Column
	private Integer cn_Shift;
	@Column
	private long cn_Inoculation;
	@Column
	private Integer cn_Nature;
	@Column
	private String cn_Date;
	@Column
	private String cn_Time;
	@Column
	private Integer cn_prweek;
	@Column
	private Integer cn_prday;
	@Column
	private long cn_pryear;
	@Column
	private Integer cn_Year;
	@Column
	private char cn_Branchcode;	
	@Column
	private long cn_PlantLoc;
	public long getCn_ID() {
		return cn_ID;
	}
	public void setCn_ID(long cn_ID) {
		this.cn_ID = cn_ID;
	}
	public String getPgr_no() {
		return Pgr_no;
	}
	public void setPgr_no(String pgr_no) {
		Pgr_no = pgr_no;
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
	public long getBlock_Code() {
		return Block_Code;
	}
	public void setBlock_Code(long block_Code) {
		Block_Code = block_Code;
	}
	public String getCn_Variety() {
		return cn_Variety;
	}
	public void setCn_Variety(String cn_Variety) {
		this.cn_Variety = cn_Variety;
	}
	public char getCn_Corb() {
		return cn_Corb;
	}
	public void setCn_Corb(char cn_Corb) {
		this.cn_Corb = cn_Corb;
	}
	public Integer getCn_Opcode() {
		return cn_Opcode;
	}
	public void setCn_Opcode(Integer cn_Opcode) {
		this.cn_Opcode = cn_Opcode;
	}
	public char getCn_Stage() {
		return cn_Stage;
	}
	public void setCn_Stage(char cn_Stage) {
		this.cn_Stage = cn_Stage;
	}
	public Integer getCn_Week() {
		return cn_Week;
	}
	public void setCn_Week(Integer cn_Week) {
		this.cn_Week = cn_Week;
	}
	public Integer getCn_Day() {
		return cn_Day;
	}
	public void setCn_Day(Integer cn_Day) {
		this.cn_Day = cn_Day;
	}
	public Integer getCn_Shift() {
		return cn_Shift;
	}
	public void setCn_Shift(Integer cn_Shift) {
		this.cn_Shift = cn_Shift;
	}
	public long getCn_Inoculation() {
		return cn_Inoculation;
	}
	public void setCn_Inoculation(long cn_Inoculation) {
		this.cn_Inoculation = cn_Inoculation;
	}
	public Integer getCn_Nature() {
		return cn_Nature;
	}
	public void setCn_Nature(Integer cn_Nature) {
		this.cn_Nature = cn_Nature;
	}
	public String getCn_Date() {
		return cn_Date;
	}
	public void setCn_Date(String cn_Date) {
		this.cn_Date = cn_Date;
	}
	public String getCn_Time() {
		return cn_Time;
	}
	public void setCn_Time(String cn_Time) {
		this.cn_Time = cn_Time;
	}
	public Integer getCn_prweek() {
		return cn_prweek;
	}
	public void setCn_prweek(Integer cn_prweek) {
		this.cn_prweek = cn_prweek;
	}
	public Integer getCn_prday() {
		return cn_prday;
	}
	public void setCn_prday(Integer cn_prday) {
		this.cn_prday = cn_prday;
	}
	public long getCn_pryear() {
		return cn_pryear;
	}
	public void setCn_pryear(long cn_pryear) {
		this.cn_pryear = cn_pryear;
	}
	public Integer getCn_Year() {
		return cn_Year;
	}
	public void setCn_Year(Integer cn_Year) {
		this.cn_Year = cn_Year;
	}
	public char getCn_Branchcode() {
		return cn_Branchcode;
	}
	public void setCn_Branchcode(char cn_Branchcode) {
		this.cn_Branchcode = cn_Branchcode;
	}
	public long getCn_PlantLoc() {
		return cn_PlantLoc;
	}
	public void setCn_PlantLoc(long cn_PlantLoc) {
		this.cn_PlantLoc = cn_PlantLoc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
