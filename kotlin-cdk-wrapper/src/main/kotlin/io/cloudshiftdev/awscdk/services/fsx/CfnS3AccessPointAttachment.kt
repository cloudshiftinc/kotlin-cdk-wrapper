@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An S3 access point attached to an Amazon FSx volume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * Object policy;
 * CfnS3AccessPointAttachment cfnS3AccessPointAttachment =
 * CfnS3AccessPointAttachment.Builder.create(this, "MyCfnS3AccessPointAttachment")
 * .name("name")
 * .openZfsConfiguration(S3AccessPointOpenZFSConfigurationProperty.builder()
 * .fileSystemIdentity(OpenZFSFileSystemIdentityProperty.builder()
 * .posixUser(OpenZFSPosixFileSystemUserProperty.builder()
 * .gid(123)
 * .uid(123)
 * // the properties below are optional
 * .secondaryGids(List.of(FileSystemGIDProperty.builder()
 * .gid(123)
 * .build()))
 * .build())
 * .type("type")
 * .build())
 * .volumeId("volumeId")
 * .build())
 * .type("type")
 * // the properties below are optional
 * .s3AccessPoint(S3AccessPointProperty.builder()
 * .alias("alias")
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .vpcConfiguration(S3AccessPointVpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html)
 */
public open class CfnS3AccessPointAttachment(
  cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnS3AccessPointAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnS3AccessPointAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnS3AccessPointAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnS3AccessPointAttachmentProps(props)
  )

  /**
   * The S3 access point's alias.
   */
  public open fun attrS3AccessPointAlias(): String = unwrap(this).getAttrS3AccessPointAlias()

  /**
   * The S3 access point's ARN.
   */
  public open fun attrS3AccessPointResourceArn(): String =
      unwrap(this).getAttrS3AccessPointResourceArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the S3 access point attachment;
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the S3 access point attachment;
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The OpenZFSConfiguration of the S3 access point attachment.
   */
  public open fun openZfsConfiguration(): Any = unwrap(this).getOpenZfsConfiguration()

  /**
   * The OpenZFSConfiguration of the S3 access point attachment.
   */
  public open fun openZfsConfiguration(`value`: IResolvable) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The OpenZFSConfiguration of the S3 access point attachment.
   */
  public open fun openZfsConfiguration(`value`: S3AccessPointOpenZFSConfigurationProperty) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(S3AccessPointOpenZFSConfigurationProperty.Companion::unwrap))
  }

  /**
   * The OpenZFSConfiguration of the S3 access point attachment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5047200a40e11ce571dc9b73bc881f19c961800e3af2abd8a1ded0787bc34b2")
  public open
      fun openZfsConfiguration(`value`: S3AccessPointOpenZFSConfigurationProperty.Builder.() -> Unit):
      Unit = openZfsConfiguration(S3AccessPointOpenZFSConfigurationProperty(`value`))

  /**
   * The S3 access point configuration of the S3 access point attachment.
   */
  public open fun s3AccessPoint(): Any? = unwrap(this).getS3AccessPoint()

  /**
   * The S3 access point configuration of the S3 access point attachment.
   */
  public open fun s3AccessPoint(`value`: IResolvable) {
    unwrap(this).setS3AccessPoint(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The S3 access point configuration of the S3 access point attachment.
   */
  public open fun s3AccessPoint(`value`: S3AccessPointProperty) {
    unwrap(this).setS3AccessPoint(`value`.let(S3AccessPointProperty.Companion::unwrap))
  }

  /**
   * The S3 access point configuration of the S3 access point attachment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("27f841e19f746a294cb5c85592ddf3f6141ebed4229ebcddaee8d7eac66ccbc5")
  public open fun s3AccessPoint(`value`: S3AccessPointProperty.Builder.() -> Unit): Unit =
      s3AccessPoint(S3AccessPointProperty(`value`))

  /**
   * The type of Amazon FSx volume that the S3 access point is attached to.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of Amazon FSx volume that the S3 access point is attached to.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.CfnS3AccessPointAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the S3 access point attachment;
     *
     * also used for the name of the S3 access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-name)
     * @param name The name of the S3 access point attachment;. 
     */
    public fun name(name: String)

    /**
     * The OpenZFSConfiguration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    /**
     * The OpenZFSConfiguration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    public fun openZfsConfiguration(openZfsConfiguration: S3AccessPointOpenZFSConfigurationProperty)

    /**
     * The OpenZFSConfiguration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b9ca386eeb3dde79c2fc5471992dca06fa54eb16e74f38b2c5646dc39f1db35")
    public
        fun openZfsConfiguration(openZfsConfiguration: S3AccessPointOpenZFSConfigurationProperty.Builder.() -> Unit)

    /**
     * The S3 access point configuration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment. 
     */
    public fun s3AccessPoint(s3AccessPoint: IResolvable)

    /**
     * The S3 access point configuration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment. 
     */
    public fun s3AccessPoint(s3AccessPoint: S3AccessPointProperty)

    /**
     * The S3 access point configuration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("268e0c0d02d081b3e9e16a4f1fbe36e3c2b475ecd49bf30849e3d0b5b17561cb")
    public fun s3AccessPoint(s3AccessPoint: S3AccessPointProperty.Builder.() -> Unit)

    /**
     * The type of Amazon FSx volume that the S3 access point is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-type)
     * @param type The type of Amazon FSx volume that the S3 access point is attached to. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.Builder =
        software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.Builder.create(scope, id)

    /**
     * The name of the S3 access point attachment;
     *
     * also used for the name of the S3 access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-name)
     * @param name The name of the S3 access point attachment;. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The OpenZFSConfiguration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The OpenZFSConfiguration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    override
        fun openZfsConfiguration(openZfsConfiguration: S3AccessPointOpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(S3AccessPointOpenZFSConfigurationProperty.Companion::unwrap))
    }

    /**
     * The OpenZFSConfiguration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b9ca386eeb3dde79c2fc5471992dca06fa54eb16e74f38b2c5646dc39f1db35")
    override
        fun openZfsConfiguration(openZfsConfiguration: S3AccessPointOpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(S3AccessPointOpenZFSConfigurationProperty(openZfsConfiguration))

    /**
     * The S3 access point configuration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment. 
     */
    override fun s3AccessPoint(s3AccessPoint: IResolvable) {
      cdkBuilder.s3AccessPoint(s3AccessPoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * The S3 access point configuration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment. 
     */
    override fun s3AccessPoint(s3AccessPoint: S3AccessPointProperty) {
      cdkBuilder.s3AccessPoint(s3AccessPoint.let(S3AccessPointProperty.Companion::unwrap))
    }

    /**
     * The S3 access point configuration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("268e0c0d02d081b3e9e16a4f1fbe36e3c2b475ecd49bf30849e3d0b5b17561cb")
    override fun s3AccessPoint(s3AccessPoint: S3AccessPointProperty.Builder.() -> Unit): Unit =
        s3AccessPoint(S3AccessPointProperty(s3AccessPoint))

    /**
     * The type of Amazon FSx volume that the S3 access point is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-type)
     * @param type The type of Amazon FSx volume that the S3 access point is attached to. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnS3AccessPointAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnS3AccessPointAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment):
        CfnS3AccessPointAttachment = CfnS3AccessPointAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnS3AccessPointAttachment):
        software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment = wrapped.cdkObject as
        software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment
  }

  /**
   * The GID of the file system user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * FileSystemGIDProperty fileSystemGIDProperty = FileSystemGIDProperty.builder()
   * .gid(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-filesystemgid.html)
   */
  public interface FileSystemGIDProperty {
    /**
     * The GID of the file system user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-filesystemgid.html#cfn-fsx-s3accesspointattachment-filesystemgid-gid)
     */
    public fun gid(): Number

    /**
     * A builder for [FileSystemGIDProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gid The GID of the file system user. 
       */
      public fun gid(gid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.FileSystemGIDProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.FileSystemGIDProperty.builder()

      /**
       * @param gid The GID of the file system user. 
       */
      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.FileSystemGIDProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.FileSystemGIDProperty,
    ) : CdkObject(cdkObject),
        FileSystemGIDProperty {
      /**
       * The GID of the file system user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-filesystemgid.html#cfn-fsx-s3accesspointattachment-filesystemgid-gid)
       */
      override fun gid(): Number = unwrap(this).getGid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemGIDProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.FileSystemGIDProperty):
          FileSystemGIDProperty = CdkObjectWrappers.wrap(cdkObject) as? FileSystemGIDProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemGIDProperty):
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.FileSystemGIDProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.FileSystemGIDProperty
    }
  }

  /**
   * Specifies the file system user identity that will be used for authorizing all file access
   * requests that are made using the S3 access point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * OpenZFSFileSystemIdentityProperty openZFSFileSystemIdentityProperty =
   * OpenZFSFileSystemIdentityProperty.builder()
   * .posixUser(OpenZFSPosixFileSystemUserProperty.builder()
   * .gid(123)
   * .uid(123)
   * // the properties below are optional
   * .secondaryGids(List.of(FileSystemGIDProperty.builder()
   * .gid(123)
   * .build()))
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsfilesystemidentity.html)
   */
  public interface OpenZFSFileSystemIdentityProperty {
    /**
     * Specifies the UID and GIDs of the file system POSIX user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsfilesystemidentity.html#cfn-fsx-s3accesspointattachment-openzfsfilesystemidentity-posixuser)
     */
    public fun posixUser(): Any

    /**
     * Specifies the FSx for OpenZFS user identity type, accepts only `POSIX` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsfilesystemidentity.html#cfn-fsx-s3accesspointattachment-openzfsfilesystemidentity-type)
     */
    public fun type(): String

    /**
     * A builder for [OpenZFSFileSystemIdentityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param posixUser Specifies the UID and GIDs of the file system POSIX user. 
       */
      public fun posixUser(posixUser: IResolvable)

      /**
       * @param posixUser Specifies the UID and GIDs of the file system POSIX user. 
       */
      public fun posixUser(posixUser: OpenZFSPosixFileSystemUserProperty)

      /**
       * @param posixUser Specifies the UID and GIDs of the file system POSIX user. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d0e9a1c297c1aeab0992338333fd5b2ae39a0fe54ac6e4d18f026de539e2a1")
      public fun posixUser(posixUser: OpenZFSPosixFileSystemUserProperty.Builder.() -> Unit)

      /**
       * @param type Specifies the FSx for OpenZFS user identity type, accepts only `POSIX` . 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSFileSystemIdentityProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSFileSystemIdentityProperty.builder()

      /**
       * @param posixUser Specifies the UID and GIDs of the file system POSIX user. 
       */
      override fun posixUser(posixUser: IResolvable) {
        cdkBuilder.posixUser(posixUser.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param posixUser Specifies the UID and GIDs of the file system POSIX user. 
       */
      override fun posixUser(posixUser: OpenZFSPosixFileSystemUserProperty) {
        cdkBuilder.posixUser(posixUser.let(OpenZFSPosixFileSystemUserProperty.Companion::unwrap))
      }

      /**
       * @param posixUser Specifies the UID and GIDs of the file system POSIX user. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3d0e9a1c297c1aeab0992338333fd5b2ae39a0fe54ac6e4d18f026de539e2a1")
      override fun posixUser(posixUser: OpenZFSPosixFileSystemUserProperty.Builder.() -> Unit): Unit
          = posixUser(OpenZFSPosixFileSystemUserProperty(posixUser))

      /**
       * @param type Specifies the FSx for OpenZFS user identity type, accepts only `POSIX` . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSFileSystemIdentityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSFileSystemIdentityProperty,
    ) : CdkObject(cdkObject),
        OpenZFSFileSystemIdentityProperty {
      /**
       * Specifies the UID and GIDs of the file system POSIX user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsfilesystemidentity.html#cfn-fsx-s3accesspointattachment-openzfsfilesystemidentity-posixuser)
       */
      override fun posixUser(): Any = unwrap(this).getPosixUser()

      /**
       * Specifies the FSx for OpenZFS user identity type, accepts only `POSIX` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsfilesystemidentity.html#cfn-fsx-s3accesspointattachment-openzfsfilesystemidentity-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenZFSFileSystemIdentityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSFileSystemIdentityProperty):
          OpenZFSFileSystemIdentityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenZFSFileSystemIdentityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenZFSFileSystemIdentityProperty):
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSFileSystemIdentityProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSFileSystemIdentityProperty
    }
  }

  /**
   * The FSx for OpenZFS file system user that is used for authorizing all file access requests that
   * are made using the S3 access point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * OpenZFSPosixFileSystemUserProperty openZFSPosixFileSystemUserProperty =
   * OpenZFSPosixFileSystemUserProperty.builder()
   * .gid(123)
   * .uid(123)
   * // the properties below are optional
   * .secondaryGids(List.of(FileSystemGIDProperty.builder()
   * .gid(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsposixfilesystemuser.html)
   */
  public interface OpenZFSPosixFileSystemUserProperty {
    /**
     * The GID of the file system user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsposixfilesystemuser.html#cfn-fsx-s3accesspointattachment-openzfsposixfilesystemuser-gid)
     */
    public fun gid(): Number

    /**
     * The list of secondary GIDs for the file system user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsposixfilesystemuser.html#cfn-fsx-s3accesspointattachment-openzfsposixfilesystemuser-secondarygids)
     */
    public fun secondaryGids(): Any? = unwrap(this).getSecondaryGids()

    /**
     * The UID of the file system user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsposixfilesystemuser.html#cfn-fsx-s3accesspointattachment-openzfsposixfilesystemuser-uid)
     */
    public fun uid(): Number

    /**
     * A builder for [OpenZFSPosixFileSystemUserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gid The GID of the file system user. 
       */
      public fun gid(gid: Number)

      /**
       * @param secondaryGids The list of secondary GIDs for the file system user.
       */
      public fun secondaryGids(secondaryGids: IResolvable)

      /**
       * @param secondaryGids The list of secondary GIDs for the file system user.
       */
      public fun secondaryGids(secondaryGids: List<Any>)

      /**
       * @param secondaryGids The list of secondary GIDs for the file system user.
       */
      public fun secondaryGids(vararg secondaryGids: Any)

      /**
       * @param uid The UID of the file system user. 
       */
      public fun uid(uid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSPosixFileSystemUserProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSPosixFileSystemUserProperty.builder()

      /**
       * @param gid The GID of the file system user. 
       */
      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      /**
       * @param secondaryGids The list of secondary GIDs for the file system user.
       */
      override fun secondaryGids(secondaryGids: IResolvable) {
        cdkBuilder.secondaryGids(secondaryGids.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param secondaryGids The list of secondary GIDs for the file system user.
       */
      override fun secondaryGids(secondaryGids: List<Any>) {
        cdkBuilder.secondaryGids(secondaryGids.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param secondaryGids The list of secondary GIDs for the file system user.
       */
      override fun secondaryGids(vararg secondaryGids: Any): Unit =
          secondaryGids(secondaryGids.toList())

      /**
       * @param uid The UID of the file system user. 
       */
      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSPosixFileSystemUserProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSPosixFileSystemUserProperty,
    ) : CdkObject(cdkObject),
        OpenZFSPosixFileSystemUserProperty {
      /**
       * The GID of the file system user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsposixfilesystemuser.html#cfn-fsx-s3accesspointattachment-openzfsposixfilesystemuser-gid)
       */
      override fun gid(): Number = unwrap(this).getGid()

      /**
       * The list of secondary GIDs for the file system user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsposixfilesystemuser.html#cfn-fsx-s3accesspointattachment-openzfsposixfilesystemuser-secondarygids)
       */
      override fun secondaryGids(): Any? = unwrap(this).getSecondaryGids()

      /**
       * The UID of the file system user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-openzfsposixfilesystemuser.html#cfn-fsx-s3accesspointattachment-openzfsposixfilesystemuser-uid)
       */
      override fun uid(): Number = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OpenZFSPosixFileSystemUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSPosixFileSystemUserProperty):
          OpenZFSPosixFileSystemUserProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenZFSPosixFileSystemUserProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenZFSPosixFileSystemUserProperty):
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSPosixFileSystemUserProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.OpenZFSPosixFileSystemUserProperty
    }
  }

  /**
   * Describes the FSx for OpenZFS attachment configuration of an S3 access point attachment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * S3AccessPointOpenZFSConfigurationProperty s3AccessPointOpenZFSConfigurationProperty =
   * S3AccessPointOpenZFSConfigurationProperty.builder()
   * .fileSystemIdentity(OpenZFSFileSystemIdentityProperty.builder()
   * .posixUser(OpenZFSPosixFileSystemUserProperty.builder()
   * .gid(123)
   * .uid(123)
   * // the properties below are optional
   * .secondaryGids(List.of(FileSystemGIDProperty.builder()
   * .gid(123)
   * .build()))
   * .build())
   * .type("type")
   * .build())
   * .volumeId("volumeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration.html)
   */
  public interface S3AccessPointOpenZFSConfigurationProperty {
    /**
     * The file system identity used to authorize file access requests made using the S3 access
     * point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration.html#cfn-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration-filesystemidentity)
     */
    public fun fileSystemIdentity(): Any

    /**
     * The ID of the FSx for OpenZFS volume that the S3 access point is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration.html#cfn-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration-volumeid)
     */
    public fun volumeId(): String

    /**
     * A builder for [S3AccessPointOpenZFSConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemIdentity The file system identity used to authorize file access requests
       * made using the S3 access point. 
       */
      public fun fileSystemIdentity(fileSystemIdentity: IResolvable)

      /**
       * @param fileSystemIdentity The file system identity used to authorize file access requests
       * made using the S3 access point. 
       */
      public fun fileSystemIdentity(fileSystemIdentity: OpenZFSFileSystemIdentityProperty)

      /**
       * @param fileSystemIdentity The file system identity used to authorize file access requests
       * made using the S3 access point. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d1fa1284bd3f5e64d733d5f7491507ac4d8f761c1ccfb7f997386ed650b6b8d")
      public
          fun fileSystemIdentity(fileSystemIdentity: OpenZFSFileSystemIdentityProperty.Builder.() -> Unit)

      /**
       * @param volumeId The ID of the FSx for OpenZFS volume that the S3 access point is attached
       * to. 
       */
      public fun volumeId(volumeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty.builder()

      /**
       * @param fileSystemIdentity The file system identity used to authorize file access requests
       * made using the S3 access point. 
       */
      override fun fileSystemIdentity(fileSystemIdentity: IResolvable) {
        cdkBuilder.fileSystemIdentity(fileSystemIdentity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fileSystemIdentity The file system identity used to authorize file access requests
       * made using the S3 access point. 
       */
      override fun fileSystemIdentity(fileSystemIdentity: OpenZFSFileSystemIdentityProperty) {
        cdkBuilder.fileSystemIdentity(fileSystemIdentity.let(OpenZFSFileSystemIdentityProperty.Companion::unwrap))
      }

      /**
       * @param fileSystemIdentity The file system identity used to authorize file access requests
       * made using the S3 access point. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d1fa1284bd3f5e64d733d5f7491507ac4d8f761c1ccfb7f997386ed650b6b8d")
      override
          fun fileSystemIdentity(fileSystemIdentity: OpenZFSFileSystemIdentityProperty.Builder.() -> Unit):
          Unit = fileSystemIdentity(OpenZFSFileSystemIdentityProperty(fileSystemIdentity))

      /**
       * @param volumeId The ID of the FSx for OpenZFS volume that the S3 access point is attached
       * to. 
       */
      override fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty,
    ) : CdkObject(cdkObject),
        S3AccessPointOpenZFSConfigurationProperty {
      /**
       * The file system identity used to authorize file access requests made using the S3 access
       * point.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration.html#cfn-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration-filesystemidentity)
       */
      override fun fileSystemIdentity(): Any = unwrap(this).getFileSystemIdentity()

      /**
       * The ID of the FSx for OpenZFS volume that the S3 access point is attached to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration.html#cfn-fsx-s3accesspointattachment-s3accesspointopenzfsconfiguration-volumeid)
       */
      override fun volumeId(): String = unwrap(this).getVolumeId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3AccessPointOpenZFSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty):
          S3AccessPointOpenZFSConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3AccessPointOpenZFSConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3AccessPointOpenZFSConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty
    }
  }

  /**
   * Describes the S3 access point configuration of the S3 access point attachment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * Object policy;
   * S3AccessPointProperty s3AccessPointProperty = S3AccessPointProperty.builder()
   * .alias("alias")
   * .policy(policy)
   * .resourceArn("resourceArn")
   * .vpcConfiguration(S3AccessPointVpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html)
   */
  public interface S3AccessPointProperty {
    /**
     * The S3 access point's alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-alias)
     */
    public fun alias(): String? = unwrap(this).getAlias()

    /**
     * The S3 access point's policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-policy)
     */
    public fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * The S3 access point's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-resourcearn)
     */
    public fun resourceArn(): String? = unwrap(this).getResourceArn()

    /**
     * The S3 access point's virtual private cloud (VPC) configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    /**
     * A builder for [S3AccessPointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alias The S3 access point's alias.
       */
      public fun alias(alias: String)

      /**
       * @param policy The S3 access point's policy.
       */
      public fun policy(policy: Any)

      /**
       * @param resourceArn The S3 access point's ARN.
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param vpcConfiguration The S3 access point's virtual private cloud (VPC) configuration.
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration The S3 access point's virtual private cloud (VPC) configuration.
       */
      public fun vpcConfiguration(vpcConfiguration: S3AccessPointVpcConfigurationProperty)

      /**
       * @param vpcConfiguration The S3 access point's virtual private cloud (VPC) configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("846468b2c148e09d2a7ac0e2afc24458d922ef43a1540ad08493b8d28010b6b6")
      public
          fun vpcConfiguration(vpcConfiguration: S3AccessPointVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointProperty.builder()

      /**
       * @param alias The S3 access point's alias.
       */
      override fun alias(alias: String) {
        cdkBuilder.alias(alias)
      }

      /**
       * @param policy The S3 access point's policy.
       */
      override fun policy(policy: Any) {
        cdkBuilder.policy(policy)
      }

      /**
       * @param resourceArn The S3 access point's ARN.
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param vpcConfiguration The S3 access point's virtual private cloud (VPC) configuration.
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcConfiguration The S3 access point's virtual private cloud (VPC) configuration.
       */
      override fun vpcConfiguration(vpcConfiguration: S3AccessPointVpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(S3AccessPointVpcConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param vpcConfiguration The S3 access point's virtual private cloud (VPC) configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("846468b2c148e09d2a7ac0e2afc24458d922ef43a1540ad08493b8d28010b6b6")
      override
          fun vpcConfiguration(vpcConfiguration: S3AccessPointVpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(S3AccessPointVpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointProperty,
    ) : CdkObject(cdkObject),
        S3AccessPointProperty {
      /**
       * The S3 access point's alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-alias)
       */
      override fun alias(): String? = unwrap(this).getAlias()

      /**
       * The S3 access point's policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-policy)
       */
      override fun policy(): Any? = unwrap(this).getPolicy()

      /**
       * The S3 access point's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-resourcearn)
       */
      override fun resourceArn(): String? = unwrap(this).getResourceArn()

      /**
       * The S3 access point's virtual private cloud (VPC) configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspoint.html#cfn-fsx-s3accesspointattachment-s3accesspoint-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3AccessPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointProperty):
          S3AccessPointProperty = CdkObjectWrappers.wrap(cdkObject) as? S3AccessPointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3AccessPointProperty):
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointProperty
    }
  }

  /**
   * If included, Amazon S3 restricts access to this access point to requests from the specified
   * virtual private cloud (VPC).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * S3AccessPointVpcConfigurationProperty s3AccessPointVpcConfigurationProperty =
   * S3AccessPointVpcConfigurationProperty.builder()
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointvpcconfiguration.html)
   */
  public interface S3AccessPointVpcConfigurationProperty {
    /**
     * Specifies the virtual private cloud (VPC) for the S3 access point VPC configuration, if one
     * exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointvpcconfiguration.html#cfn-fsx-s3accesspointattachment-s3accesspointvpcconfiguration-vpcid)
     */
    public fun vpcId(): String

    /**
     * A builder for [S3AccessPointVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcId Specifies the virtual private cloud (VPC) for the S3 access point VPC
       * configuration, if one exists. 
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointVpcConfigurationProperty.builder()

      /**
       * @param vpcId Specifies the virtual private cloud (VPC) for the S3 access point VPC
       * configuration, if one exists. 
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointVpcConfigurationProperty,
    ) : CdkObject(cdkObject),
        S3AccessPointVpcConfigurationProperty {
      /**
       * Specifies the virtual private cloud (VPC) for the S3 access point VPC configuration, if one
       * exists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-s3accesspointattachment-s3accesspointvpcconfiguration.html#cfn-fsx-s3accesspointattachment-s3accesspointvpcconfiguration-vpcid)
       */
      override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3AccessPointVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointVpcConfigurationProperty):
          S3AccessPointVpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3AccessPointVpcConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3AccessPointVpcConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointVpcConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment.S3AccessPointVpcConfigurationProperty
    }
  }
}
