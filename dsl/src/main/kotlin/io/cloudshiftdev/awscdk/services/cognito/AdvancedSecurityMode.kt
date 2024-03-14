package io.cloudshiftdev.awscdk.services.cognito

public enum class AdvancedSecurityMode(
  private val cdkObject: software.amazon.awscdk.services.cognito.AdvancedSecurityMode,
) {
  ENFORCED(software.amazon.awscdk.services.cognito.AdvancedSecurityMode.ENFORCED),
  AUDIT(software.amazon.awscdk.services.cognito.AdvancedSecurityMode.AUDIT),
  OFF(software.amazon.awscdk.services.cognito.AdvancedSecurityMode.OFF),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AdvancedSecurityMode):
        AdvancedSecurityMode = when (cdkObject) {
      software.amazon.awscdk.services.cognito.AdvancedSecurityMode.ENFORCED ->
          AdvancedSecurityMode.ENFORCED
      software.amazon.awscdk.services.cognito.AdvancedSecurityMode.AUDIT ->
          AdvancedSecurityMode.AUDIT
      software.amazon.awscdk.services.cognito.AdvancedSecurityMode.OFF -> AdvancedSecurityMode.OFF
    }

    internal fun unwrap(wrapped: AdvancedSecurityMode):
        software.amazon.awscdk.services.cognito.AdvancedSecurityMode = wrapped.cdkObject
  }
}
