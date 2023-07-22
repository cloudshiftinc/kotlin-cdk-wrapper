@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Configuration of a Microsoft Smooth output.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MsSmoothOutputSettingsProperty msSmoothOutputSettingsProperty =
 * MsSmoothOutputSettingsProperty.builder()
 * .h265PackagingType("h265PackagingType")
 * .nameModifier("nameModifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mssmoothoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelMsSmoothOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.MsSmoothOutputSettingsProperty.Builder =
      CfnChannel.MsSmoothOutputSettingsProperty.builder()

  /**
   * @param h265PackagingType Only applicable when this output is referencing an H.265 video
   * description. Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
   */
  public fun h265PackagingType(h265PackagingType: String) {
    cdkBuilder.h265PackagingType(h265PackagingType)
  }

  /**
   * @param nameModifier A string that is concatenated to the end of the destination file name.
   * This is required for multiple outputs of the same type.
   */
  public fun nameModifier(nameModifier: String) {
    cdkBuilder.nameModifier(nameModifier)
  }

  public fun build(): CfnChannel.MsSmoothOutputSettingsProperty = cdkBuilder.build()
}
