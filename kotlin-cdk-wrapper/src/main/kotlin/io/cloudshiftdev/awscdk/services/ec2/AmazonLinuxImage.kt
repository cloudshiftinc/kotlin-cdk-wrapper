@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Selects the latest version of Amazon Linux.
 *
 * This Machine Image automatically updates to the latest version on every
 * deployment. Be aware this will cause your instances to be replaced when a
 * new version of the image becomes available. Do not store stateful information
 * on the instance if you are using this image.
 *
 * The AMI ID is selected using the values published to the SSM parameter store.
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
public open class AmazonLinuxImage(
  cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImage,
) : GenericSSMParameterImage(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ec2.AmazonLinuxImage()
  )

  public constructor(props: AmazonLinuxImageProps) :
      this(software.amazon.awscdk.services.ec2.AmazonLinuxImage(props.let(AmazonLinuxImageProps.Companion::unwrap))
  )

  public constructor(props: AmazonLinuxImageProps.Builder.() -> Unit) :
      this(AmazonLinuxImageProps(props)
  )

  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct.Companion::unwrap)).let(MachineImageConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.AmazonLinuxImage].
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
     * Default: X86_64
     *
     * @param cpuType CPU Type. 
     */
    public fun cpuType(cpuType: AmazonLinuxCpuType)

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: Standard
     *
     * @param edition What edition of Amazon Linux to use. 
     */
    public fun edition(edition: AmazonLinuxEdition)

    /**
     * What generation of Amazon Linux to use.
     *
     * Default: AmazonLinux
     *
     * @param generation What generation of Amazon Linux to use. 
     */
    public fun generation(generation: AmazonLinuxGeneration)

    /**
     * What kernel version of Amazon Linux to use.
     *
     * Default: -
     *
     * @param kernel What kernel version of Amazon Linux to use. 
     */
    public fun kernel(kernel: AmazonLinuxKernel)

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
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AmazonLinuxImage.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImage.Builder.create()

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
     * Default: X86_64
     *
     * @param cpuType CPU Type. 
     */
    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType.Companion::unwrap))
    }

    /**
     * What edition of Amazon Linux to use.
     *
     * Default: Standard
     *
     * @param edition What edition of Amazon Linux to use. 
     */
    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition.Companion::unwrap))
    }

    /**
     * What generation of Amazon Linux to use.
     *
     * Default: AmazonLinux
     *
     * @param generation What generation of Amazon Linux to use. 
     */
    override fun generation(generation: AmazonLinuxGeneration) {
      cdkBuilder.generation(generation.let(AmazonLinuxGeneration.Companion::unwrap))
    }

    /**
     * What kernel version of Amazon Linux to use.
     *
     * Default: -
     *
     * @param kernel What kernel version of Amazon Linux to use. 
     */
    override fun kernel(kernel: AmazonLinuxKernel) {
      cdkBuilder.kernel(kernel.let(AmazonLinuxKernel.Companion::unwrap))
    }

    /**
     * What storage backed image to use.
     *
     * Default: GeneralPurpose
     *
     * @param storage What storage backed image to use. 
     */
    override fun storage(storage: AmazonLinuxStorage) {
      cdkBuilder.storage(storage.let(AmazonLinuxStorage.Companion::unwrap))
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

    /**
     * Virtualization type.
     *
     * Default: HVM
     *
     * @param virtualization Virtualization type. 
     */
    override fun virtualization(virtualization: AmazonLinuxVirt) {
      cdkBuilder.virtualization(virtualization.let(AmazonLinuxVirt.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinuxImage = cdkBuilder.build()
  }

  public companion object {
    public fun ssmParameterName(): String =
        software.amazon.awscdk.services.ec2.AmazonLinuxImage.ssmParameterName()

    public fun ssmParameterName(props: AmazonLinuxImageProps): String =
        software.amazon.awscdk.services.ec2.AmazonLinuxImage.ssmParameterName(props.let(AmazonLinuxImageProps.Companion::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a404935d97c75dc9dc41179b9d410bc64c050dd220fa58e9d9cf3299786d4f3b")
    public fun ssmParameterName(props: AmazonLinuxImageProps.Builder.() -> Unit): String =
        ssmParameterName(AmazonLinuxImageProps(props))

    public operator fun invoke(block: Builder.() -> Unit = {}): AmazonLinuxImage {
      val builderImpl = BuilderImpl()
      return AmazonLinuxImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImage):
        AmazonLinuxImage = AmazonLinuxImage(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImage):
        software.amazon.awscdk.services.ec2.AmazonLinuxImage = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinuxImage
  }
}
