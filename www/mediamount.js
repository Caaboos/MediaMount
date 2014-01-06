var MediaMount = {};
MediaMount.prototype.update = function() {
	cordova.exec(
		successCallback, // success callback function
		errorCallback, // error callback function
		'MediaMount', // mapped to our native Java class called "CalendarPlugin"
		'update'// with this action name
	);
};

cordova.addConstructor(function() {
	window.mediaMount = new MediaMount();
	return window.mediaMount;
});

