package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface MixedInstancesPolicy {
  public fun instancesDistribution(): InstancesDistribution? =
      unwrap(this).getInstancesDistribution()?.let(InstancesDistribution::wrap)

  public fun launchTemplate(): ILaunchTemplate

  public fun launchTemplateOverrides(): List<LaunchTemplateOverrides> =
      unwrap(this).getLaunchTemplateOverrides()?.map(LaunchTemplateOverrides::wrap) ?: emptyList()

  public interface Builder {
    public fun instancesDistribution(instancesDistribution: InstancesDistribution) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8175cc2284effd63b97f36cc7962fb356b67c47298855ae68b1aa3494c9fd10b")
    public
        fun instancesDistribution(instancesDistribution: InstancesDistribution.Builder.() -> Unit) {
    }

    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
    }

    public fun launchTemplateOverrides(launchTemplateOverrides: List<LaunchTemplateOverrides>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy.Builder
        = software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy.builder()

    public override fun instancesDistribution(instancesDistribution: InstancesDistribution) {
      cdkBuilder.instancesDistribution(instancesDistribution.let(InstancesDistribution::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8175cc2284effd63b97f36cc7962fb356b67c47298855ae68b1aa3494c9fd10b")
    public override
        fun instancesDistribution(instancesDistribution: InstancesDistribution.Builder.() -> Unit):
        Unit = instancesDistribution(InstancesDistribution(instancesDistribution))

    public override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    public override
        fun launchTemplateOverrides(launchTemplateOverrides: List<LaunchTemplateOverrides>) {
      cdkBuilder.launchTemplateOverrides(launchTemplateOverrides.map(LaunchTemplateOverrides::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy,
  ) : MixedInstancesPolicy {
    public override fun instancesDistribution(): InstancesDistribution? =
        unwrap(this).getInstancesDistribution()?.let(InstancesDistribution::wrap)

    public override fun launchTemplate(): ILaunchTemplate =
        unwrap(this).getLaunchTemplate().let(ILaunchTemplate::wrap)

    public override fun launchTemplateOverrides(): List<LaunchTemplateOverrides> =
        unwrap(this).getLaunchTemplateOverrides()?.map(LaunchTemplateOverrides::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MixedInstancesPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy):
        MixedInstancesPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MixedInstancesPolicy):
        software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy = (wrapped as
        Wrapper).cdkObject
  }
}
