package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("dao2")   // retirez ces deux lignes de @Qualifier pour l'étape 5 (résultat 200.0)
    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}