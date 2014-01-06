var MediaMount = function() {};
MediaMount.prototype.update = function(file, successCallback, errorCallback) {
	console.log('About to update');
	cordova.exec(
		successCallback, // success callback function
		errorCallback, // error callback function
		'MediaMount', // mapped to our native Java class called "CalendarPlugin"
		'update',// with this action name
		[{'file': file}]
	);
};

MediaMount.install = function() {
	window.mediaMount = new MediaMount();
	return window.mediaMount;
};

cordova.addConstructor(MediaMount.install);

