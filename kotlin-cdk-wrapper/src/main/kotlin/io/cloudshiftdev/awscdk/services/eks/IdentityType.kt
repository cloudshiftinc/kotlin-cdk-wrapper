@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class IdentityType(
  private val cdkObject: software.amazon.awscdk.services.eks.IdentityType,
) {
  IRSA(software.amazon.awscdk.services.eks.IdentityType.IRSA),
  POD_IDENTITY(software.amazon.awscdk.services.eks.IdentityType.POD_IDENTITY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.IdentityType): IdentityType =
        when (cdkObject) {
      software.amazon.awscdk.services.eks.IdentityType.IRSA -> IdentityType.IRSA
      software.amazon.awscdk.services.eks.IdentityType.POD_IDENTITY -> IdentityType.POD_IDENTITY
    }

    internal fun unwrap(wrapped: IdentityType): software.amazon.awscdk.services.eks.IdentityType =
        wrapped.cdkObject
  }
}
