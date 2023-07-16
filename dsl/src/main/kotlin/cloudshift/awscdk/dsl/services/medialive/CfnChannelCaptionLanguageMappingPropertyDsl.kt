@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelCaptionLanguageMappingPropertyDsl {
  private val cdkBuilder: CfnChannel.CaptionLanguageMappingProperty.Builder =
      CfnChannel.CaptionLanguageMappingProperty.builder()

  public fun captionChannel(captionChannel: Number) {
    cdkBuilder.captionChannel(captionChannel)
  }

  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  public fun languageDescription(languageDescription: String) {
    cdkBuilder.languageDescription(languageDescription)
  }

  public fun build(): CfnChannel.CaptionLanguageMappingProperty = cdkBuilder.build()
}
