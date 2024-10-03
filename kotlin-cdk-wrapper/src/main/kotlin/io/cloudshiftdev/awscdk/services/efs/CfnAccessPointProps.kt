@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAccessPoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .accessPointTags(List.of(AccessPointTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .clientToken("clientToken")
 * .posixUser(PosixUserProperty.builder()
 * .gid("gid")
 * .uid("uid")
 * // the properties below are optional
 * .secondaryGids(List.of("secondaryGids"))
 * .build())
 * .rootDirectory(RootDirectoryProperty.builder()
 * .creationInfo(CreationInfoProperty.builder()
 * .ownerGid("ownerGid")
 * .ownerUid("ownerUid")
 * .permissions("permissions")
 * .build())
 * .path("path")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html)
 */
public interface CfnAccessPointProps {
  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
   */
  public fun accessPointTags(): List<CfnAccessPoint.AccessPointTagProperty> =
      unwrap(this).getAccessPointTags()?.map(CfnAccessPoint.AccessPointTagProperty::wrap) ?:
      emptyList()

  /**
   * The opaque string specified in the request to ensure idempotent creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * The ID of the EFS file system that the access point applies to.
   *
   * Accepts only the ID format for input when specifying a file system, for example
   * `fs-0123456789abcedf2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid)
   */
  public fun fileSystemId(): String

  /**
   * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
   * point that is used for all file operations by NFS clients using the access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
   */
  public fun posixUser(): Any? = unwrap(this).getPosixUser()

  /**
   * The directory on the EFS file system that the access point exposes as the root directory to NFS
   * clients using the access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
   */
  public fun rootDirectory(): Any? = unwrap(this).getRootDirectory()

  /**
   * A builder for [CfnAccessPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPointTags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun accessPointTags(accessPointTags: List<CfnAccessPoint.AccessPointTagProperty>)

    /**
     * @param accessPointTags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun accessPointTags(vararg accessPointTags: CfnAccessPoint.AccessPointTagProperty)

    /**
     * @param clientToken The opaque string specified in the request to ensure idempotent creation.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param fileSystemId The ID of the EFS file system that the access point applies to. 
     * Accepts only the ID format for input when specifying a file system, for example
     * `fs-0123456789abcedf2` .
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point.
     */
    public fun posixUser(posixUser: IResolvable)

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point.
     */
    public fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty)

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ac5a2d5cb45bd1c4b4e39c1944855ba746ab74da17459db95addc39a02eea6b")
    public fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty.Builder.() -> Unit)

    /**
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point.
     */
    public fun rootDirectory(rootDirectory: IResolvable)

    /**
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point.
     */
    public fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty)

    /**
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6511f1e3b2f592a4f771410fa2a366dafb6f613cee4a5faa1398363d7665cff9")
    public fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.efs.CfnAccessPointProps.builder()

    /**
     * @param accessPointTags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun accessPointTags(accessPointTags: List<CfnAccessPoint.AccessPointTagProperty>) {
      cdkBuilder.accessPointTags(accessPointTags.map(CfnAccessPoint.AccessPointTagProperty.Companion::unwrap))
    }

    /**
     * @param accessPointTags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun accessPointTags(vararg accessPointTags: CfnAccessPoint.AccessPointTagProperty):
        Unit = accessPointTags(accessPointTags.toList())

    /**
     * @param clientToken The opaque string specified in the request to ensure idempotent creation.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param fileSystemId The ID of the EFS file system that the access point applies to. 
     * Accepts only the ID format for input when specifying a file system, for example
     * `fs-0123456789abcedf2` .
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point.
     */
    override fun posixUser(posixUser: IResolvable) {
      cdkBuilder.posixUser(posixUser.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point.
     */
    override fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty) {
      cdkBuilder.posixUser(posixUser.let(CfnAccessPoint.PosixUserProperty.Companion::unwrap))
    }

    /**
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ac5a2d5cb45bd1c4b4e39c1944855ba746ab74da17459db95addc39a02eea6b")
    override fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty.Builder.() -> Unit): Unit =
        posixUser(CfnAccessPoint.PosixUserProperty(posixUser))

    /**
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point.
     */
    override fun rootDirectory(rootDirectory: IResolvable) {
      cdkBuilder.rootDirectory(rootDirectory.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point.
     */
    override fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty) {
      cdkBuilder.rootDirectory(rootDirectory.let(CfnAccessPoint.RootDirectoryProperty.Companion::unwrap))
    }

    /**
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6511f1e3b2f592a4f771410fa2a366dafb6f613cee4a5faa1398363d7665cff9")
    override
        fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty.Builder.() -> Unit):
        Unit = rootDirectory(CfnAccessPoint.RootDirectoryProperty(rootDirectory))

    public fun build(): software.amazon.awscdk.services.efs.CfnAccessPointProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.CfnAccessPointProps,
  ) : CdkObject(cdkObject),
      CfnAccessPointProps {
    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
     */
    override fun accessPointTags(): List<CfnAccessPoint.AccessPointTagProperty> =
        unwrap(this).getAccessPointTags()?.map(CfnAccessPoint.AccessPointTagProperty::wrap) ?:
        emptyList()

    /**
     * The opaque string specified in the request to ensure idempotent creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * The ID of the EFS file system that the access point applies to.
     *
     * Accepts only the ID format for input when specifying a file system, for example
     * `fs-0123456789abcedf2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid)
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the
     * access point that is used for all file operations by NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
     */
    override fun posixUser(): Any? = unwrap(this).getPosixUser()

    /**
     * The directory on the EFS file system that the access point exposes as the root directory to
     * NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
     */
    override fun rootDirectory(): Any? = unwrap(this).getRootDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPointProps):
        CfnAccessPointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAccessPointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.efs.CfnAccessPointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.CfnAccessPointProps
  }
}
