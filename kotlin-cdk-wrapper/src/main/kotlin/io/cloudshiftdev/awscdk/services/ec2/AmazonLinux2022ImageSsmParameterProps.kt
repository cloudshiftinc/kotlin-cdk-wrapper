@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties specific to al2022 images.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AmazonLinux2022Kernel amazonLinux2022Kernel;
 * UserData userData;
 * AmazonLinux2022ImageSsmParameterProps amazonLinux2022ImageSsmParameterProps =
 * AmazonLinux2022ImageSsmParameterProps.builder()
 * .cachedInContext(false)
 * .cpuType(AmazonLinuxCpuType.ARM_64)
 * .edition(AmazonLinuxEdition.STANDARD)
 * .kernel(amazonLinux2022Kernel)
 * .userData(userData)
 * .build();
 * ```
 */
public interface AmazonLinux2022ImageSsmParameterProps : AmazonLinuxImageSsmParameterCommonOptions {
  /**
   * What kernel version of Amazon Linux to use.
   *
   * Default: AmazonLinux2022Kernel.DEFAULT
   */
  public fun kernel(): AmazonLinux2022Kernel? =
      unwrap(this).getKernel()?.let(AmazonLinux2022Kernel::wrap)

  /**
   * A builder for [AmazonLinux2022ImageSsmParameterProps]
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
    public fun kernel(kernel: AmazonLinux2022Kernel)

    /**
     * @param userData Initial user data.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps.builder()

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
    override fun kernel(kernel: AmazonLinux2022Kernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinux2022Kernel::unwrap))
    }

    /**
     * @param userData Initial user data.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps,
  ) : CdkObject(cdkObject), AmazonLinux2022ImageSsmParameterProps {
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
     * Default: AmazonLinux2022Kernel.DEFAULT
     */
    override fun kernel(): AmazonLinux2022Kernel? =
        unwrap(this).getKernel()?.let(AmazonLinux2022Kernel::wrap)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AmazonLinux2022ImageSsmParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps):
        AmazonLinux2022ImageSsmParameterProps = CdkObjectWrappers.wrap(cdkObject) as
        AmazonLinux2022ImageSsmParameterProps

    internal fun unwrap(wrapped: AmazonLinux2022ImageSsmParameterProps):
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps
  }
}
