package quiz;

import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.control.*;

public class ResultServiceImpl{
	
	public Inquiry result(Parent root) {
		Inquiry into = new Inquiry();
		ArrayList<RadioButton> radioTravel = new ArrayList<>();
		for(int i=0;i < 3;i++) {
			radioTravel.add((RadioButton)root.lookup("#radioTr"+i));
			if(radioTravel.get(i).isSelected())
				into.setTravel(i);
		}
		ArrayList<RadioButton> radioAge = new ArrayList<>();
		for(int i=0;i<4;i++) {
			radioAge.add((RadioButton)root.lookup("#radioAge"+i));
			if(radioAge.get(i).isSelected())
				into.setAge(i);
		}
		RadioButton man = (RadioButton)root.lookup("#radioGender1");
		if(man.isSelected())
			into.setGender(1);
		else
			into.setGender(0);
		return into; //into값은 위의 3가지 arraylist가 저장된 값(setter로 전달됐기 때문에)
	}
}
