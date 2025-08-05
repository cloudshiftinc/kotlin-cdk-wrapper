@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

public enum class CustomThreatProtectionMode(
  private val cdkObject: software.amazon.awscdk.services.cognito.CustomThreatProtectionMode,
) {
  FULL_FUNCTION(software.amazon.awscdk.services.cognito.CustomThreatProtectionMode.FULL_FUNCTION),
  AUDIT_ONLY(software.amazon.awscdk.services.cognito.CustomThreatProtectionMode.AUDIT_ONLY),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomThreatProtectionMode):
        CustomThreatProtectionMode = when (cdkObject) {
      software.amazon.awscdk.services.cognito.CustomThreatProtectionMode.FULL_FUNCTION ->
          CustomThreatProtectionMode.FULL_FUNCTION
      software.amazon.awscdk.services.cognito.CustomThreatProtectionMode.AUDIT_ONLY ->
          CustomThreatProtectionMode.AUDIT_ONLY
    }

    internal fun unwrap(wrapped: CustomThreatProtectionMode):
        software.amazon.awscdk.services.cognito.CustomThreatProtectionMode = wrapped.cdkObject
  }
}
