package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class State internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.State,
) : Construct(cdkObject), IChainable {
  public open fun addPrefix(x: String) {
    unwrap(this).addPrefix(x)
  }

  public open fun bindToGraph(graph: StateGraph) {
    unwrap(this).bindToGraph(graph.let(StateGraph::unwrap))
  }

  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun id(): String = unwrap(this).getId()

  public override fun startState(): State = unwrap(this).getStartState().let(State::wrap)

  public open fun stateId(): String = unwrap(this).getStateId()

  public open fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.State,
  ) : State(cdkObject)

  public companion object {
    public open fun filterNextables(states: List<State>): List<INextable> =
        software.amazon.awscdk.services.stepfunctions.State.filterNextables(states.map(State::unwrap)).map(INextable::wrap)

    public open fun findReachableEndStates(start: State): List<State> =
        software.amazon.awscdk.services.stepfunctions.State.findReachableEndStates(start.let(State::unwrap)).map(State::wrap)

    public open fun findReachableEndStates(start: State, options: FindStateOptions): List<State> =
        software.amazon.awscdk.services.stepfunctions.State.findReachableEndStates(start.let(State::unwrap),
        options.let(FindStateOptions::unwrap)).map(State::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ff9032f5265cc45d2fff5d628ac563f648bfb67e4d786b9ad0937f2bc31aad2")
    public open fun findReachableEndStates(start: State,
        options: FindStateOptions.Builder.() -> Unit): List<State> = findReachableEndStates(start,
        FindStateOptions(options))

    public open fun findReachableStates(start: State): List<State> =
        software.amazon.awscdk.services.stepfunctions.State.findReachableStates(start.let(State::unwrap)).map(State::wrap)

    public open fun findReachableStates(start: State, options: FindStateOptions): List<State> =
        software.amazon.awscdk.services.stepfunctions.State.findReachableStates(start.let(State::unwrap),
        options.let(FindStateOptions::unwrap)).map(State::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50910c2105c823e8562e9a0f8e2aa4aab19c86635a763fa9ab48e94fec614bf9")
    public open fun findReachableStates(start: State, options: FindStateOptions.Builder.() -> Unit):
        List<State> = findReachableStates(start, FindStateOptions(options))

    public open fun prefixStates(root: IConstruct, prefix: String) {
      software.amazon.awscdk.services.stepfunctions.State.prefixStates(root.let(IConstruct::unwrap),
          prefix)
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.State): State =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: State): software.amazon.awscdk.services.stepfunctions.State =
        (wrapped as Wrapper).cdkObject
  }
}
