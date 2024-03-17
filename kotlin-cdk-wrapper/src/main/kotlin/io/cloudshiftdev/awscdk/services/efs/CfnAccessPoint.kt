@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::EFS::AccessPoint` resource creates an EFS access point.
 *
 * An access point is an application-specific view into an EFS file system that applies an operating
 * system user and group, and a file system path, to any file system request made through the access
 * point. The operating system user and group override any identity information provided by the NFS
 * client. The file system path is exposed as the access point's root directory. Applications using the
 * access point can only access data in its own directory and below. To learn more, see [Mounting a
 * file system using EFS access
 * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) .
 *
 * This operation requires permissions for the `elasticfilesystem:CreateAccessPoint` action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
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
public open class CfnAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun accessPointTagsRaw(): List<AccessPointTagProperty> =
      unwrap(this).getAccessPointTagsRaw()?.map(AccessPointTagProperty::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun accessPointTagsRaw(`value`: List<AccessPointTagProperty>) {
    unwrap(this).setAccessPointTagsRaw(`value`.map(AccessPointTagProperty::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun accessPointTagsRaw(vararg `value`: AccessPointTagProperty): Unit =
      accessPointTagsRaw(`value`.toList())

  /**
   * The ID of the EFS access point.
   */
  public open fun attrAccessPointId(): String = unwrap(this).getAttrAccessPointId()

  /**
   * The Amazon Resource Name (ARN) of the access point.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The opaque string specified in the request to ensure idempotent creation.
   */
  public open fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * The opaque string specified in the request to ensure idempotent creation.
   */
  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  /**
   * The ID of the EFS file system that the access point applies to.
   */
  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  /**
   * The ID of the EFS file system that the access point applies to.
   */
  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
   * point that is used for all file operations by NFS clients using the access point.
   */
  public open fun posixUser(): Any? = unwrap(this).getPosixUser()

  /**
   * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
   * point that is used for all file operations by NFS clients using the access point.
   */
  public open fun posixUser(`value`: IResolvable) {
    unwrap(this).setPosixUser(`value`.let(IResolvable::unwrap))
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
   * point that is used for all file operations by NFS clients using the access point.
   */
  public open fun posixUser(`value`: PosixUserProperty) {
    unwrap(this).setPosixUser(`value`.let(PosixUserProperty::unwrap))
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
   * point that is used for all file operations by NFS clients using the access point.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("329ec2fc6394934ffef387e7729df843f1b9bf53cf48124926a4cd835d9c64ae")
  public open fun posixUser(`value`: PosixUserProperty.Builder.() -> Unit): Unit =
      posixUser(PosixUserProperty(`value`))

  /**
   * The directory on the EFS file system that the access point exposes as the root directory to NFS
   * clients using the access point.
   */
  public open fun rootDirectory(): Any? = unwrap(this).getRootDirectory()

  /**
   * The directory on the EFS file system that the access point exposes as the root directory to NFS
   * clients using the access point.
   */
  public open fun rootDirectory(`value`: IResolvable) {
    unwrap(this).setRootDirectory(`value`.let(IResolvable::unwrap))
  }

  /**
   * The directory on the EFS file system that the access point exposes as the root directory to NFS
   * clients using the access point.
   */
  public open fun rootDirectory(`value`: RootDirectoryProperty) {
    unwrap(this).setRootDirectory(`value`.let(RootDirectoryProperty::unwrap))
  }

  /**
   * The directory on the EFS file system that the access point exposes as the root directory to NFS
   * clients using the access point.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ef8258b148a11d4faef82921b1736ab20771a65d4dc0107d31e3b69d5a055fd")
  public open fun rootDirectory(`value`: RootDirectoryProperty.Builder.() -> Unit): Unit =
      rootDirectory(RootDirectoryProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.efs.CfnAccessPoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
     * @param accessPointTags An array of key-value pairs to apply to this resource. 
     */
    public fun accessPointTags(accessPointTags: List<AccessPointTagProperty>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
     * @param accessPointTags An array of key-value pairs to apply to this resource. 
     */
    public fun accessPointTags(vararg accessPointTags: AccessPointTagProperty)

    /**
     * The opaque string specified in the request to ensure idempotent creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken)
     * @param clientToken The opaque string specified in the request to ensure idempotent creation. 
     */
    public fun clientToken(clientToken: String)

    /**
     * The ID of the EFS file system that the access point applies to.
     *
     * Accepts only the ID format for input when specifying a file system, for example
     * `fs-0123456789abcedf2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid)
     * @param fileSystemId The ID of the EFS file system that the access point applies to. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the
     * access point that is used for all file operations by NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point. 
     */
    public fun posixUser(posixUser: IResolvable)

    /**
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the
     * access point that is used for all file operations by NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point. 
     */
    public fun posixUser(posixUser: PosixUserProperty)

    /**
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the
     * access point that is used for all file operations by NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fee7216d59d6314a6fcae17cbc03dad344c68f3cf3ab2460e766204dbf6b8c0")
    public fun posixUser(posixUser: PosixUserProperty.Builder.() -> Unit)

    /**
     * The directory on the EFS file system that the access point exposes as the root directory to
     * NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point. 
     */
    public fun rootDirectory(rootDirectory: IResolvable)

    /**
     * The directory on the EFS file system that the access point exposes as the root directory to
     * NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point. 
     */
    public fun rootDirectory(rootDirectory: RootDirectoryProperty)

    /**
     * The directory on the EFS file system that the access point exposes as the root directory to
     * NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400b9ce47bd6ce7f9764d451902b3926a5c9c8a268421895da866638da931b79")
    public fun rootDirectory(rootDirectory: RootDirectoryProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.efs.CfnAccessPoint.Builder.create(scope, id)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
     * @param accessPointTags An array of key-value pairs to apply to this resource. 
     */
    override fun accessPointTags(accessPointTags: List<AccessPointTagProperty>) {
      cdkBuilder.accessPointTags(accessPointTags.map(AccessPointTagProperty::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
     * @param accessPointTags An array of key-value pairs to apply to this resource. 
     */
    override fun accessPointTags(vararg accessPointTags: AccessPointTagProperty): Unit =
        accessPointTags(accessPointTags.toList())

    /**
     * The opaque string specified in the request to ensure idempotent creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken)
     * @param clientToken The opaque string specified in the request to ensure idempotent creation. 
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * The ID of the EFS file system that the access point applies to.
     *
     * Accepts only the ID format for input when specifying a file system, for example
     * `fs-0123456789abcedf2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid)
     * @param fileSystemId The ID of the EFS file system that the access point applies to. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the
     * access point that is used for all file operations by NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point. 
     */
    override fun posixUser(posixUser: IResolvable) {
      cdkBuilder.posixUser(posixUser.let(IResolvable::unwrap))
    }

    /**
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the
     * access point that is used for all file operations by NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point. 
     */
    override fun posixUser(posixUser: PosixUserProperty) {
      cdkBuilder.posixUser(posixUser.let(PosixUserProperty::unwrap))
    }

    /**
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the
     * access point that is used for all file operations by NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
     * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS clients using the
     * access point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fee7216d59d6314a6fcae17cbc03dad344c68f3cf3ab2460e766204dbf6b8c0")
    override fun posixUser(posixUser: PosixUserProperty.Builder.() -> Unit): Unit =
        posixUser(PosixUserProperty(posixUser))

    /**
     * The directory on the EFS file system that the access point exposes as the root directory to
     * NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point. 
     */
    override fun rootDirectory(rootDirectory: IResolvable) {
      cdkBuilder.rootDirectory(rootDirectory.let(IResolvable::unwrap))
    }

    /**
     * The directory on the EFS file system that the access point exposes as the root directory to
     * NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point. 
     */
    override fun rootDirectory(rootDirectory: RootDirectoryProperty) {
      cdkBuilder.rootDirectory(rootDirectory.let(RootDirectoryProperty::unwrap))
    }

    /**
     * The directory on the EFS file system that the access point exposes as the root directory to
     * NFS clients using the access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
     * @param rootDirectory The directory on the EFS file system that the access point exposes as
     * the root directory to NFS clients using the access point. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400b9ce47bd6ce7f9764d451902b3926a5c9c8a268421895da866638da931b79")
    override fun rootDirectory(rootDirectory: RootDirectoryProperty.Builder.() -> Unit): Unit =
        rootDirectory(RootDirectoryProperty(rootDirectory))

    public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.efs.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint): CfnAccessPoint
        = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint): software.amazon.awscdk.services.efs.CfnAccessPoint
        = wrapped.cdkObject
  }

  /**
   * Specifies the directory on the Amazon EFS file system that the access point provides access to.
   *
   * The access point exposes the specified file system path as the root directory of your file
   * system to applications using the access point. NFS clients using the access point can only access
   * data in the access point's `RootDirectory` and its subdirectories.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * RootDirectoryProperty rootDirectoryProperty = RootDirectoryProperty.builder()
   * .creationInfo(CreationInfoProperty.builder()
   * .ownerGid("ownerGid")
   * .ownerUid("ownerUid")
   * .permissions("permissions")
   * .build())
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html)
   */
  public interface RootDirectoryProperty {
    /**
     * (Optional) Specifies the POSIX IDs and permissions to apply to the access point's
     * `RootDirectory` .
     *
     * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
     * using the `CreationInfo` settings when a client connects to an access point. When specifying the
     * `CreationInfo` , you must provide values for all properties.
     *
     *
     * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
     * exist, attempts to mount the file system using the access point will fail.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-creationinfo)
     */
    public fun creationInfo(): Any? = unwrap(this).getCreationInfo()

    /**
     * Specifies the path on the EFS file system to expose as the root directory to NFS clients
     * using the access point to access the EFS file system.
     *
     * A path can have up to four subdirectories. If the specified path does not exist, you are
     * required to provide the `CreationInfo` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [RootDirectoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the
       * access point's `RootDirectory` .
       * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
       * using the `CreationInfo` settings when a client connects to an access point. When specifying
       * the `CreationInfo` , you must provide values for all properties.
       *
       *
       * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
       * exist, attempts to mount the file system using the access point will fail.
       */
      public fun creationInfo(creationInfo: IResolvable)

      /**
       * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the
       * access point's `RootDirectory` .
       * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
       * using the `CreationInfo` settings when a client connects to an access point. When specifying
       * the `CreationInfo` , you must provide values for all properties.
       *
       *
       * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
       * exist, attempts to mount the file system using the access point will fail.
       */
      public fun creationInfo(creationInfo: CreationInfoProperty)

      /**
       * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the
       * access point's `RootDirectory` .
       * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
       * using the `CreationInfo` settings when a client connects to an access point. When specifying
       * the `CreationInfo` , you must provide values for all properties.
       *
       *
       * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
       * exist, attempts to mount the file system using the access point will fail.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f09715ddaf55a736c58a579888cb8e3718cb5e0640ebf826af3c9dbf3e3ff06")
      public fun creationInfo(creationInfo: CreationInfoProperty.Builder.() -> Unit)

      /**
       * @param path Specifies the path on the EFS file system to expose as the root directory to
       * NFS clients using the access point to access the EFS file system.
       * A path can have up to four subdirectories. If the specified path does not exist, you are
       * required to provide the `CreationInfo` .
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty.builder()

      /**
       * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the
       * access point's `RootDirectory` .
       * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
       * using the `CreationInfo` settings when a client connects to an access point. When specifying
       * the `CreationInfo` , you must provide values for all properties.
       *
       *
       * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
       * exist, attempts to mount the file system using the access point will fail.
       */
      override fun creationInfo(creationInfo: IResolvable) {
        cdkBuilder.creationInfo(creationInfo.let(IResolvable::unwrap))
      }

      /**
       * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the
       * access point's `RootDirectory` .
       * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
       * using the `CreationInfo` settings when a client connects to an access point. When specifying
       * the `CreationInfo` , you must provide values for all properties.
       *
       *
       * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
       * exist, attempts to mount the file system using the access point will fail.
       */
      override fun creationInfo(creationInfo: CreationInfoProperty) {
        cdkBuilder.creationInfo(creationInfo.let(CreationInfoProperty::unwrap))
      }

      /**
       * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the
       * access point's `RootDirectory` .
       * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
       * using the `CreationInfo` settings when a client connects to an access point. When specifying
       * the `CreationInfo` , you must provide values for all properties.
       *
       *
       * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
       * exist, attempts to mount the file system using the access point will fail.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f09715ddaf55a736c58a579888cb8e3718cb5e0640ebf826af3c9dbf3e3ff06")
      override fun creationInfo(creationInfo: CreationInfoProperty.Builder.() -> Unit): Unit =
          creationInfo(CreationInfoProperty(creationInfo))

      /**
       * @param path Specifies the path on the EFS file system to expose as the root directory to
       * NFS clients using the access point to access the EFS file system.
       * A path can have up to four subdirectories. If the specified path does not exist, you are
       * required to provide the `CreationInfo` .
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty,
    ) : CdkObject(cdkObject), RootDirectoryProperty {
      /**
       * (Optional) Specifies the POSIX IDs and permissions to apply to the access point's
       * `RootDirectory` .
       *
       * If the `RootDirectory` &gt; `Path` specified does not exist, EFS creates the root directory
       * using the `CreationInfo` settings when a client connects to an access point. When specifying
       * the `CreationInfo` , you must provide values for all properties.
       *
       *
       * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
       * exist, attempts to mount the file system using the access point will fail.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-creationinfo)
       */
      override fun creationInfo(): Any? = unwrap(this).getCreationInfo()

      /**
       * Specifies the path on the EFS file system to expose as the root directory to NFS clients
       * using the access point to access the EFS file system.
       *
       * A path can have up to four subdirectories. If the specified path does not exist, you are
       * required to provide the `CreationInfo` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html#cfn-efs-accesspoint-rootdirectory-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RootDirectoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty):
          RootDirectoryProperty = CdkObjectWrappers.wrap(cdkObject) as? RootDirectoryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RootDirectoryProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty
    }
  }

  /**
   * A tag is a key-value pair attached to a file system.
   *
   * Allowed characters in the `Key` and `Value` properties are letters, white space, and numbers
   * that can be represented in UTF-8, and the following characters: `+ - = . _ : /`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * AccessPointTagProperty accessPointTagProperty = AccessPointTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-accesspointtag.html)
   */
  public interface AccessPointTagProperty {
    /**
     * The tag key (String).
     *
     * The key can't start with `aws:` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-accesspointtag.html#cfn-efs-accesspoint-accesspointtag-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value of the tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-accesspointtag.html#cfn-efs-accesspoint-accesspointtag-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [AccessPointTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag key (String).
       * The key can't start with `aws:` .
       */
      public fun key(key: String)

      /**
       * @param value The value of the tag key.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty.builder()

      /**
       * @param key The tag key (String).
       * The key can't start with `aws:` .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the tag key.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty,
    ) : CdkObject(cdkObject), AccessPointTagProperty {
      /**
       * The tag key (String).
       *
       * The key can't start with `aws:` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-accesspointtag.html#cfn-efs-accesspoint-accesspointtag-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value of the tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-accesspointtag.html#cfn-efs-accesspoint-accesspointtag-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty):
          AccessPointTagProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessPointTagProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPointTagProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty
    }
  }

  /**
   * Required if the `RootDirectory` &gt; `Path` specified does not exist.
   *
   * Specifies the POSIX IDs and permissions to apply to the access point's `RootDirectory` &gt;
   * `Path` . If the access point root directory does not exist, EFS creates it with these settings
   * when a client connects to the access point. When specifying `CreationInfo` , you must include
   * values for all properties.
   *
   * Amazon EFS creates a root directory only if you have provided the CreationInfo: OwnUid, OwnGID,
   * and permissions for the directory. If you do not provide this information, Amazon EFS does not
   * create the root directory. If the root directory does not exist, attempts to mount using the
   * access point will fail.
   *
   *
   * If you do not provide `CreationInfo` and the specified `RootDirectory` does not exist, attempts
   * to mount the file system using the access point will fail.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * CreationInfoProperty creationInfoProperty = CreationInfoProperty.builder()
   * .ownerGid("ownerGid")
   * .ownerUid("ownerUid")
   * .permissions("permissions")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html)
   */
  public interface CreationInfoProperty {
    /**
     * Specifies the POSIX group ID to apply to the `RootDirectory` .
     *
     * Accepts values from 0 to 2^32 (4294967295).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-ownergid)
     */
    public fun ownerGid(): String

    /**
     * Specifies the POSIX user ID to apply to the `RootDirectory` .
     *
     * Accepts values from 0 to 2^32 (4294967295).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-owneruid)
     */
    public fun ownerUid(): String

    /**
     * Specifies the POSIX permissions to apply to the `RootDirectory` , in the format of an octal
     * number representing the file's mode bits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-permissions)
     */
    public fun permissions(): String

    /**
     * A builder for [CreationInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ownerGid Specifies the POSIX group ID to apply to the `RootDirectory` . 
       * Accepts values from 0 to 2^32 (4294967295).
       */
      public fun ownerGid(ownerGid: String)

      /**
       * @param ownerUid Specifies the POSIX user ID to apply to the `RootDirectory` . 
       * Accepts values from 0 to 2^32 (4294967295).
       */
      public fun ownerUid(ownerUid: String)

      /**
       * @param permissions Specifies the POSIX permissions to apply to the `RootDirectory` , in the
       * format of an octal number representing the file's mode bits. 
       */
      public fun permissions(permissions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty.builder()

      /**
       * @param ownerGid Specifies the POSIX group ID to apply to the `RootDirectory` . 
       * Accepts values from 0 to 2^32 (4294967295).
       */
      override fun ownerGid(ownerGid: String) {
        cdkBuilder.ownerGid(ownerGid)
      }

      /**
       * @param ownerUid Specifies the POSIX user ID to apply to the `RootDirectory` . 
       * Accepts values from 0 to 2^32 (4294967295).
       */
      override fun ownerUid(ownerUid: String) {
        cdkBuilder.ownerUid(ownerUid)
      }

      /**
       * @param permissions Specifies the POSIX permissions to apply to the `RootDirectory` , in the
       * format of an octal number representing the file's mode bits. 
       */
      override fun permissions(permissions: String) {
        cdkBuilder.permissions(permissions)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty,
    ) : CdkObject(cdkObject), CreationInfoProperty {
      /**
       * Specifies the POSIX group ID to apply to the `RootDirectory` .
       *
       * Accepts values from 0 to 2^32 (4294967295).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-ownergid)
       */
      override fun ownerGid(): String = unwrap(this).getOwnerGid()

      /**
       * Specifies the POSIX user ID to apply to the `RootDirectory` .
       *
       * Accepts values from 0 to 2^32 (4294967295).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-owneruid)
       */
      override fun ownerUid(): String = unwrap(this).getOwnerUid()

      /**
       * Specifies the POSIX permissions to apply to the `RootDirectory` , in the format of an octal
       * number representing the file's mode bits.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-permissions)
       */
      override fun permissions(): String = unwrap(this).getPermissions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreationInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty):
          CreationInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? CreationInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreationInfoProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty
    }
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the
   * access point that is used for all file system operations performed by NFS clients using the access
   * point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * PosixUserProperty posixUserProperty = PosixUserProperty.builder()
   * .gid("gid")
   * .uid("uid")
   * // the properties below are optional
   * .secondaryGids(List.of("secondaryGids"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html)
   */
  public interface PosixUserProperty {
    /**
     * The POSIX group ID used for all file system operations using this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-gid)
     */
    public fun gid(): String

    /**
     * Secondary POSIX group IDs used for all file system operations using this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-secondarygids)
     */
    public fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

    /**
     * The POSIX user ID used for all file system operations using this access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-uid)
     */
    public fun uid(): String

    /**
     * A builder for [PosixUserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gid The POSIX group ID used for all file system operations using this access point. 
       */
      public fun gid(gid: String)

      /**
       * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
       * this access point.
       */
      public fun secondaryGids(secondaryGids: List<String>)

      /**
       * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
       * this access point.
       */
      public fun secondaryGids(vararg secondaryGids: String)

      /**
       * @param uid The POSIX user ID used for all file system operations using this access point. 
       */
      public fun uid(uid: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty.builder()

      /**
       * @param gid The POSIX group ID used for all file system operations using this access point. 
       */
      override fun gid(gid: String) {
        cdkBuilder.gid(gid)
      }

      /**
       * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
       * this access point.
       */
      override fun secondaryGids(secondaryGids: List<String>) {
        cdkBuilder.secondaryGids(secondaryGids)
      }

      /**
       * @param secondaryGids Secondary POSIX group IDs used for all file system operations using
       * this access point.
       */
      override fun secondaryGids(vararg secondaryGids: String): Unit =
          secondaryGids(secondaryGids.toList())

      /**
       * @param uid The POSIX user ID used for all file system operations using this access point. 
       */
      override fun uid(uid: String) {
        cdkBuilder.uid(uid)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty,
    ) : CdkObject(cdkObject), PosixUserProperty {
      /**
       * The POSIX group ID used for all file system operations using this access point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-gid)
       */
      override fun gid(): String = unwrap(this).getGid()

      /**
       * Secondary POSIX group IDs used for all file system operations using this access point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-secondarygids)
       */
      override fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

      /**
       * The POSIX user ID used for all file system operations using this access point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-uid)
       */
      override fun uid(): String = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PosixUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty):
          PosixUserProperty = CdkObjectWrappers.wrap(cdkObject) as? PosixUserProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PosixUserProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty
    }
  }
}
