$( document ).ready(function() {
     
    var url = window.location;
    var validation=false;
    
    // SUBMIT FORM
    $("#btnSubmit").click(function (event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
              
        var fileName =matchFileName($("#file").val().split("\\").pop(-1)).toUpperCase().trim();
        var validation=uploadFormValidation($("#file").val().split("\\").pop(-1));
        
        if(validation==true){
	        switch(fileName){
	        	case "PGR_ISSUE":
	        		ajaxFilePost(new FormData($('#uploadFile')[0]),"PGR_ISSUE",tableHeaderObject.PGR_IssueNew);
	        	break;
	        	case fileName.indexOf('PIR1_SCanOpcodeIssue') > -1:
	        		ajaxFilePost(new FormData($('#uploadFile')[0]),"PIR1_SCanOpcodeIssue");
	        	break;
	        	default:        		
	        }        
		   
    	}
    }); 
    
    var fileType = "";
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
            	if(result.status=='3'){
            		BootstrapDialog.alert('File is already uploded!');
            	}else{
            	var dataSet=result.data;
            	if(jQuery.isEmptyObject(dataSet))
            		return;
            	fileType = result.fileType;
            	datasetToDataTable(dataSet,fileType,dataTableHeader);
            }	
            },
            error : function(e) {
            	$("#"+fileType+"").hide();
                console.log("ERROR: ", e);
            }
        });
    }
})
