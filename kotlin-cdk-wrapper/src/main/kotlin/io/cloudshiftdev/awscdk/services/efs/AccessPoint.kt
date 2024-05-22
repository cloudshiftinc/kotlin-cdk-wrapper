@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class AccessPoint(
  cdkObject: software.amazon.awscdk.services.efs.AccessPoint,
) : Resource(cdkObject), IAccessPoint {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessPointProps,
  ) :
      this(software.amazon.awscdk.services.efs.AccessPoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AccessPointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessPointProps.Builder.() -> Unit,
  ) : this(scope, id, AccessPointProps(props)
  )

  /**
   * The ARN of the Access Point.
   */
  public override fun accessPointArn(): String = unwrap(this).getAccessPointArn()

  /**
   * The ID of the Access Point.
   */
  public override fun accessPointId(): String = unwrap(this).getAccessPointId()

  /**
   * The file system of the access point.
   */
  public override fun fileSystem(): IFileSystem =
      unwrap(this).getFileSystem().let(IFileSystem::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.efs.AccessPoint].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun createAcl(createAcl: Acl)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a479721a4dbf0a31026115d0afb2531beac62afe6bd95cef7af539766a1ad838")
    public fun createAcl(createAcl: Acl.Builder.() -> Unit)

    /**
     * The efs filesystem.
     *
     * @param fileSystem The efs filesystem. 
     */
    public fun fileSystem(fileSystem: IFileSystem)

    /**
     * Specifies the path on the EFS file system to expose as the root directory to NFS clients
     * using the access point to access the EFS file system.
     *
     * Default: '/'
     *
     * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
     * clients using the access point to access the EFS file system. 
     */
    public fun path(path: String)

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
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point. 
     */
    public fun posixUser(posixUser: PosixUser)

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
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3411fc0775754d830ec49cde548af994953884e96ae0a273fb45ceaa8c2ca6b4")
    public fun posixUser(posixUser: PosixUser.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPoint.Builder =
        software.amazon.awscdk.services.efs.AccessPoint.Builder.create(scope, id)

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
    override fun createAcl(createAcl: Acl) {
      cdkBuilder.createAcl(createAcl.let(Acl.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a479721a4dbf0a31026115d0afb2531beac62afe6bd95cef7af539766a1ad838")
    override fun createAcl(createAcl: Acl.Builder.() -> Unit): Unit = createAcl(Acl(createAcl))

    /**
     * The efs filesystem.
     *
     * @param fileSystem The efs filesystem. 
     */
    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem.Companion::unwrap))
    }

    /**
     * Specifies the path on the EFS file system to expose as the root directory to NFS clients
     * using the access point to access the EFS file system.
     *
     * Default: '/'
     *
     * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
     * clients using the access point to access the EFS file system. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

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
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point. 
     */
    override fun posixUser(posixUser: PosixUser) {
      cdkBuilder.posixUser(posixUser.let(PosixUser.Companion::unwrap))
    }

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
     * @param posixUser The full POSIX identity, including the user ID, group ID, and any secondary
     * group IDs, on the access point that is used for all file system operations performed by NFS
     * clients using the access point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3411fc0775754d830ec49cde548af994953884e96ae0a273fb45ceaa8c2ca6b4")
    override fun posixUser(posixUser: PosixUser.Builder.() -> Unit): Unit =
        posixUser(PosixUser(posixUser))

    public fun build(): software.amazon.awscdk.services.efs.AccessPoint = cdkBuilder.build()
  }

  public companion object {
    public fun fromAccessPointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AccessPointAttributes,
    ): IAccessPoint =
        software.amazon.awscdk.services.efs.AccessPoint.fromAccessPointAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(AccessPointAttributes.Companion::unwrap)).let(IAccessPoint::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdc24fd29d0d7d80090cf1ae8cde4702127ddffb6a4bc6cc5398f4fed3557f2d")
    public fun fromAccessPointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AccessPointAttributes.Builder.() -> Unit,
    ): IAccessPoint = fromAccessPointAttributes(scope, id, AccessPointAttributes(attrs))

    public fun fromAccessPointId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      accessPointId: String,
    ): IAccessPoint =
        software.amazon.awscdk.services.efs.AccessPoint.fromAccessPointId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, accessPointId).let(IAccessPoint::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPoint): AccessPoint =
        AccessPoint(cdkObject)

    internal fun unwrap(wrapped: AccessPoint): software.amazon.awscdk.services.efs.AccessPoint =
        wrapped.cdkObject as software.amazon.awscdk.services.efs.AccessPoint
  }
}
