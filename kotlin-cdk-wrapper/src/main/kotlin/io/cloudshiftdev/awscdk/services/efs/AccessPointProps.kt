@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for the AccessPoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * FileSystem fileSystem;
 * AccessPointProps accessPointProps = AccessPointProps.builder()
 * .fileSystem(fileSystem)
 * // the properties below are optional
 * .clientToken("clientToken")
 * .createAcl(Acl.builder()
 * .ownerGid("ownerGid")
 * .ownerUid("ownerUid")
 * .permissions("permissions")
 * .build())
 * .path("path")
 * .posixUser(PosixUser.builder()
 * .gid("gid")
 * .uid("uid")
 * // the properties below are optional
 * .secondaryGids(List.of("secondaryGids"))
 * .build())
 * .build();
 * ```
 */
public interface AccessPointProps : AccessPointOptions {
  /**
   * The efs filesystem.
   */
  public fun fileSystem(): IFileSystem

  /**
   * A builder for [AccessPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientToken The opaque string specified in the request to ensure idempotent creation.
     */
    public fun clientToken(clientToken: String)

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
    @JvmName("409f29e3cb521f759c7e0156a0920e4b82797c6cbad7b867ab0796367c1731bf")
    public fun createAcl(createAcl: Acl.Builder.() -> Unit)

    /**
     * @param fileSystem The efs filesystem. 
     */
    public fun fileSystem(fileSystem: IFileSystem)

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
    @JvmName("c25a7f2026d9708718e845d1db3e0bd2280f29365108de1a5363fb58e34c0737")
    public fun posixUser(posixUser: PosixUser.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointProps.Builder =
        software.amazon.awscdk.services.efs.AccessPointProps.builder()

    /**
     * @param clientToken The opaque string specified in the request to ensure idempotent creation.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
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
    @JvmName("409f29e3cb521f759c7e0156a0920e4b82797c6cbad7b867ab0796367c1731bf")
    override fun createAcl(createAcl: Acl.Builder.() -> Unit): Unit = createAcl(Acl(createAcl))

    /**
     * @param fileSystem The efs filesystem. 
     */
    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem.Companion::unwrap))
    }

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
    @JvmName("c25a7f2026d9708718e845d1db3e0bd2280f29365108de1a5363fb58e34c0737")
    override fun posixUser(posixUser: PosixUser.Builder.() -> Unit): Unit =
        posixUser(PosixUser(posixUser))

    public fun build(): software.amazon.awscdk.services.efs.AccessPointProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.AccessPointProps,
  ) : CdkObject(cdkObject),
      AccessPointProps {
    /**
     * The opaque string specified in the request to ensure idempotent creation.
     *
     * Default: - No client token
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

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
     * The efs filesystem.
     */
    override fun fileSystem(): IFileSystem = unwrap(this).getFileSystem().let(IFileSystem::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPointProps):
        AccessPointProps = CdkObjectWrappers.wrap(cdkObject) as? AccessPointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPointProps):
        software.amazon.awscdk.services.efs.AccessPointProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.efs.AccessPointProps
  }
}
