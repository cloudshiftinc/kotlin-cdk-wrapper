package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject

public open class AmazonLinux2022Kernel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel,
) : CdkObject(cdkObject) {
  public companion object {
    public val CDK_LATEST: AmazonLinux2022Kernel =
        AmazonLinux2022Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel.CDK_LATEST)

    public val DEFAULT: AmazonLinux2022Kernel =
        AmazonLinux2022Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel.DEFAULT)

    public val KERNEL_5_15: AmazonLinux2022Kernel =
        AmazonLinux2022Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel.KERNEL_5_15)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel):
        AmazonLinux2022Kernel = AmazonLinux2022Kernel(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2022Kernel):
        software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel = wrapped.cdkObject
  }
}
