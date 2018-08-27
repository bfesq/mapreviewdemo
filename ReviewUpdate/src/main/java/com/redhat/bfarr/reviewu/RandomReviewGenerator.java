package com.redhat.bfarr.reviewu;

import java.util.Random;

public class RandomReviewGenerator {
	private Random random = new Random();
	public static String[] descriptions = new String[] {
			"3:Really friendly helpful staff. ",
			"5:Great coffee. Yummy good. Incredible people!",
			"4:Great cafe with lots of space and lovely service. ",
			"1:Service not most attentive",
			"3:Was ok",
			"5:Happy to find this gem!",
			"2:Coffee was ok, but didnt like the service",
			"3:Good food, coffee average",
			"4:Great place"
	};
	
	public static String[] names = new String[] {
			"Maxime","Aaron", "Abbey","Abdul","Adam","Alice","Amanda","Amy","Analisa",
			"Andrew","Angelina", "Ann",  "Anthony", "Babara", "Basil", "Becky", "Ben" + 
			"Benedict","Benita","Benito","Benjamin","Bennett","Benny","Benton","Berenice",
			"Berna","Bernadette","Bernadine" , "Bernard" , "Bernie" , "Bert" , "Beth" , 
			"Betty" , "Bianca" , "Billy" , "Blake" , "Bob" , "Bonnie" , "Brandon" ,"Brent" ,  
			"Brianna" , "Bridgette" , "Bruno" , "Bryan" , "Caitlin" , "Calvin" , "Camilla" , 
			"Candy" , "Carletta" , "Carman" , "Carol" , "Carson" , "Cassandra" , "Cathy" , "Celeste" , 
			"Charise" , "Charlie" , "Chau" , "Chauncey" , "Chaya" , "Chelsea" , "Chelsey" , "Chelsie" , "Cher" , "Chere" , 
			"Cheree" , "Chin" ,"China" , "Ching" , "Chiquita" , "Chloe" , "Chong" , "Christinia" , 
			"Christoper" , "Christopher" , "Christy" , "Chrystal" , 	"Chu" , "Chuck" , "Chun" , 
			"Chung" , "Ciara" , "Cicely" , "Ciera" , "Cierra" , "Cinda" , "Cinderella" , "Cindi" , 
			"Cindie" , "Cindy" , "Cinthia","Cira","Clair","Clair","Claire","Coleman","Colene","Coletta","Colette","Colin","Colleen","Collen","Collene","Collette","Collin",
"Colton","Columbus","Concepcion","Conception","Concetta","Concha","Cristina","Cristine","Cristobal","Cristopher","Cristy","Cruz","Cruz",
"Crysta","Crystal","Crystle","Cuc","Curt","Curtis","Curtis","Cyndi","Cyndy","Cynthia","Cyril","Cyrstal","Cyrus","Cythia","Dacia","Dagmar",
"Dagny","Dahlia","Daina","Daine","Daniella","Danielle","Danika","Danille","Danilo","Danita","Dann","Danna","David","David","Davida","Davina",
"Davis","Dawn","Dawna","Dawne","Dayle","Dayna","Daysi","Deadra","Dean","Denisse","Denita","Denna","Dennis","Earnest","Earnestine","Eartha",
"Easter","Eboni","Ebonie","Ebony","Echo","Ed","Eda","Edda","Eddie","Eddie","Elane","Elanor","Elayne","Elba","Elbert","Elda","Elden","Eldon",
"Eldora","Eldridge","Eleanor","Elinor","Elinore","Elisa","Elisabeth","Elise","Eliseo","Elisha","Elisha","Elissa","Eliz","Eliza","Elizabet",
"Elizabeth","Elois","Eloisa","Eloise","Elouise","Eloy","Elroy","Elsa","Emile","Emilee","Emilia","Emilie","Erika","Erin","Erin","Erinn","Erlene",
"Erlinda","Erline","Esther","Estrella","Etha","Felisha","Felix","Felton","Ferdinand","Fermin","Fermina","Fern","Fernanda","Fernande","Fernando",
"Ferne","Fidel","Fidela","Fidelia","Fredda","Freddie","Freddie","Freddy","Frederic","Frederica","Frederick","Fredericka","Fredia","Fredric",
"Fredrick","Fredricka","Freeda","Freeman","Freida","Frida","Frieda","Genna","Gennie","Genny","Genoveva","Geoffrey","Georgann","George","George",
"Georgeann","Georgeanna","Georgene","Georgetta","Georgette","Georgia","Georgiana","Georgiann","Ghislaine","Gia","Gianna","Gidget","Gigi","Gil",
"Gilbert","Gilberte","Gilberto","Gilda","Graciela","Grady","Graham","Graig","Grant","Granville","Grayce","Grazyna","Greg","Gregg","Gregoria",
"Gregorio","Gregory","Gregory","Greta","Hans","Harlan","Harland","Harley","Harmony","Harold","Harold","Harriet","Harriett","Henry","Henry",
"Herb","Herbert","Heriberto","Honey","Hong","Hong","Hope","Horace","Horacio","Hortencia","Hortense","Hortensia","Isaac","Isabel","Isabell",
"Isabella","Isabelle","Isadora","Isaiah","Isaias","Jaime","Jaimee","Jaimie","Jake","Jaleesa","Jalisa","Jama","Jamaal","Jamal","Jamar","Jame",
"Jame","Jamee","Jamel","James","Jason","Jasper","Jaunita","Javier","Jay","Jay","Jaye","Jayme","Jaymie","Jenifer","Jeniffer","Jenine","Jenise",
"Jenna","Jennefer","Jennell","Jennette","Jenni","Jennie","Jennifer","Jenniffer","Jennine","Jenny","Jerald","Jodi","Jodie","Jody","Jody","Joe",
"Joe","Joeann","Joel","Justa","Justin","Justin","Justina","Justine","Jutta","Ka","Kacey","Keeley","Keely","Keena","Keenan","Keesha","Keiko",
"Kevin","Kevin","Khadijah","Khalilah","Kia","Kiana","Kiara","Kiera","Kiersten","Kristi","Kristian","Kristie","Kristin","Kristina","Kristine",
"Lakiesha","Lakisha","Lakita","Lala","Lamar","Lamonica","Lamont","Lan","Lana","Latoria","Latosha","Latoya","Latoyia","Latrice","Latricia",
"Latrina","Latrisha","Launa","Laura","Lauralee","Lauran","Laure","Laureen","Laurel","Leida","Leif","Leigh","Leigh","Leigha","Leighann","Leila",
"Leilani","Leisa","Leisha","Lekisha","Lela","Lelah","Leland","Lelia","Lemuel","Len","Lillia","Lilliam","Lillian","Lilliana","Lillie","Lilly",
"Lily","Lin","Lina","Lincoln","Linda","Lindsay","Lindsay","Lindsey","Lindsey","Lorelei","Loren","Loren","Lorena","Lorene","Lorenza","Lorenzo",
"Loreta","Loretta","Lorette","Lori","Loria","Loriann","Lorie","Lorilee","Lorina","Lucius","Lucrecia","Lucretia","Lucy","Ludie","Ludivina","Lue",
"Luella","Luetta","Luigi","Luis","Luis","Luisa","Luise","Madelaine","Madeleine","Madelene","Madeline","Madelyn","Madge","Madie","Madison","Madlyn",
"Madonna","Mae","Mallory","Malorie","Malvina","Mamie","Mammie","Man","Man","Mana","Manda","Margrett","Marguerita","Marguerite","Margurite","Margy",
"Marhta","Mari","Maria","Maria","Mariah","Mariam","Marian","Mariana","Marianela","Mariann","Marianna","Marianne","Marvella","Marvin","Marvis","Marx",
"Mary","Mary","Marya","Maryalice","Maryam","Maryann","Maryanna","Maryanne","Marybelle","Marybeth","Melba","Melda","Melia","Melida","Melina","Melinda",
"Melisa","Melissa","Melissia","Melita","Mellie","Mellisa","Mellissa","Melodee","Melodi","Melodie","Melody","Melonie","Melony","Mindy","Minerva","Ming",
"Minh","Minh","Minna","Minnie","Minta","Miquel","Mira","Miranda","Mireille","Mirella","Mireya","Miriam","Mirian","Mirna","Mirta","Mozell","Mozella",
"Mozelle","Mui","Muoi","Muriel","Murray","My","Myesha","Myles","Myong","Nevada","Neville","Newton","Nga","Ngan","Ngoc","Nguyet","Nia","Nichelle",
"Nichol","Nicholas","Nichole","Novella","Nu","Nubia","Numbers","Numbers","Nydia","Nyla","Obdulia","Ocie","Octavia","Octavio","Oda","Odelia","Odell",
"Odell","Odessa","Odette","Odilia","Pat","Pat","Patience","Patria","Patrica","Patrice","Patricia","Patricia","Patrick","Patrick","Patrina","Patsy",
"Patti","Pattie","Patty","Peg","Peggie","Peggy","Pei","Penelope","Penney","Penni","Quintin","Quinton","Quyen","Rachael","Rachal","Racheal","Rachel",
"Rachele","Rachell","Rachelle","Rebeca","Rebecca","Rebecka","Rebekah","Reda","Reed","Reena","Refugia","Refugio","Refugio","Regan","Regena","Regenia",
"Reggie","Regina","Reginald","Regine","Riva","Rivka","Rob","Robbi","Robbie","Robbie","Robbin","Robby","Robbyn","Robena","Rose","Roseann","Roseanna",
"Roseanne","Roselee","Roselia","Roseline","Rosella","Roselle","Roselyn","Rosemarie","Rosemary","Rosena","Rosenda","Rosendo","Rosetta","Rosette",
"Samantha","Samara","Samatha","Samella","Samira","Sammie","Sammie","Sammy","Sammy","Samual","Samuel","Samuel","Sana","Sanda","Sandee","Sandi","Sandie",
"Sandra","Sandy","Shanda","Shandi","Shandra","Shane","Shane","Shaneka","Shanel","Shanell","Shanelle","Shani","Shanice","Shanika","Shawana","Shawanda",
"Shawanna","Shawn","Shawn","Shawna","Shawnda","Shawnee","Shawnna","Shawnta","Shay","Shirley","Shirly","Shizue","Shizuko","Shon","Shona","Shonda",
"Shondra","Shonna","Shonta","Shoshana","Shu","Shyla","Sibyl","Sid","Sidney","Stacee","Stacey","Stacey","Staci","Stacia","Stacie","Stacy","Stacy","Stan",
"Susie","Susy","Suzan","Suzann","Suzanna","Suzanne","Suzette","Suzi","Suzie","Suzy","Svetlana","Tasia","Tatiana","Tatum","Tatyana","Taunya","Tawana",
"Tawanda","Tawanna","Tawna","Tawny","Tawnya","Taylor","Taylor","Theressa","Theron","Thersa","Thi","Thomas","Thomas","Thomasena","Thomasina","Thomasine",
"Thora","Thresa","Thu","Thurman","Thuy","Tia","Tiana","Tianna",
"Torri","Torrie","Tory","Tory","Tosha","Toshia","Toshiko","Tova","Towanda","Toya","Tracee","Tracey","Tracey","Traci","Tracie","Tracy","Tracy","Tran",
"Trang","Travis",

"Van","Van","Vance","Vanda","Vanesa","Vanessa","Vanetta","Vania","Vanita","Vanna","Vannesa","Vannessa","Vashti","Vasiliki","Vaughn","Veda","Velda","Velia",
"Vella",

"Vivienne","Von","Voncile","Vonda","Vonnie","Wade","Wai","Waldo","Walker","Wallace","Wally","Walter","Walter","Walton","Waltraud","Wan",
"Xavier","Xenia","Xiao","Xiomara","Xochitl","Xuan","Yadira","Yaeko","Yael","Yahaira",
			"Yajaira","Yan","Yang","Yanira","Yasmin","Yasmine",
			"Yasuko" , "Yee" , "Yelena" , "Yen" , "Yer" , "Yesenia" , "Yessenia" , "Yetta" , "Yevette" , 
			"Yi" , "Ying" , "Yoko" , "Yolonda" , "Yon" , "Yong" ,"Yong" , "Yun" , "Zofia" ,"Zoila" , "Zola" 

	};
	
	public String getDescription(Integer rating) {
		int i = random.nextInt(this.descriptions.length);
		String description = descriptions[i].split(":")[1];
		if (rating <= 5 && rating >= 0) {
			int val = -1;
			while (rating != val) {
				i = random.nextInt(this.descriptions.length);
				description = descriptions[i].split(":")[1];
				val = Integer.valueOf(descriptions[i].split(":")[0]);
			}
		}
		return description;
	}
	
	public String getName() {
		int i = random.nextInt(this.names.length);
		return names[i];
	}
	
	public Integer getRating() {

		int i = random.nextInt(5) + 1;
		return i;
	}
}
