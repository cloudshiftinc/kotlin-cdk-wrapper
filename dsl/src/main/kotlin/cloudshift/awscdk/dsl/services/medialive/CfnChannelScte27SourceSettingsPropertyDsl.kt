@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about the SCTE-27 captions to extract from the input.
 *
 * The parent of this entity is CaptionSelectorSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Scte27SourceSettingsProperty scte27SourceSettingsProperty =
 * Scte27SourceSettingsProperty.builder()
 * .ocrLanguage("ocrLanguage")
 * .pid(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html)
 */
@CdkDslMarker
public class CfnChannelScte27SourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Scte27SourceSettingsProperty.Builder =
      CfnChannel.Scte27SourceSettingsProperty.builder()

  /**
   * @param ocrLanguage If you will configure a WebVTT caption description that references this
   * caption selector, use this field to provide the language to consider when translating the
   * image-based source to text.
   */
  public fun ocrLanguage(ocrLanguage: String) {
    cdkBuilder.ocrLanguage(ocrLanguage)
  }

  /**
   * @param pid The PID field is used in conjunction with the captions selector languageCode field
   * as follows: Specify PID and Language: Extracts captions from that PID;.
   * the language is "informational." Specify PID and omit Language: Extracts the specified PID.
   * Omit PID and specify Language: Extracts the specified language, whichever PID that happens to be.
   * Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all
   * languages are passed through.
   */
  public fun pid(pid: Number) {
    cdkBuilder.pid(pid)
  }

  public fun build(): CfnChannel.Scte27SourceSettingsProperty = cdkBuilder.build()
}
