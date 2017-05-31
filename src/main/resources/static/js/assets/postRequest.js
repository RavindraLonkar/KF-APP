$( document ).ready(function() {
     
    var url = window.location;
     
    // SUBMIT FORM
    $("#btnSubmit").click(function (event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        
        var form = $('#uploadFile')[0];
        var data = new FormData(form);
        var fileName = $("#file").val().split("\\").pop(-1);
        
        switch(fileName){
        	case "PGR_IssueNew.txt":
        		pGR_IssueNewPost(data);
        	break;
        	default:        		
        }
        
    });
     
    function pGR_IssueNewPost(data){
              
        $.ajax({
            type : "POST",
            enctype: 'multipart/form-data',
            url : url + "/upload",
            data : data,
            processData: false, //prevent jQuery from automatically transforming the data into a query string
            contentType: false,
            cache: false,
            timeout: 600000,
            success : function(result) {
            	var dataSet=result.data;
            	if(jQuery.isEmptyObject(dataSet))
            		return;
            	
            	$("#example").show();
            	$('#example').dataTable( {
			        "data": dataSet,
			        "scrollX": true,
			        //"order": [[ 1, "asc" ]],
			        "bLengthChange": false,
			        "columns": [
						    { "data": "pi_ID" },
		                    { "data": "pgr_no" },
		                    { "data": "rack_Code" },
		                    { "data": "shelf_Code" },
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
		                    
		                    { "data": "pi_Year" },
		                    { "data": "pi_Branchcode" },
		                    { "data": "plant_loc"},
		                    { "data": "block_code"}
		      		 ],
			    } );
            },
            error : function(e) {
            	$("#example").hide();
                console.log("ERROR: ", e);
            }
        });
    }
      
})
