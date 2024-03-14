package io.cloudshiftdev.awscdk.services.codestarnotifications

public enum class DetailType(
  private val cdkObject: software.amazon.awscdk.services.codestarnotifications.DetailType,
) {
  BASIC(software.amazon.awscdk.services.codestarnotifications.DetailType.BASIC),
  FULL(software.amazon.awscdk.services.codestarnotifications.DetailType.FULL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.DetailType):
        DetailType = when (cdkObject) {
      software.amazon.awscdk.services.codestarnotifications.DetailType.BASIC -> DetailType.BASIC
      software.amazon.awscdk.services.codestarnotifications.DetailType.FULL -> DetailType.FULL
    }

    internal fun unwrap(wrapped: DetailType):
        software.amazon.awscdk.services.codestarnotifications.DetailType = wrapped.cdkObject
  }
}
