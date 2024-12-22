@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options for customising the delivery of SNS messages to HTTP/S endpoints.
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
public interface DeliveryPolicy {
  /**
   * The retry policy of the delivery of SNS messages to HTTP/S endpoints.
   *
   * Default: - Amazon SNS attempts up to three retries with a delay between failed attempts set at
   * 20 seconds
   */
  public fun healthyRetryPolicy(): HealthyRetryPolicy? =
      unwrap(this).getHealthyRetryPolicy()?.let(HealthyRetryPolicy::wrap)

  /**
   * The request of the content sent in AWS SNS HTTP/S requests.
   *
   * Default: - The content type is set to 'text/plain; charset=UTF-8'
   */
  public fun requestPolicy(): RequestPolicy? =
      unwrap(this).getRequestPolicy()?.let(RequestPolicy::wrap)

  /**
   * The throttling policy of the delivery of SNS messages to HTTP/S endpoints.
   *
   * Default: - No throttling
   */
  public fun throttlePolicy(): ThrottlePolicy? =
      unwrap(this).getThrottlePolicy()?.let(ThrottlePolicy::wrap)

  /**
   * A builder for [DeliveryPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param healthyRetryPolicy The retry policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    public fun healthyRetryPolicy(healthyRetryPolicy: HealthyRetryPolicy)

    /**
     * @param healthyRetryPolicy The retry policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e9a6e9e9dbf03612bec603975c91b44aad38e883e7c2fa1bba216aa725847f5")
    public fun healthyRetryPolicy(healthyRetryPolicy: HealthyRetryPolicy.Builder.() -> Unit)

    /**
     * @param requestPolicy The request of the content sent in AWS SNS HTTP/S requests.
     */
    public fun requestPolicy(requestPolicy: RequestPolicy)

    /**
     * @param requestPolicy The request of the content sent in AWS SNS HTTP/S requests.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccee568f5a54a80c7ce00bf54924c445557c7133e63b0d1135acaec104cfb632")
    public fun requestPolicy(requestPolicy: RequestPolicy.Builder.() -> Unit)

    /**
     * @param throttlePolicy The throttling policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    public fun throttlePolicy(throttlePolicy: ThrottlePolicy)

    /**
     * @param throttlePolicy The throttling policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("246aa360aee75b4bae4ff780d15ed21324a0a483692c631dc8bfe5d0b03ce1d9")
    public fun throttlePolicy(throttlePolicy: ThrottlePolicy.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.DeliveryPolicy.Builder =
        software.amazon.awscdk.services.sns.DeliveryPolicy.builder()

    /**
     * @param healthyRetryPolicy The retry policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    override fun healthyRetryPolicy(healthyRetryPolicy: HealthyRetryPolicy) {
      cdkBuilder.healthyRetryPolicy(healthyRetryPolicy.let(HealthyRetryPolicy.Companion::unwrap))
    }

    /**
     * @param healthyRetryPolicy The retry policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e9a6e9e9dbf03612bec603975c91b44aad38e883e7c2fa1bba216aa725847f5")
    override fun healthyRetryPolicy(healthyRetryPolicy: HealthyRetryPolicy.Builder.() -> Unit): Unit
        = healthyRetryPolicy(HealthyRetryPolicy(healthyRetryPolicy))

    /**
     * @param requestPolicy The request of the content sent in AWS SNS HTTP/S requests.
     */
    override fun requestPolicy(requestPolicy: RequestPolicy) {
      cdkBuilder.requestPolicy(requestPolicy.let(RequestPolicy.Companion::unwrap))
    }

    /**
     * @param requestPolicy The request of the content sent in AWS SNS HTTP/S requests.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccee568f5a54a80c7ce00bf54924c445557c7133e63b0d1135acaec104cfb632")
    override fun requestPolicy(requestPolicy: RequestPolicy.Builder.() -> Unit): Unit =
        requestPolicy(RequestPolicy(requestPolicy))

    /**
     * @param throttlePolicy The throttling policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    override fun throttlePolicy(throttlePolicy: ThrottlePolicy) {
      cdkBuilder.throttlePolicy(throttlePolicy.let(ThrottlePolicy.Companion::unwrap))
    }

    /**
     * @param throttlePolicy The throttling policy of the delivery of SNS messages to HTTP/S
     * endpoints.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("246aa360aee75b4bae4ff780d15ed21324a0a483692c631dc8bfe5d0b03ce1d9")
    override fun throttlePolicy(throttlePolicy: ThrottlePolicy.Builder.() -> Unit): Unit =
        throttlePolicy(ThrottlePolicy(throttlePolicy))

    public fun build(): software.amazon.awscdk.services.sns.DeliveryPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.DeliveryPolicy,
  ) : CdkObject(cdkObject),
      DeliveryPolicy {
    /**
     * The retry policy of the delivery of SNS messages to HTTP/S endpoints.
     *
     * Default: - Amazon SNS attempts up to three retries with a delay between failed attempts set
     * at 20 seconds
     */
    override fun healthyRetryPolicy(): HealthyRetryPolicy? =
        unwrap(this).getHealthyRetryPolicy()?.let(HealthyRetryPolicy::wrap)

    /**
     * The request of the content sent in AWS SNS HTTP/S requests.
     *
     * Default: - The content type is set to 'text/plain; charset=UTF-8'
     */
    override fun requestPolicy(): RequestPolicy? =
        unwrap(this).getRequestPolicy()?.let(RequestPolicy::wrap)

    /**
     * The throttling policy of the delivery of SNS messages to HTTP/S endpoints.
     *
     * Default: - No throttling
     */
    override fun throttlePolicy(): ThrottlePolicy? =
        unwrap(this).getThrottlePolicy()?.let(ThrottlePolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeliveryPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.DeliveryPolicy): DeliveryPolicy
        = CdkObjectWrappers.wrap(cdkObject) as? DeliveryPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeliveryPolicy): software.amazon.awscdk.services.sns.DeliveryPolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.DeliveryPolicy
  }
}
