@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotAudioAndDTMFInputSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.AudioAndDTMFInputSpecificationProperty.Builder =
      CfnBot.AudioAndDTMFInputSpecificationProperty.builder()

  public fun audioSpecification(audioSpecification: IResolvable) {
    cdkBuilder.audioSpecification(audioSpecification)
  }

  public fun audioSpecification(audioSpecification: CfnBot.AudioSpecificationProperty) {
    cdkBuilder.audioSpecification(audioSpecification)
  }

  public fun dtmfSpecification(dtmfSpecification: IResolvable) {
    cdkBuilder.dtmfSpecification(dtmfSpecification)
  }

  public fun dtmfSpecification(dtmfSpecification: CfnBot.DTMFSpecificationProperty) {
    cdkBuilder.dtmfSpecification(dtmfSpecification)
  }

  public fun startTimeoutMs(startTimeoutMs: Number) {
    cdkBuilder.startTimeoutMs(startTimeoutMs)
  }

  public fun build(): CfnBot.AudioAndDTMFInputSpecificationProperty = cdkBuilder.build()
}
