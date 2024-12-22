@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Options for customising the retry policy of the delivery of SNS messages to HTTP/S endpoints.
 *
 * Example:
 *
 * ```
 * Topic myTopic = new Topic(this, "MyTopic");
 * myTopic.addSubscription(
 * UrlSubscription.Builder.create("https://foobar.com/")
 * .deliveryPolicy(DeliveryPolicy.builder()
 * .healthyRetryPolicy(HealthyRetryPolicy.builder()
 * .minDelayTarget(Duration.seconds(5))
 * .maxDelayTarget(Duration.seconds(10))
 * .numRetries(6)
 * .backoffFunction(BackoffFunction.EXPONENTIAL)
 * .build())
 * .throttlePolicy(ThrottlePolicy.builder()
 * .maxReceivesPerSecond(10)
 * .build())
 * .requestPolicy(RequestPolicy.builder()
 * .headerContentType("application/json")
 * .build())
 * .build())
 * .build());
 * ```
 */
public interface HealthyRetryPolicy {
  /**
   * The model for backoff between retries.
   *
   * Default: - linear
   */
  public fun backoffFunction(): BackoffFunction? =
      unwrap(this).getBackoffFunction()?.let(BackoffFunction::wrap)

  /**
   * The maximum delay for a retry.
   *
   * Must be at least `minDelayTarget` less than 3,600 seconds, and correspond to a whole number of
   * seconds,
   *
   * Default: - 20 seconds
   */
  public fun maxDelayTarget(): Duration? = unwrap(this).getMaxDelayTarget()?.let(Duration::wrap)

  /**
   * The minimum delay for a retry.
   *
   * Must be at least one second, not exceed `maxDelayTarget`, and correspond to a whole number of
   * seconds.
   *
   * Default: - 20 seconds
   */
  public fun minDelayTarget(): Duration? = unwrap(this).getMinDelayTarget()?.let(Duration::wrap)

  /**
   * The number of retries in the post-backoff phase, with the maximum delay between them.
   *
   * Must be zero or greater
   *
   * Default: 0
   */
  public fun numMaxDelayRetries(): Number? = unwrap(this).getNumMaxDelayRetries()

  /**
   * The number of retries in the pre-backoff phase, with the specified minimum delay between them.
   *
   * Must be zero or greater
   *
   * Default: 0
   */
  public fun numMinDelayRetries(): Number? = unwrap(this).getNumMinDelayRetries()

  /**
   * The number of retries to be done immediately, with no delay between them.
   *
   * Must be zero or greater.
   *
   * Default: 0
   */
  public fun numNoDelayRetries(): Number? = unwrap(this).getNumNoDelayRetries()

  /**
   * The total number of retries, including immediate, pre-backoff, backoff, and post-backoff
   * retries.
   *
   * Must be greater than or equal to zero and not exceed 100.
   *
   * Default: 3
   */
  public fun numRetries(): Number? = unwrap(this).getNumRetries()

  /**
   * A builder for [HealthyRetryPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backoffFunction The model for backoff between retries.
     */
    public fun backoffFunction(backoffFunction: BackoffFunction)

    /**
     * @param maxDelayTarget The maximum delay for a retry.
     * Must be at least `minDelayTarget` less than 3,600 seconds, and correspond to a whole number
     * of seconds,
     */
    public fun maxDelayTarget(maxDelayTarget: Duration)

    /**
     * @param minDelayTarget The minimum delay for a retry.
     * Must be at least one second, not exceed `maxDelayTarget`, and correspond to a whole number of
     * seconds.
     */
    public fun minDelayTarget(minDelayTarget: Duration)

    /**
     * @param numMaxDelayRetries The number of retries in the post-backoff phase, with the maximum
     * delay between them.
     * Must be zero or greater
     */
    public fun numMaxDelayRetries(numMaxDelayRetries: Number)

    /**
     * @param numMinDelayRetries The number of retries in the pre-backoff phase, with the specified
     * minimum delay between them.
     * Must be zero or greater
     */
    public fun numMinDelayRetries(numMinDelayRetries: Number)

    /**
     * @param numNoDelayRetries The number of retries to be done immediately, with no delay between
     * them.
     * Must be zero or greater.
     */
    public fun numNoDelayRetries(numNoDelayRetries: Number)

