window.onload = function() {
	
	var TeslaModels = [
	{
		"model":"models",
		"name":"Model S",
		"price":69000,
		"year":2017
	},
	{
		"model":"modelx",
		"name":"Model X",
		"price":150000,
		"year":2019
	},
	{
		"model":"model3",
		"name":"Model 3",
		"price":130000,
		"year":2015
	},
];

	TeslaModels.forEach(function(item,index)
	{
		listElemet= document.createElement("th")
		listElemet.id=item.model
		listElemet.innerHTML=item.name
		document.getElementById("menu").appendChild(listElemet)
	})

	TeslaModels.forEach(mouseOverHandler);
	function mouseOverHandler(item, index)
	{ 
		var elem=document.getElementById(item.model);
		elem.onmouseover=function()
		{
			var details = item;
			if(details!=null)
			{
				document.getElementById("data-menu").removeAttribute('hidden');
				document.getElementById("model").innerHTML=details.name;
				document.getElementById("picture").innerHTML='<img src="'+details.model+'.png"/>';
				document.getElementById("price").innerHTML=detials.price;
				document.getElementById("year").innerHTML=details.year;
			
			}
		}
	}
}
		