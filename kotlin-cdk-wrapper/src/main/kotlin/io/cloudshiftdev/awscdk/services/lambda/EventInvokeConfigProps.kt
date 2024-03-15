@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for an EventInvokeConfig.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * IDestination destination;
 * Function function_;
 * EventInvokeConfigProps eventInvokeConfigProps = EventInvokeConfigProps.builder()
 * .function(function_)
 * // the properties below are optional
 * .maxEventAge(Duration.minutes(30))
 * .onFailure(destination)
 * .onSuccess(destination)
 * .qualifier("qualifier")
 * .retryAttempts(123)
 * .build();
 * ```
 */
public interface EventInvokeConfigProps : EventInvokeConfigOptions {
  /**
   * The Lambda function.
   */
  public fun function(): IFunction

  /**
   * The qualifier.
   *
   * Default: - latest version
   */
  public fun qualifier(): String? = unwrap(this).getQualifier()

  /**
   * A builder for [EventInvokeConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param function The Lambda function. 
     */
    public fun function(function: IFunction)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum: 60 seconds
     * Maximum: 6 hours
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param onFailure The destination for failed invocations.
     */
    public fun onFailure(onFailure: IDestination)

    /**
     * @param onSuccess The destination for successful invocations.
     */
    public fun onSuccess(onSuccess: IDestination)

    /**
     * @param qualifier The qualifier.
     */
    public fun qualifier(qualifier: String)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventInvokeConfigProps.Builder =
        software.amazon.awscdk.services.lambda.EventInvokeConfigProps.builder()

    /**
     * @param function The Lambda function. 
     */
    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum: 60 seconds
     * Maximum: 6 hours
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * @param onFailure The destination for failed invocations.
     */
    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    /**
     * @param onSuccess The destination for successful invocations.
     */
    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    /**
     * @param qualifier The qualifier.
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventInvokeConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfigProps,
  ) : CdkObject(cdkObject), EventInvokeConfigProps {
    /**
     * The Lambda function.
     */
    override fun function(): IFunction = unwrap(this).getFunction().let(IFunction::wrap)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The destination for failed invocations.
     *
     * Default: - no destination
     */
    override fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     */
    override fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

    /**
     * The qualifier.
     *
     * Default: - latest version
     */
    override fun qualifier(): String? = unwrap(this).getQualifier()

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventInvokeConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfigProps):
        EventInvokeConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventInvokeConfigProps):
        software.amazon.awscdk.services.lambda.EventInvokeConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.EventInvokeConfigProps
  }
}
