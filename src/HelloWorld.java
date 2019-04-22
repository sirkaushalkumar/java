/**
 * 
 */

/**
 * @author kkumar6
 *
 */
public class HelloWorld {

    /**
     * @param args
     */
    static void checkAge(int age) {
	if (age < 18) {
	    throw new ArithmeticException(
		    "Access denied - You must be at least 18 years old!!");
	} else {
	    System.out.println(
		    "Access granted - You are old enough!");
	}
    }

    static void myMethod() {
	System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String salutation = "Hello Kaushal Kumar";
	System.out.println(salutation);
	boolean mybool = true;
	System.out.println(mybool);
	float fval = 2.34f;
	System.out.println(fval);
	byte val = 64;
	double dval = val;
	System.out.println(val);
	System.out.println(dval);
	String txt = "Hello Kaushal";
	System.out
		.println("The length of text which you want is "
			+ txt.length() + ".");
	String txt1 = "`Kaushal Kumar`";
	System.out.println(txt1.toUpperCase());
	System.out.println(txt1.toLowerCase());
	System.out.println(txt1.indexOf("Kumar"));
	System.out.println(Math.sqrt(-256));
	byte x = 4;
	System.out.println(Math.expm1(x));
	boolean isJavaFun = true;
	boolean isFishTasty = false;
	System.out.println(isJavaFun);
	System.out.println(isFishTasty);
	System.out.println(10 > 9);
	int l = 2;
	int m = 2;
	if (l > m) {
	    System.out.println("l is greater than m");
	} else if (l < m) {
	    System.out.println("l is smaller than m");
	} else {
	    System.out.println("l is equal to m");
	}
	boolean n = true;
	String result = (n == true) ? ("True Data")
		: ("False Data");
	System.out.println(result);
	byte day = 6;
	switch (day) {
	case 1:
	    System.out.println("Monday");
	    break;
	case 2:
	    System.out.println("Tuesday");
	    break;
	case 3:
	    System.out.println("Wednesday");
	    break;
	case 4:
	    System.out.println("Thursday");
	    break;
	case 5:
	    System.out.println("Friday");
	    break;
	case 6:
	    System.out.println("Saturday");
	    break;
	case 7:
	    System.out.println("Sunday");
	    break;
	default:
	    System.out.println("Oops! 404 Not Found");
	}
	int i = 0;
	while (i < 8) {
	    System.out.println(i);
	    i++;
	}
	System.out.println("Take a break");
	do {
	    System.out.println(i);
	    i--;
	} while (i > 0);
	System.out.println("Take a break");
	for (int j = 0; j <= 10; j = j + 4) {
	    System.out.println(j);
	}
	System.out.println("Take a break");
	byte[] k = { 1, 2, 3, 4, 5, 6, 7, 8 };
	for (byte o : k) {
	    System.out.println(o);
	}
	System.out.println("Take a break");
	for (int p = 0; p < 10; p++) {
	    if (p == 4) {
		break;
	    }
	    System.out.println(p);
	}
	System.out.println("Take a break");
	for (int q = 0; q < 10; q++) {
	    if (q == 4) {
		continue;
	    }
	    System.out.println(q);
	}
	System.out.println("Take a break");
	int r = 0;
	while (r < 10) {
	    System.out.println(r);
	    r++;
	    if (r == 4) {
		break;
	    }
	}
	System.out.println("Take a break");
	int s = 0;
	while (s < 10) {
	    if (s == 4) {
		s++;
		continue;
	    }
	    System.out.println(s);
	    s++;
	}
	System.out.println("Take a break");
	int[][] myNumbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8 } };
	for (int t = 0; t < myNumbers.length; ++t) {
	    for (int u = 0; u < myNumbers[t].length; ++u) {
		System.out.println(myNumbers[t][u]);
	    }
	}
	System.out.println("Take a break");
	try {
	    int[] Numbers = { 1, 2, 3 };
	    System.out.println(Numbers[1]);
	} catch (Exception e) {
	    System.out.println("Something went wrong.");
	} finally {
	    System.out.println("The 'try catch' is finished.");
	}
	System.out.println("Take a break");
	checkAge(20);
	System.out.println("Take a break");
	myMethod();
	System.out.println("Can we check it worked?");
    }

}
