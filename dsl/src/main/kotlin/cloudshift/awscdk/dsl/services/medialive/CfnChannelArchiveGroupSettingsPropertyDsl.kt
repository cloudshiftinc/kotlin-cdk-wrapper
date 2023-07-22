@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelArchiveGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.ArchiveGroupSettingsProperty.Builder =
      CfnChannel.ArchiveGroupSettingsProperty.builder()

  /**
   * @param archiveCdnSettings Settings to configure the destination of an Archive output.
   */
  public fun archiveCdnSettings(archiveCdnSettings: IResolvable) {
    cdkBuilder.archiveCdnSettings(archiveCdnSettings)
  }

  /**
   * @param archiveCdnSettings Settings to configure the destination of an Archive output.
   */
  public fun archiveCdnSettings(archiveCdnSettings: CfnChannel.ArchiveCdnSettingsProperty) {
    cdkBuilder.archiveCdnSettings(archiveCdnSettings)
  }

  /**
   * @param destination A directory and base file name where archive files should be written.
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination A directory and base file name where archive files should be written.
   */
  public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param rolloverInterval The number of seconds to write to an archive file before closing and
   * starting a new one.
   */
  public fun rolloverInterval(rolloverInterval: Number) {
    cdkBuilder.rolloverInterval(rolloverInterval)
  }

  public fun build(): CfnChannel.ArchiveGroupSettingsProperty = cdkBuilder.build()
}
