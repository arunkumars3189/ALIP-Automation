package com.alip.selenium.po.elements;

import com.alip.selenium.basePage.page;
import com.alip.selenium.util.ReadExcel;



public class ReadData extends page {
	
	private static String UserName ;
	private static  String Password ;
	
	
			public String ReadUserName(){
			  UserName=testExcel.getStringCellData("Login", 2, "UserName");
				return UserName;
				
			}
			public String ReadPassword(){
				 Password=testExcel.getStringCellData("Login", 2, "Password");
				return Password;
				
			}
			public String ReadProjectCode(){
				String ProjectCode=testExcel.getStringCellData("Registration", 2, "ProjectCode");
				return ProjectCode;
				
			}
			public String ReadProjectType(){
				String Project_type=testExcel.getStringCellData("Registration", 2, "Project_type");
				return Project_type;
				
			}
			public String Readlocation(){
				String location=testExcel.getStringCellData("Registration", 2, "location");
				return location;
				
			}
			public String ReadProject_Name(){
				String Project_Name=testExcel.getStringCellData("Registration", 2, "Project_Name");
				return Project_Name;
				
			}
			public String ReadGemba_Unit(){
				String Gemba_Unit=testExcel.getStringCellData("Registration", 2, "Gemba_Unit");
				return Gemba_Unit;
				
			}
			public String ReadDescription(){
				String Description=testExcel.getStringCellData("Registration", 2, "Description");
				return Description;
				
			}
			public String ReadDivision(){
				String Division=testExcel.getStringCellData("Registration", 2, "Division");
				return Division;
				
			}
			public String ReadQC_Tools(){
				String QC_Tools=testExcel.getStringCellData("Registration", 2, "QC_Tools");
				return QC_Tools;
				
			}
			public String ReadCategory(){
				String Category=testExcel.getStringCellData("Registration", 2, "Category");
				return Category;
				
			}
			public String ReadSub_Category(){
				String Sub_Category=testExcel.getStringCellData("Registration", 2, "Sub_Category");
				return Sub_Category;
				
			}
			public String ReadProject_Planned(){
				String Project_Planned=testExcel.getStringCellData("Registration", 2, "Project_Planned");
				return Project_Planned;
				
			}
			public String ReadProject_Pl_end(){
				String Project_Pl_end=testExcel.getStringCellData("Registration", 2, "Project_Pl_end");
				return Project_Pl_end;
				
			}
			public String Parent_Project(){
				String Parent_Project=testExcel.getStringCellData("Registration", 2, "Parent_Project");
				return Parent_Project;
				
			}
			
			public String ReadCustomer(){
				String Customer=testExcel.getStringCellData("Registration", 2, "Customer");
				return Customer;
				
			}
			
			public String ReadProblem_start_date(){
				String Problem_start_date=testExcel.getStringCellData("Registration", 2, "Problem_start_date");
				return Problem_start_date;
				
			}
			public String ReadProblem_end_date(){
				String Problem_end_date=testExcel.getStringCellData("Registration", 2, "Problem_end_date");
				return Problem_end_date;
				
			}
			public String Readkeywords(){
				String keywords=testExcel.getStringCellData("Registration", 2, "keywords");
				return keywords;
				
			}
			public String ReadGantt_chart_plan(){
				String Gantt_chart_plan=testExcel.getStringCellData("Registration", 2, "Gantt_chart_plan");
				return Gantt_chart_plan;
				
			}
			public String ReadReg_Start_date(){
				String Reg_Start_date=testExcel.getStringCellData("Registration", 2, "Reg_Start_date");
				return Reg_Start_date;
			}
			public String ReadReg_end_date(){
				String Reg_end_date=testExcel.getStringCellData("Registration", 2, "Reg_end_date");
				return Reg_end_date;
				
			}
			public String ReadObservation_st_date(){
				String Observation_st_date=testExcel.getStringCellData("Registration", 2, "Observation_st_date");
				return Observation_st_date;
				
			}
			public String ReadObservation_end_date(){
				String Observation_end_date=testExcel.getStringCellData("Registration", 2, "Observation_end_date");
				return Observation_end_date;
				
			}
			public String ReadAnalysis_st_date(){
				String Analysis_st_date=testExcel.getStringCellData("Registration", 2, "Analysis_st_date");
				return Analysis_st_date;
				
			}
			public String ReadAnalysis_end_date(){
				String Analysis_end_date=testExcel.getStringCellData("Registration", 2, "Analysis_end_date");
				return Analysis_end_date;
				
			}
			public String ReadAction_Start_date(){
				String Action_st_date=testExcel.getStringCellData("Registration", 2, "Action_st_date");
				return Action_st_date;
				
			}
			public String ReadAction_end_date(){
				String Action_end_date=testExcel.getStringCellData("Registration", 2, "Action_end_date");
				return Action_end_date;
				
			}
			
