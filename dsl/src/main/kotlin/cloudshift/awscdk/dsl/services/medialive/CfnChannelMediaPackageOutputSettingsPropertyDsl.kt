@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for a MediaPackage output.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MediaPackageOutputSettingsProperty mediaPackageOutputSettingsProperty =
 * MediaPackageOutputSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelMediaPackageOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MediaPackageOutputSettingsProperty.Builder =
      CfnChannel.MediaPackageOutputSettingsProperty.builder()

  public fun build(): CfnChannel.MediaPackageOutputSettingsProperty = cdkBuilder.build()
}
