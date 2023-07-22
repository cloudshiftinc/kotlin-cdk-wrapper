@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to configure Nielsen Watermarks in the audio encode.
 *
 * The parent of this entity is AudioWatermarkSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * NielsenWatermarksSettingsProperty nielsenWatermarksSettingsProperty =
 * NielsenWatermarksSettingsProperty.builder()
 * .nielsenCbetSettings(NielsenCBETProperty.builder()
 * .cbetCheckDigitString("cbetCheckDigitString")
 * .cbetStepaside("cbetStepaside")
 * .csid("csid")
 * .build())
 * .nielsenDistributionType("nielsenDistributionType")
 * .nielsenNaesIiNwSettings(NielsenNaesIiNwProperty.builder()
 * .checkDigitString("checkDigitString")
 * .sid(123)
 * .timezone("timezone")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsenwatermarkssettings.html)
 */
@CdkDslMarker
public class CfnChannelNielsenWatermarksSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.NielsenWatermarksSettingsProperty.Builder =
      CfnChannel.NielsenWatermarksSettingsProperty.builder()

  /**
   * @param nielsenCbetSettings Complete these fields only if you want to insert watermarks of type
   * Nielsen CBET.
   */
  public fun nielsenCbetSettings(nielsenCbetSettings: IResolvable) {
    cdkBuilder.nielsenCbetSettings(nielsenCbetSettings)
  }

  /**
   * @param nielsenCbetSettings Complete these fields only if you want to insert watermarks of type
   * Nielsen CBET.
   */
  public fun nielsenCbetSettings(nielsenCbetSettings: CfnChannel.NielsenCBETProperty) {
    cdkBuilder.nielsenCbetSettings(nielsenCbetSettings)
  }

  /**
   * @param nielsenDistributionType Choose the distribution types that you want to assign to the
   * watermarks: - PROGRAM_CONTENT - FINAL_DISTRIBUTOR.
   */
  public fun nielsenDistributionType(nielsenDistributionType: String) {
    cdkBuilder.nielsenDistributionType(nielsenDistributionType)
  }

  /**
   * @param nielsenNaesIiNwSettings Complete these fields only if you want to insert watermarks of
   * type Nielsen NAES II (N2) and Nielsen NAES VI (NW).
   */
  public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: IResolvable) {
    cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings)
  }

  /**
   * @param nielsenNaesIiNwSettings Complete these fields only if you want to insert watermarks of
   * type Nielsen NAES II (N2) and Nielsen NAES VI (NW).
   */
  public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: CfnChannel.NielsenNaesIiNwProperty) {
    cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings)
  }

  public fun build(): CfnChannel.NielsenWatermarksSettingsProperty = cdkBuilder.build()
}
