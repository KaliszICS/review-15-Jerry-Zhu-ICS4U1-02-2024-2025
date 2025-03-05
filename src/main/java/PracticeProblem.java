public class PracticeProblem {

	public static void main(String args[]) {

	}
public static int goodString(String word){
	String c;
	int leastOp;
	c = word.charAt(0) + "";
	leastOp =  word.length() - (word.lastIndexOf(c) - word.indexOf(c) + 1) ;
	for (int i = 1; i < word.length(); i++){
c = word.charAt(i) + "";
if(leastOp >  word.length() - (word.lastIndexOf(c) - word.indexOf(c) + 1)){
		leastOp =  word.length() - (word.lastIndexOf(c) - word.indexOf(c) + 1) ;
	}
}
if(word.length() - leastOp < 2){
	return -1;
}
return leastOp;
}
}
