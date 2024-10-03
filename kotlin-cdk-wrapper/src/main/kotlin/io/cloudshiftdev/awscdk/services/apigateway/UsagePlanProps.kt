@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
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
public interface UsagePlanProps {
  /**
   * API Stages to be associated with the usage plan.
   *
   * Default: none
   */
  public fun apiStages(): List<UsagePlanPerApiStage> =
      unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

  /**
   * Represents usage plan purpose.
   *
   * Default: none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Name for this usage plan.
   *
   * Default: none
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Number of requests clients can make in a given time period.
   *
   * Default: none
   */
  public fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

  /**
   * Overall throttle settings for the API.
   *
   * Default: none
   */
  public fun throttle(): ThrottleSettings? = unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

  /**
   * A builder for [UsagePlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiStages API Stages to be associated with the usage plan.
     */
    public fun apiStages(apiStages: List<UsagePlanPerApiStage>)

    /**
     * @param apiStages API Stages to be associated with the usage plan.
     */
    public fun apiStages(vararg apiStages: UsagePlanPerApiStage)

    /**
     * @param description Represents usage plan purpose.
     */
    public fun description(description: String)

    /**
     * @param name Name for this usage plan.
     */
    public fun name(name: String)

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    public fun quota(quota: QuotaSettings)

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d12cdfee5bdbbb46ad7762a8f4725bbb9de358c9aba228ca734dc859ecfec4")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit)

    /**
     * @param throttle Overall throttle settings for the API.
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * @param throttle Overall throttle settings for the API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e846046156076b7275e27bc5f467db9c4ce70e1c888c1939c11dad216314a65")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.UsagePlanProps.Builder =
        software.amazon.awscdk.services.apigateway.UsagePlanProps.builder()

    /**
     * @param apiStages API Stages to be associated with the usage plan.
     */
    override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage.Companion::unwrap))
    }

    /**
     * @param apiStages API Stages to be associated with the usage plan.
     */
    override fun apiStages(vararg apiStages: UsagePlanPerApiStage): Unit =
        apiStages(apiStages.toList())

    /**
     * @param description Represents usage plan purpose.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name Name for this usage plan.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings.Companion::unwrap))
    }

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d12cdfee5bdbbb46ad7762a8f4725bbb9de358c9aba228ca734dc859ecfec4")
    override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit = quota(QuotaSettings(quota))

    /**
     * @param throttle Overall throttle settings for the API.
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings.Companion::unwrap))
    }

    /**
     * @param throttle Overall throttle settings for the API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e846046156076b7275e27bc5f467db9c4ce70e1c888c1939c11dad216314a65")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.UsagePlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanProps,
  ) : CdkObject(cdkObject),
      UsagePlanProps {
    /**
     * API Stages to be associated with the usage plan.
     *
     * Default: none
     */
    override fun apiStages(): List<UsagePlanPerApiStage> =
        unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

    /**
     * Represents usage plan purpose.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Name for this usage plan.
     *
     * Default: none
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Number of requests clients can make in a given time period.
     *
     * Default: none
     */
    override fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

    /**
     * Overall throttle settings for the API.
     *
     * Default: none
     */
    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UsagePlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanProps):
        UsagePlanProps = CdkObjectWrappers.wrap(cdkObject) as? UsagePlanProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UsagePlanProps):
        software.amazon.awscdk.services.apigateway.UsagePlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.UsagePlanProps
  }
}
