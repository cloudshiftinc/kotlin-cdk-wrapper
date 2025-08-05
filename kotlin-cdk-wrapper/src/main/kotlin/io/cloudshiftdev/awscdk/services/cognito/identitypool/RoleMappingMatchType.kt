@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

public enum class RoleMappingMatchType(
  private val cdkObject: software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType,
) {
  EQUALS(software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.EQUALS),
  CONTAINS(software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.CONTAINS),
  STARTS_WITH(software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.STARTS_WITH),
  NOTEQUAL(software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.NOTEQUAL),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType):
        RoleMappingMatchType = when (cdkObject) {
      software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.EQUALS ->
          RoleMappingMatchType.EQUALS
      software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.CONTAINS ->
          RoleMappingMatchType.CONTAINS
      software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.STARTS_WITH ->
          RoleMappingMatchType.STARTS_WITH
      software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType.NOTEQUAL ->
          RoleMappingMatchType.NOTEQUAL
    }

    internal fun unwrap(wrapped: RoleMappingMatchType):
        software.amazon.awscdk.services.cognito.identitypool.RoleMappingMatchType =
        wrapped.cdkObject
  }
}
