@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Initialization properties for the `WaiterStateMachine` construct.
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
 * WaiterStateMachineProps waiterStateMachineProps = WaiterStateMachineProps.builder()
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
public interface WaiterStateMachineProps {
  /**
   * Backoff between attempts.
   */
  public fun backoffRate(): Number

  /**
   * Whether logging for the state machine is disabled.
   *
   * Default: - false
   */
  public fun disableLogging(): Boolean? = unwrap(this).getDisableLogging()

  /**
   * The interval to wait between attempts.
   */
  public fun interval(): Duration

  /**
   * The main handler that notifies if the waiter to decide 'complete' or 'incomplete'.
   */
  public fun isCompleteHandler(): IFunction

  /**
   * Defines what execution history events are logged and where they are logged.
   *
   * Default: - A default log group will be created if logging is enabled.
   */
  public fun logOptions(): LogOptions? = unwrap(this).getLogOptions()?.let(LogOptions::wrap)

  /**
   * Number of attempts.
   */
  public fun maxAttempts(): Number

  /**
   * The handler to call if the waiter times out and is incomplete.
   */
  public fun timeoutHandler(): IFunction

  /**
   * A builder for [WaiterStateMachineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backoffRate Backoff between attempts. 
     */
    public fun backoffRate(backoffRate: Number)

    /**
     * @param disableLogging Whether logging for the state machine is disabled.
     */
    public fun disableLogging(disableLogging: Boolean)

    /**
     * @param interval The interval to wait between attempts. 
     */
    public fun interval(interval: Duration)

    /**
     * @param isCompleteHandler The main handler that notifies if the waiter to decide 'complete' or
     * 'incomplete'. 
     */
    public fun isCompleteHandler(isCompleteHandler: IFunction)

    /**
     * @param logOptions Defines what execution history events are logged and where they are logged.
     */
    public fun logOptions(logOptions: LogOptions)

    /**
     * @param logOptions Defines what execution history events are logged and where they are logged.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b0668647d6aaa7ff11d6c5b68f6f053ac03bc7b9d35bfcf8e87fc2c4ef39cfd")
    public fun logOptions(logOptions: LogOptions.Builder.() -> Unit)

    /**
     * @param maxAttempts Number of attempts. 
     */
    public fun maxAttempts(maxAttempts: Number)

    /**
     * @param timeoutHandler The handler to call if the waiter times out and is incomplete. 
     */
    public fun timeoutHandler(timeoutHandler: IFunction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.WaiterStateMachineProps.Builder =
        software.amazon.awscdk.customresources.WaiterStateMachineProps.builder()

    /**
     * @param backoffRate Backoff between attempts. 
     */
    override fun backoffRate(backoffRate: Number) {
      cdkBuilder.backoffRate(backoffRate)
    }

    /**
     * @param disableLogging Whether logging for the state machine is disabled.
     */
    override fun disableLogging(disableLogging: Boolean) {
      cdkBuilder.disableLogging(disableLogging)
    }

    /**
     * @param interval The interval to wait between attempts. 
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    /**
     * @param isCompleteHandler The main handler that notifies if the waiter to decide 'complete' or
     * 'incomplete'. 
     */
    override fun isCompleteHandler(isCompleteHandler: IFunction) {
      cdkBuilder.isCompleteHandler(isCompleteHandler.let(IFunction::unwrap))
    }

    /**
     * @param logOptions Defines what execution history events are logged and where they are logged.
     */
    override fun logOptions(logOptions: LogOptions) {
      cdkBuilder.logOptions(logOptions.let(LogOptions::unwrap))
    }

    /**
     * @param logOptions Defines what execution history events are logged and where they are logged.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b0668647d6aaa7ff11d6c5b68f6f053ac03bc7b9d35bfcf8e87fc2c4ef39cfd")
    override fun logOptions(logOptions: LogOptions.Builder.() -> Unit): Unit =
        logOptions(LogOptions(logOptions))

    /**
     * @param maxAttempts Number of attempts. 
     */
    override fun maxAttempts(maxAttempts: Number) {
      cdkBuilder.maxAttempts(maxAttempts)
    }

    /**
     * @param timeoutHandler The handler to call if the waiter times out and is incomplete. 
     */
    override fun timeoutHandler(timeoutHandler: IFunction) {
      cdkBuilder.timeoutHandler(timeoutHandler.let(IFunction::unwrap))
    }

    public fun build(): software.amazon.awscdk.customresources.WaiterStateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.customresources.WaiterStateMachineProps,
  ) : CdkObject(cdkObject), WaiterStateMachineProps {
    /**
     * Backoff between attempts.
     */
    override fun backoffRate(): Number = unwrap(this).getBackoffRate()

    /**
     * Whether logging for the state machine is disabled.
     *
     * Default: - false
     */
    override fun disableLogging(): Boolean? = unwrap(this).getDisableLogging()

    /**
     * The interval to wait between attempts.
     */
    override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    /**
     * The main handler that notifies if the waiter to decide 'complete' or 'incomplete'.
     */
    override fun isCompleteHandler(): IFunction =
        unwrap(this).getIsCompleteHandler().let(IFunction::wrap)

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: - A default log group will be created if logging is enabled.
     */
    override fun logOptions(): LogOptions? = unwrap(this).getLogOptions()?.let(LogOptions::wrap)

    /**
     * Number of attempts.
     */
    override fun maxAttempts(): Number = unwrap(this).getMaxAttempts()

    /**
     * The handler to call if the waiter times out and is incomplete.
     */
    override fun timeoutHandler(): IFunction = unwrap(this).getTimeoutHandler().let(IFunction::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WaiterStateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.WaiterStateMachineProps):
        WaiterStateMachineProps = CdkObjectWrappers.wrap(cdkObject) as? WaiterStateMachineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WaiterStateMachineProps):
        software.amazon.awscdk.customresources.WaiterStateMachineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.customresources.WaiterStateMachineProps
  }
}
