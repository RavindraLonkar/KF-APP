function datasetToDataTable(dataSet,objectName,dataTableHeader){
	
	$("#"+objectName+"").show();
	
	$("#"+objectName+"").dataTable( {
        "data": dataSet,
        "scrollX": true,
        "bDestroy": true,
        "bLengthChange": false,
        "columns": dataTableHeader,
    } );
	
}

function dataTableColumns(dataTableHeader) {

	var dataColumns = dataTableHeader.split(',');
	var dataArray = new Array();
	for (column = 0; column < dataColumns.length; column++) {
		var obj={
			"data" :""+dataColumns[column]+""
		};
		dataArray.push(obj);
	}
	return dataArray;
}