@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentSharedFileSystemConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.SharedFileSystemConfigurationProperty.Builder =
      CfnStudioComponent.SharedFileSystemConfigurationProperty.builder()

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  public fun linuxMountPoint(linuxMountPoint: String) {
    cdkBuilder.linuxMountPoint(linuxMountPoint)
  }

  public fun shareName(shareName: String) {
    cdkBuilder.shareName(shareName)
  }

  public fun windowsMountDrive(windowsMountDrive: String) {
    cdkBuilder.windowsMountDrive(windowsMountDrive)
  }

  public fun build(): CfnStudioComponent.SharedFileSystemConfigurationProperty = cdkBuilder.build()
}
