@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

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
