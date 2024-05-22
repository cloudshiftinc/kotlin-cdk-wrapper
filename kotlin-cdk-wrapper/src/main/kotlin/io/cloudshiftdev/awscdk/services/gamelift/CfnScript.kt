@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GameLift::Script` resource creates a new script record for your Realtime Servers
 * script.
 *
 * Realtime scripts are JavaScript that provide configuration settings and optional custom game
 * logic for your game. The script is deployed when you create a Realtime Servers fleet to host your
 * game sessions. Script logic is executed during an active game session.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnScript cfnScript = CfnScript.Builder.create(this, "MyCfnScript")
 * .storageLocation(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html)
 */
public open class CfnScript(
  cdkObject: software.amazon.awscdk.services.gamelift.CfnScript,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScriptProps,
  ) :
      this(software.amazon.awscdk.services.gamelift.CfnScript(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnScriptProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScriptProps.Builder.() -> Unit,
  ) : this(scope, id, CfnScriptProps(props)
  )

  /**
   * The unique Amazon Resource Name (ARN) for the script.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A time stamp indicating when this data object was created.
   *
   * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * A unique identifier for a Realtime script.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The file size of the uploaded Realtime script, expressed in bytes.
   *
   * When files are uploaded from an S3 location, this value remains at "0".
   */
  public open fun attrSizeOnDisk(): Number = unwrap(this).getAttrSizeOnDisk()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A descriptive label that is associated with a script.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A descriptive label that is associated with a script.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
   * stored.
   */
  public open fun storageLocation(): Any = unwrap(this).getStorageLocation()

  /**
   * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
   * stored.
   */
  public open fun storageLocation(`value`: IResolvable) {
    unwrap(this).setStorageLocation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
   * stored.
   */
  public open fun storageLocation(`value`: S3LocationProperty) {
    unwrap(this).setStorageLocation(`value`.let(S3LocationProperty.Companion::unwrap))
  }

  /**
   * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
   * stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f38dc65c163d2a30ad0a4a8462c06aba562d166f28d29618f5dec89204a2bbf")
  public open fun storageLocation(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      storageLocation(S3LocationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of labels to assign to the new script resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of labels to assign to the new script resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of labels to assign to the new script resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The version that is associated with a build or script.
   */
  public open fun version(): String? = unwrap(this).getVersion()

  /**
   * The version that is associated with a build or script.
   */
  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnScript].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A descriptive label that is associated with a script.
     *
     * Script names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-name)
     * @param name A descriptive label that is associated with a script. 
     */
    public fun name(name: String)

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     */
    public fun storageLocation(storageLocation: IResolvable)

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     */
    public fun storageLocation(storageLocation: S3LocationProperty)

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c70351e4878855f3f6dc7e9aaf7c9e3b746c27e61ebb2615139fb9e39b9b92b")
    public fun storageLocation(storageLocation: S3LocationProperty.Builder.() -> Unit)

    /**
     * A list of labels to assign to the new script resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
     * @param tags A list of labels to assign to the new script resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of labels to assign to the new script resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
     * @param tags A list of labels to assign to the new script resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The version that is associated with a build or script.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-version)
     * @param version The version that is associated with a build or script. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnScript.Builder =
        software.amazon.awscdk.services.gamelift.CfnScript.Builder.create(scope, id)

    /**
     * A descriptive label that is associated with a script.
     *
     * Script names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-name)
     * @param name A descriptive label that is associated with a script. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     */
    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     */
    override fun storageLocation(storageLocation: S3LocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(S3LocationProperty.Companion::unwrap))
    }

    /**
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is
     * stored.
     *
     * The storage location must specify the Amazon S3 bucket name, the zip file name (the "key"),
     * and a role ARN that allows Amazon GameLift to access the Amazon S3 storage location. The S3
     * bucket must be in the same Region where you want to create a new script. By default, Amazon
     * GameLift uploads the latest version of the zip file; if you have S3 object versioning turned on,
     * you can use the `ObjectVersion` parameter to specify an earlier version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-storagelocation)
     * @param storageLocation The location of the Amazon S3 bucket where a zipped file containing
     * your Realtime scripts is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c70351e4878855f3f6dc7e9aaf7c9e3b746c27e61ebb2615139fb9e39b9b92b")
    override fun storageLocation(storageLocation: S3LocationProperty.Builder.() -> Unit): Unit =
        storageLocation(S3LocationProperty(storageLocation))

    /**
     * A list of labels to assign to the new script resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
     * @param tags A list of labels to assign to the new script resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of labels to assign to the new script resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-tags)
     * @param tags A list of labels to assign to the new script resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The version that is associated with a build or script.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html#cfn-gamelift-script-version)
     * @param version The version that is associated with a build or script. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnScript = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnScript.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScript {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScript(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnScript): CfnScript =
        CfnScript(cdkObject)

    internal fun unwrap(wrapped: CfnScript): software.amazon.awscdk.services.gamelift.CfnScript =
        wrapped.cdkObject as software.amazon.awscdk.services.gamelift.CfnScript
  }

  /**
   * The location in Amazon S3 where build or script files can be stored for access by Amazon
   * GameLift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * An Amazon S3 bucket identifier. Thename of the S3 bucket.
     *
     *
     * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a
     * dot (.).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The name of the zip file that contains the build files or script files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-key)
     */
    public fun key(): String

    /**
     * The version of the file, if object versioning is turned on for the bucket.
     *
     * Amazon GameLift uses this information when retrieving files from an S3 bucket that you own.
     * Use this parameter to specify a specific version of the file. If not set, the latest version of
     * the file is retrieved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-objectversion)
     */
    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket An Amazon S3 bucket identifier. Thename of the S3 bucket. 
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
       * @param objectVersion The version of the file, if object versioning is turned on for the
       * bucket.
       * Amazon GameLift uses this information when retrieving files from an S3 bucket that you own.
       * Use this parameter to specify a specific version of the file. If not set, the latest version
       * of the file is retrieved.
       */
      public fun objectVersion(objectVersion: String)

      /**
       * @param roleArn The Amazon Resource Name (
       * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role
       * that allows Amazon GameLift to access the S3 bucket. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty.builder()

      /**
       * @param bucket An Amazon S3 bucket identifier. Thename of the S3 bucket. 
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
       * @param objectVersion The version of the file, if object versioning is turned on for the
       * bucket.
       * Amazon GameLift uses this information when retrieving files from an S3 bucket that you own.
       * Use this parameter to specify a specific version of the file. If not set, the latest version
       * of the file is retrieved.
       */
      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      /**
       * @param roleArn The Amazon Resource Name (
       * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role
       * that allows Amazon GameLift to access the S3 bucket. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * An Amazon S3 bucket identifier. Thename of the S3 bucket.
       *
       *
       * Amazon GameLift doesn't support uploading from Amazon S3 buckets with names that contain a
       * dot (.).
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The name of the zip file that contains the build files or script files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The version of the file, if object versioning is turned on for the bucket.
       *
       * Amazon GameLift uses this information when retrieving files from an S3 bucket that you own.
       * Use this parameter to specify a specific version of the file. If not set, the latest version
       * of the file is retrieved.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-objectversion)
       */
      override fun objectVersion(): String? = unwrap(this).getObjectVersion()

      /**
       * The Amazon Resource Name (
       * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role
       * that allows Amazon GameLift to access the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html#cfn-gamelift-script-s3location-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty
    }
  }
}
