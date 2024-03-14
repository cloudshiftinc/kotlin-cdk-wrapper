package io.cloudshiftdev.awscdk

public enum class CfnCapabilities(
  private val cdkObject: software.amazon.awscdk.CfnCapabilities,
) {
  NONE(software.amazon.awscdk.CfnCapabilities.NONE),
  ANONYMOUS_IAM(software.amazon.awscdk.CfnCapabilities.ANONYMOUS_IAM),
  NAMED_IAM(software.amazon.awscdk.CfnCapabilities.NAMED_IAM),
  AUTO_EXPAND(software.amazon.awscdk.CfnCapabilities.AUTO_EXPAND),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCapabilities): CfnCapabilities = when
        (cdkObject) {
      software.amazon.awscdk.CfnCapabilities.NONE -> CfnCapabilities.NONE
      software.amazon.awscdk.CfnCapabilities.ANONYMOUS_IAM -> CfnCapabilities.ANONYMOUS_IAM
      software.amazon.awscdk.CfnCapabilities.NAMED_IAM -> CfnCapabilities.NAMED_IAM
      software.amazon.awscdk.CfnCapabilities.AUTO_EXPAND -> CfnCapabilities.AUTO_EXPAND
    }

    internal fun unwrap(wrapped: CfnCapabilities): software.amazon.awscdk.CfnCapabilities =
        wrapped.cdkObject
  }
}
