@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Permissions as POSIX ACL.
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
public interface Acl {
  /**
   * Specifies the POSIX group ID to apply to the RootDirectory.
   *
   * Accepts values from 0 to 2^32 (4294967295).
   */
  public fun ownerGid(): String

  /**
   * Specifies the POSIX user ID to apply to the RootDirectory.
   *
   * Accepts values from 0 to 2^32 (4294967295).
   */
  public fun ownerUid(): String

  /**
   * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number
   * representing the file's mode bits.
   */
  public fun permissions(): String

  /**
   * A builder for [Acl]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ownerGid Specifies the POSIX group ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    public fun ownerGid(ownerGid: String)

    /**
     * @param ownerUid Specifies the POSIX user ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    public fun ownerUid(ownerUid: String)

    /**
     * @param permissions Specifies the POSIX permissions to apply to the RootDirectory, in the
     * format of an octal number representing the file's mode bits. 
     */
    public fun permissions(permissions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.Acl.Builder =
        software.amazon.awscdk.services.efs.Acl.builder()

    /**
     * @param ownerGid Specifies the POSIX group ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerGid(ownerGid: String) {
      cdkBuilder.ownerGid(ownerGid)
    }

    /**
     * @param ownerUid Specifies the POSIX user ID to apply to the RootDirectory. 
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerUid(ownerUid: String) {
      cdkBuilder.ownerUid(ownerUid)
    }

    /**
     * @param permissions Specifies the POSIX permissions to apply to the RootDirectory, in the
     * format of an octal number representing the file's mode bits. 
     */
    override fun permissions(permissions: String) {
      cdkBuilder.permissions(permissions)
    }

    public fun build(): software.amazon.awscdk.services.efs.Acl = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.Acl,
  ) : CdkObject(cdkObject), Acl {
    /**
     * Specifies the POSIX group ID to apply to the RootDirectory.
     *
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerGid(): String = unwrap(this).getOwnerGid()

    /**
     * Specifies the POSIX user ID to apply to the RootDirectory.
     *
     * Accepts values from 0 to 2^32 (4294967295).
     */
    override fun ownerUid(): String = unwrap(this).getOwnerUid()

    /**
     * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal
     * number representing the file's mode bits.
     */
    override fun permissions(): String = unwrap(this).getPermissions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Acl {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.Acl): Acl =
        CdkObjectWrappers.wrap(cdkObject) as Acl

    internal fun unwrap(wrapped: Acl): software.amazon.awscdk.services.efs.Acl = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.Acl
  }
}
