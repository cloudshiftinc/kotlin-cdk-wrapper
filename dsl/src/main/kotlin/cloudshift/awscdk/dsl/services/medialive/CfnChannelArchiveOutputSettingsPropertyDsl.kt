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

  /**
   * @param containerSettings The settings that are specific to the container type of the file.
   */
  public fun containerSettings(containerSettings: IResolvable) {
    cdkBuilder.containerSettings(containerSettings)
  }

  /**
   * @param containerSettings The settings that are specific to the container type of the file.
   */
  public fun containerSettings(containerSettings: CfnChannel.ArchiveContainerSettingsProperty) {
    cdkBuilder.containerSettings(containerSettings)
  }

  /**
   * @param extension The output file extension.
   * If excluded, this is auto-selected from the container type.
   */
  public fun extension(extension: String) {
    cdkBuilder.extension(extension)
  }

  /**
   * @param nameModifier A string that is concatenated to the end of the destination file name.
   * The string is required for multiple outputs of the same type.
   */
  public fun nameModifier(nameModifier: String) {
    cdkBuilder.nameModifier(nameModifier)
  }

  public fun build(): CfnChannel.ArchiveOutputSettingsProperty = cdkBuilder.build()
}
