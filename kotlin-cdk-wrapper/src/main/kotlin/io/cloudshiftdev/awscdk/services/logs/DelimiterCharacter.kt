@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class DelimiterCharacter(
  private val cdkObject: software.amazon.awscdk.services.logs.DelimiterCharacter,
) {
  COMMA(software.amazon.awscdk.services.logs.DelimiterCharacter.COMMA),
  TAB(software.amazon.awscdk.services.logs.DelimiterCharacter.TAB),
  SPACE(software.amazon.awscdk.services.logs.DelimiterCharacter.SPACE),
  SEMICOLON(software.amazon.awscdk.services.logs.DelimiterCharacter.SEMICOLON),
  PIPE(software.amazon.awscdk.services.logs.DelimiterCharacter.PIPE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DelimiterCharacter):
        DelimiterCharacter = when (cdkObject) {
      software.amazon.awscdk.services.logs.DelimiterCharacter.COMMA -> DelimiterCharacter.COMMA
      software.amazon.awscdk.services.logs.DelimiterCharacter.TAB -> DelimiterCharacter.TAB
      software.amazon.awscdk.services.logs.DelimiterCharacter.SPACE -> DelimiterCharacter.SPACE
      software.amazon.awscdk.services.logs.DelimiterCharacter.SEMICOLON ->
          DelimiterCharacter.SEMICOLON
      software.amazon.awscdk.services.logs.DelimiterCharacter.PIPE -> DelimiterCharacter.PIPE
    }

    internal fun unwrap(wrapped: DelimiterCharacter):
        software.amazon.awscdk.services.logs.DelimiterCharacter = wrapped.cdkObject
  }
}
