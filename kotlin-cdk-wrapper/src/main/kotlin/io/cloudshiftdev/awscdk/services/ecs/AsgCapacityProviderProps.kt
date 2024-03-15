@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface AsgCapacityProviderProps : AddAutoScalingGroupCapacityOptions {
  public fun autoScalingGroup(): IAutoScalingGroup

  public fun capacityProviderName(): String? = unwrap(this).getCapacityProviderName()

  public fun enableManagedDraining(): Boolean? = unwrap(this).getEnableManagedDraining()

  public fun enableManagedScaling(): Boolean? = unwrap(this).getEnableManagedScaling()

  public fun enableManagedTerminationProtection(): Boolean? =
      unwrap(this).getEnableManagedTerminationProtection()

  public fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

  public fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

  public fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

  public fun targetCapacityPercent(): Number? = unwrap(this).getTargetCapacityPercent()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean)

    public fun capacityProviderName(capacityProviderName: String)

    public fun enableManagedDraining(enableManagedDraining: Boolean)

    public fun enableManagedScaling(enableManagedScaling: Boolean)

    public fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean)

    public fun instanceWarmupPeriod(instanceWarmupPeriod: Number)

    public fun machineImageType(machineImageType: MachineImageType)

    public fun maximumScalingStepSize(maximumScalingStepSize: Number)

    public fun minimumScalingStepSize(minimumScalingStepSize: Number)

    public fun spotInstanceDraining(spotInstanceDraining: Boolean)

    public fun targetCapacityPercent(targetCapacityPercent: Number)

    public fun topicEncryptionKey(topicEncryptionKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AsgCapacityProviderProps.Builder =
        software.amazon.awscdk.services.ecs.AsgCapacityProviderProps.builder()

    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    override fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
      cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
    }

    override fun capacityProviderName(capacityProviderName: String) {
      cdkBuilder.capacityProviderName(capacityProviderName)
    }

    override fun enableManagedDraining(enableManagedDraining: Boolean) {
      cdkBuilder.enableManagedDraining(enableManagedDraining)
    }

    override fun enableManagedScaling(enableManagedScaling: Boolean) {
      cdkBuilder.enableManagedScaling(enableManagedScaling)
    }

    override fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean) {
      cdkBuilder.enableManagedTerminationProtection(enableManagedTerminationProtection)
    }

    override fun instanceWarmupPeriod(instanceWarmupPeriod: Number) {
      cdkBuilder.instanceWarmupPeriod(instanceWarmupPeriod)
    }

    override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    override fun maximumScalingStepSize(maximumScalingStepSize: Number) {
      cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
    }

    override fun minimumScalingStepSize(minimumScalingStepSize: Number) {
      cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
    }

    override fun spotInstanceDraining(spotInstanceDraining: Boolean) {
      cdkBuilder.spotInstanceDraining(spotInstanceDraining)
    }

    override fun targetCapacityPercent(targetCapacityPercent: Number) {
      cdkBuilder.targetCapacityPercent(targetCapacityPercent)
    }

    override fun topicEncryptionKey(topicEncryptionKey: IKey) {
      cdkBuilder.topicEncryptionKey(topicEncryptionKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.AsgCapacityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProviderProps,
  ) : CdkObject(cdkObject), AsgCapacityProviderProps {
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    override fun canContainersAccessInstanceRole(): Boolean? =
        unwrap(this).getCanContainersAccessInstanceRole()

    override fun capacityProviderName(): String? = unwrap(this).getCapacityProviderName()

    override fun enableManagedDraining(): Boolean? = unwrap(this).getEnableManagedDraining()

    override fun enableManagedScaling(): Boolean? = unwrap(this).getEnableManagedScaling()

    override fun enableManagedTerminationProtection(): Boolean? =
        unwrap(this).getEnableManagedTerminationProtection()

    override fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

    override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    override fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

    override fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

    override fun spotInstanceDraining(): Boolean? = unwrap(this).getSpotInstanceDraining()

    override fun targetCapacityPercent(): Number? = unwrap(this).getTargetCapacityPercent()

    override fun topicEncryptionKey(): IKey? = unwrap(this).getTopicEncryptionKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AsgCapacityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProviderProps):
        AsgCapacityProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AsgCapacityProviderProps):
        software.amazon.awscdk.services.ecs.AsgCapacityProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.AsgCapacityProviderProps
  }
}
