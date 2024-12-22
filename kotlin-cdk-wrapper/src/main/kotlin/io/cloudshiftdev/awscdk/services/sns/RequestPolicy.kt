@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for customising aspects of the content sent in AWS SNS HTTP/S requests.
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
public interface RequestPolicy {
  /**
   * The content type of the notification being sent to HTTP/S endpoints.
   *
   * Default: - text/plain; charset=UTF-8
   */
  public fun headerContentType(): String? = unwrap(this).getHeaderContentType()

  /**
   * A builder for [RequestPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param headerContentType The content type of the notification being sent to HTTP/S endpoints.
     */
    public fun headerContentType(headerContentType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.RequestPolicy.Builder =
        software.amazon.awscdk.services.sns.RequestPolicy.builder()

    /**
     * @param headerContentType The content type of the notification being sent to HTTP/S endpoints.
     */
    override fun headerContentType(headerContentType: String) {
      cdkBuilder.headerContentType(headerContentType)
    }

    public fun build(): software.amazon.awscdk.services.sns.RequestPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.RequestPolicy,
  ) : CdkObject(cdkObject),
      RequestPolicy {
    /**
     * The content type of the notification being sent to HTTP/S endpoints.
     *
     * Default: - text/plain; charset=UTF-8
     */
    override fun headerContentType(): String? = unwrap(this).getHeaderContentType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.RequestPolicy): RequestPolicy =
        CdkObjectWrappers.wrap(cdkObject) as? RequestPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestPolicy): software.amazon.awscdk.services.sns.RequestPolicy =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.RequestPolicy
  }
}
