@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class QuoteCharacter(
  private val cdkObject: software.amazon.awscdk.services.logs.QuoteCharacter,
) {
  DOUBLE_QUOTE(software.amazon.awscdk.services.logs.QuoteCharacter.DOUBLE_QUOTE),
  SINGLE_QUOTE(software.amazon.awscdk.services.logs.QuoteCharacter.SINGLE_QUOTE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.QuoteCharacter):
        QuoteCharacter = when (cdkObject) {
      software.amazon.awscdk.services.logs.QuoteCharacter.DOUBLE_QUOTE ->
          QuoteCharacter.DOUBLE_QUOTE
      software.amazon.awscdk.services.logs.QuoteCharacter.SINGLE_QUOTE ->
          QuoteCharacter.SINGLE_QUOTE
    }

    internal fun unwrap(wrapped: QuoteCharacter):
        software.amazon.awscdk.services.logs.QuoteCharacter = wrapped.cdkObject
  }
}
