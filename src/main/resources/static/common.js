$(function() {
    $("#slider").slider({
        animate: 'slow',
        slide: function(event, ui) {
            $("#current-value").html(ui.value);
        }
    });

    var isSliderEnabled = false,
        timerId = false;
    $("#submit").click(function(e) {
        e.preventDefault();
        if (!isSliderEnabled && !timerId) {
            timerId = setInterval(function() {
                getValueFromServer();
                $("#submit").html("Stop");
            }, 2000);
            isSliderEnabled = true;
        } else {
            clearInterval(timerId);
            $("#submit").html("Start");
            timerId = false;
            isSliderEnabled = false;
        }
    });
});
function getValueFromServer() {
    var min = parseInt($("#minValue").val()),
        max = parseInt($("#maxValue").val()),
        range = {
            minValue : min ? min : 0,
            maxValue : max ? max : 100
        };
    $.ajax({
        url: "https://dynamic-slider.herokuapp.com/getNumber",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(range),
        success: function(data) {
            setSliderValue(parseInt(data), range);
        },
        timeout: 30000
    });
}
function setSliderValue(value, range) {
    $("#slider").slider({
        animate: 'slow',
        value: value,
        min: range.minValue,
        max: range.maxValue,
        step: (range.maxValue - range.minValue) / 100,
        slide: function(event, ui) {
            $("#current-value").html(ui.value);
        }

    });
    $("#current-value").html(value);
}