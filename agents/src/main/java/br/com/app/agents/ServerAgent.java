package br.com.app.agents;

import br.com.app.facades.ServerFacade;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class ServerAgent extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                ServerFacade.teste();
            }
        });
    }
}
