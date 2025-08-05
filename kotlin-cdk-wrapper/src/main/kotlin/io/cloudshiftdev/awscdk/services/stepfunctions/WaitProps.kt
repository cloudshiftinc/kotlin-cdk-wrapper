@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a Wait state.
 *
 * Example:
 *
 * ```
 * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
 * seconds")
 * .expression("$.waitMilliseconds / 1000")
 * .resultPath("$.waitSeconds")
 * .build();
 * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
 * // Note: this is a string inside a string.
 * .expression("`Now waiting ${$.waitSeconds} seconds...`")
 * .runtime(Runtime.NODEJS_LATEST)
 * .resultPath("$.message")
 * .build();
 * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
 * .topic(new Topic(this, "cool-topic"))
 * .message(TaskInput.fromJsonPathAt("$.message"))
 * .resultPath("$.sns")
 * .build();
 * Wait wait = Wait.Builder.create(this, "Wait")
 * .time(WaitTime.secondsPath("$.waitSeconds"))
 * .build();
 * StateMachine.Builder.create(this, "StateMachine")
 * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
 * .build();
 * ```
 */
public interface WaitProps : StateBaseProps, AssignableStateOptions {
  /**
   * Wait duration.
   */
  public fun time(): WaitTime

  /**
   * A builder for [WaitProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param time Wait duration. 
     */
    public fun time(time: WaitTime)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.WaitProps.Builder =
        software.amazon.awscdk.services.stepfunctions.WaitProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param time Wait duration. 
     */
    override fun time(time: WaitTime) {
      cdkBuilder.time(time.let(WaitTime.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.WaitProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.WaitProps,
  ) : CdkObject(cdkObject),
      WaitProps {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Wait duration.
     */
    override fun time(): WaitTime = unwrap(this).getTime().let(WaitTime::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WaitProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.WaitProps): WaitProps
        = CdkObjectWrappers.wrap(cdkObject) as? WaitProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WaitProps): software.amazon.awscdk.services.stepfunctions.WaitProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.WaitProps
  }
}
