@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AsgCapacityProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProvider,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun autoScalingGroup(): AutoScalingGroup =
      unwrap(this).getAutoScalingGroup().let(AutoScalingGroup::wrap)

  public open fun canContainersAccessInstanceRole(): Boolean? =
      unwrap(this).getCanContainersAccessInstanceRole()

  public open fun capacityProviderName(): String = unwrap(this).getCapacityProviderName()

  public open fun enableManagedDraining(): Boolean? = unwrap(this).getEnableManagedDraining()

  public open fun enableManagedTerminationProtection(): Boolean? =
      unwrap(this).getEnableManagedTerminationProtection()

  public open fun machineImageType(): MachineImageType =
      unwrap(this).getMachineImageType().let(MachineImageType::wrap)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AsgCapacityProvider.Builder =
        software.amazon.awscdk.services.ecs.AsgCapacityProvider.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ecs.AsgCapacityProvider = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AsgCapacityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AsgCapacityProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProvider):
        AsgCapacityProvider = AsgCapacityProvider(cdkObject)

    internal fun unwrap(wrapped: AsgCapacityProvider):
        software.amazon.awscdk.services.ecs.AsgCapacityProvider = wrapped.cdkObject
  }
}
