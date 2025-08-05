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
 * Define a Wait state in the state machine.
 *
 * A Wait state can be used to delay execution of the state machine for a while.
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
public open class Wait(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Wait,
) : State(cdkObject),
    INextable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WaitProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Wait(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(WaitProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WaitProps.Builder.() -> Unit,
  ) : this(scope, id, WaitProps(props)
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
   *
   * @param topLevelQueryLanguage
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * Return the Amazon States Language object for this state.
   *
   * @param topLevelQueryLanguage
   */
  public override fun toStateJson(topLevelQueryLanguage: QueryLanguage): ObjectNode =
      unwrap(this).toStateJson(topLevelQueryLanguage.let(QueryLanguage.Companion::unwrap))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Wait].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    public fun comment(comment: String)

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Wait duration.
     *
     * @param time Wait duration. 
     */
    public fun time(time: WaitTime)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Wait.Builder =
        software.amazon.awscdk.services.stepfunctions.Wait.Builder.create(scope, id)

    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     * @param assign Workflow variables to store in this step. 
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * A comment describing this state.
     *
     * Default: No comment
     *
     * @param comment A comment describing this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     *
     * @param queryLanguage The name of the query language used by the state. 
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
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

    /**
     * Wait duration.
     *
     * @param time Wait duration. 
     */
    override fun time(time: WaitTime) {
      cdkBuilder.time(time.let(WaitTime.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Wait = cdkBuilder.build()
  }

  public companion object {
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: WaitJsonPathProps,
    ): Wait =
        software.amazon.awscdk.services.stepfunctions.Wait.jsonPath(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(WaitJsonPathProps.Companion::unwrap)).let(Wait::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5d659f49c35acd4292efd15b2d881576bcb8af21e72f1bcf2c7d1e873e1ca46")
    public fun jsonPath(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: WaitJsonPathProps.Builder.() -> Unit,
    ): Wait = jsonPath(scope, id, WaitJsonPathProps(props))

    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: WaitJsonataProps,
    ): Wait =
        software.amazon.awscdk.services.stepfunctions.Wait.jsonata(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, props.let(WaitJsonataProps.Companion::unwrap)).let(Wait::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52f90f808d0b60c358db36e93ddae812a681a73ac277a3873282517e9effc868")
    public fun jsonata(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      props: WaitJsonataProps.Builder.() -> Unit,
    ): Wait = jsonata(scope, id, WaitJsonataProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Wait {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Wait(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Wait): Wait =
        Wait(cdkObject)

    internal fun unwrap(wrapped: Wait): software.amazon.awscdk.services.stepfunctions.Wait =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Wait
  }
}
