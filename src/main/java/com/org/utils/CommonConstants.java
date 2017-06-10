package com.org.utils;

public class CommonConstants {
	
	public static final String PGR_ISSUNEW_HEADER = "plant_loc,Pgr_no,Rack_Code,Shelf_Code,block_code,pi_Branchcode,pi_Variety,pi_CorB,pi_Opcode,pi_Stage,pi_Week,pi_Day,pi_Shift,pi_Inoculation,pi_Bottles";
	public static final String CONTAMINATION_HEADER = "cn_Plantloc,Pgr_no,Rack_Code,Shelf_Code,Block_Code,cn_Branchcode,cn_Variety,cn_Corb,cn_Opcode,cn_Stage,cn_Week,cn_Day,cn_Shift,cn_Inoculation,cn_Nature";
	public static final String PGR_PRODUCTION_HEADER = "plant_loc,Pgr_No,Rack_Code,Shelf_Code,block_code,pr_BranchCode,cr_Variety,cr_CorB,cr_Opcode,cr_Stage,cr_Week,cr_Day,cr_Shift,cr_Inoculation,cr_Bottles";
	public static final String PIR_RETURN_HEADER = "pr_PlantLoc,pr_PIRNo,pr_RackCode,pr_ShelfCode,pr_BlockCode,pr_BranchCode,pr_Variety,pr_CorB,pr_Opcode,pr_Stage,pr_Week,pr_Day,pr_Shift,pr_Inoculation,pr_Bottles";
	public static final String PIR_PRODUCTION_HEADER = "plant_loc,pr_PIRNo,pr_RackCode,pr_ShelfCode,block_code,pr_BrachCode,pr_Variety,pr_CorB,pr_Opcode,pr_Stage,pr_Week,pr_Day,pr_Shift,pr_Inoculation,pr_Bottles";
	public static final String PIR_ISSUE_HEADER = "pi_PlantLoc,pi_PIR_No,pi_Rack_Code,pi_ShelfCode,pi_BlockCode,pi_BranchCode,pi_Variety,pi_CorB,pi_Opcode,pi_Stage,pi_Week,pi_Day,pi_Shift,pi_Inoculation,pi_Bottles";
	public static final String DISPATCH_RETURN_MASTER_HEADER = "ds_PlantLoc,ds_tblno,ds_RackCode,ds_ShelfCode,ds_BlockCode,ds_BranchCode,ds_Variety,ds_CorB,ds_Opcode,ds_Stage,ds_Week,ds_Day,ds_Shif,ds_Inoculation,ds_Bottles";
	public static final String DISPATCH_HEADER = "dc_PlantLoc,ds_tblno,Rack_Code,Shelf_Code,dc_BlockCode,branch_code,ds_Variety,ds_CorB,ds_Opcode,ds_Stage,ds_Week,ds_Day,ds_Shift,ds_Inoculation,ds_Bottles";
	public static final String DISCARD_HEADER = "dc_PlantLoc,Pgr_No,Rack_Code,dc_BlockCode,dc_branch_code,dc_Variety,dc_CorB,dc_Opcode,dc_Stage,dc_Week,dc_Day,dc_Shift,dc_Inoculation,dc_Bottles";
	public static final String PGR_RETURNNEW_HEADER = "pr_Plantloc,Pgr_No,Rack_Code,Shelf_Code,pr_Blockcode,pr_BranchCode,pr_Variety,pr_CorB,pr_Opcode,pr_Stage,pr_Week,pr_Day,pr_Shift,pr_Inoculation,pr_Bottles";
	public static final String DELIVERY_HEADER = null;
	public static final String DELIVERYTOGREEN_HOUSENEW1_HEADER = null;
	
	public static final String TEXTDATA_HEADER = null;
	
	public static final String KF_SCUCESS="1";
	public static final String KF_FAIL="0";
	public static final String KF_FILE_EMPTY="2";
	public static final String KF_FILE_EXISTS="3";
	

	public static final String KF_SCUCESS_MESSAGE="File Uploaded Successfully.";
	public static final String KF_FAIL_MESSAGE="Data Mismatch. Please Contact to Admin";
	public static final String KF_FILE_EMPTY_MESSAGE="File Is Empty";
	public static final String KF_FILE_EXISTS_MESSAGE="File Is Aready Uploaded";
	public static final String KF_FILE_VALID_MESSAGE="Please Upload Correct File";
		
}
