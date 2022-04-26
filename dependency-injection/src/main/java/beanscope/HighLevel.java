package beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HighLevel {
    @Autowired
    private LowLevel lowLevelBean;

    public LowLevel getLowLevelBean() {
        return lowLevelBean;
    }
    
}
