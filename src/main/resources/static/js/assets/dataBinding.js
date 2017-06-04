function datasetToDataTable(dataSet,fileType,dataTableHeader){
	
	var header=dataTableHeader.split(',');
	$("#"+fileType+"").show();
	$("#"+fileType+"").dataTable( {
        "data": dataSet,
        "scrollX": true,
        "bDestroy": true,
        //"order": [[ 1, "asc" ]],
        "bLengthChange": false,
        "columns": [
			    { "data": ""+header[0]+"" },
			    { "data": ""+header[1]+""},
                { "data": ""+header[2]+"" },
                { "data": ""+header[3]+"" },
                { "data": ""+header[4]+"" },
                { "data": ""+header[5]+""},
                { "data": ""+header[6]+"" },
                { "data": ""+header[7]+"" },
                { "data": ""+header[8]+""},
                { "data": ""+header[9]+"" },
                { "data": ""+header[10]+"" },
                { "data": ""+header[11]+"" },
                { "data": ""+header[12]+"" },
                { "data": ""+header[13]+"" },
                { "data": ""+header[14]+""},
                
                { "data": ""+header[15]+"" },
                { "data": ""+header[16]+"" },
                { "data": ""+header[17]+"" },
                { "data": ""+header[18]+"" },
                { "data": ""+header[19]+"" },
                { "data": ""+header[20]+"" },
                { "data": ""+header[21]+""},
                { "data": ""+header[22]+"" }
  		 ],
    } );
	
$("#tableDiv").show();
}