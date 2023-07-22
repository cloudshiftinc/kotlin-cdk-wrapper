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

  /**
   * @param captionChannel The closed caption channel being described by this
   * CaptionLanguageMapping.
   * Each channel mapping must have a unique channel number (maximum of 4).
   */
  public fun captionChannel(captionChannel: Number) {
    cdkBuilder.captionChannel(captionChannel)
  }

  /**
   * @param languageCode A three-character ISO 639-2 language code (see
   * http://www.loc.gov/standards/iso639-2).
   */
  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  /**
   * @param languageDescription The textual description of language.
   */
  public fun languageDescription(languageDescription: String) {
    cdkBuilder.languageDescription(languageDescription)
  }

  public fun build(): CfnChannel.CaptionLanguageMappingProperty = cdkBuilder.build()
}
