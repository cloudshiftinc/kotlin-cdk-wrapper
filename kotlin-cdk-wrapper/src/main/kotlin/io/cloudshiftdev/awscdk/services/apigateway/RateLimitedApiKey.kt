@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RateLimitedApiKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.RateLimitedApiKey,
) : Resource(cdkObject), IApiKey {
  public open fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantReadWrite(grantee: IGrantable): Grant =
      unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun keyArn(): String = unwrap(this).getKeyArn()

  public override fun keyId(): String = unwrap(this).getKeyId()

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyName(apiKeyName: String)

    public fun apiStages(apiStages: List<UsagePlanPerApiStage>)

    public fun apiStages(vararg apiStages: UsagePlanPerApiStage)

    public fun customerId(customerId: String)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f50ff071625981764f82429784ac3715b63e9f508b1e50d085551637034bad70")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60439bd874f0211a9dafedf2e647e2c45f5a751727d104ed0e83c0f0c9fbb67c")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef97845dba141b04eefe2f909187c753c4024aac51744efff91a0adc77af1c6f")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun generateDistinctId(generateDistinctId: Boolean)

    public fun quota(quota: QuotaSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a77bfbeb4a98e3eddcfd39cfed3e64991adc4e7ddb06d0d29ce83cf2cced7c")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(vararg resources: IRestApi)

    public fun stages(stages: List<IStage>)

    public fun stages(vararg stages: IStage)

    public fun throttle(throttle: ThrottleSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c653e494d941860dd189f107cb8a8595ac6894842b9a37fc7e36b41b4de4771")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RateLimitedApiKey.Builder =
        software.amazon.awscdk.services.apigateway.RateLimitedApiKey.Builder.create(scope, id)

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
    @JvmName("f50ff071625981764f82429784ac3715b63e9f508b1e50d085551637034bad70")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60439bd874f0211a9dafedf2e647e2c45f5a751727d104ed0e83c0f0c9fbb67c")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef97845dba141b04eefe2f909187c753c4024aac51744efff91a0adc77af1c6f")
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
    @JvmName("d3a77bfbeb4a98e3eddcfd39cfed3e64991adc4e7ddb06d0d29ce83cf2cced7c")
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
    @JvmName("6c653e494d941860dd189f107cb8a8595ac6894842b9a37fc7e36b41b4de4771")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RateLimitedApiKey =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RateLimitedApiKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RateLimitedApiKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RateLimitedApiKey):
        RateLimitedApiKey = RateLimitedApiKey(cdkObject)

    internal fun unwrap(wrapped: RateLimitedApiKey):
        software.amazon.awscdk.services.apigateway.RateLimitedApiKey = wrapped.cdkObject
  }
}
