var mediamount = {
    createEvent: function(successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'MediaMount', // mapped to our native Java class called "CalendarPlugin"
            'update'// with this action name
        ); 
    }
}
module.exports = mediamount;