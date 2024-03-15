@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class StateGraph internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.StateGraph,
) : CdkObject(cdkObject) {
  public open fun bind(stateMachine: StateMachine) {
    unwrap(this).bind(stateMachine.let(StateMachine::unwrap))
  }

  public open fun policyStatements(): List<PolicyStatement> =
      unwrap(this).getPolicyStatements().map(PolicyStatement::wrap)

  public open fun registerPolicyStatement(statement: PolicyStatement) {
    unwrap(this).registerPolicyStatement(statement.let(PolicyStatement::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("586708ebe856663e400a315ea4a4aa904b08df442609265374cd1f307d39e3a7")
  public open fun registerPolicyStatement(statement: PolicyStatement.Builder.() -> Unit): Unit =
      registerPolicyStatement(PolicyStatement(statement))

  public open fun registerState(state: State) {
    unwrap(this).registerState(state.let(State::unwrap))
  }

  public open fun registerSuperGraph(graph: StateGraph) {
    unwrap(this).registerSuperGraph(graph.let(StateGraph::unwrap))
  }

  public open fun startState(): State = unwrap(this).getStartState().let(State::wrap)

  public open fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public open fun timeout(`value`: Duration) {
    unwrap(this).setTimeout(`value`.let(Duration::unwrap))
  }

  public open fun toGraphJson(): ObjectNode = unwrap(this).toGraphJson()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateGraph):
        StateGraph = StateGraph(cdkObject)

    internal fun unwrap(wrapped: StateGraph):
        software.amazon.awscdk.services.stepfunctions.StateGraph = wrapped.cdkObject
  }
}
