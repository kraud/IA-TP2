package simulator;


import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.solver.Solve;
import frsf.cidisi.faia.state.AgentState;

import SistemaDeProducciones.Problema;

public abstract class KnowledgeBasedAgent extends Agent {

    protected Solve solver;
    protected AgentState state;

    public KnowledgeBasedAgent() {
    }

    public abstract void see(Perception p);

    public Solve getSolver() {
        return solver;
    }

    protected void setSolver(Solve solver) {
        this.solver = solver;
    }

    public AgentState getAgentState() {
        return state;
    }

    protected void setAgentState(AgentState agentState) {
        this.state = agentState;
    }

    private Problema problema;

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }
}
