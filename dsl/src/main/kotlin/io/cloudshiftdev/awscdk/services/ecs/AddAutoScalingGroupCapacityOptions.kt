package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Unit

public interface AddAutoScalingGroupCapacityOptions {
  public fun canContainersAccessInstanceRole(): Boolean? =
      unwrap(this).getCanContainersAccessInstanceRole()

  public fun machineImageType(): MachineImageType? =
      unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

  public fun spotInstanceDraining(): Boolean? = unwrap(this).getSpotInstanceDraining()

  public fun topicEncryptionKey(): IKey? = unwrap(this).getTopicEncryptionKey()?.let(IKey::wrap)

  public interface Builder {
    public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
    }

    public fun machineImageType(machineImageType: MachineImageType) {
    }

    public fun spotInstanceDraining(spotInstanceDraining: Boolean) {
    }

    public fun topicEncryptionKey(topicEncryptionKey: IKey) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder =
        software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.builder()

    public override fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
      cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
    }

    public override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    public override fun spotInstanceDraining(spotInstanceDraining: Boolean) {
      cdkBuilder.spotInstanceDraining(spotInstanceDraining)
    }

    public override fun topicEncryptionKey(topicEncryptionKey: IKey) {
      cdkBuilder.topicEncryptionKey(topicEncryptionKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions,
  ) : AddAutoScalingGroupCapacityOptions {
    public override fun canContainersAccessInstanceRole(): Boolean? =
        unwrap(this).getCanContainersAccessInstanceRole()

    public override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    public override fun spotInstanceDraining(): Boolean? = unwrap(this).getSpotInstanceDraining()

    public override fun topicEncryptionKey(): IKey? =
        unwrap(this).getTopicEncryptionKey()?.let(IKey::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddAutoScalingGroupCapacityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions):
        AddAutoScalingGroupCapacityOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddAutoScalingGroupCapacityOptions):
        software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions = (wrapped as
        Wrapper).cdkObject
  }
}