			public String ReadCheck_Start_date(){
				String Check_Start_date=testExcel.getStringCellData("Registration", 2, "Check_Start_date");
				return Check_Start_date;
				
			}
			public String ReadCheck_end_date(){
				String Check_end_date=testExcel.getStringCellData("Registration", 2, "Check_end_date");
				return Check_end_date;
				
			}
			public String ReadStd_st_date(){
				String Std_st_date=testExcel.getStringCellData("Registration", 2, "Std_st_date");
				return Std_st_date;
				
			}
			public String ReadStd_end_date(){
				String Std_end_date=testExcel.getStringCellData("Registration", 2, "Std_end_date");
				return Std_end_date;
				
			}
			public String ReadConclude_st_date(){
				String Conclude_st_date=testExcel.getStringCellData("Registration", 2, "Conclude_st_date");
				return Conclude_st_date;
				
			}
			public String ReadConclude_end_date(){
				String Conclude_end_date=testExcel.getStringCellData("Registration", 2, "Conclude_end_date");
				return Conclude_end_date;
				
			}
			public String ReadKPI_code(){
				String KPI_code=testExcel.getStringCellData("Registration", 2, "KPI_code");
				System.out.println(KPI_code);
				return KPI_code;
				
			}
			public String ReadKPI_1(){
				String KPI_code=testExcel.getStringCellData("Registration", 2, "KPI_1");
				return KPI_code;
				
			}
			public String ReadKPI_2(){
				String KPI_code=testExcel.getStringCellData("Registration", 2, "KPI_2");
				return KPI_code;
				
			}
			public String ReadBaseline(){
				String Baseline=testExcel.getStringCellData("Registration", 2, "Baseline");
				return Baseline;
				
			}
			public String ReadTarget(){
				String Target=testExcel.getStringCellData("Registration", 2, "Target");
				return Target;
				
			}
			public String ReadKPI_Name(){
				String KPI_Name=testExcel.getStringCellData("Registration", 2, "KPI_Name");
				return KPI_Name;
				
			}
			public String ReadUOM(){
				String UOM=testExcel.getStringCellData("Registration", 2, "UOM");
				return UOM;
				
			}
			public String ReadAspiration(){
				String Aspiration=testExcel.getStringCellData("Registration", 2, "Aspiration");
				return Aspiration;
				
			}
			public String ReadRole(int i){
				String Role=testExcel.getStringCellData("Role", i, "Role");
				return Role;
				
			}
			public String ReadEmployee_name(int i){
				String Employee_name=testExcel.getStringCellData("Role", i, "Employee_name");
				return Employee_name;
				
			}
			public String ReadEmployee_name_1(int i){
				String Employee_name_1=testExcel.getStringCellData("Role", i, "Employee_name_1");
				return Employee_name_1;
				
			}
			public String ReadEmployee_name_2(int i){
				String Employee_name_2=testExcel.getStringCellData("Role", i, "Employee_name_2");
				return Employee_name_2;
				
			}
			
