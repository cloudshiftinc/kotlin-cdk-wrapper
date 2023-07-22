@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.Acl

@CdkDslMarker
public class AclDsl {
  private val cdkBuilder: Acl.Builder = Acl.builder()

  /**
   * @param ownerGid Specifies the POSIX group ID to apply to the RootDirectory. 
   * Accepts values from 0 to 2^32 (4294967295).
   */
  public fun ownerGid(ownerGid: String) {
    cdkBuilder.ownerGid(ownerGid)
  }

  /**
   * @param ownerUid Specifies the POSIX user ID to apply to the RootDirectory. 
   * Accepts values from 0 to 2^32 (4294967295).
   */
  public fun ownerUid(ownerUid: String) {
    cdkBuilder.ownerUid(ownerUid)
  }

  /**
   * @param permissions Specifies the POSIX permissions to apply to the RootDirectory, in the format
   * of an octal number representing the file's mode bits. 
   */
  public fun permissions(permissions: String) {
    cdkBuilder.permissions(permissions)
  }

  public fun build(): Acl = cdkBuilder.build()
}
