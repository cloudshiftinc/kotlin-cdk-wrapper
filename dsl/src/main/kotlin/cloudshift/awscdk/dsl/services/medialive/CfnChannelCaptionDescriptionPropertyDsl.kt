@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelCaptionDescriptionPropertyDsl {
  private val cdkBuilder: CfnChannel.CaptionDescriptionProperty.Builder =
      CfnChannel.CaptionDescriptionProperty.builder()

  /**
   * @param accessibility the value to be set.
   */
  public fun accessibility(accessibility: String) {
    cdkBuilder.accessibility(accessibility)
  }

  /**
   * @param captionSelectorName Specifies which input captions selector to use as a captions source
   * when generating output captions.
   * This field should match a captionSelector name.
   */
  public fun captionSelectorName(captionSelectorName: String) {
    cdkBuilder.captionSelectorName(captionSelectorName)
  }

  /**
   * @param destinationSettings Additional settings for a captions destination that depend on the
   * destination type.
   */
  public fun destinationSettings(destinationSettings: IResolvable) {
    cdkBuilder.destinationSettings(destinationSettings)
  }

  /**
   * @param destinationSettings Additional settings for a captions destination that depend on the
   * destination type.
   */
  public
      fun destinationSettings(destinationSettings: CfnChannel.CaptionDestinationSettingsProperty) {
    cdkBuilder.destinationSettings(destinationSettings)
  }

  /**
   * @param languageCode An ISO 639-2 three-digit code.
   * For more information, see http://www.loc.gov/standards/iso639-2/.
   */
  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  /**
   * @param languageDescription Human-readable information to indicate the captions that are
   * available for players (for example, English or Spanish).
   */
  public fun languageDescription(languageDescription: String) {
    cdkBuilder.languageDescription(languageDescription)
  }

  /**
   * @param name The name of the captions description.
   * The name is used to associate a captions description with an output. Names must be unique
   * within a channel.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnChannel.CaptionDescriptionProperty = cdkBuilder.build()
}
