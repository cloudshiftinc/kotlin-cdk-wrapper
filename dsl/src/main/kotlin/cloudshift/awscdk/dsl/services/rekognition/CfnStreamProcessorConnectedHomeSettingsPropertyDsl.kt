@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/**
 * Connected home settings to use on a streaming video.
 *
 * Defining the settings is required in the request parameter for `CreateStreamProcessor` .
 * Including this setting in the CreateStreamProcessor request lets you use the stream processor for
 * connected home features. You can then select what you want the stream processor to detect, such as
 * people or pets.
 *
 * When the stream processor has started, one notification is sent for each object class specified.
 * For example, if packages and pets are selected, one SNS notification is published the first time a
 * package is detected and one SNS notification is published the first time a pet is detected. An
 * end-of-session summary is also published. For more information, see the ConnectedHome section of
 * [StreamProcessorSettings](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorSettings)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * ConnectedHomeSettingsProperty connectedHomeSettingsProperty =
 * ConnectedHomeSettingsProperty.builder()
 * .labels(List.of("labels"))
 * // the properties below are optional
 * .minConfidence(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-connectedhomesettings.html)
 */
@CdkDslMarker
public class CfnStreamProcessorConnectedHomeSettingsPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.ConnectedHomeSettingsProperty.Builder =
      CfnStreamProcessor.ConnectedHomeSettingsProperty.builder()

  private val _labels: MutableList<String> = mutableListOf()

  /**
   * @param labels Specifies what you want to detect in the video, such as people, packages, or
   * pets. 
   * The current valid labels you can include in this list are: "PERSON", "PET", "PACKAGE", and
   * "ALL".
   */
  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
  }

  /**
   * @param labels Specifies what you want to detect in the video, such as people, packages, or
   * pets. 
   * The current valid labels you can include in this list are: "PERSON", "PET", "PACKAGE", and
   * "ALL".
   */
  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  /**
   * @param minConfidence The minimum confidence required to label an object in the video.
   */
  public fun minConfidence(minConfidence: Number) {
    cdkBuilder.minConfidence(minConfidence)
  }

  public fun build(): CfnStreamProcessor.ConnectedHomeSettingsProperty {
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
