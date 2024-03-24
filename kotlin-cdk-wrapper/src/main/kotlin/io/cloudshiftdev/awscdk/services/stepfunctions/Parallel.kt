@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Parallel state in the state machine.
 *
 * A Parallel state can be used to run one or more state machines at the same
 * time.
 *
 * The Result of a Parallel state is an array of the results of its substatemachines.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.Stack;
 * import software.constructs.Construct;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * public class MyJobProps {
 * private String jobFlavor;
 * public String getJobFlavor() {
 * return this.jobFlavor;
 * }
 * public MyJobProps jobFlavor(String jobFlavor) {
 * this.jobFlavor = jobFlavor;
 * return this;
 * }
 * }
 * public class MyJob extends StateMachineFragment {
 * public final State startState;
 * public final INextable[] endStates;
 * public MyJob(Construct parent, String id, MyJobProps props) {
 * super(parent, id);
 * Choice choice = new Choice(this, "Choice").when(Condition.stringEquals("$.branch", "left"), new
 * Pass(this, "Left Branch")).when(Condition.stringEquals("$.branch", "right"), new Pass(this, "Right
 * Branch"));
 * // ...
 * this.startState = choice;
 * this.endStates = choice.afterwards().getEndStates();
 * }
 * }
 * public class MyStack extends Stack {
 * public MyStack(Construct scope, String id) {
 * super(scope, id);
 * // Do 3 different variants of MyJob in parallel
 * Parallel parallel = new Parallel(this, "All jobs").branch(new MyJob(this, "Quick", new
 * MyJobProps().jobFlavor("quick")).prefixStates()).branch(new MyJob(this, "Medium", new
 * MyJobProps().jobFlavor("medium")).prefixStates()).branch(new MyJob(this, "Slow", new
 * MyJobProps().jobFlavor("slow")).prefixStates());
 * StateMachine.Builder.create(this, "MyStateMachine")
 * .definitionBody(DefinitionBody.fromChainable(parallel))
 * .build();
 * }
 * }
 * ```
 */
public open class Parallel(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Parallel,
) : State(cdkObject), INextable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.Parallel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ParallelProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Parallel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ParallelProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ParallelProps.Builder.() -> Unit,
  ) : this(scope, id, ParallelProps(props)
  )

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable): Parallel =
      unwrap(this).addCatch(handler.let(IChainable::unwrap)).let(Parallel::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable, props: CatchProps): Parallel =
      unwrap(this).addCatch(handler.let(IChainable::unwrap),
      props.let(CatchProps::unwrap)).let(Parallel::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b719e950ad2c8299d268244d76691f679b7fa802f14b21a3fa3a73374f60d09")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit): Parallel =
      addCatch(handler, CatchProps(props))

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(): Parallel = unwrap(this).addRetry().let(Parallel::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(props: RetryProps): Parallel =
      unwrap(this).addRetry(props.let(RetryProps::unwrap)).let(Parallel::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("001441e679998fc0a3c1b7097ba22af8e29f36fc68df94c1378ef16674041fba")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): Parallel =
      addRetry(RetryProps(props))

  /**
   * Overwrites State.bindToGraph. Adds branches to the Parallel state here so that any necessary
   * prefixes are appended first.
   *
   * @param graph 
   */
  public override fun bindToGraph(graph: StateGraph) {
    unwrap(this).bindToGraph(graph.let(StateGraph::unwrap))
  }

  /**
   * Define one or more branches to run in parallel.
   *
   * @param branches 
   */
  public open fun branch(vararg branches: IChainable): Parallel =
      unwrap(this).branch(*branches.map{CdkObjectWrappers.unwrap(it) as
      software.amazon.awscdk.services.stepfunctions.IChainable}.toTypedArray()).let(Parallel::wrap)

  /**
   * Continuable states of this Chainable.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * Continue normal execution with the given state.
   *
   * @param next 
   */
  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Parallel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state. 
     */
    public fun comment(comment: String)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Parallel.Builder =
        software.amazon.awscdk.services.stepfunctions.Parallel.Builder.create(scope, id)

    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Parallel = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Parallel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Parallel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Parallel): Parallel =
        Parallel(cdkObject)

    internal fun unwrap(wrapped: Parallel): software.amazon.awscdk.services.stepfunctions.Parallel =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Parallel
  }
}
