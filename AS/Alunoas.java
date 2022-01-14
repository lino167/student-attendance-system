package AS;

import java.util.ArrayList;
import java.util.List;
import POP.Sala;

public class Alunoas {

    private List<Sala> statusList = new ArrayList<>();

    public List<Sala> getSalaList() {
        return statusList;
    }

    public void setSalaList(List<Sala> statusList) {
        this.statusList = statusList;
    }
    public void addNovaChamada(Sala sala){
        statusList.add(sala);
    }
}
