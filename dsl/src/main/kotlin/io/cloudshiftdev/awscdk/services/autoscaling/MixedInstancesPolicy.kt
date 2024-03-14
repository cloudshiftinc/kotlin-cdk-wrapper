package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface MixedInstancesPolicy {
  /**
   * InstancesDistribution to use.
   *
   * Default: - The value for each property in it uses a default value.
   */
  public fun instancesDistribution(): InstancesDistribution? =
      unwrap(this).getInstancesDistribution()?.let(InstancesDistribution::wrap)

  /**
   * Launch template to use.
   */
  public fun launchTemplate(): ILaunchTemplate

  /**
   * Launch template overrides.
   *
   * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
   *
   * The maximum number of distinct launch templates you can define for an Auto Scaling group is 20.
   *
   * Default: - Do not provide any overrides
   */
  public fun launchTemplateOverrides(): List<LaunchTemplateOverrides> =
      unwrap(this).getLaunchTemplateOverrides()?.map(LaunchTemplateOverrides::wrap) ?: emptyList()

  /**
   * A builder for [MixedInstancesPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instancesDistribution InstancesDistribution to use.
     */
    public fun instancesDistribution(instancesDistribution: InstancesDistribution)

    /**
     * @param instancesDistribution InstancesDistribution to use.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8175cc2284effd63b97f36cc7962fb356b67c47298855ae68b1aa3494c9fd10b")
    public
        fun instancesDistribution(instancesDistribution: InstancesDistribution.Builder.() -> Unit)

    /**
     * @param launchTemplate Launch template to use. 
     */
    public fun launchTemplate(launchTemplate: ILaunchTemplate)

    /**
     * @param launchTemplateOverrides Launch template overrides.
     * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
     *
     * The maximum number of distinct launch templates you can define for an Auto Scaling group is
     * 20.
     */
    public fun launchTemplateOverrides(launchTemplateOverrides: List<LaunchTemplateOverrides>)

    /**
     * @param launchTemplateOverrides Launch template overrides.
     * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
     *
     * The maximum number of distinct launch templates you can define for an Auto Scaling group is
     * 20.
     */
    public fun launchTemplateOverrides(vararg launchTemplateOverrides: LaunchTemplateOverrides)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy.Builder
        = software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy.builder()

    /**
     * @param instancesDistribution InstancesDistribution to use.
     */
    override fun instancesDistribution(instancesDistribution: InstancesDistribution) {
      cdkBuilder.instancesDistribution(instancesDistribution.let(InstancesDistribution::unwrap))
    }

    /**
     * @param instancesDistribution InstancesDistribution to use.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8175cc2284effd63b97f36cc7962fb356b67c47298855ae68b1aa3494c9fd10b")
    override
        fun instancesDistribution(instancesDistribution: InstancesDistribution.Builder.() -> Unit):
        Unit = instancesDistribution(InstancesDistribution(instancesDistribution))

    /**
     * @param launchTemplate Launch template to use. 
     */
    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    /**
     * @param launchTemplateOverrides Launch template overrides.
     * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
     *
     * The maximum number of distinct launch templates you can define for an Auto Scaling group is
     * 20.
     */
    override fun launchTemplateOverrides(launchTemplateOverrides: List<LaunchTemplateOverrides>) {
      cdkBuilder.launchTemplateOverrides(launchTemplateOverrides.map(LaunchTemplateOverrides::unwrap))
    }

    /**
     * @param launchTemplateOverrides Launch template overrides.
     * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
     *
     * The maximum number of distinct launch templates you can define for an Auto Scaling group is
     * 20.
     */
    override fun launchTemplateOverrides(vararg launchTemplateOverrides: LaunchTemplateOverrides):
        Unit = launchTemplateOverrides(launchTemplateOverrides.toList())

    public fun build(): software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy,
  ) : MixedInstancesPolicy {
    /**
     * InstancesDistribution to use.
     *
     * Default: - The value for each property in it uses a default value.
     */
    override fun instancesDistribution(): InstancesDistribution? =
        unwrap(this).getInstancesDistribution()?.let(InstancesDistribution::wrap)

    /**
     * Launch template to use.
     */
    override fun launchTemplate(): ILaunchTemplate =
        unwrap(this).getLaunchTemplate().let(ILaunchTemplate::wrap)

    /**
     * Launch template overrides.
     *
     * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
     *
     * The maximum number of distinct launch templates you can define for an Auto Scaling group is
     * 20.
     *
     * Default: - Do not provide any overrides
     */
    override fun launchTemplateOverrides(): List<LaunchTemplateOverrides> =
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
