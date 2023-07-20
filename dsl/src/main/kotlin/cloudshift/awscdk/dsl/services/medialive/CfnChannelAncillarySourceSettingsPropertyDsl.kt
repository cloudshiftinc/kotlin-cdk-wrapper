@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAncillarySourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AncillarySourceSettingsProperty.Builder =
      CfnChannel.AncillarySourceSettingsProperty.builder()

  public fun sourceAncillaryChannelNumber(sourceAncillaryChannelNumber: Number) {
    cdkBuilder.sourceAncillaryChannelNumber(sourceAncillaryChannelNumber)
  }

  public fun build(): CfnChannel.AncillarySourceSettingsProperty = cdkBuilder.build()
}
