@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class AccessScopeType(
  private val cdkObject: software.amazon.awscdk.services.eks.AccessScopeType,
) {
  NAMESPACE(software.amazon.awscdk.services.eks.AccessScopeType.NAMESPACE),
  CLUSTER(software.amazon.awscdk.services.eks.AccessScopeType.CLUSTER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessScopeType):
        AccessScopeType = when (cdkObject) {
      software.amazon.awscdk.services.eks.AccessScopeType.NAMESPACE -> AccessScopeType.NAMESPACE
      software.amazon.awscdk.services.eks.AccessScopeType.CLUSTER -> AccessScopeType.CLUSTER
    }

    internal fun unwrap(wrapped: AccessScopeType):
        software.amazon.awscdk.services.eks.AccessScopeType = wrapped.cdkObject
  }
}
