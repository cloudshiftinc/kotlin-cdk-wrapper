@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

public enum class RedirectProtocol(
  private val cdkObject: software.amazon.awscdk.services.s3.RedirectProtocol,
) {
  HTTP(software.amazon.awscdk.services.s3.RedirectProtocol.HTTP),
  HTTPS(software.amazon.awscdk.services.s3.RedirectProtocol.HTTPS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.RedirectProtocol):
        RedirectProtocol = when (cdkObject) {
      software.amazon.awscdk.services.s3.RedirectProtocol.HTTP -> RedirectProtocol.HTTP
      software.amazon.awscdk.services.s3.RedirectProtocol.HTTPS -> RedirectProtocol.HTTPS
    }

    internal fun unwrap(wrapped: RedirectProtocol):
        software.amazon.awscdk.services.s3.RedirectProtocol = wrapped.cdkObject
  }
}
