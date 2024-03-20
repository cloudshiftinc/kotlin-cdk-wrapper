@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.Function
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Triggers an AWS Lambda function during deployment.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.triggers.*;
 * Function func = Function.Builder.create(this, "MyFunction")
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_18_X)
 * .code(Code.fromInline("foo"))
 * .build();
 * Trigger.Builder.create(this, "MyTrigger")
 * .handler(func)
 * .timeout(Duration.minutes(10))
 * .invocationType(InvocationType.EVENT)
 * .build();
 * ```
 */
public open class Trigger internal constructor(
  internal override val cdkObject: software.amazon.awscdk.triggers.Trigger,
) : CloudshiftdevConstructsConstruct(cdkObject), ITrigger {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TriggerProps,
  ) :
      this(software.amazon.awscdk.triggers.Trigger(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(TriggerProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TriggerProps.Builder.() -> Unit,
  ) : this(scope, id, TriggerProps(props)
  )

  /**
   * Adds trigger dependencies.
   *
   * Execute this trigger only after these construct
   * scopes have been provisioned.
   *
   * @param scopes 
   */
  public override fun executeAfter(vararg scopes: CloudshiftdevConstructsConstruct) {
    unwrap(this).executeAfter(*scopes.map(CloudshiftdevConstructsConstruct::unwrap).toTypedArray())
  }

  /**
   * Adds this trigger as a dependency on other constructs.
   *
   * This means that this
   * trigger will get executed *before* the given construct(s).
   *
   * @param scopes 
   */
  public override fun executeBefore(vararg scopes: CloudshiftdevConstructsConstruct) {
    unwrap(this).executeBefore(*scopes.map(CloudshiftdevConstructsConstruct::unwrap).toTypedArray())
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.triggers.Trigger].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     *
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned. 
     */
    public fun executeAfter(executeAfter: List<CloudshiftdevConstructsConstruct>)

    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     *
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned. 
     */
    public fun executeAfter(vararg executeAfter: CloudshiftdevConstructsConstruct)

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     *
     * @param executeBefore Adds this trigger as a dependency on other constructs. 
     */
    public fun executeBefore(executeBefore: List<CloudshiftdevConstructsConstruct>)

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     *
     * @param executeBefore Adds this trigger as a dependency on other constructs. 
     */
    public fun executeBefore(vararg executeBefore: CloudshiftdevConstructsConstruct)

    /**
     * Re-executes the trigger every time the handler changes.
     *
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     *
     * Default: true
     *
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes. 
     */
    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean)

    /**
     * The AWS Lambda function of the handler to execute.
     *
     * @param handler The AWS Lambda function of the handler to execute. 
     */
    public fun handler(handler: Function)

    /**
     * The invocation type to invoke the Lambda function with.
     *
     * Default: RequestResponse
     *
     * @param invocationType The invocation type to invoke the Lambda function with. 
     */
    public fun invocationType(invocationType: InvocationType)

    /**
     * The timeout of the invocation call of the Lambda function to be triggered.
     *
     * Default: Duration.minutes(2)
     *
     * @param timeout The timeout of the invocation call of the Lambda function to be triggered. 
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.triggers.Trigger.Builder =
        software.amazon.awscdk.triggers.Trigger.Builder.create(scope, id)

    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     *
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned. 
     */
    override fun executeAfter(executeAfter: List<CloudshiftdevConstructsConstruct>) {
      cdkBuilder.executeAfter(executeAfter.map(CloudshiftdevConstructsConstruct::unwrap))
    }

    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     *
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned. 
     */
    override fun executeAfter(vararg executeAfter: CloudshiftdevConstructsConstruct): Unit =
        executeAfter(executeAfter.toList())

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     *
     * @param executeBefore Adds this trigger as a dependency on other constructs. 
     */
    override fun executeBefore(executeBefore: List<CloudshiftdevConstructsConstruct>) {
      cdkBuilder.executeBefore(executeBefore.map(CloudshiftdevConstructsConstruct::unwrap))
    }

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     *
     * @param executeBefore Adds this trigger as a dependency on other constructs. 
     */
    override fun executeBefore(vararg executeBefore: CloudshiftdevConstructsConstruct): Unit =
        executeBefore(executeBefore.toList())

    /**
     * Re-executes the trigger every time the handler changes.
     *
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     *
     * Default: true
     *
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes. 
     */
    override fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
      cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    /**
     * The AWS Lambda function of the handler to execute.
     *
     * @param handler The AWS Lambda function of the handler to execute. 
     */
    override fun handler(handler: Function) {
      cdkBuilder.handler(handler.let(Function::unwrap))
    }

    /**
     * The invocation type to invoke the Lambda function with.
     *
     * Default: RequestResponse
     *
     * @param invocationType The invocation type to invoke the Lambda function with. 
     */
    override fun invocationType(invocationType: InvocationType) {
      cdkBuilder.invocationType(invocationType.let(InvocationType::unwrap))
    }

    /**
     * The timeout of the invocation call of the Lambda function to be triggered.
     *
     * Default: Duration.minutes(2)
     *
     * @param timeout The timeout of the invocation call of the Lambda function to be triggered. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.triggers.Trigger = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Trigger {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Trigger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.Trigger): Trigger =
        Trigger(cdkObject)

    internal fun unwrap(wrapped: Trigger): software.amazon.awscdk.triggers.Trigger =
        wrapped.cdkObject
  }
}
