/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tarsys.checkout.servicio.listeners;

import java.util.EventListener;

/**
 *
 * @author tarradelo
 */
public interface ProcesoLoginListener extends EventListener {
    void ProcesoLogin(EvProcesoLogin evt);
}
