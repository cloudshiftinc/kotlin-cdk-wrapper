@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class KeyValueDelimiter(
  private val cdkObject: software.amazon.awscdk.services.logs.KeyValueDelimiter,
) {
  EQUAL(software.amazon.awscdk.services.logs.KeyValueDelimiter.EQUAL),
  COLON(software.amazon.awscdk.services.logs.KeyValueDelimiter.COLON),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.KeyValueDelimiter):
        KeyValueDelimiter = when (cdkObject) {
      software.amazon.awscdk.services.logs.KeyValueDelimiter.EQUAL -> KeyValueDelimiter.EQUAL
      software.amazon.awscdk.services.logs.KeyValueDelimiter.COLON -> KeyValueDelimiter.COLON
    }

    internal fun unwrap(wrapped: KeyValueDelimiter):
        software.amazon.awscdk.services.logs.KeyValueDelimiter = wrapped.cdkObject
  }
}