			public String ReadRoleProject(int i){
				String RoleProject=testExcel.getStringCellData("Role", i, "Project");
				return RoleProject;
				
			}
			public String ReadGrade(){
				String Grade=testExcel.getStringCellData("Registration", 2, "Grade");
				return Grade;
				
			}
			
		
			public String ReadMilestones(int i){
				String Milestones=testExcel.getStringCellData("Toll", i, "Milestones");
				return Milestones;
				
			}public String ReadRYG(int i){
				String RYG=testExcel.getStringCellData("Toll", i, "RYG");
				return RYG;
				
			}public String ReadRemarks(int i){
				String Remarks=testExcel.getStringCellData("Toll", i, "Remarks");
				return Remarks;
				
			}
			public String ReadPrjOwner(int i){
				String Project_Owner=testExcel.getStringCellData("Registration", i, "Project_Owner");
				return Project_Owner;
				
			}
			
			public void SetPrjcode(int i,String ProjCode){
				testExcel.setCellData("Registration", i, "ProjectCode", ProjCode);				
				
			}
			public void SetPrjOwner(int i,String PrjOwner){
				testExcel.setCellData("Registration", i, "Project_Owner", PrjOwner);				
				
			}
			
//OBSERVATION
			
			public String ReadOBS_Description(int i){
				String Description=testExcel.getStringCellData("Observation", i, "OBS_Description");
				return Description;
				
			}
			public String ReadOBS_QCtool(int i){
				String QCtool=testExcel.getStringCellData("Observation", i, "OBS_QCtool");
				return QCtool;
				
			}
			
			public String ReadOBS_Actual_ST(int i){
				String Actual_ST=testExcel.getStringCellData("Observation", i, "OBS_Actual_ST");
				return Actual_ST;
				
			}
			public String ReadOBS_Actual_END(int i){
				String Actual_END=testExcel.getStringCellData("Observation", i, "OBS_Actual_END");
				return Actual_END;
				
			}			
				

			public String ReadOBS_RYG(int i){
				String RYG=testExcel.getStringCellData("Obser_Toll", i, "RYG");
				return RYG;
				
			}
			public String ReadOBS_Remarks(int i){
				String Remarks=testExcel.getStringCellData("Obser_Toll", i, "Remarks");
				return Remarks;
				
			}
			public String ReadOBS_Milestones(int i){
				String Milestones=testExcel.getStringCellData("Obser_Toll", i, "Milestones");
				return Milestones;
				
			}
			
			//Analysis
			
			public String ReadANALYS_Description(int i){
				String ANALYS_Description=testExcel.getStringCellData("Analysis", i, "ANALYS_Description");
				return ANALYS_Description;
				
			}
			public String ReadANALYS_QCtool(int i){
				String ANALYS_QCtool=testExcel.getStringCellData("Analysis", i, "ANALYS_QCtool");
				return ANALYS_QCtool;
				
			}
			
			public String ReadANALYS_Actual_ST(int i){
				String ANALYS_Actual_ST=testExcel.getStringCellData("Analysis", i, "ANALYS_Actual_ST");
				return ANALYS_Actual_ST;
				
			}
			public String ReadANALYS_Actual_END(int i){
				String ANALYS_Actual_END=testExcel.getStringCellData("Analysis", i, "ANALYS_Actual_END");
				return ANALYS_Actual_END ;
			}
				public String ReadProbable_Cause(int i){
					String Probable_Cause=testExcel.getStringCellData("Analysis", i, "Probable_Cause");
					return Probable_Cause;
					
				}
				
				public String ReadANALYS_Root_Cause(int i){
					String Root_Cause=testExcel.getStringCellData("Analysis", i, "Root_Cause");
					return Root_Cause;
					
				}
				//Generation
				
