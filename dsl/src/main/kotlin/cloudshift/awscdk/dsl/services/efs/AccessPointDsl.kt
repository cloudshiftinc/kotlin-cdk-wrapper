@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.Acl
import software.amazon.awscdk.services.efs.IFileSystem
import software.amazon.awscdk.services.efs.PosixUser
import software.constructs.Construct

/**
 * Represents the AccessPoint.
 *
 * Example:
 *
 * ```
 * AccessPoint.fromAccessPointAttributes(this, "ap", AccessPointAttributes.builder()
 * .accessPointId("fsap-1293c4d9832fo0912")
 * .fileSystem(FileSystem.fromFileSystemAttributes(this, "efs", FileSystemAttributes.builder()
 * .fileSystemId("fs-099d3e2f")
 * .securityGroup(SecurityGroup.fromSecurityGroupId(this, "sg", "sg-51530134"))
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class AccessPointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AccessPoint.Builder = AccessPoint.Builder.create(scope, id)

  /**
   * Specifies the POSIX IDs and permissions to apply when creating the access point's root
   * directory.
   *
   * If the
   * root directory specified by `path` does not exist, EFS creates the root directory and applies
   * the
   * permissions specified here. If the specified `path` does not exist, you must specify
   * `createAcl`.
   *
   * Default: - None. The directory specified by `path` must exist.
   *
   * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
   * point's root directory. 
   */
  public fun createAcl(createAcl: AclDsl.() -> Unit = {}) {
    val builder = AclDsl()
    builder.apply(createAcl)
    cdkBuilder.createAcl(builder.build())
  }

  /**
   * Specifies the POSIX IDs and permissions to apply when creating the access point's root
   * directory.
   *
   * If the
   * root directory specified by `path` does not exist, EFS creates the root directory and applies
   * the
   * permissions specified here. If the specified `path` does not exist, you must specify
   * `createAcl`.
   *
   * Default: - None. The directory specified by `path` must exist.
   *
   * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
   * point's root directory. 
   */
  public fun createAcl(createAcl: Acl) {
    cdkBuilder.createAcl(createAcl)
  }

  /**
   * The efs filesystem.
   *
   * @param fileSystem The efs filesystem. 
   */
  public fun fileSystem(fileSystem: IFileSystem) {
    cdkBuilder.fileSystem(fileSystem)
  }

  /**
   * Specifies the path on the EFS file system to expose as the root directory to NFS clients using
   * the access point to access the EFS file system.
   *
   * Default: '/'
   *
   * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
   * clients using the access point to access the EFS file system. 
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the
   * access point that is used for all file system operations performed by NFS clients using the access
   * point.
   *
   * Specify this to enforce a user identity using an access point.
   *
   * Default: - user identity not enforced
   *
   * [Documentation]( - [Enforcing a User Identity Using an Access
   * Point](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html))
   * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
   * group IDs, on the access point that is used for all file system operations performed by NFS
   * clients using the access point. 
   */
  public fun posixUser(posixUser: PosixUserDsl.() -> Unit = {}) {
    val builder = PosixUserDsl()
    builder.apply(posixUser)
    cdkBuilder.posixUser(builder.build())
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the
   * access point that is used for all file system operations performed by NFS clients using the access
   * point.
   *
   * Specify this to enforce a user identity using an access point.
   *
   * Default: - user identity not enforced
   *
   * [Documentation]( - [Enforcing a User Identity Using an Access
   * Point](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html))
   * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
   * group IDs, on the access point that is used for all file system operations performed by NFS
   * clients using the access point. 
   */
  public fun posixUser(posixUser: PosixUser) {
    cdkBuilder.posixUser(posixUser)
  }

  public fun build(): AccessPoint = cdkBuilder.build()
}
