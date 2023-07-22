@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

/**
 * The configuration for a shared file storage system that is associated with a studio resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * SharedFileSystemConfigurationProperty sharedFileSystemConfigurationProperty =
 * SharedFileSystemConfigurationProperty.builder()
 * .endpoint("endpoint")
 * .fileSystemId("fileSystemId")
 * .linuxMountPoint("linuxMountPoint")
 * .shareName("shareName")
 * .windowsMountDrive("windowsMountDrive")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html)
 */
@CdkDslMarker
public class CfnStudioComponentSharedFileSystemConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.SharedFileSystemConfigurationProperty.Builder =
      CfnStudioComponent.SharedFileSystemConfigurationProperty.builder()

  /**
   * @param endpoint The endpoint of the shared file system that is accessed by the studio component
   * resource.
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param fileSystemId The unique identifier for a file system.
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * @param linuxMountPoint The mount location for a shared file system on a Linux virtual
   * workstation.
   */
  public fun linuxMountPoint(linuxMountPoint: String) {
    cdkBuilder.linuxMountPoint(linuxMountPoint)
  }

  /**
   * @param shareName The name of the file share.
   */
  public fun shareName(shareName: String) {
    cdkBuilder.shareName(shareName)
  }

  /**
   * @param windowsMountDrive The mount location for a shared file system on a Windows virtual
   * workstation.
   */
  public fun windowsMountDrive(windowsMountDrive: String) {
    cdkBuilder.windowsMountDrive(windowsMountDrive)
  }

  public fun build(): CfnStudioComponent.SharedFileSystemConfigurationProperty = cdkBuilder.build()
}
