package helloworld;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Dept {
	private Person leader;
	private int depno;
	private List<Person> listEmps;
	private Set<Person> setEmps;
	private Map<String, Person> mapEmps;
	private Properties props;

	public void printDept() {
		System.out.println("部门号：" + depno);
		System.out.println("领导：");
		leader.printInfo();
	}

	public Person getLeader() {
		return leader;
	}

	public void setLeader(Person leader) {
		this.leader = leader;
	}

	public int getDepno() {
		return depno;
	}

	public void setDepno(int depno) {
		this.depno = depno;
	}

	public List<Person> getListEmps() {
		return listEmps;
	}

	public void setListEmps(List<Person> listEmps) {
		this.listEmps = listEmps;
	}

	public Set<Person> getSetEmps() {
		return setEmps;
	}

	public void setSetEmps(Set<Person> setEmps) {
		this.setEmps = setEmps;
	}

	public Map<String, Person> getMapEmps() {
		return mapEmps;
	}

	public void setMapEmps(Map<String, Person> mapEmps) {
		this.mapEmps = mapEmps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
}
