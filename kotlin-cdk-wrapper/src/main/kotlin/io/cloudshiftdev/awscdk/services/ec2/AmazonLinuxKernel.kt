@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class AmazonLinuxKernel(
  private val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxKernel,
) {
  KERNEL5_X(software.amazon.awscdk.services.ec2.AmazonLinuxKernel.KERNEL5_X),
  KERNEL6_1(software.amazon.awscdk.services.ec2.AmazonLinuxKernel.KERNEL6_1),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxKernel):
        AmazonLinuxKernel = when (cdkObject) {
      software.amazon.awscdk.services.ec2.AmazonLinuxKernel.KERNEL5_X -> AmazonLinuxKernel.KERNEL5_X
      software.amazon.awscdk.services.ec2.AmazonLinuxKernel.KERNEL6_1 -> AmazonLinuxKernel.KERNEL6_1
    }

    internal fun unwrap(wrapped: AmazonLinuxKernel):
        software.amazon.awscdk.services.ec2.AmazonLinuxKernel = wrapped.cdkObject
  }
}
