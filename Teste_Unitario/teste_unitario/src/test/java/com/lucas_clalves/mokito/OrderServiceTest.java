package com.lucas_clalves.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.AdditionalMatchers.lt;
import static org.mockito.ArgumentMatchers.argThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    private Payment payment = mock(Payment.class);
    private UserService userService = mock(UserService.class);
    private OrderService orderService = new OrderService(userService, payment);

    @Test
    @DisplayName("Deve lançar uma exceção quando o usuário for menor de idade.")
    public void shouldThorwAnExceptionWhenUserIsMinor(){
        
        Order order = new Order("lucas", 15);
        when(userService.isUserMinor(lt(18))).thenReturn(true);
        doNothing().when(payment).pay();

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> orderService.create(order));

        assertEquals("Usuario não pode ser menor de idade", exception.getMessage());

        verify(userService, times(1)).isUserMinor(lt(18));
        verify(payment, times(0)).pay();

    }

    @Test
    @DisplayName("Cria a ordem e esxecuta o pagamento se usuario for de maior")
        public void createsTheOrderAndExecutesThePaymentIfTheUserIsOfLegalAge(){
            Order order = new Order("lucas", 24);
            when(userService.isUserMinor(argThat(age -> age >17))).thenReturn(false);
            doNothing().when(payment).pay();
            
            orderService.create(order);
            
            verify(userService, times(1)).isUserMinor(argThat(age -> age > 17));
            verify(payment, times(1)).pay();;
        }

}
