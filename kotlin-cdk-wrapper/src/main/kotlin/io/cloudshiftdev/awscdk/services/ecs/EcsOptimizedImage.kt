@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.MachineImageConfig
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Construct a Linux or Windows machine image from the latest ECS Optimized AMI published in SSM.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .vpc(vpc)
 * .build();
 * // Either add default capacity
 * cluster.addCapacity("DefaultAutoScalingGroupCapacity", AddCapacityOptions.builder()
 * .instanceType(new InstanceType("t2.xlarge"))
 * .desiredCapacity(3)
 * .build());
 * // Or add customized capacity. Be sure to start the Amazon ECS-optimized AMI.
 * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(new InstanceType("t2.xlarge"))
 * .machineImage(EcsOptimizedImage.amazonLinux())
 * // Or use Amazon ECS-Optimized Amazon Linux 2 AMI
 * // machineImage: EcsOptimizedImage.amazonLinux2(),
 * .desiredCapacity(3)
 * .build();
 * AsgCapacityProvider capacityProvider = AsgCapacityProvider.Builder.create(this,
 * "AsgCapacityProvider")
 * .autoScalingGroup(autoScalingGroup)
 * .build();
 * cluster.addAsgCapacityProvider(capacityProvider);
 * ```
 */
public open class EcsOptimizedImage(
  cdkObject: software.amazon.awscdk.services.ecs.EcsOptimizedImage,
) : CdkObject(cdkObject), IMachineImage {
  /**
   * Return the correct image.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct.Companion::unwrap)).let(MachineImageConfig::wrap)

  public companion object {
    public fun amazonLinux(): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux().let(EcsOptimizedImage::wrap)

    public fun amazonLinux(options: EcsOptimizedImageOptions): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux(options.let(EcsOptimizedImageOptions.Companion::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f93e5a87fbd6616222398433e1ccd8b9a1e019d397ddd8e321f33a36989609a7")
    public fun amazonLinux(options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage
        = amazonLinux(EcsOptimizedImageOptions(options))

    public fun amazonLinux2(): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2().let(EcsOptimizedImage::wrap)

    public fun amazonLinux2(hardwareType: AmiHardwareType): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2(hardwareType.let(AmiHardwareType.Companion::unwrap)).let(EcsOptimizedImage::wrap)

    public fun amazonLinux2(hardwareType: AmiHardwareType, options: EcsOptimizedImageOptions):
        EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2(hardwareType.let(AmiHardwareType.Companion::unwrap),
        options.let(EcsOptimizedImageOptions.Companion::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc3aa8d938d5713c1147297adfe81e772ad3efd29124368f915a9af0ce144697")
    public fun amazonLinux2(hardwareType: AmiHardwareType,
        options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage =
        amazonLinux2(hardwareType, EcsOptimizedImageOptions(options))

    public fun amazonLinux2023(): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2023().let(EcsOptimizedImage::wrap)

    public fun amazonLinux2023(hardwareType: AmiHardwareType): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2023(hardwareType.let(AmiHardwareType.Companion::unwrap)).let(EcsOptimizedImage::wrap)

    public fun amazonLinux2023(hardwareType: AmiHardwareType, options: EcsOptimizedImageOptions):
        EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.amazonLinux2023(hardwareType.let(AmiHardwareType.Companion::unwrap),
        options.let(EcsOptimizedImageOptions.Companion::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa3b2f35b5fa6f9d797342f29e3bf57f158ca291e867516dafe0ff05bb7c144c")
    public fun amazonLinux2023(hardwareType: AmiHardwareType,
        options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage =
        amazonLinux2023(hardwareType, EcsOptimizedImageOptions(options))

    public fun windows(windowsVersion: WindowsOptimizedVersion): EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.windows(windowsVersion.let(WindowsOptimizedVersion.Companion::unwrap)).let(EcsOptimizedImage::wrap)

    public fun windows(windowsVersion: WindowsOptimizedVersion, options: EcsOptimizedImageOptions):
        EcsOptimizedImage =
        software.amazon.awscdk.services.ecs.EcsOptimizedImage.windows(windowsVersion.let(WindowsOptimizedVersion.Companion::unwrap),
        options.let(EcsOptimizedImageOptions.Companion::unwrap)).let(EcsOptimizedImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6b383a2e109bf0dcab6b90cd7f90e03c0ab136e7b88e89b9a716c1541d1e014")
    public fun windows(windowsVersion: WindowsOptimizedVersion,
        options: EcsOptimizedImageOptions.Builder.() -> Unit): EcsOptimizedImage =
        windows(windowsVersion, EcsOptimizedImageOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcsOptimizedImage):
        EcsOptimizedImage = EcsOptimizedImage(cdkObject)

    internal fun unwrap(wrapped: EcsOptimizedImage):
        software.amazon.awscdk.services.ecs.EcsOptimizedImage = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.EcsOptimizedImage
  }
}
