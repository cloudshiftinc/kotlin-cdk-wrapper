@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents the PosixUser.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * // create a new VPC
 * Vpc vpc = new Vpc(this, "VPC");
 * // create a new Amazon EFS filesystem
 * FileSystem fileSystem = FileSystem.Builder.create(this, "Efs").vpc(vpc).build();
 * // create a new access point from the filesystem
 * AccessPoint accessPoint = fileSystem.addAccessPoint("AccessPoint", AccessPointOptions.builder()
 * // set /export/lambda as the root of the access point
 * .path("/export/lambda")
 * // as /export/lambda does not exist in a new efs filesystem, the efs will create the directory
 * with the following createAcl
 * .createAcl(Acl.builder()
 * .ownerUid("1001")
 * .ownerGid("1001")
 * .permissions("750")
 * .build())
 * // enforce the POSIX identity so lambda function will access with this identity
 * .posixUser(PosixUser.builder()
 * .uid("1001")
 * .gid("1001")
 * .build())
 * .build());
 * Function fn = Function.Builder.create(this, "MyLambda")
 * // mount the access point to /mnt/msg in the lambda runtime environment
 * .filesystem(FileSystem.fromEfsAccessPoint(accessPoint, "/mnt/msg"))
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface PosixUser {
  /**
   * The POSIX group ID used for all file system operations using this access point.
   */
  public fun gid(): String

  /**
   * Secondary POSIX group IDs used for all file system operations using this access point.
   *
   * Default: - None
   */
  public fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

  /**
   * The POSIX user ID used for all file system operations using this access point.
   */
  public fun uid(): String

  /**
   * A builder for [PosixUser]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param gid The POSIX group ID used for all file system operations using this access point. 
     */
    public fun gid(gid: String)

    /**
     * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
     * access point.
     */
    public fun secondaryGids(secondaryGids: List<String>)

    /**
     * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
     * access point.
     */
    public fun secondaryGids(vararg secondaryGids: String)

    /**
     * @param uid The POSIX user ID used for all file system operations using this access point. 
     */
    public fun uid(uid: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.PosixUser.Builder =
        software.amazon.awscdk.services.efs.PosixUser.builder()

    /**
     * @param gid The POSIX group ID used for all file system operations using this access point. 
     */
    override fun gid(gid: String) {
      cdkBuilder.gid(gid)
    }

    /**
     * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
     * access point.
     */
    override fun secondaryGids(secondaryGids: List<String>) {
      cdkBuilder.secondaryGids(secondaryGids)
    }

    /**
     * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
     * access point.
     */
    override fun secondaryGids(vararg secondaryGids: String): Unit =
        secondaryGids(secondaryGids.toList())

    /**
     * @param uid The POSIX user ID used for all file system operations using this access point. 
     */
    override fun uid(uid: String) {
      cdkBuilder.uid(uid)
    }

    public fun build(): software.amazon.awscdk.services.efs.PosixUser = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.PosixUser,
  ) : CdkObject(cdkObject),
      PosixUser {
    /**
     * The POSIX group ID used for all file system operations using this access point.
     */
    override fun gid(): String = unwrap(this).getGid()

    /**
     * Secondary POSIX group IDs used for all file system operations using this access point.
     *
     * Default: - None
     */
    override fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

    /**
     * The POSIX user ID used for all file system operations using this access point.
     */
    override fun uid(): String = unwrap(this).getUid()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PosixUser {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.PosixUser): PosixUser =
        CdkObjectWrappers.wrap(cdkObject) as? PosixUser ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PosixUser): software.amazon.awscdk.services.efs.PosixUser =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.efs.PosixUser
  }
}
