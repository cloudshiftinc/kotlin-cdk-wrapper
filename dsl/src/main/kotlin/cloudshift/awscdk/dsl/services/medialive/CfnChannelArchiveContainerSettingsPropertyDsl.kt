@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelArchiveContainerSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.ArchiveContainerSettingsProperty.Builder =
      CfnChannel.ArchiveContainerSettingsProperty.builder()

  /**
   * @param m2TsSettings The settings for the M2TS in the archive output.
   */
  public fun m2TsSettings(m2TsSettings: IResolvable) {
    cdkBuilder.m2TsSettings(m2TsSettings)
  }

  /**
   * @param m2TsSettings The settings for the M2TS in the archive output.
   */
  public fun m2TsSettings(m2TsSettings: CfnChannel.M2tsSettingsProperty) {
    cdkBuilder.m2TsSettings(m2TsSettings)
  }

  /**
   * @param rawSettings The settings for Raw archive output type.
   */
  public fun rawSettings(rawSettings: IResolvable) {
    cdkBuilder.rawSettings(rawSettings)
  }

  /**
   * @param rawSettings The settings for Raw archive output type.
   */
  public fun rawSettings(rawSettings: CfnChannel.RawSettingsProperty) {
    cdkBuilder.rawSettings(rawSettings)
  }

  public fun build(): CfnChannel.ArchiveContainerSettingsProperty = cdkBuilder.build()
}
