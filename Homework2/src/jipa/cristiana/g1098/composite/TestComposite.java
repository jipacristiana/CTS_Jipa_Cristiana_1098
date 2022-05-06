package jipa.cristiana.g1098.composite;

public class TestComposite {

public static void main(String[] args) {
		
		InternalDanceStudioStructure departamentDance = new InternalDanceStudioStructure("Dance Department", "These are the instructors of the Dance Studio.");
		
	
		InternalDanceStudioStructure teamStreet = new InternalDanceStudioStructure ("Street dance team", "The street dance team");
		
		teamStreet.addChildNode(new Employee("Cris", "HR"));
		teamStreet.addChildNode(new Employee("David", "HR"));
		
	
		departamentDance.addChildNode(new Employee("Marilu", "Department Manager"));
		departamentDance.addChildNode(teamStreet);
	
		System.out.println(departamentDance.getInfo());
		
	}

}
