@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelMotionGraphicsSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MotionGraphicsSettingsProperty.Builder =
      CfnChannel.MotionGraphicsSettingsProperty.builder()

  /**
   * @param htmlMotionGraphicsSettings Settings to configure the motion graphics overlay to use an
   * HTML asset.
   */
  public fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: IResolvable) {
    cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings)
  }

  /**
   * @param htmlMotionGraphicsSettings Settings to configure the motion graphics overlay to use an
   * HTML asset.
   */
  public
      fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: CfnChannel.HtmlMotionGraphicsSettingsProperty) {
    cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings)
  }

  public fun build(): CfnChannel.MotionGraphicsSettingsProperty = cdkBuilder.build()
}
