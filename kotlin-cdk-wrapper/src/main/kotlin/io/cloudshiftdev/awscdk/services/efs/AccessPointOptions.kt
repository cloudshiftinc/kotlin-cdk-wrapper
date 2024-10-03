@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options to create an AccessPoint.
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
public interface AccessPointOptions {
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
   */
  public fun createAcl(): Acl? = unwrap(this).getCreateAcl()?.let(Acl::wrap)

  /**
   * Specifies the path on the EFS file system to expose as the root directory to NFS clients using
   * the access point to access the EFS file system.
   *
   * Default: '/'
   */
  public fun path(): String? = unwrap(this).getPath()

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
   */
  public fun posixUser(): PosixUser? = unwrap(this).getPosixUser()?.let(PosixUser::wrap)

  /**
   * A builder for [AccessPointOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
     * point's root directory.
     * If the
     * root directory specified by `path` does not exist, EFS creates the root directory and applies
     * the
     * permissions specified here. If the specified `path` does not exist, you must specify
     * `createAcl`.
     */
    public fun createAcl(createAcl: Acl)

    /**
     * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
     * point's root directory.
     * If the
     * root directory specified by `path` does not exist, EFS creates the root directory and applies
     * the
     * permissions specified here. If the specified `path` does not exist, you must specify
     * `createAcl`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6d86428783bb6f202c1d30da88da33a778387841d439037d314936f1bd1b5d1")
    public fun createAcl(createAcl: Acl.Builder.() -> Unit)

    /**
     * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
     * clients using the access point to access the EFS file system.
     */
    public fun path(path: String)

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point.
     * Specify this to enforce a user identity using an access point.
     */
    public fun posixUser(posixUser: PosixUser)

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point.
     * Specify this to enforce a user identity using an access point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1a171fd0929f89ad36e16912a11a04345c7b4fd663c147256d30c27e755163")
    public fun posixUser(posixUser: PosixUser.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointOptions.Builder =
        software.amazon.awscdk.services.efs.AccessPointOptions.builder()

    /**
     * @param createAcl Specifies the POSIX IDs and permissions to apply when creating the access
     * point's root directory.
     * If the
     * root directory specified by `path` does not exist, EFS creates the root directory and applies
     * the
     * permissions specified here. If the specified `path` does not exist, you must specify
     * `createAcl`.
     */
    override fun createAcl(createAcl: Acl) {
      cdkBuilder.createAcl(createAcl.let(Acl.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6d86428783bb6f202c1d30da88da33a778387841d439037d314936f1bd1b5d1")
    override fun createAcl(createAcl: Acl.Builder.() -> Unit): Unit = createAcl(Acl(createAcl))

    /**
     * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
     * clients using the access point to access the EFS file system.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point.
     * Specify this to enforce a user identity using an access point.
     */
    override fun posixUser(posixUser: PosixUser) {
      cdkBuilder.posixUser(posixUser.let(PosixUser.Companion::unwrap))
    }

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point.
     * Specify this to enforce a user identity using an access point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1a171fd0929f89ad36e16912a11a04345c7b4fd663c147256d30c27e755163")
    override fun posixUser(posixUser: PosixUser.Builder.() -> Unit): Unit =
        posixUser(PosixUser(posixUser))

    public fun build(): software.amazon.awscdk.services.efs.AccessPointOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.AccessPointOptions,
  ) : CdkObject(cdkObject),
      AccessPointOptions {
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
     */
    override fun createAcl(): Acl? = unwrap(this).getCreateAcl()?.let(Acl::wrap)

    /**
     * Specifies the path on the EFS file system to expose as the root directory to NFS clients
     * using the access point to access the EFS file system.
     *
     * Default: '/'
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the
     * access point that is used for all file system operations performed by NFS clients using the
     * access point.
     *
     * Specify this to enforce a user identity using an access point.
     *
     * Default: - user identity not enforced
     *
     * [Documentation]( - [Enforcing a User Identity Using an Access
     * Point](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html))
     */
    override fun posixUser(): PosixUser? = unwrap(this).getPosixUser()?.let(PosixUser::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPointOptions):
        AccessPointOptions = CdkObjectWrappers.wrap(cdkObject) as? AccessPointOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPointOptions):
        software.amazon.awscdk.services.efs.AccessPointOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.efs.AccessPointOptions
  }
}
