package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UsagePlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.UsagePlan,
) : Resource(cdkObject), IUsagePlan {
  public override fun addApiKey(apiKey: IApiKey) {
    unwrap(this).addApiKey(apiKey.let(IApiKey::unwrap))
  }

  public override fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions) {
    unwrap(this).addApiKey(apiKey.let(IApiKey::unwrap), options.let(AddApiKeyOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f5ef86a87be3209ae0cbdb48ee812520d7927d679407f259483e5c3856b59ac")
  public override fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions.Builder.() -> Unit): Unit
      = addApiKey(apiKey, AddApiKeyOptions(options))

  public open fun addApiStage(apiStage: UsagePlanPerApiStage) {
    unwrap(this).addApiStage(apiStage.let(UsagePlanPerApiStage::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a7754d760ff4571903b19d230e81b9024e4d98bb2380f3259d59bcba435ba8f")
  public open fun addApiStage(apiStage: UsagePlanPerApiStage.Builder.() -> Unit): Unit =
      addApiStage(UsagePlanPerApiStage(apiStage))

  public override fun usagePlanId(): String = unwrap(this).getUsagePlanId()

  public interface Builder {
    public fun apiStages(apiStages: List<UsagePlanPerApiStage>)

    public fun description(description: String)

    public fun name(name: String)

    public fun quota(quota: QuotaSettings)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3dddaab8cb54bd4f648fc607743b3d7ac24dbbdb19d14d809341832e821313")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit)

    public fun throttle(throttle: ThrottleSettings)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b8b5c0eb07927357fc4949f0c320f751c1e9d5ee18a74234d2530f2c6758ea")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.UsagePlan.Builder =
        software.amazon.awscdk.services.apigateway.UsagePlan.Builder.create(scope, id)

    override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3dddaab8cb54bd4f648fc607743b3d7ac24dbbdb19d14d809341832e821313")
    override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit = quota(QuotaSettings(quota))

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b8b5c0eb07927357fc4949f0c320f751c1e9d5ee18a74234d2530f2c6758ea")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.UsagePlan = cdkBuilder.build()
  }

  public companion object {
    public open fun fromUsagePlanId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      usagePlanId: String,
    ): IUsagePlan =
        software.amazon.awscdk.services.apigateway.UsagePlan.fromUsagePlanId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, usagePlanId).let(IUsagePlan::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UsagePlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UsagePlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.UsagePlan): UsagePlan =
        UsagePlan(cdkObject)

    internal fun unwrap(wrapped: UsagePlan): software.amazon.awscdk.services.apigateway.UsagePlan =
        wrapped.cdkObject
  }
}
