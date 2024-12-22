@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Options for customising AWS SNS HTTP/S delivery throttling.
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
public interface ThrottlePolicy {
  /**
   * The maximum number of deliveries per second, per subscription.
   *
   * Default: - no throttling
   */
  public fun maxReceivesPerSecond(): Number? = unwrap(this).getMaxReceivesPerSecond()

  /**
   * A builder for [ThrottlePolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxReceivesPerSecond The maximum number of deliveries per second, per subscription.
     */
    public fun maxReceivesPerSecond(maxReceivesPerSecond: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.ThrottlePolicy.Builder =
        software.amazon.awscdk.services.sns.ThrottlePolicy.builder()

    /**
     * @param maxReceivesPerSecond The maximum number of deliveries per second, per subscription.
     */
    override fun maxReceivesPerSecond(maxReceivesPerSecond: Number) {
      cdkBuilder.maxReceivesPerSecond(maxReceivesPerSecond)
    }

    public fun build(): software.amazon.awscdk.services.sns.ThrottlePolicy = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.ThrottlePolicy,
  ) : CdkObject(cdkObject),
      ThrottlePolicy {
    /**
     * The maximum number of deliveries per second, per subscription.
     *
     * Default: - no throttling
     */
    override fun maxReceivesPerSecond(): Number? = unwrap(this).getMaxReceivesPerSecond()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ThrottlePolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.ThrottlePolicy): ThrottlePolicy
        = CdkObjectWrappers.wrap(cdkObject) as? ThrottlePolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThrottlePolicy): software.amazon.awscdk.services.sns.ThrottlePolicy
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.ThrottlePolicy
  }
}
