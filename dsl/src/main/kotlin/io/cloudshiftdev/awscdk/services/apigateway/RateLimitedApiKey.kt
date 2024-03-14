package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RateLimitedApiKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.RateLimitedApiKey,
) : Resource(cdkObject), IApiKey {
  public open fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantReadWrite(grantee: IGrantable): Grant =
      unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun keyArn(): String = unwrap(this).getKeyArn()

  public override fun keyId(): String = unwrap(this).getKeyId()

  public interface Builder {
    public fun apiKeyName(apiKeyName: String) {
    }

    public fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
    }

    public fun customerId(customerId: String) {
    }

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f50ff071625981764f82429784ac3715b63e9f508b1e50d085551637034bad70")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit) {
    }

    public fun defaultIntegration(defaultIntegration: Integration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60439bd874f0211a9dafedf2e647e2c45f5a751727d104ed0e83c0f0c9fbb67c")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit) {
    }

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef97845dba141b04eefe2f909187c753c4024aac51744efff91a0adc77af1c6f")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun generateDistinctId(generateDistinctId: Boolean) {
    }

    public fun quota(quota: QuotaSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a77bfbeb4a98e3eddcfd39cfed3e64991adc4e7ddb06d0d29ce83cf2cced7c")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>) {
    }

    public fun stages(stages: List<IStage>) {
    }

    public fun throttle(throttle: ThrottleSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c653e494d941860dd189f107cb8a8595ac6894842b9a37fc7e36b41b4de4771")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RateLimitedApiKey.Builder =
        software.amazon.awscdk.services.apigateway.RateLimitedApiKey.Builder.create(scope, id)

    public override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    public override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage::unwrap))
    }

    public override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    public override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f50ff071625981764f82429784ac3715b63e9f508b1e50d085551637034bad70")
    public override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    public override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60439bd874f0211a9dafedf2e647e2c45f5a751727d104ed0e83c0f0c9fbb67c")
    public override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit
        = defaultIntegration(Integration(defaultIntegration))

    public override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef97845dba141b04eefe2f909187c753c4024aac51744efff91a0adc77af1c6f")
    public override
        fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit =
        defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    public override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a77bfbeb4a98e3eddcfd39cfed3e64991adc4e7ddb06d0d29ce83cf2cced7c")
    public override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit =
        quota(QuotaSettings(quota))

    @Deprecated(message = "deprecated in CDK")
    public override fun resources(resources: List<IRestApi>) {
      cdkBuilder.resources(resources.map(IRestApi::unwrap))
    }

    public override fun stages(stages: List<IStage>) {
      cdkBuilder.stages(stages.map(IStage::unwrap))
    }

    public override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c653e494d941860dd189f107cb8a8595ac6894842b9a37fc7e36b41b4de4771")
    public override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RateLimitedApiKey =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
