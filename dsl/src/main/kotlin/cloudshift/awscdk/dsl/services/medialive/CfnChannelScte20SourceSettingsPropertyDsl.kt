@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelScte20SourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Scte20SourceSettingsProperty.Builder =
      CfnChannel.Scte20SourceSettingsProperty.builder()

  public fun convert608To708(convert608To708: String) {
    cdkBuilder.convert608To708(convert608To708)
  }

  public fun source608ChannelNumber(source608ChannelNumber: Number) {
    cdkBuilder.source608ChannelNumber(source608ChannelNumber)
  }

  public fun build(): CfnChannel.Scte20SourceSettingsProperty = cdkBuilder.build()
}
