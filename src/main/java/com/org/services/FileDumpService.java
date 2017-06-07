package com.org.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.models.Contamination;
import com.org.models.PGR_IssueNew;
import com.org.models.PGR_Production;
import com.org.models.PGR_ReturnNew;
import com.org.models.PIR1_SCanOpcodeIssue;
import com.org.models.PIR2_SCanOpcodeIssue;
import com.org.models.PIR3_SCanOpcodeIssue;
import com.org.models.PIR_Production;
import com.org.models.PIR_ReturnNew;
import com.org.repositories.ContaminationRepository;
import com.org.repositories.PGR_IssueNewRepository;
import com.org.repositories.PGR_ProductionRepository;
import com.org.repositories.PGR_ReturnNewRepository;
import com.org.repositories.PIR1_SCanOpcodeIssueRepository;
import com.org.repositories.PIR2_SCanOpcodeIssueRepository;
import com.org.repositories.PIR3_SCanOpcodeIssueRepository;
import com.org.repositories.PIR_ProductionRepository;
import com.org.repositories.PIR_ReturnNewRepository;
import com.org.utils.CommonConstants;
import com.org.utils.CustomFileUtils;
import com.org.utils.Response;

@Service
public class FileDumpService {
	

	@Autowired PGR_IssueNewRepository pGR_IssueNewRepository;
	@Autowired PIR1_SCanOpcodeIssueRepository pIR1_SCanOpcodeIssueRepository;
	@Autowired PIR2_SCanOpcodeIssueRepository pIR2_SCanOpcodeIssueRepository;
	@Autowired PIR3_SCanOpcodeIssueRepository pIR3_SCanOpcodeIssueRepository;
	@Autowired ContaminationRepository contaminationRepository;
	@Autowired PGR_ProductionRepository pGR_ProductionRepository;
	@Autowired PGR_ReturnNewRepository pGR_ReturnNewRepository;
	@Autowired PIR_ProductionRepository pIR_ProductionRepository;
	@Autowired PIR_ReturnNewRepository pIR_ReturnNewRepository;
	
	Response response=new Response();
	
	private Logger logger = Logger.getLogger(FileDumpService.class);

