function uploadFormValidation(filename){
	$('#file_error').addClass('hide');
	$('#fileType_error').addClass('hide');
	$('#shift_error').addClass('hide');
	var validation = true;
	var extensionToCheck=$('#file').val().substring(($('#file').val()
			.lastIndexOf('.') + 1));
	
	// For file
	if(filename==''){
		$('#file_error').removeClass('hide');
		$('#fileType_error').addClass('hide');
		validation=false;
		return validation;
	}else{
		$('#file_error').addClass('hide');
		if(extensionToCheck !='' && extensionToCheck != 'txt'){
			$('#file').val('');
			$('#inputFileName').val('');
			$('#fileType_error').removeClass('hide');
			validation=false;
			return validation;
		}else{
			$('#fileType_error').addClass('hide');
		}
	}
	//For Shift
	if($('#shift').val()==0){
		$('#shift_error').removeClass('hide');
		validation=false;
		return validation;
		
	}else{
		$('#shift_error').addClass('hide');
	}
	return validation;
}

