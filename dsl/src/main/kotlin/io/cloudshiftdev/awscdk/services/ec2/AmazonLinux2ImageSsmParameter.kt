package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class AmazonLinux2ImageSsmParameter internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter,
) : AmazonLinuxImageSsmParameterBase(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.AmazonLinux2ImageSsmParameter].
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
     * Default: -
     *
     * @param kernel What kernel version of Amazon Linux to use. 
     */
    public fun kernel(kernel: AmazonLinux2Kernel)

    /**
     * What storage backed image to use.
     *
     * Default: GeneralPurpose
     *
     * @param storage What storage backed image to use. 
     */
    public fun storage(storage: AmazonLinuxStorage)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    public fun userData(userData: UserData)

    /**
     * Virtualization type.
     *
     * Default: HVM
     *
     * @param virtualization Virtualization type. 
     */
    public fun virtualization(virtualization: AmazonLinuxVirt)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter.Builder.create()

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
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: AmazonLinuxEdition.Standard
     *
     * @param edition What edition of Amazon Linux to use. 
     */
    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    /**
     * What kernel version of Amazon Linux to use.
     *
     * Default: -
     *
     * @param kernel What kernel version of Amazon Linux to use. 
     */
    override fun kernel(kernel: AmazonLinux2Kernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinux2Kernel::unwrap))
    }

    /**
     * What storage backed image to use.
     *
     * Default: GeneralPurpose
     *
     * @param storage What storage backed image to use. 
     */
    override fun storage(storage: AmazonLinuxStorage) {
      cdkBuilder.storage(storage.let(AmazonLinuxStorage::unwrap))
    }

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    /**
     * Virtualization type.
     *
     * Default: HVM
     *
     * @param virtualization Virtualization type. 
     */
    override fun virtualization(virtualization: AmazonLinuxVirt) {
      cdkBuilder.virtualization(virtualization.let(AmazonLinuxVirt::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter =
        cdkBuilder.build()
  }

  public companion object {
    public fun ssmParameterName(props: AmazonLinux2ImageSsmParameterProps): String =
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter.ssmParameterName(props.let(AmazonLinux2ImageSsmParameterProps::unwrap))

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be96e33b0132f0c5a67c00f40fc28b8c800535e60c6bb6bf16f748418c650955")
    public fun ssmParameterName(props: AmazonLinux2ImageSsmParameterProps.Builder.() -> Unit):
        String = ssmParameterName(AmazonLinux2ImageSsmParameterProps(props))

    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinux2ImageSsmParameter {
      val builderImpl = BuilderImpl()
      return AmazonLinux2ImageSsmParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter):
        AmazonLinux2ImageSsmParameter = AmazonLinux2ImageSsmParameter(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2ImageSsmParameter):
        software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter = wrapped.cdkObject
  }
}
