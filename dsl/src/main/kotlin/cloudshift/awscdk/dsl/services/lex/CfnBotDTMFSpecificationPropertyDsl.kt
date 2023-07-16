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

  public fun deletionCharacter(deletionCharacter: String) {
    cdkBuilder.deletionCharacter(deletionCharacter)
  }

  public fun endCharacter(endCharacter: String) {
    cdkBuilder.endCharacter(endCharacter)
  }

  public fun endTimeoutMs(endTimeoutMs: Number) {
    cdkBuilder.endTimeoutMs(endTimeoutMs)
  }

  public fun maxLength(maxLength: Number) {
    cdkBuilder.maxLength(maxLength)
  }

  public fun build(): CfnBot.DTMFSpecificationProperty = cdkBuilder.build()
}
