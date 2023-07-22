@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS

/**
 * Represents the protocol that AWS DataSync uses to access your Amazon FSx for OpenZFS file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * ProtocolProperty protocolProperty = ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-protocol.html)
 */
@CdkDslMarker
public class CfnLocationFSxOpenZFSProtocolPropertyDsl {
  private val cdkBuilder: CfnLocationFSxOpenZFS.ProtocolProperty.Builder =
      CfnLocationFSxOpenZFS.ProtocolProperty.builder()

  /**
   * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access your
   * FSx for OpenZFS file system.
   */
  public fun nfs(nfs: IResolvable) {
    cdkBuilder.nfs(nfs)
  }

  /**
   * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access your
   * FSx for OpenZFS file system.
   */
  public fun nfs(nfs: CfnLocationFSxOpenZFS.NFSProperty) {
    cdkBuilder.nfs(nfs)
  }

  public fun build(): CfnLocationFSxOpenZFS.ProtocolProperty = cdkBuilder.build()
}
