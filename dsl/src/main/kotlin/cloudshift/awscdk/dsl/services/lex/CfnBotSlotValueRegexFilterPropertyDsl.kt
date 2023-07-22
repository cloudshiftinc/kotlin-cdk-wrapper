@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotSlotValueRegexFilterPropertyDsl {
  private val cdkBuilder: CfnBot.SlotValueRegexFilterProperty.Builder =
      CfnBot.SlotValueRegexFilterProperty.builder()

  /**
   * @param pattern A regular expression used to validate the value of a slot. 
   * Use a standard regular expression. Amazon Lex supports the following characters in the regular
   * expression:
   *
   * * A-Z, a-z
   * * 0-9
   * * Unicode characters ("\⁠u<Unicode>")
   *
   * Represent Unicode characters with four digits, for example "\⁠u0041" or "\⁠u005A".
   *
   * The following regular expression operators are not supported:
   *
   * * Infinite repeaters: *, +, or {x,} with no upper bound.
   * * Wild card (.)
   */
  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnBot.SlotValueRegexFilterProperty = cdkBuilder.build()
}
