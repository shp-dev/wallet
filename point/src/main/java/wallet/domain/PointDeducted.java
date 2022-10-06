package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PointDeducted extends AbstractEvent {

    private Long id;
    private String holder;
    private Long amount;

    public PointDeducted(Point aggregate){
        super(aggregate);
    }
    public PointDeducted(){
        super();
    }
}