    /**
     * @param numRetries The total number of retries, including immediate, pre-backoff, backoff, and
     * post-backoff retries.
     * Must be greater than or equal to zero and not exceed 100.
     */
    public fun numRetries(numRetries: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.HealthyRetryPolicy.Builder =
        software.amazon.awscdk.services.sns.HealthyRetryPolicy.builder()

    /**
     * @param backoffFunction The model for backoff between retries.
     */
    override fun backoffFunction(backoffFunction: BackoffFunction) {
      cdkBuilder.backoffFunction(backoffFunction.let(BackoffFunction.Companion::unwrap))
    }

    /**
     * @param maxDelayTarget The maximum delay for a retry.
     * Must be at least `minDelayTarget` less than 3,600 seconds, and correspond to a whole number
     * of seconds,
     */
    override fun maxDelayTarget(maxDelayTarget: Duration) {
      cdkBuilder.maxDelayTarget(maxDelayTarget.let(Duration.Companion::unwrap))
    }

    /**
     * @param minDelayTarget The minimum delay for a retry.
     * Must be at least one second, not exceed `maxDelayTarget`, and correspond to a whole number of
     * seconds.
     */
    override fun minDelayTarget(minDelayTarget: Duration) {
      cdkBuilder.minDelayTarget(minDelayTarget.let(Duration.Companion::unwrap))
    }

    /**
     * @param numMaxDelayRetries The number of retries in the post-backoff phase, with the maximum
     * delay between them.
     * Must be zero or greater
     */
    override fun numMaxDelayRetries(numMaxDelayRetries: Number) {
      cdkBuilder.numMaxDelayRetries(numMaxDelayRetries)
    }

    /**
     * @param numMinDelayRetries The number of retries in the pre-backoff phase, with the specified
     * minimum delay between them.
     * Must be zero or greater
     */
    override fun numMinDelayRetries(numMinDelayRetries: Number) {
      cdkBuilder.numMinDelayRetries(numMinDelayRetries)
    }

    /**
     * @param numNoDelayRetries The number of retries to be done immediately, with no delay between
     * them.
     * Must be zero or greater.
     */
    override fun numNoDelayRetries(numNoDelayRetries: Number) {
      cdkBuilder.numNoDelayRetries(numNoDelayRetries)
    }

    /**
     * @param numRetries The total number of retries, including immediate, pre-backoff, backoff, and
     * post-backoff retries.
     * Must be greater than or equal to zero and not exceed 100.
     */
    override fun numRetries(numRetries: Number) {
      cdkBuilder.numRetries(numRetries)
    }

    public fun build(): software.amazon.awscdk.services.sns.HealthyRetryPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.HealthyRetryPolicy,
  ) : CdkObject(cdkObject),
      HealthyRetryPolicy {
    /**
     * The model for backoff between retries.
     *
     * Default: - linear
     */
    override fun backoffFunction(): BackoffFunction? =
        unwrap(this).getBackoffFunction()?.let(BackoffFunction::wrap)

    /**
     * The maximum delay for a retry.
     *
     * Must be at least `minDelayTarget` less than 3,600 seconds, and correspond to a whole number
     * of seconds,
     *
     * Default: - 20 seconds
     */
    override fun maxDelayTarget(): Duration? = unwrap(this).getMaxDelayTarget()?.let(Duration::wrap)

    /**
     * The minimum delay for a retry.
     *
     * Must be at least one second, not exceed `maxDelayTarget`, and correspond to a whole number of
     * seconds.
     *
     * Default: - 20 seconds
     */
    override fun minDelayTarget(): Duration? = unwrap(this).getMinDelayTarget()?.let(Duration::wrap)

    /**
     * The number of retries in the post-backoff phase, with the maximum delay between them.
     *
     * Must be zero or greater
     *
     * Default: 0
     */
    override fun numMaxDelayRetries(): Number? = unwrap(this).getNumMaxDelayRetries()

    /**
     * The number of retries in the pre-backoff phase, with the specified minimum delay between
     * them.
     *
     * Must be zero or greater
     *
     * Default: 0
     */
    override fun numMinDelayRetries(): Number? = unwrap(this).getNumMinDelayRetries()

    /**
     * The number of retries to be done immediately, with no delay between them.
     *
     * Must be zero or greater.
     *
     * Default: 0
     */
    override fun numNoDelayRetries(): Number? = unwrap(this).getNumNoDelayRetries()

    /**
     * The total number of retries, including immediate, pre-backoff, backoff, and post-backoff
     * retries.
     *
     * Must be greater than or equal to zero and not exceed 100.
     *
     * Default: 3
     */
    override fun numRetries(): Number? = unwrap(this).getNumRetries()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthyRetryPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.HealthyRetryPolicy):
        HealthyRetryPolicy = CdkObjectWrappers.wrap(cdkObject) as? HealthyRetryPolicy ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthyRetryPolicy):
        software.amazon.awscdk.services.sns.HealthyRetryPolicy = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.HealthyRetryPolicy
  }
}
