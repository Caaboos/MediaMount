var MediaMount = function() {};
MediaMount.prototype.update = function(successCallback, errorCallback) {
	cordova.exec(
		successCallback, // success callback function
		errorCallback, // error callback function
		'MediaMount', // mapped to our native Java class called "CalendarPlugin"
		'update'// with this action name
	);
};

MediaMount.install = function() {
	window.mediaMount = new MediaMount();
	return window.mediaMount;
};

cordova.addConstructor(MediaMount.install);

