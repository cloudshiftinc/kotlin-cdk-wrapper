package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Unit

public interface AddAutoScalingGroupCapacityOptions {
  /**
   * Specifies whether the containers can access the container instance role.
   *
   * Default: false
   */
  public fun canContainersAccessInstanceRole(): Boolean? =
      unwrap(this).getCanContainersAccessInstanceRole()

  /**
   * What type of machine image this is.
   *
   * Depending on the setting, different UserData will automatically be added
   * to the `AutoScalingGroup` to configure it properly for use with ECS.
   *
   * If you create an `AutoScalingGroup` yourself and are adding it via
   * `addAutoScalingGroup()`, you must specify this value. If you are adding an
   * `autoScalingGroup` via `addCapacity`, this value will be determined
   * from the `machineImage` you pass.
   *
   * Default: - Automatically determined from `machineImage`, if available, otherwise
   * `MachineImageType.AMAZON_LINUX_2`.
   */
  public fun machineImageType(): MachineImageType? =
      unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

  /**
   * Specify whether to enable Automated Draining for Spot Instances running Amazon ECS Services.
   *
   * For more information, see [Using Spot
   * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
   *
   * Default: false
   */
  public fun spotInstanceDraining(): Boolean? = unwrap(this).getSpotInstanceDraining()

  /**
   * If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero, then the ECS cluster creates
   * an SNS Topic to as part of a system to drain instances of tasks when the instance is being shut
   * down. If this property is provided, then this key will be used to encrypt the contents of that SNS
   * Topic. See [SNS Data
   * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
   * information.
   *
   * Default: The SNS Topic will not be encrypted.
   */
  public fun topicEncryptionKey(): IKey? = unwrap(this).getTopicEncryptionKey()?.let(IKey::wrap)

  /**
   * A builder for [AddAutoScalingGroupCapacityOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param canContainersAccessInstanceRole Specifies whether the containers can access the
     * container instance role.
     */
    public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean)

    /**
     * @param machineImageType What type of machine image this is.
     * Depending on the setting, different UserData will automatically be added
     * to the `AutoScalingGroup` to configure it properly for use with ECS.
     *
     * If you create an `AutoScalingGroup` yourself and are adding it via
     * `addAutoScalingGroup()`, you must specify this value. If you are adding an
     * `autoScalingGroup` via `addCapacity`, this value will be determined
     * from the `machineImage` you pass.
     */
    public fun machineImageType(machineImageType: MachineImageType)

    /**
     * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
     * running Amazon ECS Services.
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     */
    public fun spotInstanceDraining(spotInstanceDraining: Boolean)

    /**
     * @param topicEncryptionKey If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero,
     * then the ECS cluster creates an SNS Topic to as part of a system to drain instances of tasks
     * when the instance is being shut down. If this property is provided, then this key will be used
     * to encrypt the contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     */
    public fun topicEncryptionKey(topicEncryptionKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.Builder =
        software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions.builder()

    /**
     * @param canContainersAccessInstanceRole Specifies whether the containers can access the
     * container instance role.
     */
    override fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
      cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
    }

    /**
     * @param machineImageType What type of machine image this is.
     * Depending on the setting, different UserData will automatically be added
     * to the `AutoScalingGroup` to configure it properly for use with ECS.
     *
     * If you create an `AutoScalingGroup` yourself and are adding it via
     * `addAutoScalingGroup()`, you must specify this value. If you are adding an
     * `autoScalingGroup` via `addCapacity`, this value will be determined
     * from the `machineImage` you pass.
     */
    override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    /**
     * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
     * running Amazon ECS Services.
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     */
    override fun spotInstanceDraining(spotInstanceDraining: Boolean) {
      cdkBuilder.spotInstanceDraining(spotInstanceDraining)
    }

    /**
     * @param topicEncryptionKey If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero,
     * then the ECS cluster creates an SNS Topic to as part of a system to drain instances of tasks
     * when the instance is being shut down. If this property is provided, then this key will be used
     * to encrypt the contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     */
    override fun topicEncryptionKey(topicEncryptionKey: IKey) {
      cdkBuilder.topicEncryptionKey(topicEncryptionKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions,
  ) : AddAutoScalingGroupCapacityOptions {
    /**
     * Specifies whether the containers can access the container instance role.
     *
     * Default: false
     */
    override fun canContainersAccessInstanceRole(): Boolean? =
        unwrap(this).getCanContainersAccessInstanceRole()

    /**
     * What type of machine image this is.
     *
     * Depending on the setting, different UserData will automatically be added
     * to the `AutoScalingGroup` to configure it properly for use with ECS.
     *
     * If you create an `AutoScalingGroup` yourself and are adding it via
     * `addAutoScalingGroup()`, you must specify this value. If you are adding an
     * `autoScalingGroup` via `addCapacity`, this value will be determined
     * from the `machineImage` you pass.
     *
     * Default: - Automatically determined from `machineImage`, if available, otherwise
     * `MachineImageType.AMAZON_LINUX_2`.
     */
    override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    /**
     * Specify whether to enable Automated Draining for Spot Instances running Amazon ECS Services.
     *
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     *
     * Default: false
     */
    override fun spotInstanceDraining(): Boolean? = unwrap(this).getSpotInstanceDraining()

    /**
     * If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero, then the ECS cluster
     * creates an SNS Topic to as part of a system to drain instances of tasks when the instance is
     * being shut down. If this property is provided, then this key will be used to encrypt the
     * contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     *
     * Default: The SNS Topic will not be encrypted.
     */
    override fun topicEncryptionKey(): IKey? = unwrap(this).getTopicEncryptionKey()?.let(IKey::wrap)
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
