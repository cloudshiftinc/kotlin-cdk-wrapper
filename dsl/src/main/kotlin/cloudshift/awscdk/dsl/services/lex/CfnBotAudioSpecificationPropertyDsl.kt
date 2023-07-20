@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotAudioSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.AudioSpecificationProperty.Builder =
      CfnBot.AudioSpecificationProperty.builder()

  public fun endTimeoutMs(endTimeoutMs: Number) {
    cdkBuilder.endTimeoutMs(endTimeoutMs)
  }

  public fun maxLengthMs(maxLengthMs: Number) {
    cdkBuilder.maxLengthMs(maxLengthMs)
  }

  public fun build(): CfnBot.AudioSpecificationProperty = cdkBuilder.build()
}
