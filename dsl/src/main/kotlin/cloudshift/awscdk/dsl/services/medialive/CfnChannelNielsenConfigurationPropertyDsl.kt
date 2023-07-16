@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelNielsenConfigurationPropertyDsl {
  private val cdkBuilder: CfnChannel.NielsenConfigurationProperty.Builder =
      CfnChannel.NielsenConfigurationProperty.builder()

  public fun distributorId(distributorId: String) {
    cdkBuilder.distributorId(distributorId)
  }

  public fun nielsenPcmToId3Tagging(nielsenPcmToId3Tagging: String) {
    cdkBuilder.nielsenPcmToId3Tagging(nielsenPcmToId3Tagging)
  }

  public fun build(): CfnChannel.NielsenConfigurationProperty = cdkBuilder.build()
}
