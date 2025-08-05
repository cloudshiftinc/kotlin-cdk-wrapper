@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A collection of connected states.
 *
 * A StateGraph is used to keep track of all states that are connected (have
 * transitions between them). It does not include the substatemachines in
 * a Parallel's branches: those are their own StateGraphs, but the graphs
 * themselves have a hierarchical relationship as well.
 *
 * By assigning states to a definitive StateGraph, we verify that no state
 * machines are constructed. In particular:
 *
 * * Every state object can only ever be in 1 StateGraph, and not inadvertently
 * be used in two graphs.
 * * Every stateId must be unique across all states in the entire state
 * machine.
 *
 * All policy statements in all states in all substatemachines are bubbled so
 * that the top-level StateMachine instantiation can read them all and add
 * them to the IAM Role.
 *
 * You do not need to instantiate this class; it is used internally.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * State state;
 * StateGraph stateGraph = new StateGraph(state, "graphDescription");
 * ```
 */
public open class StateGraph(
  cdkObject: software.amazon.awscdk.services.stepfunctions.StateGraph,
) : CdkObject(cdkObject) {
  public constructor(startState: State, graphDescription: String) :
      this(software.amazon.awscdk.services.stepfunctions.StateGraph(startState.let(State.Companion::unwrap),
      graphDescription)
  )

  /**
   * Binds this StateGraph to the StateMachine it defines and updates state machine permissions.
   *
   * @param stateMachine 
   */
  public open fun bind(stateMachine: StateMachine) {
    unwrap(this).bind(stateMachine.let(StateMachine.Companion::unwrap))
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
    unwrap(this).registerPolicyStatement(statement.let(PolicyStatement.Companion::unwrap))
  }

  /**
   * Register a Policy Statement used by states in this graph.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).registerState(state.let(State.Companion::unwrap))
  }

  /**
   * Register this graph as a child of the given graph.
   *
   * Resource changes will be bubbled up to the given graph.
   *
   * @param graph 
   */
  public open fun registerSuperGraph(graph: StateGraph) {
    unwrap(this).registerSuperGraph(graph.let(StateGraph.Companion::unwrap))
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
    unwrap(this).setTimeout(`value`.let(Duration.Companion::unwrap))
  }

  /**
   * Return the Amazon States Language JSON for this graph.
   *
   * @param queryLanguage
   */
  public open fun toGraphJson(): ObjectNode = unwrap(this).toGraphJson()

  /**
   * Return the Amazon States Language JSON for this graph.
   *
   * @param queryLanguage
   */
  public open fun toGraphJson(queryLanguage: QueryLanguage): ObjectNode =
      unwrap(this).toGraphJson(queryLanguage.let(QueryLanguage.Companion::unwrap))

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateGraph):
        StateGraph = StateGraph(cdkObject)

    internal fun unwrap(wrapped: StateGraph):
        software.amazon.awscdk.services.stepfunctions.StateGraph = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.StateGraph
  }
}
