window.onload = function onload() {
  $("div[id^='myButtons'] .btn").click(function() {
    $(this).button('loading').delay(1000).queue(function() {
    });
  });

  $("img[id^='img']").click(function() {
    $(this).toggleClass('min');
    $(this).toggleClass('max');
  });
}

// $("img[id^='img']").dblclick(function(){
// $(this).toggleClass('min');
// $(this).toggleClass('max');
// });

// $(function() {
// $('#collapseOne').collapse('hide')
// });

// $(function() {
// $('#collapseTwo').collapse('show')
// });

// $(function() {
// $('#collapseThree').collapse('toggle')
// });

// $(function() {
// $('#collapseFour').collapse({
// toggle : false
// })
// });

