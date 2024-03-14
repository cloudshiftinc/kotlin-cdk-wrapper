package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class StateGraph internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.StateGraph,
) : CdkObject(cdkObject) {
  /**
   * Binds this StateGraph to the StateMachine it defines and updates state machine permissions.
   *
   * @param stateMachine 
   */
  public open fun bind(stateMachine: StateMachine) {
    unwrap(this).bind(stateMachine.let(StateMachine::unwrap))
  }

  /**
   * The accumulated policy statements.
   */
  public open fun policyStatements(): List<PolicyStatement> =
      unwrap(this).getPolicyStatements().map(PolicyStatement::wrap)

  /**
   * Register a Policy Statement used by states in this graph.
   *
   * @param statement 
   */
  public open fun registerPolicyStatement(statement: PolicyStatement) {
    unwrap(this).registerPolicyStatement(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Register a Policy Statement used by states in this graph.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("586708ebe856663e400a315ea4a4aa904b08df442609265374cd1f307d39e3a7")
  public open fun registerPolicyStatement(statement: PolicyStatement.Builder.() -> Unit): Unit =
      registerPolicyStatement(PolicyStatement(statement))

  /**
   * Register a state as part of this graph.
   *
   * Called by State.bindToGraph().
   *
   * @param state 
   */
  public open fun registerState(state: State) {
    unwrap(this).registerState(state.let(State::unwrap))
  }

  /**
   * Register this graph as a child of the given graph.
   *
   * Resource changes will be bubbled up to the given graph.
   *
   * @param graph 
   */
  public open fun registerSuperGraph(graph: StateGraph) {
    unwrap(this).registerSuperGraph(graph.let(StateGraph::unwrap))
  }

  /**
   * state that gets executed when the state machine is launched.
   */
  public open fun startState(): State = unwrap(this).getStartState().let(State::wrap)

  /**
   * Set a timeout to render into the graph JSON.
   *
   * Read/write. Only makes sense on the top-level graph, subgraphs
   * do not support this feature.
   *
   * Default: No timeout
   */
  public open fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * Set a timeout to render into the graph JSON.
   *
   * Read/write. Only makes sense on the top-level graph, subgraphs
   * do not support this feature.
   *
   * Default: No timeout
   */
  public open fun timeout(`value`: Duration) {
    unwrap(this).setTimeout(`value`.let(Duration::unwrap))
  }

  /**
   * Return the Amazon States Language JSON for this graph.
   */
  public open fun toGraphJson(): ObjectNode = unwrap(this).toGraphJson()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateGraph):
        StateGraph = StateGraph(cdkObject)

    internal fun unwrap(wrapped: StateGraph):
        software.amazon.awscdk.services.stepfunctions.StateGraph = wrapped.cdkObject
  }
}
