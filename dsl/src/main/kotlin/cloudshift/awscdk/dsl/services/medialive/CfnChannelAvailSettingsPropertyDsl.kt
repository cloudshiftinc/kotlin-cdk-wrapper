@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAvailSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.AvailSettingsProperty.Builder =
      CfnChannel.AvailSettingsProperty.builder()

  public fun esam(esam: IResolvable) {
    cdkBuilder.esam(esam)
  }

  public fun esam(esam: CfnChannel.EsamProperty) {
    cdkBuilder.esam(esam)
  }

  public fun scte35SpliceInsert(scte35SpliceInsert: IResolvable) {
    cdkBuilder.scte35SpliceInsert(scte35SpliceInsert)
  }

  public fun scte35SpliceInsert(scte35SpliceInsert: CfnChannel.Scte35SpliceInsertProperty) {
    cdkBuilder.scte35SpliceInsert(scte35SpliceInsert)
  }

  public fun scte35TimeSignalApos(scte35TimeSignalApos: IResolvable) {
    cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos)
  }

  public fun scte35TimeSignalApos(scte35TimeSignalApos: CfnChannel.Scte35TimeSignalAposProperty) {
    cdkBuilder.scte35TimeSignalApos(scte35TimeSignalApos)
  }

  public fun build(): CfnChannel.AvailSettingsProperty = cdkBuilder.build()
}
