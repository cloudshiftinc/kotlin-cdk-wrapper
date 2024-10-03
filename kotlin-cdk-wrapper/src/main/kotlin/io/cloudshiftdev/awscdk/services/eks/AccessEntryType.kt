@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class AccessEntryType(
  private val cdkObject: software.amazon.awscdk.services.eks.AccessEntryType,
) {
  STANDARD(software.amazon.awscdk.services.eks.AccessEntryType.STANDARD),
  FARGATE_LINUX(software.amazon.awscdk.services.eks.AccessEntryType.FARGATE_LINUX),
  EC2_LINUX(software.amazon.awscdk.services.eks.AccessEntryType.EC2_LINUX),
  EC2_WINDOWS(software.amazon.awscdk.services.eks.AccessEntryType.EC2_WINDOWS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessEntryType):
        AccessEntryType = when (cdkObject) {
      software.amazon.awscdk.services.eks.AccessEntryType.STANDARD -> AccessEntryType.STANDARD
      software.amazon.awscdk.services.eks.AccessEntryType.FARGATE_LINUX ->
          AccessEntryType.FARGATE_LINUX
      software.amazon.awscdk.services.eks.AccessEntryType.EC2_LINUX -> AccessEntryType.EC2_LINUX
      software.amazon.awscdk.services.eks.AccessEntryType.EC2_WINDOWS -> AccessEntryType.EC2_WINDOWS
    }

    internal fun unwrap(wrapped: AccessEntryType):
        software.amazon.awscdk.services.eks.AccessEntryType = wrapped.cdkObject
  }
}
