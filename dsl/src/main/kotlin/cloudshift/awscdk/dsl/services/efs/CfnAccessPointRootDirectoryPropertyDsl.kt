@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointRootDirectoryPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.RootDirectoryProperty.Builder =
      CfnAccessPoint.RootDirectoryProperty.builder()

  /**
   * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the access
   * point's `RootDirectory` .
   * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
   * using the `CreationInfo` settings when a client connects to an access point. When specifying the
   * `CreationInfo` , you must provide values for all properties.
   *
   *
   * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
   * exist, attempts to mount the file system using the access point will fail.
   */
  public fun creationInfo(creationInfo: IResolvable) {
    cdkBuilder.creationInfo(creationInfo)
  }

  /**
   * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the access
   * point's `RootDirectory` .
   * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
   * using the `CreationInfo` settings when a client connects to an access point. When specifying the
   * `CreationInfo` , you must provide values for all properties.
   *
   *
   * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
   * exist, attempts to mount the file system using the access point will fail.
   */
  public fun creationInfo(creationInfo: CfnAccessPoint.CreationInfoProperty) {
    cdkBuilder.creationInfo(creationInfo)
  }

  /**
   * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
   * clients using the access point to access the EFS file system.
   * A path can have up to four subdirectories. If the specified path does not exist, you are
   * required to provide the `CreationInfo` .
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnAccessPoint.RootDirectoryProperty = cdkBuilder.build()
}
