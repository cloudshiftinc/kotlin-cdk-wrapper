@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Retry details.
 *
 * Example:
 *
 * ```
 * Parallel parallel = new Parallel(this, "Do the work in parallel");
 * // Add branches to be executed in parallel
 * Pass shipItem = new Pass(this, "ShipItem");
 * Pass sendInvoice = new Pass(this, "SendInvoice");
 * Pass restock = new Pass(this, "Restock");
 * parallel.branch(shipItem);
 * parallel.branch(sendInvoice);
 * parallel.branch(restock);
 * // Retry the whole workflow if something goes wrong with exponential backoff
 * parallel.addRetry(RetryProps.builder()
 * .maxAttempts(1)
 * .maxDelay(Duration.seconds(5))
 * .jitterStrategy(JitterType.FULL)
 * .build());
 * // How to recover from errors
 * Pass sendFailureNotification = new Pass(this, "SendFailureNotification");
 * parallel.addCatch(sendFailureNotification);
 * // What to do in case everything succeeded
 * Pass closeOrder = new Pass(this, "CloseOrder");
 * parallel.next(closeOrder);
 * ```
 */
public interface RetryProps {
  /**
   * Multiplication for how much longer the wait interval gets on every retry.
   *
   * Default: 2
   */
  public fun backoffRate(): Number? = unwrap(this).getBackoffRate()

  /**
   * Errors to retry.
   *
   * A list of error strings to retry, which can be either predefined errors
   * (for example Errors.NoChoiceMatched) or a self-defined error.
   *
   * Default: All errors
   */
  public fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

  /**
   * How many seconds to wait initially before retrying.
   *
   * Default: Duration.seconds(1)
   */
  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  /**
   * Introduces a randomization over the retry interval.
   *
   * Default: - No jitter strategy
   */
  public fun jitterStrategy(): JitterType? = unwrap(this).getJitterStrategy()?.let(JitterType::wrap)

  /**
   * How many times to retry this particular error.
   *
   * May be 0 to disable retry for specific errors (in case you have
   * a catch-all retry policy).
   *
   * Default: 3
   */
  public fun maxAttempts(): Number? = unwrap(this).getMaxAttempts()

  /**
   * Maximum limit on retry interval growth during exponential backoff.
   *
   * Default: - No max delay
   */
  public fun maxDelay(): Duration? = unwrap(this).getMaxDelay()?.let(Duration::wrap)

  /**
   * A builder for [RetryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backoffRate Multiplication for how much longer the wait interval gets on every retry.
     */
    public fun backoffRate(backoffRate: Number)

    /**
     * @param errors Errors to retry.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(errors: List<String>)

    /**
     * @param errors Errors to retry.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(vararg errors: String)

    /**
     * @param interval How many seconds to wait initially before retrying.
     */
    public fun interval(interval: Duration)

    /**
     * @param jitterStrategy Introduces a randomization over the retry interval.
     */
    public fun jitterStrategy(jitterStrategy: JitterType)

    /**
     * @param maxAttempts How many times to retry this particular error.
     * May be 0 to disable retry for specific errors (in case you have
     * a catch-all retry policy).
     */
    public fun maxAttempts(maxAttempts: Number)

    /**
     * @param maxDelay Maximum limit on retry interval growth during exponential backoff.
     */
    public fun maxDelay(maxDelay: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.RetryProps.Builder =
        software.amazon.awscdk.services.stepfunctions.RetryProps.builder()

    /**
     * @param backoffRate Multiplication for how much longer the wait interval gets on every retry.
     */
    override fun backoffRate(backoffRate: Number) {
      cdkBuilder.backoffRate(backoffRate)
    }

    /**
     * @param errors Errors to retry.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    override fun errors(errors: List<String>) {
      cdkBuilder.errors(errors)
    }

    /**
     * @param errors Errors to retry.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    override fun errors(vararg errors: String): Unit = errors(errors.toList())

    /**
     * @param interval How many seconds to wait initially before retrying.
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    /**
     * @param jitterStrategy Introduces a randomization over the retry interval.
     */
    override fun jitterStrategy(jitterStrategy: JitterType) {
      cdkBuilder.jitterStrategy(jitterStrategy.let(JitterType::unwrap))
    }

    /**
     * @param maxAttempts How many times to retry this particular error.
     * May be 0 to disable retry for specific errors (in case you have
     * a catch-all retry policy).
     */
    override fun maxAttempts(maxAttempts: Number) {
      cdkBuilder.maxAttempts(maxAttempts)
    }

    /**
     * @param maxDelay Maximum limit on retry interval growth during exponential backoff.
     */
    override fun maxDelay(maxDelay: Duration) {
      cdkBuilder.maxDelay(maxDelay.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.RetryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.RetryProps,
  ) : CdkObject(cdkObject), RetryProps {
    /**
     * Multiplication for how much longer the wait interval gets on every retry.
     *
     * Default: 2
     */
    override fun backoffRate(): Number? = unwrap(this).getBackoffRate()

    /**
     * Errors to retry.
     *
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     *
     * Default: All errors
     */
    override fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

    /**
     * How many seconds to wait initially before retrying.
     *
     * Default: Duration.seconds(1)
     */
    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    /**
     * Introduces a randomization over the retry interval.
     *
     * Default: - No jitter strategy
     */
    override fun jitterStrategy(): JitterType? =
        unwrap(this).getJitterStrategy()?.let(JitterType::wrap)

    /**
     * How many times to retry this particular error.
     *
     * May be 0 to disable retry for specific errors (in case you have
     * a catch-all retry policy).
     *
     * Default: 3
     */
    override fun maxAttempts(): Number? = unwrap(this).getMaxAttempts()

    /**
     * Maximum limit on retry interval growth during exponential backoff.
     *
     * Default: - No max delay
     */
    override fun maxDelay(): Duration? = unwrap(this).getMaxDelay()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RetryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.RetryProps):
        RetryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RetryProps):
        software.amazon.awscdk.services.stepfunctions.RetryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.RetryProps
  }
}
