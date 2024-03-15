@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationSettingsProps {
  public fun applicationId(): String

  public fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  public fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

  public fun limits(): Any? = unwrap(this).getLimits()

  public fun quietTime(): Any? = unwrap(this).getQuietTime()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun campaignHook(campaignHook: IResolvable)

    public fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a608e559e20a9aeff8b9d146c36f5246df3fd8d138c7fb07d19b71e0862a4408")
    public
        fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty.Builder.() -> Unit)

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean)

    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable)

    public fun limits(limits: IResolvable)

    public fun limits(limits: CfnApplicationSettings.LimitsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad203f5494a3269791fb2d6e6a4af41fa6afe328ca7a8eb70e252af4f671e595")
    public fun limits(limits: CfnApplicationSettings.LimitsProperty.Builder.() -> Unit)

    public fun quietTime(quietTime: IResolvable)

    public fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ed106ecc8f33c3ddb5a1899c41466b40be21bd2b6c4b5708b995eccf1065450")
    public fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable::unwrap))
    }

    override fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CfnApplicationSettings.CampaignHookProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a608e559e20a9aeff8b9d146c36f5246df3fd8d138c7fb07d19b71e0862a4408")
    override
        fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty.Builder.() -> Unit):
        Unit = campaignHook(CfnApplicationSettings.CampaignHookProperty(campaignHook))

    override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable::unwrap))
    }

    override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable::unwrap))
    }

    override fun limits(limits: CfnApplicationSettings.LimitsProperty) {
      cdkBuilder.limits(limits.let(CfnApplicationSettings.LimitsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad203f5494a3269791fb2d6e6a4af41fa6afe328ca7a8eb70e252af4f671e595")
    override fun limits(limits: CfnApplicationSettings.LimitsProperty.Builder.() -> Unit): Unit =
        limits(CfnApplicationSettings.LimitsProperty(limits))

    override fun quietTime(quietTime: IResolvable) {
      cdkBuilder.quietTime(quietTime.let(IResolvable::unwrap))
    }

    override fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty) {
      cdkBuilder.quietTime(quietTime.let(CfnApplicationSettings.QuietTimeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ed106ecc8f33c3ddb5a1899c41466b40be21bd2b6c4b5708b995eccf1065450")
    override fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty.Builder.() -> Unit):
        Unit = quietTime(CfnApplicationSettings.QuietTimeProperty(quietTime))

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps,
  ) : CdkObject(cdkObject), CfnApplicationSettingsProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun campaignHook(): Any? = unwrap(this).getCampaignHook()

    override fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

    override fun limits(): Any? = unwrap(this).getLimits()

    override fun quietTime(): Any? = unwrap(this).getQuietTime()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps):
        CfnApplicationSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationSettingsProps):
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps
  }
}
