@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Options to add an EventInvokeConfig to a function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * IDestination destination;
 * EventInvokeConfigOptions eventInvokeConfigOptions = EventInvokeConfigOptions.builder()
 * .maxEventAge(Duration.minutes(30))
 * .onFailure(destination)
 * .onSuccess(destination)
 * .retryAttempts(123)
 * .build();
 * ```
 */
public interface EventInvokeConfigOptions {
  /**
   * The maximum age of a request that Lambda sends to a function for processing.
   *
   * Minimum: 60 seconds
   * Maximum: 6 hours
   *
   * Default: Duration.hours(6)
   */
  public fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

  /**
   * The destination for failed invocations.
   *
   * Default: - no destination
   */
  public fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

  /**
   * The destination for successful invocations.
   *
   * Default: - no destination
   */
  public fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

  /**
   * The maximum number of times to retry when the function returns an error.
   *
   * Minimum: 0
   * Maximum: 2
   *
   * Default: 2
   */
  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  /**
   * A builder for [EventInvokeConfigOptions]
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventInvokeConfigOptions.Builder
        = software.amazon.awscdk.services.lambda.EventInvokeConfigOptions.builder()

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
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventInvokeConfigOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfigOptions,
  ) : CdkObject(cdkObject), EventInvokeConfigOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): EventInvokeConfigOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfigOptions):
        EventInvokeConfigOptions = CdkObjectWrappers.wrap(cdkObject) as? EventInvokeConfigOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventInvokeConfigOptions):
        software.amazon.awscdk.services.lambda.EventInvokeConfigOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.EventInvokeConfigOptions
  }
}
