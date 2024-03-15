@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Amazon Linux image properties.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // instance to add as the target for load balancer.
 * Instance instance = Instance.Builder.create(this, "targetInstance")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
 * .build();
 * lb.addTarget(new InstanceTarget(instance));
 * ```
 */
public interface AmazonLinuxImageProps {
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
  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  /**
   * CPU Type.
   *
   * Default: X86_64
   */
  public fun cpuType(): AmazonLinuxCpuType? =
      unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

  /**
   * What edition of Amazon Linux to use.
   *
   * Default: Standard
   */
  public fun edition(): AmazonLinuxEdition? =
      unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

  /**
   * What generation of Amazon Linux to use.
   *
   * Default: AmazonLinux
   */
  public fun generation(): AmazonLinuxGeneration? =
      unwrap(this).getGeneration()?.let(AmazonLinuxGeneration::wrap)

  /**
   * What kernel version of Amazon Linux to use.
   *
   * Default: -
   */
  public fun kernel(): AmazonLinuxKernel? = unwrap(this).getKernel()?.let(AmazonLinuxKernel::wrap)

  /**
   * What storage backed image to use.
   *
   * Default: GeneralPurpose
   */
  public fun storage(): AmazonLinuxStorage? =
      unwrap(this).getStorage()?.let(AmazonLinuxStorage::wrap)

  /**
   * Initial user data.
   *
   * Default: - Empty UserData for Linux machines
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * Virtualization type.
   *
   * Default: HVM
   */
  public fun virtualization(): AmazonLinuxVirt? =
      unwrap(this).getVirtualization()?.let(AmazonLinuxVirt::wrap)

  /**
   * A builder for [AmazonLinuxImageProps]
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
     * @param generation What generation of Amazon Linux to use.
     */
    public fun generation(generation: AmazonLinuxGeneration)

    /**
     * @param kernel What kernel version of Amazon Linux to use.
     */
    public fun kernel(kernel: AmazonLinuxKernel)

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
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AmazonLinuxImageProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImageProps.builder()

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
     * @param generation What generation of Amazon Linux to use.
     */
    override fun generation(generation: AmazonLinuxGeneration) {
      cdkBuilder.generation(generation.let(AmazonLinuxGeneration::unwrap))
    }

    /**
     * @param kernel What kernel version of Amazon Linux to use.
     */
    override fun kernel(kernel: AmazonLinuxKernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinuxKernel::unwrap))
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

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinuxImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageProps,
  ) : CdkObject(cdkObject), AmazonLinuxImageProps {
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
     * Default: X86_64
     */
    override fun cpuType(): AmazonLinuxCpuType? =
        unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: Standard
     */
    override fun edition(): AmazonLinuxEdition? =
        unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

    /**
     * What generation of Amazon Linux to use.
     *
     * Default: AmazonLinux
     */
    override fun generation(): AmazonLinuxGeneration? =
        unwrap(this).getGeneration()?.let(AmazonLinuxGeneration::wrap)

    /**
     * What kernel version of Amazon Linux to use.
     *
     * Default: -
     */
    override fun kernel(): AmazonLinuxKernel? =
        unwrap(this).getKernel()?.let(AmazonLinuxKernel::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinuxImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageProps):
        AmazonLinuxImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageProps):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.AmazonLinuxImageProps
  }
}
