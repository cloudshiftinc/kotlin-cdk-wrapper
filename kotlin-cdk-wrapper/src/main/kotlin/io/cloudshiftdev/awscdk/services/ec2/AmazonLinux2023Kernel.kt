@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * Amazon Linux 2023 kernel versions.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Instance.Builder.create(this, "LatestAl2023")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.C7G, InstanceSize.LARGE))
 * // context cache is turned on by default
 * .machineImage(AmazonLinux2023ImageSsmParameter.Builder.create()
 * .kernel(AmazonLinux2023Kernel.KERNEL_6_1)
 * .build())
 * .build();
 * ```
 */
public open class AmazonLinux2023Kernel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel,
) : CdkObject(cdkObject) {
  public companion object {
    public val CDK_LATEST: AmazonLinux2023Kernel =
        AmazonLinux2023Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel.CDK_LATEST)

    public val DEFAULT: AmazonLinux2023Kernel =
        AmazonLinux2023Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel.DEFAULT)

    public val KERNEL_6_1: AmazonLinux2023Kernel =
        AmazonLinux2023Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel.KERNEL_6_1)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel):
        AmazonLinux2023Kernel = AmazonLinux2023Kernel(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2023Kernel):
        software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel = wrapped.cdkObject
  }
}
