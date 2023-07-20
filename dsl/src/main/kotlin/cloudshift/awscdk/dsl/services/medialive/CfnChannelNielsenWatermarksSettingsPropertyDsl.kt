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

  public fun nielsenCbetSettings(nielsenCbetSettings: IResolvable) {
    cdkBuilder.nielsenCbetSettings(nielsenCbetSettings)
  }

  public fun nielsenCbetSettings(nielsenCbetSettings: CfnChannel.NielsenCBETProperty) {
    cdkBuilder.nielsenCbetSettings(nielsenCbetSettings)
  }

  public fun nielsenDistributionType(nielsenDistributionType: String) {
    cdkBuilder.nielsenDistributionType(nielsenDistributionType)
  }

  public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: IResolvable) {
    cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings)
  }

  public fun nielsenNaesIiNwSettings(nielsenNaesIiNwSettings: CfnChannel.NielsenNaesIiNwProperty) {
    cdkBuilder.nielsenNaesIiNwSettings(nielsenNaesIiNwSettings)
  }

  public fun build(): CfnChannel.NielsenWatermarksSettingsProperty = cdkBuilder.build()
}
