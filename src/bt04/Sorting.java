package bt04;

import bt02.Student;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
     List<FootballTeam> teamList = new ArrayList<>();

    public List<FootballTeam> getTeamList() {
        return teamList;
    }
    public void setTeamList(List<FootballTeam> teamList) {
        teamList.add(new FootballTeam(1,"Arsenal",11,84));
        teamList.add(new FootballTeam(2,"Chelsea",11,44));
        teamList.add(new FootballTeam(3,"Man City",11,89));
        teamList.add(new FootballTeam(4,"Liverpool",11,67));
        teamList.add(new FootballTeam(5,"Tottenham",11,60));
    }
    // chọn
    public void selectionSort( List<FootballTeam> teamList) {
        for (int i = 0; i < teamList.size() - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < teamList.size(); j++) {
                if (teamList.get(j).getScore() > teamList.get(maxIndex).getScore()) {
                    maxIndex = j;
                }
            }

            FootballTeam temp = teamList.get(maxIndex);
            teamList.set(maxIndex, teamList.get(i));
            teamList.set(i, temp);

        }
    }
    // chèn
    public void insertionSort( List<FootballTeam> teamList) {
        for (int i = 1; i < teamList.size(); i++) {
            FootballTeam key = teamList.get(i);
            int j = i - 1;

            while (j >= 0 && teamList.get(j).getScore() < key.getScore()) {
                teamList.set(j + 1, teamList.get(j));
                j--;
            }
            teamList.set(j + 1, key);
        }


    }
    // nổi bọt
    public void bubbleSort ( List<FootballTeam> teamList){
        for (int i = 0; i < teamList.size() - 1; i++) {
            for (int j = 0; j < teamList.size() - i - 1; j++) {
                if (teamList.get(j).getScore() < teamList.get(j + 1).getScore()) {
                    FootballTeam temp = teamList.get(j);
                    teamList.set(j, teamList.get(j + 1));
                    teamList.set(j + 1, temp);
                }
            }
        }
    }
}
