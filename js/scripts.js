$(function(){
    $("#title").click(function(){
        $("#title").html('Hello World');
    });

    $(".trigger").click(function(){
        $(".ov").slideToggle();
    })

});