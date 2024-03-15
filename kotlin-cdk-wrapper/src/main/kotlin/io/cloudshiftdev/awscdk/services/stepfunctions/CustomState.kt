@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * State defined by supplying Amazon States Language (ASL) in the state machine.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * // create a table
 * Table table = Table.Builder.create(this, "montable")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .build();
 * Pass finalStatus = new Pass(this, "final step");
 * // States language JSON to put an item into DynamoDB
 * // snippet generated from
 * https://docs.aws.amazon.com/step-functions/latest/dg/tutorial-code-snippet.html#tutorial-code-snippet-1
 * Map&lt;String, Object&gt; stateJson = Map.of(
 * "Type", "Task",
 * "Resource", "arn:aws:states:::dynamodb:putItem",
 * "Parameters", Map.of(
 * "TableName", table.getTableName(),
 * "Item", Map.of(
 * "id", Map.of(
 * "S", "MyEntry"))),
 * "ResultPath", null);
 * // custom state which represents a task to insert data into DynamoDB
 * CustomState custom = CustomState.Builder.create(this, "my custom task")
 * .stateJson(stateJson)
 * .build();
 * // catch errors with addCatch
 * Pass errorHandler = new Pass(this, "handle failure");
 * custom.addCatch(errorHandler);
 * // retry the task if something goes wrong
 * custom.addRetry(RetryProps.builder()
 * .errors(List.of(Errors.ALL))
 * .interval(Duration.seconds(10))
 * .maxAttempts(5)
 * .build());
 * Chain chain = Chain.start(custom).next(finalStatus);
 * StateMachine sm = StateMachine.Builder.create(this, "StateMachine")
 * .definitionBody(DefinitionBody.fromChainable(chain))
 * .timeout(Duration.seconds(30))
 * .comment("a super cool state machine")
 * .build();
 * // don't forget permissions. You need to assign them
 * table.grantWriteData(sm);
 * ```
 */
public open class CustomState internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.CustomState,
) : State(cdkObject), IChainable, INextable {
  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable): CustomState =
      unwrap(this).addCatch(handler.let(IChainable::unwrap)).let(CustomState::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable, props: CatchProps): CustomState =
      unwrap(this).addCatch(handler.let(IChainable::unwrap),
      props.let(CatchProps::unwrap)).let(CustomState::wrap)

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
  @JvmName("adaa20bd07e28fb7ea3c3501c09f4e814a7db5b38f512959ba2b8e8363c50e65")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit): CustomState =
      addCatch(handler, CatchProps(props))

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(): CustomState = unwrap(this).addRetry().let(CustomState::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(props: RetryProps): CustomState =
      unwrap(this).addRetry(props.let(RetryProps::unwrap)).let(CustomState::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c02a3a1fba1376165cb275b716affc038930e660dd6bbe1f83a63987816dc527")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): CustomState =
      addRetry(RetryProps(props))

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
   * Returns the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.CustomState].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Amazon States Language (JSON-based) definition of the state.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * @param stateJson Amazon States Language (JSON-based) definition of the state. 
     */
    public fun stateJson(stateJson: Map<String, Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CustomState.Builder =
        software.amazon.awscdk.services.stepfunctions.CustomState.Builder.create(scope, id)

    /**
     * Amazon States Language (JSON-based) definition of the state.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html)
     * @param stateJson Amazon States Language (JSON-based) definition of the state. 
     */
    override fun stateJson(stateJson: Map<String, Any>) {
      cdkBuilder.stateJson(stateJson)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CustomState =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomState {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomState(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CustomState):
        CustomState = CustomState(cdkObject)

    internal fun unwrap(wrapped: CustomState):
        software.amazon.awscdk.services.stepfunctions.CustomState = wrapped.cdkObject
  }
}
