@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPointProps
import software.amazon.awscdk.services.efs.Acl
import software.amazon.awscdk.services.efs.IFileSystem
import software.amazon.awscdk.services.efs.PosixUser

@CdkDslMarker
public class AccessPointPropsDsl {
  private val cdkBuilder: AccessPointProps.Builder = AccessPointProps.builder()

  /**
   * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
   * point's root directory.
   * If the
   * root directory specified by `path` does not exist, EFS creates the root directory and applies
   * the
   * permissions specified here. If the specified `path` does not exist, you must specify
   * `createAcl`.
   */
  public fun createAcl(createAcl: AclDsl.() -> Unit = {}) {
    val builder = AclDsl()
    builder.apply(createAcl)
    cdkBuilder.createAcl(builder.build())
  }

  /**
   * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
   * point's root directory.
   * If the
   * root directory specified by `path` does not exist, EFS creates the root directory and applies
   * the
   * permissions specified here. If the specified `path` does not exist, you must specify
   * `createAcl`.
   */
  public fun createAcl(createAcl: Acl) {
    cdkBuilder.createAcl(createAcl)
  }

  /**
   * @param fileSystem The efs filesystem. 
   */
  public fun fileSystem(fileSystem: IFileSystem) {
    cdkBuilder.fileSystem(fileSystem)
  }

  /**
   * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
   * clients using the access point to access the EFS file system.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
   * group IDs, on the access point that is used for all file system operations performed by NFS
   * clients using the access point.
   * Specify this to enforce a user identity using an access point.
   */
  public fun posixUser(posixUser: PosixUserDsl.() -> Unit = {}) {
    val builder = PosixUserDsl()
    builder.apply(posixUser)
    cdkBuilder.posixUser(builder.build())
  }

  /**
   * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
   * group IDs, on the access point that is used for all file system operations performed by NFS
   * clients using the access point.
   * Specify this to enforce a user identity using an access point.
   */
  public fun posixUser(posixUser: PosixUser) {
    cdkBuilder.posixUser(posixUser)
  }

  public fun build(): AccessPointProps = cdkBuilder.build()
}
