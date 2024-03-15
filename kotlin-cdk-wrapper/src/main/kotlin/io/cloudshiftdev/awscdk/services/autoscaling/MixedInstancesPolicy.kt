@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface MixedInstancesPolicy {
  public fun instancesDistribution(): InstancesDistribution? =
      unwrap(this).getInstancesDistribution()?.let(InstancesDistribution::wrap)

  public fun launchTemplate(): ILaunchTemplate

  public fun launchTemplateOverrides(): List<LaunchTemplateOverrides> =
      unwrap(this).getLaunchTemplateOverrides()?.map(LaunchTemplateOverrides::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun instancesDistribution(instancesDistribution: InstancesDistribution)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8175cc2284effd63b97f36cc7962fb356b67c47298855ae68b1aa3494c9fd10b")
    public
        fun instancesDistribution(instancesDistribution: InstancesDistribution.Builder.() -> Unit)

    public fun launchTemplate(launchTemplate: ILaunchTemplate)

    public fun launchTemplateOverrides(launchTemplateOverrides: List<LaunchTemplateOverrides>)

    public fun launchTemplateOverrides(vararg launchTemplateOverrides: LaunchTemplateOverrides)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy.Builder
        = software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy.builder()

    override fun instancesDistribution(instancesDistribution: InstancesDistribution) {
      cdkBuilder.instancesDistribution(instancesDistribution.let(InstancesDistribution::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8175cc2284effd63b97f36cc7962fb356b67c47298855ae68b1aa3494c9fd10b")
    override
        fun instancesDistribution(instancesDistribution: InstancesDistribution.Builder.() -> Unit):
        Unit = instancesDistribution(InstancesDistribution(instancesDistribution))

    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    override fun launchTemplateOverrides(launchTemplateOverrides: List<LaunchTemplateOverrides>) {
      cdkBuilder.launchTemplateOverrides(launchTemplateOverrides.map(LaunchTemplateOverrides::unwrap))
    }

    override fun launchTemplateOverrides(vararg launchTemplateOverrides: LaunchTemplateOverrides):
        Unit = launchTemplateOverrides(launchTemplateOverrides.toList())

    public fun build(): software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy,
  ) : CdkObject(cdkObject), MixedInstancesPolicy {
    override fun instancesDistribution(): InstancesDistribution? =
        unwrap(this).getInstancesDistribution()?.let(InstancesDistribution::wrap)

    override fun launchTemplate(): ILaunchTemplate =
        unwrap(this).getLaunchTemplate().let(ILaunchTemplate::wrap)

    override fun launchTemplateOverrides(): List<LaunchTemplateOverrides> =
        unwrap(this).getLaunchTemplateOverrides()?.map(LaunchTemplateOverrides::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MixedInstancesPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy):
        MixedInstancesPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MixedInstancesPolicy):
        software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy
  }
}
