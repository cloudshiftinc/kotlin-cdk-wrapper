@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDTMFSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.DTMFSpecificationProperty.Builder =
      CfnBot.DTMFSpecificationProperty.builder()

  /**
   * @param deletionCharacter The DTMF character that clears the accumulated DTMF digits and
   * immediately ends the input. 
   */
  public fun deletionCharacter(deletionCharacter: String) {
    cdkBuilder.deletionCharacter(deletionCharacter)
  }

  /**
   * @param endCharacter The DTMF character that immediately ends input. 
   * If the user does not press this character, the input ends after the end timeout.
   */
  public fun endCharacter(endCharacter: String) {
    cdkBuilder.endCharacter(endCharacter)
  }

  /**
   * @param endTimeoutMs How long the bot should wait after the last DTMF character input before
   * assuming that the input has concluded. 
   */
  public fun endTimeoutMs(endTimeoutMs: Number) {
    cdkBuilder.endTimeoutMs(endTimeoutMs)
  }

  /**
   * @param maxLength The maximum number of DTMF digits allowed in an utterance. 
   */
  public fun maxLength(maxLength: Number) {
    cdkBuilder.maxLength(maxLength)
  }

  public fun build(): CfnBot.DTMFSpecificationProperty = cdkBuilder.build()
}
