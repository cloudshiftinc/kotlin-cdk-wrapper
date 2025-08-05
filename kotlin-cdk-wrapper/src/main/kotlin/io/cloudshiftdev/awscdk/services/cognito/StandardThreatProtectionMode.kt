@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

public enum class StandardThreatProtectionMode(
  private val cdkObject: software.amazon.awscdk.services.cognito.StandardThreatProtectionMode,
) {
  FULL_FUNCTION(software.amazon.awscdk.services.cognito.StandardThreatProtectionMode.FULL_FUNCTION),
  AUDIT_ONLY(software.amazon.awscdk.services.cognito.StandardThreatProtectionMode.AUDIT_ONLY),
  NO_ENFORCEMENT(software.amazon.awscdk.services.cognito.StandardThreatProtectionMode.NO_ENFORCEMENT),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StandardThreatProtectionMode):
        StandardThreatProtectionMode = when (cdkObject) {
      software.amazon.awscdk.services.cognito.StandardThreatProtectionMode.FULL_FUNCTION ->
          StandardThreatProtectionMode.FULL_FUNCTION
      software.amazon.awscdk.services.cognito.StandardThreatProtectionMode.AUDIT_ONLY ->
          StandardThreatProtectionMode.AUDIT_ONLY
      software.amazon.awscdk.services.cognito.StandardThreatProtectionMode.NO_ENFORCEMENT ->
          StandardThreatProtectionMode.NO_ENFORCEMENT
    }

    internal fun unwrap(wrapped: StandardThreatProtectionMode):
        software.amazon.awscdk.services.cognito.StandardThreatProtectionMode = wrapped.cdkObject
  }
}
