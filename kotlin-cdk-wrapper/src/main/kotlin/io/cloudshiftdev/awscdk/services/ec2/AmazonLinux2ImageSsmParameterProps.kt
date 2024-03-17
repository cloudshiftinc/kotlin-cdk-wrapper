@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties specific to amzn2 images.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * // Amazon Linux 2
 * // Amazon Linux 2
 * Instance.Builder.create(this, "Instance2")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2())
 * .build();
 * // Amazon Linux 2 with kernel 5.x
 * // Amazon Linux 2 with kernel 5.x
 * Instance.Builder.create(this, "Instance3")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2(AmazonLinux2ImageSsmParameterProps.builder()
 * .kernel(AmazonLinux2Kernel.KERNEL_5_10)
 * .build()))
 * .build();
 * // Amazon Linux 2023
 * // Amazon Linux 2023
 * Instance.Builder.create(this, "Instance4")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .build();
 * // Graviton 3 Processor
 * // Graviton 3 Processor
 * Instance.Builder.create(this, "Instance5")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
 * .machineImage(MachineImage.latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps.builder()
 * .cpuType(AmazonLinuxCpuType.ARM_64)
 * .build()))
 * .build();
 * ```
 */
public interface AmazonLinux2ImageSsmParameterProps : AmazonLinuxImageSsmParameterCommonOptions {
  /**
   * What kernel version of Amazon Linux to use.
   *
   * Default: -
   */
  public fun kernel(): AmazonLinux2Kernel? = unwrap(this).getKernel()?.let(AmazonLinux2Kernel::wrap)

  /**
   * What storage backed image to use.
   *
   * Default: GeneralPurpose
   */
  public fun storage(): AmazonLinuxStorage? =
      unwrap(this).getStorage()?.let(AmazonLinuxStorage::wrap)

  /**
   * Virtualization type.
   *
   * Default: HVM
   */
  public fun virtualization(): AmazonLinuxVirt? =
      unwrap(this).getVirtualization()?.let(AmazonLinuxVirt::wrap)

  /**
   * A builder for [AmazonLinux2ImageSsmParameterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    public fun cachedInContext(cachedInContext: Boolean)

    /**
     * @param cpuType CPU Type.
     */
    public fun cpuType(cpuType: AmazonLinuxCpuType)

    /**
     * @param edition What edition of Amazon Linux to use.
     */
    public fun edition(edition: AmazonLinuxEdition)

    /**
     * @param kernel What kernel version of Amazon Linux to use.
     */
    public fun kernel(kernel: AmazonLinux2Kernel)

    /**
     * @param storage What storage backed image to use.
     */
    public fun storage(storage: AmazonLinuxStorage)

    /**
     * @param userData Initial user data.
     */
    public fun userData(userData: UserData)

    /**
     * @param virtualization Virtualization type.
     */
    public fun virtualization(virtualization: AmazonLinuxVirt)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps.builder()

    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    /**
     * @param cpuType CPU Type.
     */
    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    /**
     * @param edition What edition of Amazon Linux to use.
     */
    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    /**
     * @param kernel What kernel version of Amazon Linux to use.
     */
    override fun kernel(kernel: AmazonLinux2Kernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinux2Kernel::unwrap))
    }

    /**
     * @param storage What storage backed image to use.
     */
    override fun storage(storage: AmazonLinuxStorage) {
      cdkBuilder.storage(storage.let(AmazonLinuxStorage::unwrap))
    }

    /**
     * @param userData Initial user data.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    /**
     * @param virtualization Virtualization type.
     */
    override fun virtualization(virtualization: AmazonLinuxVirt) {
      cdkBuilder.virtualization(virtualization.let(AmazonLinuxVirt::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps,
  ) : CdkObject(cdkObject), AmazonLinux2ImageSsmParameterProps {
    /**
     * Whether the AMI ID is cached to be stable between deployments.
     *
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     *
     * Default: false
     */
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    /**
     * CPU Type.
     *
     * Default: AmazonLinuxCpuType.X86_64
     */
    override fun cpuType(): AmazonLinuxCpuType? =
        unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: AmazonLinuxEdition.Standard
     */
    override fun edition(): AmazonLinuxEdition? =
        unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

    /**
     * What kernel version of Amazon Linux to use.
     *
     * Default: -
     */
    override fun kernel(): AmazonLinux2Kernel? =
        unwrap(this).getKernel()?.let(AmazonLinux2Kernel::wrap)

    /**
     * What storage backed image to use.
     *
     * Default: GeneralPurpose
     */
    override fun storage(): AmazonLinuxStorage? =
        unwrap(this).getStorage()?.let(AmazonLinuxStorage::wrap)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    /**
     * Virtualization type.
     *
     * Default: HVM
     */
    override fun virtualization(): AmazonLinuxVirt? =
        unwrap(this).getVirtualization()?.let(AmazonLinuxVirt::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinux2ImageSsmParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps):
        AmazonLinux2ImageSsmParameterProps = CdkObjectWrappers.wrap(cdkObject) as?
        AmazonLinux2ImageSsmParameterProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2ImageSsmParameterProps):
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps
  }
}
