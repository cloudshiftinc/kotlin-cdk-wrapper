@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Container for defining throttling parameters to API stages or methods.
 *
 * Example:
 *
 * ```
 * LambdaIntegration integration;
 * RestApi api = new RestApi(this, "hello-api");
 * Resource v1 = api.root.addResource("v1");
 * Resource echo = v1.addResource("echo");
 * Method echoMethod = echo.addMethod("GET", integration,
 * MethodOptions.builder().apiKeyRequired(true).build());
 * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
 * .name("Easy")
 * .throttle(ThrottleSettings.builder()
 * .rateLimit(10)
 * .burstLimit(2)
 * .build())
 * .build());
 * IApiKey key = api.addApiKey("ApiKey");
 * plan.addApiKey(key);
 * ```
 */
public interface ThrottleSettings {
  /**
   * The maximum API request rate limit over a time ranging from one to a few seconds.
   *
   * Default: none
   */
  public fun burstLimit(): Number? = unwrap(this).getBurstLimit()

  /**
   * The API request steady-state rate limit (average requests per second over an extended period of
   * time).
   *
   * Default: none
   */
  public fun rateLimit(): Number? = unwrap(this).getRateLimit()

  /**
   * A builder for [ThrottleSettings]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param burstLimit The maximum API request rate limit over a time ranging from one to a few
     * seconds.
     */
    public fun burstLimit(burstLimit: Number)

    /**
     * @param rateLimit The API request steady-state rate limit (average requests per second over an
     * extended period of time).
     */
    public fun rateLimit(rateLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ThrottleSettings.Builder =
        software.amazon.awscdk.services.apigateway.ThrottleSettings.builder()

    /**
     * @param burstLimit The maximum API request rate limit over a time ranging from one to a few
     * seconds.
     */
    override fun burstLimit(burstLimit: Number) {
      cdkBuilder.burstLimit(burstLimit)
    }

    /**
     * @param rateLimit The API request steady-state rate limit (average requests per second over an
     * extended period of time).
     */
    override fun rateLimit(rateLimit: Number) {
      cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ThrottleSettings =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.ThrottleSettings,
  ) : CdkObject(cdkObject),
      ThrottleSettings {
    /**
     * The maximum API request rate limit over a time ranging from one to a few seconds.
     *
     * Default: none
     */
    override fun burstLimit(): Number? = unwrap(this).getBurstLimit()

    /**
     * The API request steady-state rate limit (average requests per second over an extended period
     * of time).
     *
     * Default: none
     */
    override fun rateLimit(): Number? = unwrap(this).getRateLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ThrottleSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ThrottleSettings):
        ThrottleSettings = CdkObjectWrappers.wrap(cdkObject) as? ThrottleSettings ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThrottleSettings):
        software.amazon.awscdk.services.apigateway.ThrottleSettings = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ThrottleSettings
  }
}
