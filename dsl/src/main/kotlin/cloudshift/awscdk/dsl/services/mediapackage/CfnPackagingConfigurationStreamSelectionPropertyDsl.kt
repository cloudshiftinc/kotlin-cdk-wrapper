@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationStreamSelectionPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.StreamSelectionProperty.Builder =
      CfnPackagingConfiguration.StreamSelectionProperty.builder()

  public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
    cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
  }

  public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
    cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
  }

  public fun streamOrder(streamOrder: String) {
    cdkBuilder.streamOrder(streamOrder)
  }

  public fun build(): CfnPackagingConfiguration.StreamSelectionProperty = cdkBuilder.build()
}