	private <T> ArrayList<T> getModels(Class<T> type) {
		ArrayList<T> arrayList = new ArrayList<T>();
		return arrayList;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public Response dumpFile(File file,String shift, String objectName) {
		String fileContent = null;
		
		

			try {
				fileContent = FileUtils.readFileToString(file);
			} catch (IOException e) {
				logger.error(e.getMessage());
			}

			List<?> dataList = null;
			
			switch (objectName) {
				case "PGR_IssueNew":
					dataList = this.getModels(PGR_IssueNew.class);
					CustomFileUtils<PGR_IssueNew> customPGR_IssueNewUtils = new CustomFileUtils<PGR_IssueNew>();
					dataList = customPGR_IssueNewUtils.getMappedObjectList(fileContent, new PGR_IssueNew(),
							CommonConstants.PGR_ISSUNEW_HEADER);
					
					for (PGR_IssueNew pGR_IssueNew : (List<PGR_IssueNew>) dataList) {					
						pGR_IssueNew.setPi_Time(customPGR_IssueNewUtils.getPrTime());
						pGR_IssueNew.setPi_Date(customPGR_IssueNewUtils.getDate());
						pGR_IssueNew.setPi_prweek(customPGR_IssueNewUtils.getPrWeek());
						pGR_IssueNew.setPi_prday(customPGR_IssueNewUtils.getPrDay());
						pGR_IssueNew.setPi_pryear(customPGR_IssueNewUtils.getPrYear());
						pGR_IssueNew.setPi_Year(customPGR_IssueNewUtils.getPrYear());
						pGR_IssueNew.setPi_prshift(Integer.parseInt(shift));
					}
					
					List<PGR_IssueNew> pgrdata = (List<PGR_IssueNew>) pGR_IssueNewRepository.save((List<PGR_IssueNew>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pgrdata,CommonConstants.KF_SCUCESS_MESSAGE);
				break;
				case "PIR1_SCanOpcodeIssue":
					dataList = this.getModels(PIR1_SCanOpcodeIssue.class);
					CustomFileUtils<PIR1_SCanOpcodeIssue> customPIR1_SCanOpcodeIssueUtils = new CustomFileUtils<PIR1_SCanOpcodeIssue>();
					dataList = customPIR1_SCanOpcodeIssueUtils.getMappedObjectList(fileContent, new PIR1_SCanOpcodeIssue(),
							CommonConstants.PGR_ISSUNEW_HEADER);
					
					for (PIR1_SCanOpcodeIssue pIR1_SCanOpcodeIssue : (List<PIR1_SCanOpcodeIssue>) dataList) {					
						pIR1_SCanOpcodeIssue.setPi_Time(customPIR1_SCanOpcodeIssueUtils.getPrTime());
						pIR1_SCanOpcodeIssue.setPi_prweek(customPIR1_SCanOpcodeIssueUtils.getPrWeek());
						pIR1_SCanOpcodeIssue.setPi_prday(customPIR1_SCanOpcodeIssueUtils.getPrDay());
						pIR1_SCanOpcodeIssue.setPi_pryear(customPIR1_SCanOpcodeIssueUtils.getPrYear());
						//pIR1_SCanOpcodeIssue.setPi_Year(customPGR_IssueNewUtils.getPrYear());
						pIR1_SCanOpcodeIssue.setPi_prshift(Integer.parseInt(shift));
					}
					
					List<PIR1_SCanOpcodeIssue> pIR1_SCanOpcodeIssueNewList = (List<PIR1_SCanOpcodeIssue>) pIR1_SCanOpcodeIssueRepository.save((List<PIR1_SCanOpcodeIssue>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pIR1_SCanOpcodeIssueNewList,CommonConstants.KF_SCUCESS_MESSAGE);
				break;
				case "PIR2_SCanOpcodeIssue":
					dataList = this.getModels(PIR2_SCanOpcodeIssue.class);
					CustomFileUtils<PIR2_SCanOpcodeIssue> customPIR2_SCanOpcodeIssueUtils = new CustomFileUtils<PIR2_SCanOpcodeIssue>();
					dataList = customPIR2_SCanOpcodeIssueUtils.getMappedObjectList(fileContent, new PIR2_SCanOpcodeIssue(),
							CommonConstants.PGR_ISSUNEW_HEADER);
					
					for (PIR2_SCanOpcodeIssue pIR2_SCanOpcodeIssue : (List<PIR2_SCanOpcodeIssue>) dataList) {					
						pIR2_SCanOpcodeIssue.setPi_Time(customPIR2_SCanOpcodeIssueUtils.getPrTime());
						pIR2_SCanOpcodeIssue.setPi_prweek(customPIR2_SCanOpcodeIssueUtils.getPrWeek());
						pIR2_SCanOpcodeIssue.setPi_prday(customPIR2_SCanOpcodeIssueUtils.getPrDay());
						pIR2_SCanOpcodeIssue.setPi_pryear(customPIR2_SCanOpcodeIssueUtils.getPrYear());
						//pIR2_SCanOpcodeIssue.setPi_Year(customPIR2_SCanOpcodeIssueUtils.getYear(pIR2_SCanOpcodeIssue.getPi_Week()));
						pIR2_SCanOpcodeIssue.setPi_prshift(Integer.parseInt(shift));
					}
					
					List<PIR2_SCanOpcodeIssue> pIR2_SCanOpcodeIssueNewList = (List<PIR2_SCanOpcodeIssue>) pIR2_SCanOpcodeIssueRepository.save((List<PIR2_SCanOpcodeIssue>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pIR2_SCanOpcodeIssueNewList,CommonConstants.KF_SCUCESS_MESSAGE);

				break;
				case "PIR3_SCanOpcodeIssue":
					dataList = this.getModels(PIR3_SCanOpcodeIssue.class);
					CustomFileUtils<PIR3_SCanOpcodeIssue> customPIR3_SCanOpcodeIssueUtils = new CustomFileUtils<PIR3_SCanOpcodeIssue>();
					dataList = customPIR3_SCanOpcodeIssueUtils.getMappedObjectList(fileContent, new PIR3_SCanOpcodeIssue(),
							CommonConstants.PGR_ISSUNEW_HEADER);
					
					for (PIR3_SCanOpcodeIssue pIR3_SCanOpcodeIssue : (List<PIR3_SCanOpcodeIssue>) dataList) {					
						pIR3_SCanOpcodeIssue.setPi_Time(customPIR3_SCanOpcodeIssueUtils.getPrTime());
						pIR3_SCanOpcodeIssue.setPi_prweek(customPIR3_SCanOpcodeIssueUtils.getPrWeek());
						pIR3_SCanOpcodeIssue.setPi_prday(customPIR3_SCanOpcodeIssueUtils.getPrDay());
						pIR3_SCanOpcodeIssue.setPi_pryear(customPIR3_SCanOpcodeIssueUtils.getPrYear());
						//pIR3_SCanOpcodeIssue.setPi_Year(customPIR3_SCanOpcodeIssueUtils.getYear(pIR3_SCanOpcodeIssue.getPi_Week()));
						pIR3_SCanOpcodeIssue.setPi_prshift(1);
					}
					
					List<PIR3_SCanOpcodeIssue> pIR3_SCanOpcodeIssueNewList = (List<PIR3_SCanOpcodeIssue>) pIR3_SCanOpcodeIssueRepository.save((List<PIR3_SCanOpcodeIssue>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pIR3_SCanOpcodeIssueNewList,CommonConstants.KF_SCUCESS_MESSAGE);
				break;
				case "CONTAMINATION":
					dataList = this.getModels(Contamination.class);
					CustomFileUtils<Contamination> customContamination = new CustomFileUtils<Contamination>();
					dataList = customContamination.getMappedObjectList(fileContent, new Contamination(),
							CommonConstants.CONTAMINATION_HEADER);
					
					for (Contamination contamination : (List<Contamination>) dataList) {					
						contamination.setCn_Time(customContamination.getPrTime());
						contamination.setCn_Date(customContamination.getDate());
						contamination.setCn_prweek(customContamination.getPrWeek());
						contamination.setCn_prday(customContamination.getPrDay());
						contamination.setCn_pryear(customContamination.getPrYear());
						contamination.setCn_Year(customContamination.getPrYear());
						contamination.setCn_Shift(Integer.parseInt(shift));
					}
					
					List<Contamination> contaminationList = (List<Contamination>) contaminationRepository.save((List<Contamination>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, contaminationList,CommonConstants.KF_SCUCESS_MESSAGE);

				break;
				case "PGR_Production":
					dataList = this.getModels(PGR_Production.class);
					CustomFileUtils<PGR_Production> customPGR_Production = new CustomFileUtils<PGR_Production>();
					dataList = customPGR_Production.getMappedObjectList(fileContent, new PGR_Production(),
							CommonConstants.CONTAMINATION_HEADER);
					
					for (PGR_Production pGR_Production : (List<PGR_Production>) dataList) {					
						pGR_Production.setPr_Time(customPGR_Production.getPrTime());
						pGR_Production.setCr_Week(customPGR_Production.getPrWeek());
						pGR_Production.setCr_Day(customPGR_Production.getPrDay());
						pGR_Production.setPr_Year(customPGR_Production.getPrYear());
						//pGR_Production.setPr_Year(customPGR_Production.getPrYear());
						pGR_Production.setCr_Shift(Integer.parseInt(shift));
					}
					
					List<PGR_Production> pGR_ProductionList = (List<PGR_Production>) pGR_ProductionRepository.save((List<PGR_Production>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pGR_ProductionList,CommonConstants.KF_SCUCESS_MESSAGE);

				break;
				case "PGR_ReturnNew":
					dataList = this.getModels(PGR_ReturnNew.class);
					CustomFileUtils<PGR_ReturnNew> customPGR_ReturnNew = new CustomFileUtils<PGR_ReturnNew>();
					dataList = customPGR_ReturnNew.getMappedObjectList(fileContent, new PGR_ReturnNew(),
							CommonConstants.CONTAMINATION_HEADER);
					
					for (PGR_ReturnNew pGR_ReturnNew : (List<PGR_ReturnNew>) dataList) {					
						pGR_ReturnNew.setPr_Time(customPGR_ReturnNew.getPrTime());
						pGR_ReturnNew.setPr_prweek(customPGR_ReturnNew.getPrWeek());
						pGR_ReturnNew.setPr_Day(customPGR_ReturnNew.getPrDay());
						pGR_ReturnNew.setPr_pryear(customPGR_ReturnNew.getPrYear());
						pGR_ReturnNew.setPr_Year(customPGR_ReturnNew.getPrYear());
						pGR_ReturnNew.setPr_Shift(Integer.parseInt(shift));
					}
					
					List<PGR_ReturnNew> pGR_ReturnNewList = (List<PGR_ReturnNew>) pGR_ReturnNewRepository.save((List<PGR_ReturnNew>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pGR_ReturnNewList,"");

				break;
				case "PIR_Production":
					dataList = this.getModels(PIR_Production.class);
					CustomFileUtils<PIR_Production> customPIR_Production = new CustomFileUtils<PIR_Production>();
					dataList = customPIR_Production.getMappedObjectList(fileContent, new PIR_Production(),
							CommonConstants.CONTAMINATION_HEADER);
					
					for (PIR_Production pIR_Production : (List<PIR_Production>) dataList) {					
						pIR_Production.setPr_Time(customPIR_Production.getPrTime());
						pIR_Production.setPr_Week(customPIR_Production.getPrWeek());
						pIR_Production.setPr_Day(customPIR_Production.getPrDay());
						pIR_Production.setPr_Year(customPIR_Production.getPrYear());
						pIR_Production.setPr_Year(customPIR_Production.getPrYear());
						pIR_Production.setPr_Shift(Integer.parseInt(shift));
					}
					
					List<PIR_Production> pIR_ProductionList = (List<PIR_Production>) pIR_ProductionRepository.save((List<PIR_Production>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pIR_ProductionList,CommonConstants.KF_SCUCESS_MESSAGE);

				break;
				case "PIR_ReturnNew":
					dataList = this.getModels(PIR_ReturnNew.class);
					CustomFileUtils<PIR_ReturnNew> customPIR_ReturnNew = new CustomFileUtils<PIR_ReturnNew>();
					dataList = customPIR_ReturnNew.getMappedObjectList(fileContent, new PIR_ReturnNew(),
							CommonConstants.CONTAMINATION_HEADER);
					
					for (PIR_ReturnNew pIR_ReturnNew : (List<PIR_ReturnNew>) dataList) {					
						pIR_ReturnNew.setPr_Time(customPIR_ReturnNew.getPrTime());
						pIR_ReturnNew.setPr_prweek(customPIR_ReturnNew.getPrWeek());
						pIR_ReturnNew.setPr_Day(customPIR_ReturnNew.getPrDay());
						pIR_ReturnNew.setPr_pryear(customPIR_ReturnNew.getPrYear());
						pIR_ReturnNew.setPr_Year(customPIR_ReturnNew.getPrYear());
						pIR_ReturnNew.setPr_Shift(Integer.parseInt(shift));
					}
					
					List<PIR_ReturnNew> pIR_ReturnNewList = (List<PIR_ReturnNew>) pIR_ReturnNewRepository.save((List<PIR_ReturnNew>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pIR_ReturnNewList,"");

				break;

					default:
					logger.info("No case match!");
					response = new Response(CommonConstants.KF_FAIL, null, CommonConstants.KF_FILE_VALID_MESSAGE);
			}
		
		return response;

	}
	
}