				public String ReadGen_Idea_Title(int i){
					String Idea_Title=testExcel.getStringCellData("Generation", i, "Idea_Title");
					return Idea_Title;
					
				}
				public String ReadGen_Idea_No(int i){
					String Idea_No=testExcel.getStringCellData("Generation", i, "Idea_No");
					return Idea_No;
					
				}
				public String ReadGen_Idea_Classifier(int i){
					String Idea_Classifier=testExcel.getStringCellData("Generation", i, "Idea_Classifier");
					return Idea_Classifier;
					
				}
				public String ReadGen_Idea_Description(int i){
					String Idea_Description=testExcel.getStringCellData("Generation", i, "Idea_Description");
					return Idea_Description;
					
				}
				public String ReadGen_Idea_Type(int i){
					String Idea_Type=testExcel.getStringCellData("Generation", i, "Idea_Type");
					return Idea_Type;
					
				}
				public String ReadGen_Line_of_Business(int i){
					String Line_of_Business=testExcel.getStringCellData("Generation", i, "Line_of_Business");
					return Line_of_Business;
					
				}
				
				public String ReadGen_Segment(int i){
					String Segment=testExcel.getStringCellData("Generation", i, "Segment");
					return Segment;
					
				}
				public String ReadGen_Sub_Segment(int i){
					String Sub_Segment=testExcel.getStringCellData("Generation", i, "Sub_Segment");
					return Sub_Segment;
					
				}
				public String ReadGen_Aggregate(int i){
					String Aggregate=testExcel.getStringCellData("Generation", i, "Aggregate");
					return Aggregate;
					
				}
				public String ReadGen_Model(int i){
					String Model=testExcel.getStringCellData("Generation", i, "Model");
					return Model;
					
				}
				public String ReadGen_Employee_No(int i){
					String Employee_No=testExcel.getStringCellData("Generation", i, "Emp_No");
					return Employee_No;
					
				}
				
				public String ReadGen_Emp_No_1(int i){
					String Emp_No_1=testExcel.getStringCellData("Generation", i, "Emp_No_1");
					return Emp_No_1;
					
				}
				public String ReadGen_Emp_No_2(int i){
					String Emp_No_2=testExcel.getStringCellData("Generation", i, "Emp_No_2");
					return Emp_No_2;
					
				}
				public void SetGen_Idea_No(int i,String ideaNo){
					testExcel.setCellData("Generation", i, "Idea_No", ideaNo);
					
					
				}
					
				
//Evaluation
				
				public String ReadEval_Priority(int i){
					String Eval_Prior=testExcel.getStringCellData("Evaluation", i, "Priority");
					return Eval_Prior;
					
				}
				public String ReadEval_MinorIdea(int i){
					String MinorIdea=testExcel.getStringCellData("Evaluation", i, "MinorIdea");
					return MinorIdea;
					
				}
				
				public String ReadEval_Comment(int i){
					String Comment=testExcel.getStringCellData("Evaluation", i, "Comment");
					return Comment;
					
				}
			
				
				public String ReadEval_Impact(int i){
					String Eval_Impact=testExcel.getStringCellData("Evaluation", i, "Impact");
					return Eval_Impact;
					
				}
				public String ReadEval_Feasibility(int i){
					String Feasibility=testExcel.getStringCellData("Evaluation", i, "Feasibility");
					return Feasibility;
					
				}
				
				public String ReadEval_BackupIdea(int i){
					String BackupIdea=testExcel.getStringCellData("Evaluation", i, "BackupIdea");
					return BackupIdea;
					
				}
				public String ReadEval_BackUpIdeaNo(int i){
					String BackUpIdeaNo=testExcel.getStringCellData("Evaluation", i, "BackUpIdeaNo");
					return BackUpIdeaNo;
					
				}
				public String ReadEval_CancelIdea(int i){
					String CancelIdea=testExcel.getStringCellData("Evaluation", i, "CancelIdea");
					return CancelIdea;
					
				}
				public String ReadEval_IdeaHold(int i){
					String IdeaHold=testExcel.getStringCellData("Evaluation", i, "IdeaHold");
					return IdeaHold;
					
				}
				public String ReadEval_KPI(int i){
					String KPI=testExcel.getStringCellData("Eval_KPI", i, "KPI");
					return KPI;
					
				}
				
