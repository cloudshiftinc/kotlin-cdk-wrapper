@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Specifies the maximum number of requests that clients can make to API Gateway APIs.
 *
 * Example:
 *
 * ```
 * RestApi api;
 * RateLimitedApiKey key = RateLimitedApiKey.Builder.create(this, "rate-limited-api-key")
 * .customerId("hello-customer")
 * .stages(List.of(api.getDeploymentStage()))
 * .quota(QuotaSettings.builder()
 * .limit(10000)
 * .period(Period.MONTH)
 * .build())
 * .build();
 * ```
 */
public interface QuotaSettings {
  /**
   * The maximum number of requests that users can make within the specified time period.
   *
   * Default: none
   */
  public fun limit(): Number? = unwrap(this).getLimit()

  /**
   * For the initial time period, the number of requests to subtract from the specified limit.
   *
   * Default: none
   */
  public fun offset(): Number? = unwrap(this).getOffset()

  /**
   * The time period for which the maximum limit of requests applies.
   *
   * Default: none
   */
  public fun period(): Period? = unwrap(this).getPeriod()?.let(Period::wrap)

  /**
   * A builder for [QuotaSettings]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param limit The maximum number of requests that users can make within the specified time
     * period.
     */
    public fun limit(limit: Number)

    /**
     * @param offset For the initial time period, the number of requests to subtract from the
     * specified limit.
     */
    public fun offset(offset: Number)

    /**
     * @param period The time period for which the maximum limit of requests applies.
     */
    public fun period(period: Period)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.QuotaSettings.Builder =
        software.amazon.awscdk.services.apigateway.QuotaSettings.builder()

    /**
     * @param limit The maximum number of requests that users can make within the specified time
     * period.
     */
    override fun limit(limit: Number) {
      cdkBuilder.limit(limit)
    }

    /**
     * @param offset For the initial time period, the number of requests to subtract from the
     * specified limit.
     */
    override fun offset(offset: Number) {
      cdkBuilder.offset(offset)
    }

    /**
     * @param period The time period for which the maximum limit of requests applies.
     */
    override fun period(period: Period) {
      cdkBuilder.period(period.let(Period.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.QuotaSettings =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.QuotaSettings,
  ) : CdkObject(cdkObject),
      QuotaSettings {
    /**
     * The maximum number of requests that users can make within the specified time period.
     *
     * Default: none
     */
    override fun limit(): Number? = unwrap(this).getLimit()

    /**
     * For the initial time period, the number of requests to subtract from the specified limit.
     *
     * Default: none
     */
    override fun offset(): Number? = unwrap(this).getOffset()

    /**
     * The time period for which the maximum limit of requests applies.
     *
     * Default: none
     */
    override fun period(): Period? = unwrap(this).getPeriod()?.let(Period::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QuotaSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.QuotaSettings):
        QuotaSettings = CdkObjectWrappers.wrap(cdkObject) as? QuotaSettings ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: QuotaSettings):
        software.amazon.awscdk.services.apigateway.QuotaSettings = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.QuotaSettings
  }
}
