@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to configure the motion graphics overlay to use an HTML asset.
 *
 * The parent of this entity is MotionGraphicsSetting.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HtmlMotionGraphicsSettingsProperty htmlMotionGraphicsSettingsProperty =
 * HtmlMotionGraphicsSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-htmlmotiongraphicssettings.html)
 */
@CdkDslMarker
public class CfnChannelHtmlMotionGraphicsSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HtmlMotionGraphicsSettingsProperty.Builder =
      CfnChannel.HtmlMotionGraphicsSettingsProperty.builder()

  public fun build(): CfnChannel.HtmlMotionGraphicsSettingsProperty = cdkBuilder.build()
}
