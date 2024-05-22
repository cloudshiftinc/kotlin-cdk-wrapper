@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A SSM Parameter that contains the AMI ID for Amazon Linux 2023.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Instance.Builder.create(this, "LatestAl2023")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
 * .machineImage(MachineImage.latestAmazonLinux2023(AmazonLinux2023ImageSsmParameterProps.builder()
 * .cachedInContext(true)
 * .build()))
 * .build();
 * // or
 * // or
 * Instance.Builder.create(this, "LatestAl2023")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
 * // context cache is turned on by default
 * .machineImage(new AmazonLinux2023ImageSsmParameter())
 * .build();
 * ```
 */
public open class AmazonLinux2023ImageSsmParameter(
  cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter,
) : AmazonLinuxImageSsmParameterBase(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter()
  )

  public constructor(props: AmazonLinux2023ImageSsmParameterProps) :
      this(software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter(props.let(AmazonLinux2023ImageSsmParameterProps.Companion::unwrap))
  )

  public constructor(props: AmazonLinux2023ImageSsmParameterProps.Builder.() -> Unit) :
      this(AmazonLinux2023ImageSsmParameterProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. 
     */
    public fun cachedInContext(cachedInContext: Boolean)

    /**
     * CPU Type.
     *
     * Default: AmazonLinuxCpuType.X86_64
     *
     * @param cpuType CPU Type. 
     */
    public fun cpuType(cpuType: AmazonLinuxCpuType)

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: AmazonLinuxEdition.Standard
     *
     * @param edition What edition of Amazon Linux to use. 
     */
    public fun edition(edition: AmazonLinuxEdition)

    /**
     * What kernel version of Amazon Linux to use.
     *
     * Default: AmazonLinux2023Kernel.DEFAULT
     *
     * @param kernel What kernel version of Amazon Linux to use. 
     */
    public fun kernel(kernel: AmazonLinux2023Kernel)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter.Builder.create()

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
     *
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. 
     */
    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    /**
     * CPU Type.
     *
     * Default: AmazonLinuxCpuType.X86_64
     *
     * @param cpuType CPU Type. 
     */
    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType.Companion::unwrap))
    }

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: AmazonLinuxEdition.Standard
     *
     * @param edition What edition of Amazon Linux to use. 
     */
    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition.Companion::unwrap))
    }

    /**
     * What kernel version of Amazon Linux to use.
     *
     * Default: AmazonLinux2023Kernel.DEFAULT
     *
     * @param kernel What kernel version of Amazon Linux to use. 
     */
    override fun kernel(kernel: AmazonLinux2023Kernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinux2023Kernel.Companion::unwrap))
    }

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter =
        cdkBuilder.build()
  }

  public companion object {
    public fun ssmParameterName(props: AmazonLinux2023ImageSsmParameterProps): String =
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter.ssmParameterName(props.let(AmazonLinux2023ImageSsmParameterProps.Companion::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b3719397a1188916c6b60658e0e9c8f4e61fe053f967f62c8639c65cc7e125")
    public fun ssmParameterName(props: AmazonLinux2023ImageSsmParameterProps.Builder.() -> Unit):
        String = ssmParameterName(AmazonLinux2023ImageSsmParameterProps(props))

    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinux2023ImageSsmParameter {
      val builderImpl = BuilderImpl()
      return AmazonLinux2023ImageSsmParameter(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter):
        AmazonLinux2023ImageSsmParameter = AmazonLinux2023ImageSsmParameter(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2023ImageSsmParameter):
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter
  }
}
