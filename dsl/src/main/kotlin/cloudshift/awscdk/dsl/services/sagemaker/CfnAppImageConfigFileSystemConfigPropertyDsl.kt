@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@CdkDslMarker
public class CfnAppImageConfigFileSystemConfigPropertyDsl {
  private val cdkBuilder: CfnAppImageConfig.FileSystemConfigProperty.Builder =
      CfnAppImageConfig.FileSystemConfigProperty.builder()

  /**
   * @param defaultGid The default POSIX group ID (GID).
   * If not specified, defaults to `100` .
   */
  public fun defaultGid(defaultGid: Number) {
    cdkBuilder.defaultGid(defaultGid)
  }

  /**
   * @param defaultUid The default POSIX user ID (UID).
   * If not specified, defaults to `1000` .
   */
  public fun defaultUid(defaultUid: Number) {
    cdkBuilder.defaultUid(defaultUid)
  }

  /**
   * @param mountPath The path within the image to mount the user's EFS home directory.
   * The directory should be empty. If not specified, defaults to * /home/sagemaker-user* .
   */
  public fun mountPath(mountPath: String) {
    cdkBuilder.mountPath(mountPath)
  }

  public fun build(): CfnAppImageConfig.FileSystemConfigProperty = cdkBuilder.build()
}
