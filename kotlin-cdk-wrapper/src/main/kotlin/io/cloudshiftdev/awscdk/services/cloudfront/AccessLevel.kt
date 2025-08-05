@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class AccessLevel(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.AccessLevel,
) {
  READ(software.amazon.awscdk.services.cloudfront.AccessLevel.READ),
  READ_VERSIONED(software.amazon.awscdk.services.cloudfront.AccessLevel.READ_VERSIONED),
  LIST(software.amazon.awscdk.services.cloudfront.AccessLevel.LIST),
  WRITE(software.amazon.awscdk.services.cloudfront.AccessLevel.WRITE),
  DELETE(software.amazon.awscdk.services.cloudfront.AccessLevel.DELETE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.AccessLevel):
        AccessLevel = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.AccessLevel.READ -> AccessLevel.READ
      software.amazon.awscdk.services.cloudfront.AccessLevel.READ_VERSIONED ->
          AccessLevel.READ_VERSIONED
      software.amazon.awscdk.services.cloudfront.AccessLevel.LIST -> AccessLevel.LIST
      software.amazon.awscdk.services.cloudfront.AccessLevel.WRITE -> AccessLevel.WRITE
      software.amazon.awscdk.services.cloudfront.AccessLevel.DELETE -> AccessLevel.DELETE
    }

    internal fun unwrap(wrapped: AccessLevel):
        software.amazon.awscdk.services.cloudfront.AccessLevel = wrapped.cdkObject
  }
}
