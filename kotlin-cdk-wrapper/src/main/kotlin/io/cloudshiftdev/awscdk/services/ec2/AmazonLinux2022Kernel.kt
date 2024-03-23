@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Amazon Linux 2022 kernel versions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AmazonLinux2022Kernel amazonLinux2022Kernel = AmazonLinux2022Kernel.CDK_LATEST;
 * ```
 */
public open class AmazonLinux2022Kernel(
  cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel,
) : CdkObject(cdkObject) {
  public constructor(version: String) :
      this(software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel(version)
  )

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
        software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel
  }
}