				public String ReadEval_KPI_1(int i){
					String KPI_1=testExcel.getStringCellData("Eval_KPI", i, "KPI_1");
					return KPI_1;
					
				}
				
				public String ReadEval_KPI_2(int i){
					String KPI_2=testExcel.getStringCellData("Eval_KPI", i, "KPI_2");
					return KPI_2;
					
				}
				
				public String ReadEval_KPI_Impact(int i){
					String KPI_Impact=testExcel.getStringCellData("Eval_KPI", i, "KPI_Impact");
					return KPI_Impact;
					
				}
				
				public String ReadEval_ShareOfBusiness(int i){
					String ShareOfBusiness=testExcel.getStringCellData("Eval_KPI", i, "ShareOfBusiness");
					return ShareOfBusiness;
					
				}
				
				public String ReadEval_OneTime(int i){
					String OneTime=testExcel.getStringCellData("Eval_KPI", i, "OneTime");
					return OneTime;
					
				}
				
				public String ReadEval_AutoCompute(int i){
					String AutoCompute=testExcel.getStringCellData("Eval_KPI", i, "AutoCompute");
					return AutoCompute;
					
				}
				
				public String ReadEval_RecurringAnnum(int i){
					String RecurringAnnum=testExcel.getStringCellData("Eval_KPI", i, "RecurringAnnum");
					return RecurringAnnum;
					
				}
				
				public String ReadEval_CurrentMethod(int i){
					String CurrentMethod=testExcel.getStringCellData("Eval_KPI", i, "CurrentMethod");
					return CurrentMethod;
					
				}
				
				public String ReadEval_Advantages(int i){
					String Advantages=testExcel.getStringCellData("Eval_KPI", i, "Advantages");
					return Advantages;
					
				}
				
				public String ReadEval_IntangibleBenefit(int i){
					String IntangibleBenefit=testExcel.getStringCellData("Eval_KPI", i, "IntangibleBenefit");
					return IntangibleBenefit;
					
				}
				
				public String ReadEval_Downsides(int i){
					String Downsides=testExcel.getStringCellData("Eval_KPI", i, "Downsides");
					return Downsides;
					
				}
				
				public String ReadEval_Capital(int i){
					String Capital=testExcel.getStringCellData("Evaluation", i, "Capital");
					return Capital;
					
				}
				
				public String ReadEval_NonCapital(int i){
					String NonCapital=testExcel.getStringCellData("Evaluation", i, "NonCapital");
					return NonCapital;
					
				}
				
				public String ReadEval_Recurring(int i){
					String Recurring=testExcel.getStringCellData("Evaluation", i, "Recurring");
					return Recurring;
					
				}
				
				public String ReadEval_Emp_no(int i){
					String Emp_no=testExcel.getStringCellData("Eval_EmpSeq", i, "Emp_no");
					return Emp_no;
					
				}
				
				public String ReadEval_Emp_no_1(int i){
					String Emp_no_1=testExcel.getStringCellData("Eval_EmpSeq", i, "Emp_no_1");
					return Emp_no_1;
					
				}
				
				public String ReadEval_Emp_no_2(int i){
					String Emp_no_2=testExcel.getStringCellData("Eval_EmpSeq", i, "Emp_no_2");
					return Emp_no_2;
					
				}
				
				public String ReadEval_Sequence(int i){
					String Sequence=testExcel.getStringCellData("Eval_EmpSeq", i, "Sequence");
					return Sequence;
					
				}
				
				
			
}
