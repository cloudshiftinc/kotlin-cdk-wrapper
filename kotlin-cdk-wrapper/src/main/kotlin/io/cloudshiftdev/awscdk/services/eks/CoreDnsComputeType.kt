@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class CoreDnsComputeType(
  private val cdkObject: software.amazon.awscdk.services.eks.CoreDnsComputeType,
) {
  EC2(software.amazon.awscdk.services.eks.CoreDnsComputeType.EC2),
  FARGATE(software.amazon.awscdk.services.eks.CoreDnsComputeType.FARGATE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CoreDnsComputeType):
        CoreDnsComputeType = when (cdkObject) {
      software.amazon.awscdk.services.eks.CoreDnsComputeType.EC2 -> CoreDnsComputeType.EC2
      software.amazon.awscdk.services.eks.CoreDnsComputeType.FARGATE -> CoreDnsComputeType.FARGATE
    }

    internal fun unwrap(wrapped: CoreDnsComputeType):
        software.amazon.awscdk.services.eks.CoreDnsComputeType = wrapped.cdkObject
  }
}
