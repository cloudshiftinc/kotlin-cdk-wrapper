@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * RateLimitedApiKey properties.
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
public interface RateLimitedApiKeyProps : ApiKeyProps {
  /**
   * API Stages to be associated with the RateLimitedApiKey.
   *
   * Default: none
   */
  public fun apiStages(): List<UsagePlanPerApiStage> =
      unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

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
   * A builder for [RateLimitedApiKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyName A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     */
    public fun apiKeyName(apiKeyName: String)

    /**
     * @param apiStages API Stages to be associated with the RateLimitedApiKey.
     */
    public fun apiStages(apiStages: List<UsagePlanPerApiStage>)

    /**
     * @param apiStages API Stages to be associated with the RateLimitedApiKey.
     */
    public fun apiStages(vararg apiStages: UsagePlanPerApiStage)

    /**
     * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS
     * SaaS Marketplace.
     */
    public fun customerId(customerId: String)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80bb91160a8be1187c5b62e66defb6bea2825210d1cc43ebd50107104867869c")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab560c658cfd507153ed119c580c7c97375b4449950f6e765d71f999a660aa91")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a4175587c1a432d6985f0d6112c40f7baf61edb6380d1d9d1c6d6ccb32ecad4")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    /**
     * @param description A description of the purpose of the API key.
     */
    public fun description(description: String)

    /**
     * @param enabled Indicates whether the API key can be used by clients.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param generateDistinctId Specifies whether the key identifier is distinct from the created
     * API key value.
     */
    public fun generateDistinctId(generateDistinctId: Boolean)

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    public fun quota(quota: QuotaSettings)

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75e337554aa344222be2cf14e85873dde8e47d7f78dee8f2f32877fed0fdcf8b")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit)

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>)

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun resources(vararg resources: IRestApi)

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    public fun stages(stages: List<IStage>)

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    public fun stages(vararg stages: IStage)

    /**
     * @param throttle Overall throttle settings for the API.
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * @param throttle Overall throttle settings for the API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15525debf8d2fad76075bd5f954658a8eaf6631c45c7ea2378b0b76c27c82bb5")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)

    /**
     * @param value The value of the API key.
     * Must be at least 20 characters long.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps.Builder =
        software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps.builder()

    /**
     * @param apiKeyName A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     */
    override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    /**
     * @param apiStages API Stages to be associated with the RateLimitedApiKey.
     */
    override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage::unwrap))
    }

    /**
     * @param apiStages API Stages to be associated with the RateLimitedApiKey.
     */
    override fun apiStages(vararg apiStages: UsagePlanPerApiStage): Unit =
        apiStages(apiStages.toList())

    /**
     * @param customerId An AWS Marketplace customer identifier to use when integrating with the AWS
     * SaaS Marketplace.
     */
    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80bb91160a8be1187c5b62e66defb6bea2825210d1cc43ebd50107104867869c")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab560c658cfd507153ed119c580c7c97375b4449950f6e765d71f999a660aa91")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a4175587c1a432d6985f0d6112c40f7baf61edb6380d1d9d1c6d6ccb32ecad4")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    /**
     * @param description A description of the purpose of the API key.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enabled Indicates whether the API key can be used by clients.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param generateDistinctId Specifies whether the key identifier is distinct from the created
     * API key value.
     */
    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings::unwrap))
    }

    /**
     * @param quota Number of requests clients can make in a given time period.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75e337554aa344222be2cf14e85873dde8e47d7f78dee8f2f32877fed0fdcf8b")
    override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit = quota(QuotaSettings(quota))

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resources(resources: List<IRestApi>) {
      cdkBuilder.resources(resources.map(IRestApi::unwrap))
    }

    /**
     * @param resources A list of resources this api key is associated with.
     * @deprecated - use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resources(vararg resources: IRestApi): Unit = resources(resources.toList())

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    override fun stages(stages: List<IStage>) {
      cdkBuilder.stages(stages.map(IStage::unwrap))
    }

    /**
     * @param stages A list of Stages this api key is associated with.
     */
    override fun stages(vararg stages: IStage): Unit = stages(stages.toList())

    /**
     * @param throttle Overall throttle settings for the API.
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    /**
     * @param throttle Overall throttle settings for the API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15525debf8d2fad76075bd5f954658a8eaf6631c45c7ea2378b0b76c27c82bb5")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    /**
     * @param value The value of the API key.
     * Must be at least 20 characters long.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps,
  ) : CdkObject(cdkObject), RateLimitedApiKeyProps {
    /**
     * A name for the API key.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name.
     *
     * Default: automically generated name
     */
    override fun apiKeyName(): String? = unwrap(this).getApiKeyName()

    /**
     * API Stages to be associated with the RateLimitedApiKey.
     *
     * Default: none
     */
    override fun apiStages(): List<UsagePlanPerApiStage> =
        unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     *
     * Default: none
     */
    override fun customerId(): String? = unwrap(this).getCustomerId()

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     */
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    /**
     * A description of the purpose of the API key.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether the API key can be used by clients.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Specifies whether the key identifier is distinct from the created API key value.
     *
     * Default: false
     */
    override fun generateDistinctId(): Boolean? = unwrap(this).getGenerateDistinctId()

    /**
     * Number of requests clients can make in a given time period.
     *
     * Default: none
     */
    override fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

    /**
     * (deprecated) A list of resources this api key is associated with.
     *
     * Default: none
     *
     * * use `stages` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resources(): List<IRestApi> = unwrap(this).getResources()?.map(IRestApi::wrap) ?:
        emptyList()

    /**
     * A list of Stages this api key is associated with.
     *
     * Default: - the api key is not associated with any stages
     */
    override fun stages(): List<IStage> = unwrap(this).getStages()?.map(IStage::wrap) ?: emptyList()

    /**
     * Overall throttle settings for the API.
     *
     * Default: none
     */
    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

    /**
     * The value of the API key.
     *
     * Must be at least 20 characters long.
     *
     * Default: none
     */
    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitedApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps):
        RateLimitedApiKeyProps = CdkObjectWrappers.wrap(cdkObject) as? RateLimitedApiKeyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RateLimitedApiKeyProps):
        software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
  }
}
