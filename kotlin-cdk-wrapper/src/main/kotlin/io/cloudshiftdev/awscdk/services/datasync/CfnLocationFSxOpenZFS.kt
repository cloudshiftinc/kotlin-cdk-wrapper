@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
 * The `AWS::DataSync::LocationFSxOpenZFS` resource specifies an endpoint for an Amazon FSx for
 * OpenZFS file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationFSxOpenZFS cfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS.Builder.create(this,
 * "MyCfnLocationFSxOpenZFS")
 * .protocol(ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .securityGroupArns(List.of("securityGroupArns"))
 * // the properties below are optional
 * .fsxFilesystemArn("fsxFilesystemArn")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html)
 */
public open class CfnLocationFSxOpenZFS internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationFSxOpenZFSProps,
  ) :
      this(software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLocationFSxOpenZFSProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationFSxOpenZFSProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLocationFSxOpenZFSProps(props)
  )

  /**
   * The ARN of the specified FSx for OpenZFS file system location.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified FSx for OpenZFS file system location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
   */
  public open fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  /**
   * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
   */
  public open fun fsxFilesystemArn(`value`: String) {
    unwrap(this).setFsxFilesystemArn(`value`)
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
   * The type of protocol that AWS DataSync uses to access your file system.
   */
  public open fun protocol(): Any = unwrap(this).getProtocol()

  /**
   * The type of protocol that AWS DataSync uses to access your file system.
   */
  public open fun protocol(`value`: IResolvable) {
    unwrap(this).setProtocol(`value`.let(IResolvable::unwrap))
  }

  /**
   * The type of protocol that AWS DataSync uses to access your file system.
   */
  public open fun protocol(`value`: ProtocolProperty) {
    unwrap(this).setProtocol(`value`.let(ProtocolProperty::unwrap))
  }

  /**
   * The type of protocol that AWS DataSync uses to access your file system.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45dae59154aeb2bf120faf735fa67ed63a1aef5cc8ce0eb3b670a30c962e0f5e")
  public open fun protocol(`value`: ProtocolProperty.Builder.() -> Unit): Unit =
      protocol(ProtocolProperty(`value`))

  /**
   * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
   */
  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

  /**
   * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
   */
  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
  }

  /**
   * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
   */
  public open fun securityGroupArns(vararg `value`: String): Unit =
      securityGroupArns(`value`.toList())

  /**
   * A subdirectory in the location's path that must begin with `/fsx` .
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * A subdirectory in the location's path that must begin with `/fsx` .
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The key-value pair that represents a tag that you want to add to the resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The key-value pair that represents a tag that you want to add to the resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The key-value pair that represents a tag that you want to add to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationFSxOpenZFS].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-fsxfilesystemarn)
     * @param fsxFilesystemArn The Amazon Resource Name (ARN) of the FSx for OpenZFS file system. 
     */
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    /**
     * The type of protocol that AWS DataSync uses to access your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    public fun protocol(protocol: IResolvable)

    /**
     * The type of protocol that AWS DataSync uses to access your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    public fun protocol(protocol: ProtocolProperty)

    /**
     * The type of protocol that AWS DataSync uses to access your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2396111d82e0f56f870246bb6151ae72c1c9ad7f89902c5572bc5c0b637af9")
    public fun protocol(protocol: ProtocolProperty.Builder.() -> Unit)

    /**
     * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * A subdirectory in the location's path that must begin with `/fsx` .
     *
     * DataSync uses this subdirectory to read or write data (depending on whether the file system
     * is a source or destination location).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-subdirectory)
     * @param subdirectory A subdirectory in the location's path that must begin with `/fsx` . 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * The key-value pair that represents a tag that you want to add to the resource.
     *
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
     * @param tags The key-value pair that represents a tag that you want to add to the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key-value pair that represents a tag that you want to add to the resource.
     *
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
     * @param tags The key-value pair that represents a tag that you want to add to the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-fsxfilesystemarn)
     * @param fsxFilesystemArn The Amazon Resource Name (ARN) of the FSx for OpenZFS file system. 
     */
    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    /**
     * The type of protocol that AWS DataSync uses to access your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    /**
     * The type of protocol that AWS DataSync uses to access your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    override fun protocol(protocol: ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(ProtocolProperty::unwrap))
    }

    /**
     * The type of protocol that AWS DataSync uses to access your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-protocol)
     * @param protocol The type of protocol that AWS DataSync uses to access your file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2396111d82e0f56f870246bb6151ae72c1c9ad7f89902c5572bc5c0b637af9")
    override fun protocol(protocol: ProtocolProperty.Builder.() -> Unit): Unit =
        protocol(ProtocolProperty(protocol))

    /**
     * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * *Length constraints* : Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-securitygrouparns)
     * @param securityGroupArns The ARNs of the security groups that are used to configure the FSx
     * for OpenZFS file system. 
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * A subdirectory in the location's path that must begin with `/fsx` .
     *
     * DataSync uses this subdirectory to read or write data (depending on whether the file system
     * is a source or destination location).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-subdirectory)
     * @param subdirectory A subdirectory in the location's path that must begin with `/fsx` . 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * The key-value pair that represents a tag that you want to add to the resource.
     *
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
     * @param tags The key-value pair that represents a tag that you want to add to the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The key-value pair that represents a tag that you want to add to the resource.
     *
     * The value can be an empty string. This value helps you manage, filter, and search for your
     * resources. We recommend that you create a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxopenzfs.html#cfn-datasync-locationfsxopenzfs-tags)
     * @param tags The key-value pair that represents a tag that you want to add to the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationFSxOpenZFS {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationFSxOpenZFS(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS):
        CfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxOpenZFS):
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS = wrapped.cdkObject
  }

  /**
   * Represents the mount options that are available for DataSync to access a Network File System
   * (NFS) location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * MountOptionsProperty mountOptionsProperty = MountOptionsProperty.builder()
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-mountoptions.html)
   */
  public interface MountOptionsProperty {
    /**
     * The specific NFS version that you want DataSync to use to mount your NFS share.
     *
     * If the server refuses to use the version specified, the sync will fail. If you don't specify
     * a version, DataSync defaults to `AUTOMATIC` . That is, DataSync automatically selects a version
     * based on negotiation with the NFS server.
     *
     * You can specify the following NFS versions:
     *
     * * *[NFSv3](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc1813)* : Stateless
     * protocol version that allows for asynchronous writes on the server.
     * * *[NFSv4.0](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3530)* : Stateful,
     * firewall-friendly protocol version that supports delegations and pseudo file systems.
     * * *[NFSv4.1](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5661)* : Stateful
     * protocol version that supports sessions, directory delegations, and parallel data processing.
     * Version 4.1 also includes all features available in version 4.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-mountoptions.html#cfn-datasync-locationfsxopenzfs-mountoptions-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [MountOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param version The specific NFS version that you want DataSync to use to mount your NFS
       * share.
       * If the server refuses to use the version specified, the sync will fail. If you don't
       * specify a version, DataSync defaults to `AUTOMATIC` . That is, DataSync automatically selects
       * a version based on negotiation with the NFS server.
       *
       * You can specify the following NFS versions:
       *
       * * *[NFSv3](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc1813)* : Stateless
       * protocol version that allows for asynchronous writes on the server.
       * * *[NFSv4.0](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3530)* : Stateful,
       * firewall-friendly protocol version that supports delegations and pseudo file systems.
       * * *[NFSv4.1](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5661)* : Stateful
       * protocol version that supports sessions, directory delegations, and parallel data processing.
       * Version 4.1 also includes all features available in version 4.0.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty.builder()

      /**
       * @param version The specific NFS version that you want DataSync to use to mount your NFS
       * share.
       * If the server refuses to use the version specified, the sync will fail. If you don't
       * specify a version, DataSync defaults to `AUTOMATIC` . That is, DataSync automatically selects
       * a version based on negotiation with the NFS server.
       *
       * You can specify the following NFS versions:
       *
       * * *[NFSv3](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc1813)* : Stateless
       * protocol version that allows for asynchronous writes on the server.
       * * *[NFSv4.0](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3530)* : Stateful,
       * firewall-friendly protocol version that supports delegations and pseudo file systems.
       * * *[NFSv4.1](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5661)* : Stateful
       * protocol version that supports sessions, directory delegations, and parallel data processing.
       * Version 4.1 also includes all features available in version 4.0.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty,
    ) : CdkObject(cdkObject), MountOptionsProperty {
      /**
       * The specific NFS version that you want DataSync to use to mount your NFS share.
       *
       * If the server refuses to use the version specified, the sync will fail. If you don't
       * specify a version, DataSync defaults to `AUTOMATIC` . That is, DataSync automatically selects
       * a version based on negotiation with the NFS server.
       *
       * You can specify the following NFS versions:
       *
       * * *[NFSv3](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc1813)* : Stateless
       * protocol version that allows for asynchronous writes on the server.
       * * *[NFSv4.0](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3530)* : Stateful,
       * firewall-friendly protocol version that supports delegations and pseudo file systems.
       * * *[NFSv4.1](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5661)* : Stateful
       * protocol version that supports sessions, directory delegations, and parallel data processing.
       * Version 4.1 also includes all features available in version 4.0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-mountoptions.html#cfn-datasync-locationfsxopenzfs-mountoptions-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty):
          MountOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? MountOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty
    }
  }

  /**
   * Represents the Network File System (NFS) protocol that AWS DataSync uses to access your Amazon
   * FSx for OpenZFS file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * NFSProperty nFSProperty = NFSProperty.builder()
   * .mountOptions(MountOptionsProperty.builder()
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-nfs.html)
   */
  public interface NFSProperty {
    /**
     * Represents the mount options that are available for DataSync to access an NFS location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-nfs.html#cfn-datasync-locationfsxopenzfs-nfs-mountoptions)
     */
    public fun mountOptions(): Any

    /**
     * A builder for [NFSProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mountOptions Represents the mount options that are available for DataSync to access
       * an NFS location. 
       */
      public fun mountOptions(mountOptions: IResolvable)

      /**
       * @param mountOptions Represents the mount options that are available for DataSync to access
       * an NFS location. 
       */
      public fun mountOptions(mountOptions: MountOptionsProperty)

      /**
       * @param mountOptions Represents the mount options that are available for DataSync to access
       * an NFS location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87b84a95a8857f96d24ce753066896f675992aaf5cec72080ff786cd7ebb64ce")
      public fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty.builder()

      /**
       * @param mountOptions Represents the mount options that are available for DataSync to access
       * an NFS location. 
       */
      override fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
      }

      /**
       * @param mountOptions Represents the mount options that are available for DataSync to access
       * an NFS location. 
       */
      override fun mountOptions(mountOptions: MountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions.let(MountOptionsProperty::unwrap))
      }

      /**
       * @param mountOptions Represents the mount options that are available for DataSync to access
       * an NFS location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87b84a95a8857f96d24ce753066896f675992aaf5cec72080ff786cd7ebb64ce")
      override fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit): Unit =
          mountOptions(MountOptionsProperty(mountOptions))

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty,
    ) : CdkObject(cdkObject), NFSProperty {
      /**
       * Represents the mount options that are available for DataSync to access an NFS location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-nfs.html#cfn-datasync-locationfsxopenzfs-nfs-mountoptions)
       */
      override fun mountOptions(): Any = unwrap(this).getMountOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NFSProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty):
          NFSProperty = CdkObjectWrappers.wrap(cdkObject) as? NFSProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NFSProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty
    }
  }

  /**
   * Represents the protocol that AWS DataSync uses to access your Amazon FSx for OpenZFS file
   * system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * ProtocolProperty protocolProperty = ProtocolProperty.builder()
   * .nfs(NFSProperty.builder()
   * .mountOptions(MountOptionsProperty.builder()
   * .version("version")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-protocol.html)
   */
  public interface ProtocolProperty {
    /**
     * Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for
     * OpenZFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-protocol.html#cfn-datasync-locationfsxopenzfs-protocol-nfs)
     */
    public fun nfs(): Any? = unwrap(this).getNfs()

    /**
     * A builder for [ProtocolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access
       * your FSx for OpenZFS file system.
       */
      public fun nfs(nfs: IResolvable)

      /**
       * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access
       * your FSx for OpenZFS file system.
       */
      public fun nfs(nfs: NFSProperty)

      /**
       * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access
       * your FSx for OpenZFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fc6ba73f6163e17969e0763e3c24480654ace62c9055b8e8b9ba4eb0fc261a")
      public fun nfs(nfs: NFSProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty.builder()

      /**
       * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access
       * your FSx for OpenZFS file system.
       */
      override fun nfs(nfs: IResolvable) {
        cdkBuilder.nfs(nfs.let(IResolvable::unwrap))
      }

      /**
       * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access
       * your FSx for OpenZFS file system.
       */
      override fun nfs(nfs: NFSProperty) {
        cdkBuilder.nfs(nfs.let(NFSProperty::unwrap))
      }

      /**
       * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access
       * your FSx for OpenZFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fc6ba73f6163e17969e0763e3c24480654ace62c9055b8e8b9ba4eb0fc261a")
      override fun nfs(nfs: NFSProperty.Builder.() -> Unit): Unit = nfs(NFSProperty(nfs))

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty,
    ) : CdkObject(cdkObject), ProtocolProperty {
      /**
       * Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for
       * OpenZFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-protocol.html#cfn-datasync-locationfsxopenzfs-protocol-nfs)
       */
      override fun nfs(): Any? = unwrap(this).getNfs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProtocolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty):
          ProtocolProperty = CdkObjectWrappers.wrap(cdkObject) as? ProtocolProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtocolProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty
    }
  }
}
