$( document ).ready(function() {
     
    var url = window.location;
    var validation=false;
    
    // SUBMIT FORM
    $("#btnSubmit").click(function (event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
              
        var fileName = $("#file").val().split("\\").pop(-1);
        var validation=uploadFormValidation(fileName);
        
        if(validation==true){
	        switch(true){
	        	case fileName.indexOf('PGR_ISSUE') > -1:
	        		pGR_IssueNewPost(new FormData($('#uploadFile')[0]),"PGR_IssueNew");
	        	break;
	        	case fileName.indexOf('PIR1_SCanOpcodeIssue') > -1:
	        		PIR1_SCanOpcodeIssuePost(new FormData($('#uploadFile')[0]),"PIR1_SCanOpcodeIssue");
	        	break;
	        	default:        		
	        }        
		   
    	}
    }); 
    
    var fileType = "";
    function pGR_IssueNewPost(data,objectName){
              
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
            	var dataSet=result.data;
            	if(jQuery.isEmptyObject(dataSet))
            		return;
            	fileType = result.fileType;
            	
            	$("#PGR_IssueNew").show();
            	$('#PGR_IssueNew').dataTable( {
			        "data": dataSet,
			        "scrollX": true,
			        //"order": [[ 1, "asc" ]],
			        "bLengthChange": false,
			        "columns": [
						    { "data": "pi_ID" },
						    { "data": "plant_loc"},
		                    { "data": "pgr_no" },
		                    { "data": "rack_Code" },
		                    { "data": "shelf_Code" },
		                    { "data": "block_code"},
		                    { "data": "pi_Branchcode" },
		                    { "data": "pi_Variety" },
		                    { "data": "pi_CorB"},
		                    
		                    {"data": "pi_Opcode" },
		                    { "data": "pi_Stage" },
		                    { "data": "pi_Week" },
		                    { "data": "pi_Day" },
		                    { "data": "pi_Shift" },
		                    { "data": "pi_Inoculation"},
		                    
		                    {"data": "pi_Bottles" },
		                    {"data": "pi_Date" },
		                    { "data": "pi_Time" },
		                    { "data": "pi_prweek" },
		                    { "data": "pi_prday" },
		                    { "data": "pi_prshift" },
		                    { "data": "pi_pryear"},
		                    { "data": "pi_Year" }
		      		 ],
			    } );
            },
            error : function(e) {
            	$("#PGR_IssueNew").hide();
                console.log("ERROR: ", e);
            }
        });
    }
    
    function PIR1_SCanOpcodeIssuePost(data){
    	
    }
      
})
