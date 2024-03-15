@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface RateLimitedApiKeyProps : ApiKeyProps {
  public fun apiStages(): List<UsagePlanPerApiStage> =
      unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

  public fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

  public fun throttle(): ThrottleSettings? = unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyName(apiKeyName: String)

    public fun apiStages(apiStages: List<UsagePlanPerApiStage>)

    public fun apiStages(vararg apiStages: UsagePlanPerApiStage)

    public fun customerId(customerId: String)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80bb91160a8be1187c5b62e66defb6bea2825210d1cc43ebd50107104867869c")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab560c658cfd507153ed119c580c7c97375b4449950f6e765d71f999a660aa91")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a4175587c1a432d6985f0d6112c40f7baf61edb6380d1d9d1c6d6ccb32ecad4")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun generateDistinctId(generateDistinctId: Boolean)

    public fun quota(quota: QuotaSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75e337554aa344222be2cf14e85873dde8e47d7f78dee8f2f32877fed0fdcf8b")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(vararg resources: IRestApi)

    public fun stages(stages: List<IStage>)

    public fun stages(vararg stages: IStage)

    public fun throttle(throttle: ThrottleSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15525debf8d2fad76075bd5f954658a8eaf6631c45c7ea2378b0b76c27c82bb5")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps.Builder =
        software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps.builder()

    override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage::unwrap))
    }

    override fun apiStages(vararg apiStages: UsagePlanPerApiStage): Unit =
        apiStages(apiStages.toList())

    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80bb91160a8be1187c5b62e66defb6bea2825210d1cc43ebd50107104867869c")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab560c658cfd507153ed119c580c7c97375b4449950f6e765d71f999a660aa91")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a4175587c1a432d6985f0d6112c40f7baf61edb6380d1d9d1c6d6ccb32ecad4")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75e337554aa344222be2cf14e85873dde8e47d7f78dee8f2f32877fed0fdcf8b")
    override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit = quota(QuotaSettings(quota))

    @Deprecated(message = "deprecated in CDK")
    override fun resources(resources: List<IRestApi>) {
      cdkBuilder.resources(resources.map(IRestApi::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun resources(vararg resources: IRestApi): Unit = resources(resources.toList())

    override fun stages(stages: List<IStage>) {
      cdkBuilder.stages(stages.map(IStage::unwrap))
    }

    override fun stages(vararg stages: IStage): Unit = stages(stages.toList())

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15525debf8d2fad76075bd5f954658a8eaf6631c45c7ea2378b0b76c27c82bb5")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps,
  ) : CdkObject(cdkObject), RateLimitedApiKeyProps {
    override fun apiKeyName(): String? = unwrap(this).getApiKeyName()

    override fun apiStages(): List<UsagePlanPerApiStage> =
        unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

    override fun customerId(): String? = unwrap(this).getCustomerId()

    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun generateDistinctId(): Boolean? = unwrap(this).getGenerateDistinctId()

    override fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun resources(): List<IRestApi> = unwrap(this).getResources()?.map(IRestApi::wrap) ?:
        emptyList()

    override fun stages(): List<IStage> = unwrap(this).getStages()?.map(IStage::wrap) ?: emptyList()

    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RateLimitedApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps):
        RateLimitedApiKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RateLimitedApiKeyProps):
        software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RateLimitedApiKeyProps
  }
}
