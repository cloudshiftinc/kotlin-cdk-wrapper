@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/**
 * Allows you to opt in or opt out to share data with Rekognition to improve model performance.
 *
 * You can choose this option at the account level or on a per-stream basis. Note that if you opt
 * out at the account level, this setting is ignored on individual streams. For more information, see
 * [StreamProcessorDataSharingPreference](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_StreamProcessorDataSharingPreference)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * DataSharingPreferenceProperty dataSharingPreferenceProperty =
 * DataSharingPreferenceProperty.builder()
 * .optIn(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-datasharingpreference.html)
 */
@CdkDslMarker
public class CfnStreamProcessorDataSharingPreferencePropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.DataSharingPreferenceProperty.Builder =
      CfnStreamProcessor.DataSharingPreferenceProperty.builder()

  /**
   * @param optIn Describes the opt-in status applied to a stream processor's data sharing policy. 
   */
  public fun optIn(optIn: Boolean) {
    cdkBuilder.optIn(optIn)
  }

  /**
   * @param optIn Describes the opt-in status applied to a stream processor's data sharing policy. 
   */
  public fun optIn(optIn: IResolvable) {
    cdkBuilder.optIn(optIn)
  }

  public fun build(): CfnStreamProcessor.DataSharingPreferenceProperty = cdkBuilder.build()
}
