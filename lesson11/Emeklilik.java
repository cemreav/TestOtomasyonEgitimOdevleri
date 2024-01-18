package lesson11;
import java.util.List;
public class Emeklilik {
    public abstract class Person {
        String name;
        String surname;
        String brithDate;

        public Person(String name, String surname, String brithDate) {
                this.name=name;
                this.surname=surname;
                this.brithDate=brithDate;
        }
        public int emeklilikyasiHesapla(){
                return 0;
        }
    }
    class Erkek extends Emeklilik.Person {
        public Erkek(String name, String surname, String birthDate){
            super(name,surname,birthDate);
        }
        @Override
        public int emeklilikyasiHesapla(){
                return 65;
        }

    }
    class Kadin extends Emeklilik.Person {
        public Kadin(String name,String surname, String birthDate){
            super(name,surname,birthDate);
        }
        @Override
        public int emeklilikyasiHesapla(){
            return 60;
        }
    }
    class Department{
        private Emeklilik.Erkek teamLead;
        private List<Emeklilik.Person> personnelList;
        private List<String> assignmentList;

        public Department(Erkek teamLead) {}
            public void changeTeamLead(Emeklilik.Erkek newTeamLead){
                if (newTeamLead==null){
                    throw new IllegalArgumentException("Yeni team lead boş olamaz");
                }
                this.teamLead=newTeamLead;
            }
            public void addPersonel(Kadin person){
                this.personnelList.add(person);
            }
            public void removePersonel(Emeklilik.Person person){
                this.personnelList.remove(person);
            }
            public void changePersonnel(Emeklilik.Person eskipersonel, Emeklilik.Person yenipersonel){
                int index=this.personnelList.indexOf(eskipersonel);
                this.personnelList.set(index, yenipersonel);
            }
            public void addAssignment(String assignment){
                this.assignmentList.add(assignment);
            }
            public void markAssignmenComplete(String assignment){
                this.assignmentList.remove(assignment);
            }
        public void main(String[] args){
            Erkek teamLead = new Erkek("Team", "Lead", "01-01-1970");
            Department department = new Department(teamLead);

            Kadin person1= new Kadin("Ayşe", "Deniz", "01-01-1975");
            Erkek person2 = new Erkek("Ali", "Gümüş","01-01-1965");

            department.addPersonel(person1);

            department.addAssignment("Görev 1");

            System.out.println(person1);
        }
    }
}
