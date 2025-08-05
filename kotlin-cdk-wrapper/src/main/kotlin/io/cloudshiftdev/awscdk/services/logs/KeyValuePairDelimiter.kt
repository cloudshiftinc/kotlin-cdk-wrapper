@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class KeyValuePairDelimiter(
  private val cdkObject: software.amazon.awscdk.services.logs.KeyValuePairDelimiter,
) {
  AMPERSAND(software.amazon.awscdk.services.logs.KeyValuePairDelimiter.AMPERSAND),
  SEMICOLON(software.amazon.awscdk.services.logs.KeyValuePairDelimiter.SEMICOLON),
  SPACE(software.amazon.awscdk.services.logs.KeyValuePairDelimiter.SPACE),
  NEWLINE(software.amazon.awscdk.services.logs.KeyValuePairDelimiter.NEWLINE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.KeyValuePairDelimiter):
        KeyValuePairDelimiter = when (cdkObject) {
      software.amazon.awscdk.services.logs.KeyValuePairDelimiter.AMPERSAND ->
          KeyValuePairDelimiter.AMPERSAND
      software.amazon.awscdk.services.logs.KeyValuePairDelimiter.SEMICOLON ->
          KeyValuePairDelimiter.SEMICOLON
      software.amazon.awscdk.services.logs.KeyValuePairDelimiter.SPACE ->
          KeyValuePairDelimiter.SPACE
      software.amazon.awscdk.services.logs.KeyValuePairDelimiter.NEWLINE ->
          KeyValuePairDelimiter.NEWLINE
    }

    internal fun unwrap(wrapped: KeyValuePairDelimiter):
        software.amazon.awscdk.services.logs.KeyValuePairDelimiter = wrapped.cdkObject
  }
}
