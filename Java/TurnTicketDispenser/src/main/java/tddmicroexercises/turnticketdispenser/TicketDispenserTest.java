package tddmicroexercises.turnticketdispenser;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicketDispenserTest { 

    @Test
    public void shouldIssueTicketsInAscendingOrder() {
        TicketDispenser td = new TicketDispenser();
        TurnTicket ticket1 = td.getTurnTicket();
        TurnTicket ticket2 = td.getTurnTicket();
        
        assertThat(ticket2.getTurnNumber(), is(ticket1.getTurnNumber() + 1));
    }
    
    
}
