@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelArchiveOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.ArchiveOutputSettingsProperty.Builder =
      CfnChannel.ArchiveOutputSettingsProperty.builder()

  public fun containerSettings(containerSettings: IResolvable) {
    cdkBuilder.containerSettings(containerSettings)
  }

  public fun containerSettings(containerSettings: CfnChannel.ArchiveContainerSettingsProperty) {
    cdkBuilder.containerSettings(containerSettings)
  }

  public fun extension(extension: String) {
    cdkBuilder.extension(extension)
  }

  public fun nameModifier(nameModifier: String) {
    cdkBuilder.nameModifier(nameModifier)
  }

  public fun build(): CfnChannel.ArchiveOutputSettingsProperty = cdkBuilder.build()
}
