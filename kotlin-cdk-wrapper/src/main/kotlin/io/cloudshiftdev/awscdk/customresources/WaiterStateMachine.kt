@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A very simple StateMachine construct highly customized to the provider framework.
 *
 * We previously used `CfnResource` instead of `CfnStateMachine` to avoid depending
 * on `aws-stepfunctions` module, but now it is okay.
 *
 * The state machine continuously calls the isCompleteHandler, until it succeeds or times out.
 * The handler is called `maxAttempts` times with an `interval` duration and a `backoffRate` rate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.customresources.*;
 * Function function_;
 * LogGroup logGroup;
 * WaiterStateMachine waiterStateMachine = WaiterStateMachine.Builder.create(this,
 * "MyWaiterStateMachine")
 * .backoffRate(123)
 * .interval(Duration.minutes(30))
 * .isCompleteHandler(function_)
 * .maxAttempts(123)
 * .timeoutHandler(function_)
 * // the properties below are optional
 * .disableLogging(false)
 * .logOptions(LogOptions.builder()
 * .destination(logGroup)
 * .includeExecutionData(false)
 * .level(LogLevel.OFF)
 * .build())
 * .build();
 * ```
 */
public open class WaiterStateMachine(
  cdkObject: software.amazon.awscdk.customresources.WaiterStateMachine,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WaiterStateMachineProps,
  ) :
      this(software.amazon.awscdk.customresources.WaiterStateMachine(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(WaiterStateMachineProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WaiterStateMachineProps.Builder.() -> Unit,
  ) : this(scope, id, WaiterStateMachineProps(props)
  )

  /**
   * Grant the given identity permissions on StartExecution of the state machine.
   *
   * @param identity 
   */
  public open fun grantStartExecution(identity: IGrantable): Grant =
      unwrap(this).grantStartExecution(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The ARN of the state machine.
   */
  public open fun stateMachineArn(): String = unwrap(this).getStateMachineArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.customresources.WaiterStateMachine].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Backoff between attempts.
     *
     * @param backoffRate Backoff between attempts. 
     */
    public fun backoffRate(backoffRate: Number)

    /**
     * Whether logging for the state machine is disabled.
     *
     * Default: - false
     *
     * @param disableLogging Whether logging for the state machine is disabled. 
     */
    public fun disableLogging(disableLogging: Boolean)

    /**
     * The interval to wait between attempts.
     *
     * @param interval The interval to wait between attempts. 
     */
    public fun interval(interval: Duration)

    /**
     * The main handler that notifies if the waiter to decide 'complete' or 'incomplete'.
     *
     * @param isCompleteHandler The main handler that notifies if the waiter to decide 'complete' or
     * 'incomplete'. 
     */
    public fun isCompleteHandler(isCompleteHandler: IFunction)

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: - A default log group will be created if logging is enabled.
     *
     * @param logOptions Defines what execution history events are logged and where they are logged.
     * 
     */
    public fun logOptions(logOptions: LogOptions)

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: - A default log group will be created if logging is enabled.
     *
     * @param logOptions Defines what execution history events are logged and where they are logged.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("070ffc9da408403e15c9354d15c3595efc985ad8dad8636246bda2b36d308b2c")
    public fun logOptions(logOptions: LogOptions.Builder.() -> Unit)

    /**
     * Number of attempts.
     *
     * @param maxAttempts Number of attempts. 
     */
    public fun maxAttempts(maxAttempts: Number)

    /**
     * The handler to call if the waiter times out and is incomplete.
     *
     * @param timeoutHandler The handler to call if the waiter times out and is incomplete. 
     */
    public fun timeoutHandler(timeoutHandler: IFunction)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.WaiterStateMachine.Builder =
        software.amazon.awscdk.customresources.WaiterStateMachine.Builder.create(scope, id)

    /**
     * Backoff between attempts.
     *
     * @param backoffRate Backoff between attempts. 
     */
    override fun backoffRate(backoffRate: Number) {
      cdkBuilder.backoffRate(backoffRate)
    }

    /**
     * Whether logging for the state machine is disabled.
     *
     * Default: - false
     *
     * @param disableLogging Whether logging for the state machine is disabled. 
     */
    override fun disableLogging(disableLogging: Boolean) {
      cdkBuilder.disableLogging(disableLogging)
    }

    /**
     * The interval to wait between attempts.
     *
     * @param interval The interval to wait between attempts. 
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration.Companion::unwrap))
    }

    /**
     * The main handler that notifies if the waiter to decide 'complete' or 'incomplete'.
     *
     * @param isCompleteHandler The main handler that notifies if the waiter to decide 'complete' or
     * 'incomplete'. 
     */
    override fun isCompleteHandler(isCompleteHandler: IFunction) {
      cdkBuilder.isCompleteHandler(isCompleteHandler.let(IFunction.Companion::unwrap))
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: - A default log group will be created if logging is enabled.
     *
     * @param logOptions Defines what execution history events are logged and where they are logged.
     * 
     */
    override fun logOptions(logOptions: LogOptions) {
      cdkBuilder.logOptions(logOptions.let(LogOptions.Companion::unwrap))
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: - A default log group will be created if logging is enabled.
     *
     * @param logOptions Defines what execution history events are logged and where they are logged.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("070ffc9da408403e15c9354d15c3595efc985ad8dad8636246bda2b36d308b2c")
    override fun logOptions(logOptions: LogOptions.Builder.() -> Unit): Unit =
        logOptions(LogOptions(logOptions))

    /**
     * Number of attempts.
     *
     * @param maxAttempts Number of attempts. 
     */
    override fun maxAttempts(maxAttempts: Number) {
      cdkBuilder.maxAttempts(maxAttempts)
    }

    /**
     * The handler to call if the waiter times out and is incomplete.
     *
     * @param timeoutHandler The handler to call if the waiter times out and is incomplete. 
     */
    override fun timeoutHandler(timeoutHandler: IFunction) {
      cdkBuilder.timeoutHandler(timeoutHandler.let(IFunction.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.customresources.WaiterStateMachine =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.customresources.WaiterStateMachine.PROPERTY_INJECTION_ID

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WaiterStateMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WaiterStateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.WaiterStateMachine):
        WaiterStateMachine = WaiterStateMachine(cdkObject)

    internal fun unwrap(wrapped: WaiterStateMachine):
        software.amazon.awscdk.customresources.WaiterStateMachine = wrapped.cdkObject as
        software.amazon.awscdk.customresources.WaiterStateMachine
  }
}
