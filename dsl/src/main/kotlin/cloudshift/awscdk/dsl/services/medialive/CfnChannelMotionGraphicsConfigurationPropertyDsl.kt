@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMotionGraphicsConfigurationPropertyDsl {
  private val cdkBuilder: CfnChannel.MotionGraphicsConfigurationProperty.Builder =
      CfnChannel.MotionGraphicsConfigurationProperty.builder()

  /**
   * @param motionGraphicsInsertion Enables or disables the motion graphics overlay feature in the
   * channel.
   */
  public fun motionGraphicsInsertion(motionGraphicsInsertion: String) {
    cdkBuilder.motionGraphicsInsertion(motionGraphicsInsertion)
  }

  /**
   * @param motionGraphicsSettings Settings to enable and configure the motion graphics overlay
   * feature in the channel.
   */
  public fun motionGraphicsSettings(motionGraphicsSettings: IResolvable) {
    cdkBuilder.motionGraphicsSettings(motionGraphicsSettings)
  }

  /**
   * @param motionGraphicsSettings Settings to enable and configure the motion graphics overlay
   * feature in the channel.
   */
  public
      fun motionGraphicsSettings(motionGraphicsSettings: CfnChannel.MotionGraphicsSettingsProperty) {
    cdkBuilder.motionGraphicsSettings(motionGraphicsSettings)
  }

  public fun build(): CfnChannel.MotionGraphicsConfigurationProperty = cdkBuilder.build()
}
