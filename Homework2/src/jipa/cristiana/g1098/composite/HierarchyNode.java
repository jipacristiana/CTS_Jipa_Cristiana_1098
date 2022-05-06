package jipa.cristiana.g1098.composite;

public abstract class HierarchyNode {

	public abstract String getName();
	public abstract String getPosition();
	public abstract double getSalary();
	
	public String getInfo()
	{
		return this.getName() + " - "+ this.getPosition();
	}
	
	public void addChildNode(HierarchyNode node)
	{
		throw new UnsupportedOperationException();
	}
	
	public void deleteChildNode(HierarchyNode node){
		throw new UnsupportedOperationException();
	}
	
	public HierarchyNode getChildNode(int i){
		throw new UnsupportedOperationException();
	}
}
