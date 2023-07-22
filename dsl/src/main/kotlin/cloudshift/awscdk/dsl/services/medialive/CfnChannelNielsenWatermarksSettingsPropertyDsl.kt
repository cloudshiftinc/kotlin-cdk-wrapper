@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

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
