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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Pass in the state machine.
 *
 * A Pass state can be used to transform the current execution's state.
 *
 * Example:
 *
 * ```
 * // Define a state machine with one Pass state
 * StateMachine child = StateMachine.Builder.create(this, "ChildStateMachine")
 * .definition(Chain.start(new Pass(this, "PassState")))
 * .build();
 * // Include the state machine in a Task state with callback pattern
 * StepFunctionsStartExecution task = StepFunctionsStartExecution.Builder.create(this, "ChildTask")
 * .stateMachine(child)
 * .integrationPattern(IntegrationPattern.WAIT_FOR_TASK_TOKEN)
 * .input(TaskInput.fromObject(Map.of(
 * "token", JsonPath.getTaskToken(),
 * "foo", "bar")))
 * .name("MyExecutionName")
 * .build();
 * // Define a second state machine with the Task state above
 * // Define a second state machine with the Task state above
 * StateMachine.Builder.create(this, "ParentStateMachine")
 * .definition(task)
 * .build();
 * ```
 */
public open class Pass(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Pass,
) : State(cdkObject),
    INextable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.Pass(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PassProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Pass(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(PassProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PassProps.Builder.() -> Unit,
  ) : this(scope, id, PassProps(props)
  )

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
      unwrap(this).next(next.let(IChainable.Companion::unwrap)).let(Chain::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Pass].
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
     * Parameters pass a collection of key-value pairs, either static values or JSONPath expressions
     * that select from the input.
     *
     * Default: No parameters
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters)
     * @param parameters Parameters pass a collection of key-value pairs, either static values or
     * JSONPath expressions that select from the input. 
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * If given, treat as the result of this operation.
     *
     * Can be used to inject or replace the current execution state.
     *
     * Default: No injected result
     *
     * @param result If given, treat as the result of this operation. 
     */
    public fun result(result: Result)

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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Pass.Builder =
        software.amazon.awscdk.services.stepfunctions.Pass.Builder.create(scope, id)

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
     * Parameters pass a collection of key-value pairs, either static values or JSONPath expressions
     * that select from the input.
     *
     * Default: No parameters
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-parameters)
     * @param parameters Parameters pass a collection of key-value pairs, either static values or
     * JSONPath expressions that select from the input. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * If given, treat as the result of this operation.
     *
     * Can be used to inject or replace the current execution state.
     *
     * Default: No injected result
     *
     * @param result If given, treat as the result of this operation. 
     */
    override fun result(result: Result) {
      cdkBuilder.result(result.let(Result.Companion::unwrap))
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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Pass = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Pass {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Pass(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Pass): Pass =
        Pass(cdkObject)

    internal fun unwrap(wrapped: Pass): software.amazon.awscdk.services.stepfunctions.Pass =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Pass
  }
}
