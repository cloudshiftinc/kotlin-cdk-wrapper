@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUsagePlanProps {
  public fun apiStages(): Any? = unwrap(this).getApiStages()

  public fun description(): String? = unwrap(this).getDescription()

  public fun quota(): Any? = unwrap(this).getQuota()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun throttle(): Any? = unwrap(this).getThrottle()

  public fun usagePlanName(): String? = unwrap(this).getUsagePlanName()

  @CdkDslMarker
  public interface Builder {
    public fun apiStages(apiStages: IResolvable)

    public fun apiStages(apiStages: List<Any>)

    public fun apiStages(vararg apiStages: Any)

    public fun description(description: String)

    public fun quota(quota: IResolvable)

    public fun quota(quota: CfnUsagePlan.QuotaSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9854b4b8e14da0947215c44a9a604a1c6ad7f01403b5cbbfd5bf922a06879247")
    public fun quota(quota: CfnUsagePlan.QuotaSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun throttle(throttle: IResolvable)

    public fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e17daf260e81ca19f9bc3053aa08921fc3944154cfa8c40bd38ddad7000251fb")
    public fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty.Builder.() -> Unit)

    public fun usagePlanName(usagePlanName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlanProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnUsagePlanProps.builder()

    override fun apiStages(apiStages: IResolvable) {
      cdkBuilder.apiStages(apiStages.let(IResolvable::unwrap))
    }

    override fun apiStages(apiStages: List<Any>) {
      cdkBuilder.apiStages(apiStages)
    }

    override fun apiStages(vararg apiStages: Any): Unit = apiStages(apiStages.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun quota(quota: IResolvable) {
      cdkBuilder.quota(quota.let(IResolvable::unwrap))
    }

    override fun quota(quota: CfnUsagePlan.QuotaSettingsProperty) {
      cdkBuilder.quota(quota.let(CfnUsagePlan.QuotaSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9854b4b8e14da0947215c44a9a604a1c6ad7f01403b5cbbfd5bf922a06879247")
    override fun quota(quota: CfnUsagePlan.QuotaSettingsProperty.Builder.() -> Unit): Unit =
        quota(CfnUsagePlan.QuotaSettingsProperty(quota))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun throttle(throttle: IResolvable) {
      cdkBuilder.throttle(throttle.let(IResolvable::unwrap))
    }

    override fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty) {
      cdkBuilder.throttle(throttle.let(CfnUsagePlan.ThrottleSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e17daf260e81ca19f9bc3053aa08921fc3944154cfa8c40bd38ddad7000251fb")
    override fun throttle(throttle: CfnUsagePlan.ThrottleSettingsProperty.Builder.() -> Unit): Unit
        = throttle(CfnUsagePlan.ThrottleSettingsProperty(throttle))

    override fun usagePlanName(usagePlanName: String) {
      cdkBuilder.usagePlanName(usagePlanName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanProps,
  ) : CdkObject(cdkObject), CfnUsagePlanProps {
    override fun apiStages(): Any? = unwrap(this).getApiStages()

    override fun description(): String? = unwrap(this).getDescription()

    override fun quota(): Any? = unwrap(this).getQuota()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun throttle(): Any? = unwrap(this).getThrottle()

    override fun usagePlanName(): String? = unwrap(this).getUsagePlanName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUsagePlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanProps):
        CfnUsagePlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlanProps):
        software.amazon.awscdk.services.apigateway.CfnUsagePlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnUsagePlanProps
  }
}
