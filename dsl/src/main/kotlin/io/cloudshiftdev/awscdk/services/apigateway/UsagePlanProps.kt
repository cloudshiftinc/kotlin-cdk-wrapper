package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UsagePlanProps {
  public fun apiStages(): List<UsagePlanPerApiStage> =
      unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

  public fun throttle(): ThrottleSettings? = unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

  public interface Builder {
    public fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun quota(quota: QuotaSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d12cdfee5bdbbb46ad7762a8f4725bbb9de358c9aba228ca734dc859ecfec4")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit) {
    }

    public fun throttle(throttle: ThrottleSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e846046156076b7275e27bc5f467db9c4ce70e1c888c1939c11dad216314a65")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.UsagePlanProps.Builder =
        software.amazon.awscdk.services.apigateway.UsagePlanProps.builder()

    public override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d12cdfee5bdbbb46ad7762a8f4725bbb9de358c9aba228ca734dc859ecfec4")
    public override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit =
        quota(QuotaSettings(quota))

    public override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e846046156076b7275e27bc5f467db9c4ce70e1c888c1939c11dad216314a65")
    public override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.UsagePlanProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanProps,
  ) : UsagePlanProps {
    public override fun apiStages(): List<UsagePlanPerApiStage> =
        unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun name(): String? = unwrap(this).getName()

    public override fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

    public override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UsagePlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanProps):
        UsagePlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UsagePlanProps):
        software.amazon.awscdk.services.apigateway.UsagePlanProps = (wrapped as Wrapper).cdkObject
  }
}
