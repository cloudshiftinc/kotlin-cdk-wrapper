@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class HeadersFrameOption(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.HeadersFrameOption,
) {
  DENY(software.amazon.awscdk.services.cloudfront.HeadersFrameOption.DENY),
  SAMEORIGIN(software.amazon.awscdk.services.cloudfront.HeadersFrameOption.SAMEORIGIN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.HeadersFrameOption):
        HeadersFrameOption = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.HeadersFrameOption.DENY -> HeadersFrameOption.DENY
      software.amazon.awscdk.services.cloudfront.HeadersFrameOption.SAMEORIGIN ->
          HeadersFrameOption.SAMEORIGIN
    }

    internal fun unwrap(wrapped: HeadersFrameOption):
        software.amazon.awscdk.services.cloudfront.HeadersFrameOption = wrapped.cdkObject
  }
}
