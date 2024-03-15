@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LaunchTemplateOverrides {
  public fun instanceRequirements(): CfnAutoScalingGroup.InstanceRequirementsProperty? =
      unwrap(this).getInstanceRequirements()?.let(CfnAutoScalingGroup.InstanceRequirementsProperty::wrap)

  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  public fun launchTemplate(): ILaunchTemplate? =
      unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

  public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

  @CdkDslMarker
  public interface Builder {
    public
        fun instanceRequirements(instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c819bf79835396db2722d29a50ca7989f57d065df0557529cc25baad7d0e488")
    public
        fun instanceRequirements(instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty.Builder.() -> Unit)

    public fun instanceType(instanceType: InstanceType)

    public fun launchTemplate(launchTemplate: ILaunchTemplate)

    public fun weightedCapacity(weightedCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides.Builder =
        software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides.builder()

    override
        fun instanceRequirements(instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty) {
      cdkBuilder.instanceRequirements(instanceRequirements.let(CfnAutoScalingGroup.InstanceRequirementsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c819bf79835396db2722d29a50ca7989f57d065df0557529cc25baad7d0e488")
    override
        fun instanceRequirements(instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty.Builder.() -> Unit):
        Unit =
        instanceRequirements(CfnAutoScalingGroup.InstanceRequirementsProperty(instanceRequirements))

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    override fun weightedCapacity(weightedCapacity: Number) {
      cdkBuilder.weightedCapacity(weightedCapacity)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides,
  ) : CdkObject(cdkObject), LaunchTemplateOverrides {
    override fun instanceRequirements(): CfnAutoScalingGroup.InstanceRequirementsProperty? =
        unwrap(this).getInstanceRequirements()?.let(CfnAutoScalingGroup.InstanceRequirementsProperty::wrap)

    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    override fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateOverrides {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides):
        LaunchTemplateOverrides = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateOverrides):
        software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
  }
}
