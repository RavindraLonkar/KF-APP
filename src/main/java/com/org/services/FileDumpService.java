package com.org.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.models.PGR_IssueNew;
import com.org.models.PIR1_SCanOpcodeIssue;
import com.org.models.PIR2_SCanOpcodeIssue;
import com.org.models.PIR3_SCanOpcodeIssue;
import com.org.repositories.PGR_IssueNewRepository;
import com.org.repositories.PIR1_SCanOpcodeIssueRepository;
import com.org.repositories.PIR2_SCanOpcodeIssueRepository;
import com.org.repositories.PIR3_SCanOpcodeIssueRepository;
import com.org.utils.CommonConstants;
import com.org.utils.CustomFileUtils;
import com.org.utils.Response;

@Service
public class FileDumpService {

	@Autowired PGR_IssueNewRepository pGR_IssueNewRepository;
	@Autowired PIR1_SCanOpcodeIssueRepository pIR1_SCanOpcodeIssueRepository;
	@Autowired PIR2_SCanOpcodeIssueRepository pIR2_SCanOpcodeIssueRepository;
	@Autowired PIR3_SCanOpcodeIssueRepository pIR3_SCanOpcodeIssueRepository;
	
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

			List<?> dataList = null;
			
			switch (objectName) {
				case "PGR_ISSUE":
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
					response = new Response(CommonConstants.KF_SCUCESS, pgrdata,"PGR_IssueNew");
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
						//pIR1_SCanOpcodeIssue.setPi_Year(customPIR1_SCanOpcodeIssueUtils.getYear(pIR1_SCanOpcodeIssue.getPi_Week()));
						pIR1_SCanOpcodeIssue.setPi_prshift(Integer.parseInt(shift));
					}
					
					List<PIR1_SCanOpcodeIssue> pIR1_SCanOpcodeIssueNewList = (List<PIR1_SCanOpcodeIssue>) pIR1_SCanOpcodeIssueRepository.save((List<PIR1_SCanOpcodeIssue>) dataList);
					response = new Response(CommonConstants.KF_SCUCESS, pIR1_SCanOpcodeIssueNewList,"PIR1_SCanOpcodeIssue");
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
					response = new Response(CommonConstants.KF_SCUCESS, pIR2_SCanOpcodeIssueNewList,"PIR2_SCanOpcodeIssue");

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
					response = new Response(CommonConstants.KF_SCUCESS, pIR3_SCanOpcodeIssueNewList,"PIR3_SCanOpcodeIssue");
				break;
				default:
					logger.info("No case match!");
			}

		} catch (Exception e) {
			logger.error(e);
		}
		return response;

	}
	
}
