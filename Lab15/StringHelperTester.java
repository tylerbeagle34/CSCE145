
public class StringHelperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the String Helper Tester");
		System.out.println("\nMeshing harp with fiddle:");
		StringHelper.meshStrings("harp", "fiddle");
		System.out.println("Replacing vowels with the word \"oodle\" in taco:");
		StringHelper.replaceVowelsWithOodle("burrito");
		System.out.println("The weight of the word taco is:");
		StringHelper.weight("taco");
	}

}
