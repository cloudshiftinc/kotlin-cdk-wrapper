@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class DateTimeFormat(
  private val cdkObject: software.amazon.awscdk.services.logs.DateTimeFormat,
) {
  ISO_8601(software.amazon.awscdk.services.logs.DateTimeFormat.ISO_8601),
  UNIX_TIMESTAMP(software.amazon.awscdk.services.logs.DateTimeFormat.UNIX_TIMESTAMP),
  CUSTOM(software.amazon.awscdk.services.logs.DateTimeFormat.CUSTOM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DateTimeFormat):
        DateTimeFormat = when (cdkObject) {
      software.amazon.awscdk.services.logs.DateTimeFormat.ISO_8601 -> DateTimeFormat.ISO_8601
      software.amazon.awscdk.services.logs.DateTimeFormat.UNIX_TIMESTAMP ->
          DateTimeFormat.UNIX_TIMESTAMP
      software.amazon.awscdk.services.logs.DateTimeFormat.CUSTOM -> DateTimeFormat.CUSTOM
    }

    internal fun unwrap(wrapped: DateTimeFormat):
        software.amazon.awscdk.services.logs.DateTimeFormat = wrapped.cdkObject
  }
}
