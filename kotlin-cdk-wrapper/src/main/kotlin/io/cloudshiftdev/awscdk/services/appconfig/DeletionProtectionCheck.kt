@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

public enum class DeletionProtectionCheck(
  private val cdkObject: software.amazon.awscdk.services.appconfig.DeletionProtectionCheck,
) {
  ACCOUNT_DEFAULT(software.amazon.awscdk.services.appconfig.DeletionProtectionCheck.ACCOUNT_DEFAULT),
  APPLY(software.amazon.awscdk.services.appconfig.DeletionProtectionCheck.APPLY),
  BYPASS(software.amazon.awscdk.services.appconfig.DeletionProtectionCheck.BYPASS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.DeletionProtectionCheck):
        DeletionProtectionCheck = when (cdkObject) {
      software.amazon.awscdk.services.appconfig.DeletionProtectionCheck.ACCOUNT_DEFAULT ->
          DeletionProtectionCheck.ACCOUNT_DEFAULT
      software.amazon.awscdk.services.appconfig.DeletionProtectionCheck.APPLY ->
          DeletionProtectionCheck.APPLY
      software.amazon.awscdk.services.appconfig.DeletionProtectionCheck.BYPASS ->
          DeletionProtectionCheck.BYPASS
    }

    internal fun unwrap(wrapped: DeletionProtectionCheck):
        software.amazon.awscdk.services.appconfig.DeletionProtectionCheck = wrapped.cdkObject
  }
}
