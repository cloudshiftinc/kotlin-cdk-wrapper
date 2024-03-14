package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject

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
