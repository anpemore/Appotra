
let slider=document.querySelector(".slider-row");

let numImg=slider.querySelectorAll("img");



let i=0;
let j=0;
setInterval(function(){
	let por = i* - 100;
	slider.style.trasform="translateX("+por+"%)";
	j=Math.floor(Math.random()*20);
	if(j==0)
	   j++;
	else{  
	   
	    numImg[i].src="/img/img"+j+".jpg"; 
	   
	   
	  }
	
	i++;
	 // $("img").hide().fadeIn(2000);
	if(i>(numImg.length-1)){
	   i=0;
	   
	   numImg[0].src="/img/img"+ Math.floor(Math.random()*(20-1)+1)+".jpg";
	   numImg[1].src="/img/img"+ Math.floor(Math.random()*(20-1)+1)+".jpg";
	   numImg[2].src="/img/img"+ Math.floor(Math.random()*(20-1)+1)+".jpg";
	   numImg[3].src="/img/img"+ Math.floor(Math.random()*(20-1)+1)+".jpg"; 
	   //$("img").hide().fadeIn(10000);	   
	}   
	
},1000);


function myTimer() {
  const date = new Date();
document.getElementById("body").innerHTML = date.toLocaleTimeString();
}



