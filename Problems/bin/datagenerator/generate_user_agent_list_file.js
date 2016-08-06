/**
 * 
 */
var fs = require('fs');
var random_useragent = require('random-useragent');
var str = random_useragent.getRandom(); // gets a random user agent string
var lines = [];

for (var i=0; i<1000; i++) {
	lines.push(random_useragent.getRandom());
}

fs.writeFile("useragents.txt", lines.join("\n"), function(err) {
    if(err) {
        return console.log(err);
    }

    console.log("The file was saved!");
}); 

