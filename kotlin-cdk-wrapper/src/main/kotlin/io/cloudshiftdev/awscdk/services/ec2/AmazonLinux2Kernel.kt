@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * Amazon Linux 2 kernel versions.
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
public open class AmazonLinux2Kernel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2Kernel,
) : CdkObject(cdkObject) {
  public companion object {
    public val CDK_LATEST: AmazonLinux2Kernel =
        AmazonLinux2Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2Kernel.CDK_LATEST)

    public val DEFAULT: AmazonLinux2Kernel =
        AmazonLinux2Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2Kernel.DEFAULT)

    public val KERNEL_5_10: AmazonLinux2Kernel =
        AmazonLinux2Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2Kernel.KERNEL_5_10)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2Kernel):
        AmazonLinux2Kernel = AmazonLinux2Kernel(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2Kernel):
        software.amazon.awscdk.services.ec2.AmazonLinux2Kernel = wrapped.cdkObject
  }
}
