@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class AmazonLinuxCpuType(
  private val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxCpuType,
) {
  ARM_64(software.amazon.awscdk.services.ec2.AmazonLinuxCpuType.ARM_64),
  X86_64(software.amazon.awscdk.services.ec2.AmazonLinuxCpuType.X86_64),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxCpuType):
        AmazonLinuxCpuType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.AmazonLinuxCpuType.ARM_64 -> AmazonLinuxCpuType.ARM_64
      software.amazon.awscdk.services.ec2.AmazonLinuxCpuType.X86_64 -> AmazonLinuxCpuType.X86_64
    }

    internal fun unwrap(wrapped: AmazonLinuxCpuType):
        software.amazon.awscdk.services.ec2.AmazonLinuxCpuType = wrapped.cdkObject
  }
}
