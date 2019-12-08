function check(divid, source) {

  var checks = document.querySelectorAll('#' + divid + ' input[type="number"]');

  for(var i=0;i<checks.length;i++){
    checks[i].disabled = !source.checked;
    checks[i].value=1;
   
    if(checks[i].disabled){
      checks[i].value=0;
    }
  }
}

function createUniqueIds(){
   var allMenus = document.getElementsByClassName('menu');
   var index = 0;
   for(i = 0; i < allMenus.length; i++){
	   allMenus[i].id = 'id_'+ index++;
   }  
}

document.addEventListener('DOMContentLoaded', function() {
	createUniqueIds();
	}, false);
