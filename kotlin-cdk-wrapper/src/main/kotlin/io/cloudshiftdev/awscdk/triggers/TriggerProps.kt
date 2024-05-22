@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.Function
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

/**
 * Props for `Trigger`.
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
public interface TriggerProps : TriggerOptions {
  /**
   * The AWS Lambda function of the handler to execute.
   */
  public fun handler(): Function

  /**
   * The invocation type to invoke the Lambda function with.
   *
   * Default: RequestResponse
   */
  public fun invocationType(): InvocationType? =
      unwrap(this).getInvocationType()?.let(InvocationType::wrap)

  /**
   * The timeout of the invocation call of the Lambda function to be triggered.
   *
   * Default: Duration.minutes(2)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [TriggerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    public fun executeAfter(executeAfter: List<Construct>)

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    public fun executeAfter(vararg executeAfter: Construct)

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(executeBefore: List<Construct>)

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(vararg executeBefore: Construct)

    /**
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes.
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     */
    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean)

    /**
     * @param handler The AWS Lambda function of the handler to execute. 
     */
    public fun handler(handler: Function)

    /**
     * @param invocationType The invocation type to invoke the Lambda function with.
     */
    public fun invocationType(invocationType: InvocationType)

    /**
     * @param timeout The timeout of the invocation call of the Lambda function to be triggered.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.triggers.TriggerProps.Builder =
        software.amazon.awscdk.triggers.TriggerProps.builder()

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    override fun executeAfter(executeAfter: List<Construct>) {
      cdkBuilder.executeAfter(executeAfter.map(Construct.Companion::unwrap))
    }

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these
     * construct scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    override fun executeAfter(vararg executeAfter: Construct): Unit =
        executeAfter(executeAfter.toList())

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    override fun executeBefore(executeBefore: List<Construct>) {
      cdkBuilder.executeBefore(executeBefore.map(Construct.Companion::unwrap))
    }

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    override fun executeBefore(vararg executeBefore: Construct): Unit =
        executeBefore(executeBefore.toList())

    /**
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes.
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     */
    override fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
      cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    /**
     * @param handler The AWS Lambda function of the handler to execute. 
     */
    override fun handler(handler: Function) {
      cdkBuilder.handler(handler.let(Function.Companion::unwrap))
    }

    /**
     * @param invocationType The invocation type to invoke the Lambda function with.
     */
    override fun invocationType(invocationType: InvocationType) {
      cdkBuilder.invocationType(invocationType.let(InvocationType.Companion::unwrap))
    }

    /**
     * @param timeout The timeout of the invocation call of the Lambda function to be triggered.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.triggers.TriggerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.triggers.TriggerProps,
  ) : CdkObject(cdkObject), TriggerProps {
    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     */
    override fun executeAfter(): List<Construct> =
        unwrap(this).getExecuteAfter()?.map(Construct::wrap) ?: emptyList()

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     */
    override fun executeBefore(): List<Construct> =
        unwrap(this).getExecuteBefore()?.map(Construct::wrap) ?: emptyList()

    /**
     * Re-executes the trigger every time the handler changes.
     *
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     *
     * Default: true
     */
    override fun executeOnHandlerChange(): Boolean? = unwrap(this).getExecuteOnHandlerChange()

    /**
     * The AWS Lambda function of the handler to execute.
     */
    override fun handler(): Function = unwrap(this).getHandler().let(Function::wrap)

    /**
     * The invocation type to invoke the Lambda function with.
     *
     * Default: RequestResponse
     */
    override fun invocationType(): InvocationType? =
        unwrap(this).getInvocationType()?.let(InvocationType::wrap)

    /**
     * The timeout of the invocation call of the Lambda function to be triggered.
     *
     * Default: Duration.minutes(2)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TriggerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.TriggerProps): TriggerProps =
        CdkObjectWrappers.wrap(cdkObject) as? TriggerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TriggerProps): software.amazon.awscdk.triggers.TriggerProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.triggers.TriggerProps
  }
}
