var app = angular.module('MeowGallery', []);

app.controller('HomePageController', function() {

	var homepage = this;

	homepage.galleryCards = [{
		img: "images/cat_1.jpg",
		desc: "“A happy arrangement: many people prefer cats to other people, and many cats prefer people to other cats.” – Mason Cooley",
		tags: "brown, tiger, sleepy"
	},
	{
		img: "images/cat_2.jpg",
		desc: "“I used to love dogs until I discovered cats.” – Nafisa Joseph",
			tags: "sitting, rooftop, brown"
	},
	{
		img: "images/cat_3.jpg",
		desc: "“Cats are inquisitive, but hate to admit it.” – Mason Cooley",
		tags: "sleepy, cuddling, brown, white"

	},
	{
		img: "images/cat_4.jpg",
		desc: "“In ancient times cats were worshipped as gods; they have not forgotten this.” – Terry Pratchett",
		tags: "sleepy, cuddling, black, white, kitty"
	},
	{
		img: "images/cat_5.jpg",
		desc: "“I have studied many philosophers and many cats. The wisdom of cats is infinitely superior.” – Hippolyte Taine",
		tags: "sleepy, brown, white, kitty"
	},
	{
		img: "images/cat_6.jpg",
		desc: "“There are two means of refuge from the miseries of life: music and cats.” – Albert Schweitzer",
		tags: "meow, brown, white, black"
	}];
	
	homepage.picOfTheDay = {
			img: homepage.galleryCards[Math.floor(Math.random() * 5)].img,
			desc: homepage.galleryCards[Math.floor(Math.random() * 5)].desc,
			updatedAgo: "3 mins"
		};
});