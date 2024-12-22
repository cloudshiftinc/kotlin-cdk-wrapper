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
 * The `AWS::DataSync::LocationS3` resource specifies an endpoint for an Amazon S3 bucket.
 *
 * For more information, see the [*AWS DataSync User
 * Guide*](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationS3 cfnLocationS3 = CfnLocationS3.Builder.create(this, "MyCfnLocationS3")
 * .s3Config(S3ConfigProperty.builder()
 * .bucketAccessRoleArn("bucketAccessRoleArn")
 * .build())
 * // the properties below are optional
 * .s3BucketArn("s3BucketArn")
 * .s3StorageClass("s3StorageClass")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html)
 */
public open class CfnLocationS3(
  cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationS3Props,
  ) :
      this(software.amazon.awscdk.services.datasync.CfnLocationS3(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLocationS3Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLocationS3Props.Builder.() -> Unit,
  ) : this(scope, id, CfnLocationS3Props(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the specified Amazon S3 location.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified Amazon S3 location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the Amazon S3 bucket.
   */
  public open fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

  /**
   * The ARN of the Amazon S3 bucket.
   */
  public open fun s3BucketArn(`value`: String) {
    unwrap(this).setS3BucketArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
   * used to access an Amazon S3 bucket.
   */
  public open fun s3Config(): Any = unwrap(this).getS3Config()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
   * used to access an Amazon S3 bucket.
   */
  public open fun s3Config(`value`: IResolvable) {
    unwrap(this).setS3Config(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
   * used to access an Amazon S3 bucket.
   */
  public open fun s3Config(`value`: S3ConfigProperty) {
    unwrap(this).setS3Config(`value`.let(S3ConfigProperty.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
   * used to access an Amazon S3 bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5a6e7ca61727d4170a2f0d9a777ad77cf8936087a6b1ea7bf8bd0bcbe4eeaa5a")
  public open fun s3Config(`value`: S3ConfigProperty.Builder.() -> Unit): Unit =
      s3Config(S3ConfigProperty(`value`))

  /**
   * The Amazon S3 storage class that you want to store your files in when this location is used as
   * a task destination.
   */
  public open fun s3StorageClass(): String? = unwrap(this).getS3StorageClass()

  /**
   * The Amazon S3 storage class that you want to store your files in when this location is used as
   * a task destination.
   */
  public open fun s3StorageClass(`value`: String) {
    unwrap(this).setS3StorageClass(`value`)
  }

  /**
   * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether
   * the bucket is a source or destination location).
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether
   * the bucket is a source or destination location).
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationS3].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3bucketarn)
     * @param s3BucketArn The ARN of the Amazon S3 bucket. 
     */
    public fun s3BucketArn(s3BucketArn: String)

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
     * used to access an Amazon S3 bucket.
     *
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     */
    public fun s3Config(s3Config: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
     * used to access an Amazon S3 bucket.
     *
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     */
    public fun s3Config(s3Config: S3ConfigProperty)

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
     * used to access an Amazon S3 bucket.
     *
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2913a60c9b6a3ff55f01f98abaccc69c7b5f4891aa4a4f678f0b452c230c38f3")
    public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon S3 storage class that you want to store your files in when this location is used
     * as a task destination.
     *
     * For buckets in AWS Regions , the storage class defaults to S3 Standard.
     *
     * For more information about S3 storage classes, see [Amazon S3 Storage
     * Classes](https://docs.aws.amazon.com/s3/storage-classes/) . Some storage classes have behaviors
     * that can affect your S3 storage costs. For detailed information, see [Considerations When
     * Working with Amazon S3 Storage Classes in
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * .
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3storageclass)
     * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when
     * this location is used as a task destination. 
     */
    public fun s3StorageClass(s3StorageClass: String)

    /**
     * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on
     * whether the bucket is a source or destination location).
     *
     *
     * DataSync can't transfer objects with a prefix that begins with a slash ( `/` ) or includes
     * `//` , `/./` , or `/../` patterns. For example:
     *
     * * `/photos`
     * * `photos//2006/January`
     * * `photos/./2006/February`
     * * `photos/../2006/March`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-subdirectory)
     * @param subdirectory Specifies a prefix in the S3 bucket that DataSync reads from or writes to
     * (depending on whether the bucket is a source or destination location). 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationS3.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationS3.Builder.create(scope, id)

    /**
     * The ARN of the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3bucketarn)
     * @param s3BucketArn The ARN of the Amazon S3 bucket. 
     */
    override fun s3BucketArn(s3BucketArn: String) {
      cdkBuilder.s3BucketArn(s3BucketArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
     * used to access an Amazon S3 bucket.
     *
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     */
    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
     * used to access an Amazon S3 bucket.
     *
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     */
    override fun s3Config(s3Config: S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(S3ConfigProperty.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
     * used to access an Amazon S3 bucket.
     *
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2913a60c9b6a3ff55f01f98abaccc69c7b5f4891aa4a4f678f0b452c230c38f3")
    override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
        s3Config(S3ConfigProperty(s3Config))

    /**
     * The Amazon S3 storage class that you want to store your files in when this location is used
     * as a task destination.
     *
     * For buckets in AWS Regions , the storage class defaults to S3 Standard.
     *
     * For more information about S3 storage classes, see [Amazon S3 Storage
     * Classes](https://docs.aws.amazon.com/s3/storage-classes/) . Some storage classes have behaviors
     * that can affect your S3 storage costs. For detailed information, see [Considerations When
     * Working with Amazon S3 Storage Classes in
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * .
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3storageclass)
     * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when
     * this location is used as a task destination. 
     */
    override fun s3StorageClass(s3StorageClass: String) {
      cdkBuilder.s3StorageClass(s3StorageClass)
    }

    /**
     * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on
     * whether the bucket is a source or destination location).
     *
     *
     * DataSync can't transfer objects with a prefix that begins with a slash ( `/` ) or includes
     * `//` , `/./` , or `/../` patterns. For example:
     *
     * * `/photos`
     * * `photos//2006/January`
     * * `photos/./2006/February`
     * * `photos/../2006/March`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-subdirectory)
     * @param subdirectory Specifies a prefix in the S3 bucket that DataSync reads from or writes to
     * (depending on whether the bucket is a source or destination location). 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationS3 = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationS3.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationS3 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationS3(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3):
        CfnLocationS3 = CfnLocationS3(cdkObject)

    internal fun unwrap(wrapped: CfnLocationS3):
        software.amazon.awscdk.services.datasync.CfnLocationS3 = wrapped.cdkObject as
        software.amazon.awscdk.services.datasync.CfnLocationS3
  }

  /**
   * Specifies the Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role
   * that DataSync uses to access your S3 bucket.
   *
   * For more information, see [Accessing S3
   * buckets](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#create-s3-location-access)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
   * .bucketAccessRoleArn("bucketAccessRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locations3-s3config.html)
   */
  public interface S3ConfigProperty {
    /**
     * Specifies the ARN of the IAM role that DataSync uses to access your S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locations3-s3config.html#cfn-datasync-locations3-s3config-bucketaccessrolearn)
     */
    public fun bucketAccessRoleArn(): String

    /**
     * A builder for [S3ConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketAccessRoleArn Specifies the ARN of the IAM role that DataSync uses to access
       * your S3 bucket. 
       */
      public fun bucketAccessRoleArn(bucketAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty.builder()

      /**
       * @param bucketAccessRoleArn Specifies the ARN of the IAM role that DataSync uses to access
       * your S3 bucket. 
       */
      override fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty,
    ) : CdkObject(cdkObject),
        S3ConfigProperty {
      /**
       * Specifies the ARN of the IAM role that DataSync uses to access your S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locations3-s3config.html#cfn-datasync-locations3-s3config-bucketaccessrolearn)
       */
      override fun bucketAccessRoleArn(): String = unwrap(this).getBucketAccessRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty):
          S3ConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty
    }
  }
}
