@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GameLift::Build` resource creates a game server build that is installed and run on
 * instances in an Amazon GameLift fleet.
 *
 * This resource points to an Amazon S3 location that contains a zip file with all of the components
 * of the game server build.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnBuild cfnBuild = CfnBuild.Builder.create(this, "MyCfnBuild")
 * .name("name")
 * .operatingSystem("operatingSystem")
 * .serverSdkVersion("serverSdkVersion")
 * .storageLocation(StorageLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
 */
public open class CfnBuild internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.gamelift.CfnBuild,
) : CfnResource(cdkObject), IInspectable {
  /**
   * A unique identifier for the build.
   */
  public open fun attrBuildId(): String = unwrap(this).getAttrBuildId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A descriptive label that is associated with a build.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A descriptive label that is associated with a build.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The operating system that your game server binaries run on.
   */
  public open fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  /**
   * The operating system that your game server binaries run on.
   */
  public open fun operatingSystem(`value`: String) {
    unwrap(this).setOperatingSystem(`value`)
  }

  /**
   * A server SDK version you used when integrating your game server build with Amazon GameLift.
   */
  public open fun serverSdkVersion(): String? = unwrap(this).getServerSdkVersion()

  /**
   * A server SDK version you used when integrating your game server build with Amazon GameLift.
   */
  public open fun serverSdkVersion(`value`: String) {
    unwrap(this).setServerSdkVersion(`value`)
  }

  /**
   * Information indicating where your game build files are stored.
   */
  public open fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  /**
   * Information indicating where your game build files are stored.
   */
  public open fun storageLocation(`value`: IResolvable) {
    unwrap(this).setStorageLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information indicating where your game build files are stored.
   */
  public open fun storageLocation(`value`: StorageLocationProperty) {
    unwrap(this).setStorageLocation(`value`.let(StorageLocationProperty::unwrap))
  }

  /**
   * Information indicating where your game build files are stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2cbba7b376908e2d546d1d9aa71a8d7a34c0870fd121f09463c749ed41027af")
  public open fun storageLocation(`value`: StorageLocationProperty.Builder.() -> Unit): Unit =
      storageLocation(StorageLocationProperty(`value`))

  /**
   * Version information that is associated with this build.
   */
  public open fun version(): String? = unwrap(this).getVersion()

  /**
   * Version information that is associated with this build.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnBuild].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A descriptive label that is associated with a build.
     *
     * Build names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
     * @param name A descriptive label that is associated with a build. 
     */
    public fun name(name: String)

    /**
     * The operating system that your game server binaries run on.
     *
     * This value determines the type of fleet resources that you use for this build. If your game
     * build contains multiple executables, they all must run on the same operating system. You must
     * specify a valid operating system in this request. There is no default value. You can't change a
     * build's operating system later.
     *
     *
     * If you have active fleets using the Windows Server 2012 operating system, you can continue to
     * create new builds using this OS until October 10, 2023, when Microsoft ends its support. All
     * others must use Windows Server 2016 when creating new Windows-based builds.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-operatingsystem)
     * @param operatingSystem The operating system that your game server binaries run on. 
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * A server SDK version you used when integrating your game server build with Amazon GameLift.
     *
     * For more information see [Integrate games with custom game
     * servers](https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-custom-intro.html)
     * . By default Amazon GameLift sets this value to `4.0.2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-serversdkversion)
     * @param serverSdkVersion A server SDK version you used when integrating your game server build
     * with Amazon GameLift. 
     */
    public fun serverSdkVersion(serverSdkVersion: String)

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     * @param storageLocation Information indicating where your game build files are stored. 
     */
    public fun storageLocation(storageLocation: IResolvable)

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     * @param storageLocation Information indicating where your game build files are stored. 
     */
    public fun storageLocation(storageLocation: StorageLocationProperty)

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     * @param storageLocation Information indicating where your game build files are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d5c1888cb6aea4a915f59edee556ca7c9485511849194e4c2886604f2c122cd")
    public fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit)

    /**
     * Version information that is associated with this build.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
     * @param version Version information that is associated with this build. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnBuild.Builder =
        software.amazon.awscdk.services.gamelift.CfnBuild.Builder.create(scope, id)

    /**
     * A descriptive label that is associated with a build.
     *
     * Build names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
     * @param name A descriptive label that is associated with a build. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The operating system that your game server binaries run on.
     *
     * This value determines the type of fleet resources that you use for this build. If your game
     * build contains multiple executables, they all must run on the same operating system. You must
     * specify a valid operating system in this request. There is no default value. You can't change a
     * build's operating system later.
     *
     *
     * If you have active fleets using the Windows Server 2012 operating system, you can continue to
     * create new builds using this OS until October 10, 2023, when Microsoft ends its support. All
     * others must use Windows Server 2016 when creating new Windows-based builds.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-operatingsystem)
     * @param operatingSystem The operating system that your game server binaries run on. 
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * A server SDK version you used when integrating your game server build with Amazon GameLift.
     *
     * For more information see [Integrate games with custom game
     * servers](https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-custom-intro.html)
     * . By default Amazon GameLift sets this value to `4.0.2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-serversdkversion)
     * @param serverSdkVersion A server SDK version you used when integrating your game server build
     * with Amazon GameLift. 
     */
    override fun serverSdkVersion(serverSdkVersion: String) {
      cdkBuilder.serverSdkVersion(serverSdkVersion)
    }

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     * @param storageLocation Information indicating where your game build files are stored. 
     */
    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     * @param storageLocation Information indicating where your game build files are stored. 
     */
    override fun storageLocation(storageLocation: StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(StorageLocationProperty::unwrap))
    }

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     * @param storageLocation Information indicating where your game build files are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d5c1888cb6aea4a915f59edee556ca7c9485511849194e4c2886604f2c122cd")
    override fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit): Unit
        = storageLocation(StorageLocationProperty(storageLocation))

    /**
     * Version information that is associated with this build.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
     * @param version Version information that is associated with this build. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnBuild = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnBuild.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBuild {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBuild(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnBuild): CfnBuild =
        CfnBuild(cdkObject)

    internal fun unwrap(wrapped: CfnBuild): software.amazon.awscdk.services.gamelift.CfnBuild =
        wrapped.cdkObject
  }

  /**
   * The location in Amazon S3 where build or script files are stored for access by Amazon GameLift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * StorageLocationProperty storageLocationProperty = StorageLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html)
   */
  public interface StorageLocationProperty {
    /**
     * An Amazon S3 bucket identifier. The name of the S3 bucket.
     *
     *
     * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a
     * dot (.).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-bucket)
     */
    public fun bucket(): String

    /**
     * The name of the zip file that contains the build files or script files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-key)
     */
    public fun key(): String

    /**
     * A version of a stored file to retrieve, if the object versioning feature is turned on for the
     * S3 bucket.
     *
     * Use this parameter to specify a specific version. If this parameter isn't set, Amazon
     * GameLift retrieves the latest version of the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-objectversion)
     */
    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /**
     * The ARNfor an IAM role that allows Amazon GameLift to access the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [StorageLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket An Amazon S3 bucket identifier. The name of the S3 bucket. 
       *
       * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a
       * dot (.).
       */
      public fun bucket(bucket: String)

      /**
       * @param key The name of the zip file that contains the build files or script files. 
       */
      public fun key(key: String)

      /**
       * @param objectVersion A version of a stored file to retrieve, if the object versioning
       * feature is turned on for the S3 bucket.
       * Use this parameter to specify a specific version. If this parameter isn't set, Amazon
       * GameLift retrieves the latest version of the file.
       */
      public fun objectVersion(objectVersion: String)

      /**
       * @param roleArn The ARNfor an IAM role that allows Amazon GameLift to access the S3 bucket. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty.builder()

      /**
       * @param bucket An Amazon S3 bucket identifier. The name of the S3 bucket. 
       *
       * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a
       * dot (.).
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The name of the zip file that contains the build files or script files. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param objectVersion A version of a stored file to retrieve, if the object versioning
       * feature is turned on for the S3 bucket.
       * Use this parameter to specify a specific version. If this parameter isn't set, Amazon
       * GameLift retrieves the latest version of the file.
       */
      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      /**
       * @param roleArn The ARNfor an IAM role that allows Amazon GameLift to access the S3 bucket. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty,
    ) : CdkObject(cdkObject), StorageLocationProperty {
      /**
       * An Amazon S3 bucket identifier. The name of the S3 bucket.
       *
       *
       * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a
       * dot (.).
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The name of the zip file that contains the build files or script files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * A version of a stored file to retrieve, if the object versioning feature is turned on for
       * the S3 bucket.
       *
       * Use this parameter to specify a specific version. If this parameter isn't set, Amazon
       * GameLift retrieves the latest version of the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-objectversion)
       */
      override fun objectVersion(): String? = unwrap(this).getObjectVersion()

      /**
       * The ARNfor an IAM role that allows Amazon GameLift to access the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storagelocation-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty):
          StorageLocationProperty = CdkObjectWrappers.wrap(cdkObject) as StorageLocationProperty

      internal fun unwrap(wrapped: StorageLocationProperty):
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnBuild.StorageLocationProperty
    }
  }
}
