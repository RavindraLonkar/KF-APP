$( document ).ready(function() {
     
    var url = window.location;
    var validation=false;
    
    // SUBMIT FORM
    $("#btnSubmit").click(function (event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        var validation=uploadFormValidation($("#file").val().split("\\").pop(-1));

        if(validation==true){
        	var fileName =matchFileName($("#file").val().split("\\").pop(-1)).toUpperCase().trim();
        	switch(fileName){
	        	case "PGR_ISSUE":
	        		ajaxFilePost(new FormData($('#uploadFile')[0]),"PGR_IssueNew",tableHeaderObject.PGR_IssueNew);
	        	break;
	        	case  "PIR1_SCanOpcodeIssue":
	        		ajaxFilePost(new FormData($('#uploadFile')[0]),"PIR1_SCanOpcodeIssue");
	        	break;
	        	case  "CONTAMINATION_HBT":
	        		ajaxFilePost(new FormData($('#uploadFile')[0]),"CONTAMINATION",tableHeaderObject.Contamination);
	        	break;
	        	case  "CONTAMINATION_FUNGUS":
	        		ajaxFilePost(new FormData($('#uploadFile')[0]),"CONTAMINATION",tableHeaderObject.Contamination);
	        	break;
	        	case  "CONTAMINATION_OTHER":
	        		ajaxFilePost(new FormData($('#uploadFile')[0]),"CONTAMINATION",tableHeaderObject.Contamination);
		        break;
	        	
	        	default:  
	        		notMatchCase();
	        	break;
	        }        
		   
    	}
    }); 
    
    function ajaxFilePost(data,objectName,dataTableHeader){
              
        $.ajax({
            type : "POST",
            enctype: 'multipart/form-data',
            url : url + "upload?objectName=" + objectName,
            data : data,
            processData: false, //prevent jQuery from automatically transforming the data into a query string
            contentType: false,
            cache: false,
            timeout: 600000,
            success : function(result) {
            	if(result.status=='1'){
            		var dataSet=result.data;
            		if(jQuery.isEmptyObject(dataSet))
                		return;
            		DataTableHeaderBind(dataTableHeader,objectName);
            		hideDataTable();
                	datasetToDataTable(dataSet,objectName,dataTableColumns(dataTableHeader));
                	BootstrapDialog.alert(result.resonCode);
            	}else{
            		BootstrapDialog.alert(result.resonCode);
            	}	
            },
            error : function(e) {
            	$("#"+objectName+"").hide();
                console.log("ERROR: ", e);
            }
        });
    }
    
    function notMatchCase(){
    	
    	BootstrapDialog.alert('Please Upload Correct File!');
    }
})
