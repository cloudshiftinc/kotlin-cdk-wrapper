@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

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
 * The AWS::S3Outposts::Bucket resource specifies a new Amazon S3 on Outposts bucket.
 *
 * To create an S3 on Outposts bucket, you must have S3 on Outposts capacity provisioned on your
 * Outpost. For more information, see [Using Amazon S3 on
 * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
 *
 * S3 on Outposts buckets support the following:
 *
 * * Tags
 * * Lifecycle configuration rules for deleting expired objects
 *
 * For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see
 * [Amazon S3 on Outposts Restrictions and
 * Limitations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OnOutpostsRestrictionsLimitations.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * Object filter;
 * CfnBucket cfnBucket = CfnBucket.Builder.create(this, "MyCfnBucket")
 * .bucketName("bucketName")
 * .outpostId("outpostId")
 * // the properties below are optional
 * .lifecycleConfiguration(LifecycleConfigurationProperty.builder()
 * .rules(List.of(RuleProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
 * .daysAfterInitiation(123)
 * .build())
 * .expirationDate("expirationDate")
 * .expirationInDays(123)
 * .filter(filter)
 * .id("id")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html)
 */
public open class CfnBucket(
  cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketProps,
  ) :
      this(software.amazon.awscdk.services.s3outposts.CfnBucket(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBucketProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBucketProps(props)
  )

  /**
   * Returns the ARN of the specified bucket.
   *
   * Example: `arn:aws:s3Outposts:::DOC-EXAMPLE-BUCKET`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A name for the S3 on Outposts bucket.
   */
  public open fun bucketName(): String = unwrap(this).getBucketName()

  /**
   * A name for the S3 on Outposts bucket.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
   * lifecycle configuration.
   */
  public open fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  /**
   * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
   * lifecycle configuration.
   */
  public open fun lifecycleConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
   * lifecycle configuration.
   */
  public open fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty) {
    unwrap(this).setLifecycleConfiguration(`value`.let(LifecycleConfigurationProperty.Companion::unwrap))
  }

  /**
   * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
   * lifecycle configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b114a8fa3d88477c0ae14e9bbd2bf4b0be10bd048f7790ad84f282857bab5ecd")
  public open
      fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty.Builder.() -> Unit): Unit =
      lifecycleConfiguration(LifecycleConfigurationProperty(`value`))

  /**
   * The ID of the Outpost of the specified bucket.
   */
  public open fun outpostId(): String = unwrap(this).getOutpostId()

  /**
   * The ID of the Outpost of the specified bucket.
   */
  public open fun outpostId(`value`: String) {
    unwrap(this).setOutpostId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Sets the tags for an S3 on Outposts bucket.
   *
   * For more information, see [Using Amazon S3 on
   * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Sets the tags for an S3 on Outposts bucket.
   *
   * For more information, see [Using Amazon S3 on
   * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Sets the tags for an S3 on Outposts bucket.
   *
   * For more information, see [Using Amazon S3 on
   * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3outposts.CfnBucket].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the S3 on Outposts bucket.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the bucket name. The bucket name must contain only lowercase letters, numbers, periods (.), and
     * dashes (-) and must follow [Amazon S3 bucket restrictions and
     * limitations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html) .
     * For more information, see [Bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html#bucketnamingrules)
     * .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-bucketname)
     * @param bucketName A name for the S3 on Outposts bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
     * lifecycle configuration.
     *
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    /**
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
     * lifecycle configuration.
     *
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty)

    /**
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
     * lifecycle configuration.
     *
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b30418c71d54521c0248fb6c87d8bcba24bb269e4541a7230ed5a2c7c9aaba1b")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit)

    /**
     * The ID of the Outpost of the specified bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-outpostid)
     * @param outpostId The ID of the Outpost of the specified bucket. 
     */
    public fun outpostId(outpostId: String)

    /**
     * Sets the tags for an S3 on Outposts bucket. For more information, see [Using Amazon S3 on
     * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
     *
     * Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to
     * get your AWS account bill with tag key values included. Then, to see the cost of combined
     * resources, organize your billing information according to resources with the same tag key
     * values. For example, you can tag several resources with a specific application name, and then
     * organize your billing information to see the total cost of that application across several
     * services. For more information, see [Cost allocation and
     * tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) .
     *
     *
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value
     * overwrites the old value. For more information, see [Using cost allocation and bucket
     * tags](https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html) .
     *
     *
     * To use this resource, you must have permissions to perform the `s3-outposts:PutBucketTagging`
     * . The S3 on Outposts bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see [Permissions Related to Bucket
     * Subresource
     * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources)
     * and [Managing access permissions to your Amazon S3
     * resources](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-tags)
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * . 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Sets the tags for an S3 on Outposts bucket. For more information, see [Using Amazon S3 on
     * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
     *
     * Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to
     * get your AWS account bill with tag key values included. Then, to see the cost of combined
     * resources, organize your billing information according to resources with the same tag key
     * values. For example, you can tag several resources with a specific application name, and then
     * organize your billing information to see the total cost of that application across several
     * services. For more information, see [Cost allocation and
     * tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) .
     *
     *
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value
     * overwrites the old value. For more information, see [Using cost allocation and bucket
     * tags](https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html) .
     *
     *
     * To use this resource, you must have permissions to perform the `s3-outposts:PutBucketTagging`
     * . The S3 on Outposts bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see [Permissions Related to Bucket
     * Subresource
     * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources)
     * and [Managing access permissions to your Amazon S3
     * resources](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-tags)
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * . 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucket.Builder =
        software.amazon.awscdk.services.s3outposts.CfnBucket.Builder.create(scope, id)

    /**
     * A name for the S3 on Outposts bucket.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the bucket name. The bucket name must contain only lowercase letters, numbers, periods (.), and
     * dashes (-) and must follow [Amazon S3 bucket restrictions and
     * limitations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html) .
     * For more information, see [Bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html#bucketnamingrules)
     * .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-bucketname)
     * @param bucketName A name for the S3 on Outposts bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
     * lifecycle configuration.
     *
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
     * lifecycle configuration.
     *
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(LifecycleConfigurationProperty.Companion::unwrap))
    }

    /**
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
     * lifecycle configuration.
     *
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b30418c71d54521c0248fb6c87d8bcba24bb269e4541a7230ed5a2c7c9aaba1b")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit = lifecycleConfiguration(LifecycleConfigurationProperty(lifecycleConfiguration))

    /**
     * The ID of the Outpost of the specified bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-outpostid)
     * @param outpostId The ID of the Outpost of the specified bucket. 
     */
    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    /**
     * Sets the tags for an S3 on Outposts bucket. For more information, see [Using Amazon S3 on
     * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
     *
     * Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to
     * get your AWS account bill with tag key values included. Then, to see the cost of combined
     * resources, organize your billing information according to resources with the same tag key
     * values. For example, you can tag several resources with a specific application name, and then
     * organize your billing information to see the total cost of that application across several
     * services. For more information, see [Cost allocation and
     * tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) .
     *
     *
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value
     * overwrites the old value. For more information, see [Using cost allocation and bucket
     * tags](https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html) .
     *
     *
     * To use this resource, you must have permissions to perform the `s3-outposts:PutBucketTagging`
     * . The S3 on Outposts bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see [Permissions Related to Bucket
     * Subresource
     * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources)
     * and [Managing access permissions to your Amazon S3
     * resources](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-tags)
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * . 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Sets the tags for an S3 on Outposts bucket. For more information, see [Using Amazon S3 on
     * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
     *
     * Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to
     * get your AWS account bill with tag key values included. Then, to see the cost of combined
     * resources, organize your billing information according to resources with the same tag key
     * values. For example, you can tag several resources with a specific application name, and then
     * organize your billing information to see the total cost of that application across several
     * services. For more information, see [Cost allocation and
     * tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) .
     *
     *
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value
     * overwrites the old value. For more information, see [Using cost allocation and bucket
     * tags](https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html) .
     *
     *
     * To use this resource, you must have permissions to perform the `s3-outposts:PutBucketTagging`
     * . The S3 on Outposts bucket owner has this permission by default and can grant this permission
     * to others. For more information about permissions, see [Permissions Related to Bucket
     * Subresource
     * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources)
     * and [Managing access permissions to your Amazon S3
     * resources](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-tags)
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * . 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3outposts.CfnBucket.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket): CfnBucket =
        CfnBucket(cdkObject)

    internal fun unwrap(wrapped: CfnBucket): software.amazon.awscdk.services.s3outposts.CfnBucket =
        wrapped.cdkObject as software.amazon.awscdk.services.s3outposts.CfnBucket
  }

  /**
   * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 on
   * Outposts waits before permanently removing all parts of the upload.
   *
   * For more information, see [Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
   * Policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * AbortIncompleteMultipartUploadProperty abortIncompleteMultipartUploadProperty =
   * AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-abortincompletemultipartupload.html)
   */
  public interface AbortIncompleteMultipartUploadProperty {
    /**
     * Specifies the number of days after initiation that Amazon S3 on Outposts aborts an incomplete
     * multipart upload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-abortincompletemultipartupload.html#cfn-s3outposts-bucket-abortincompletemultipartupload-daysafterinitiation)
     */
    public fun daysAfterInitiation(): Number

    /**
     * A builder for [AbortIncompleteMultipartUploadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daysAfterInitiation Specifies the number of days after initiation that Amazon S3 on
       * Outposts aborts an incomplete multipart upload. 
       */
      public fun daysAfterInitiation(daysAfterInitiation: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

      /**
       * @param daysAfterInitiation Specifies the number of days after initiation that Amazon S3 on
       * Outposts aborts an incomplete multipart upload. 
       */
      override fun daysAfterInitiation(daysAfterInitiation: Number) {
        cdkBuilder.daysAfterInitiation(daysAfterInitiation)
      }

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty,
    ) : CdkObject(cdkObject), AbortIncompleteMultipartUploadProperty {
      /**
       * Specifies the number of days after initiation that Amazon S3 on Outposts aborts an
       * incomplete multipart upload.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-abortincompletemultipartupload.html#cfn-s3outposts-bucket-abortincompletemultipartupload-daysafterinitiation)
       */
      override fun daysAfterInitiation(): Number = unwrap(this).getDaysAfterInitiation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AbortIncompleteMultipartUploadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty):
          AbortIncompleteMultipartUploadProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AbortIncompleteMultipartUploadProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortIncompleteMultipartUploadProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.AbortIncompleteMultipartUploadProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * FilterAndOperatorProperty filterAndOperatorProperty = FilterAndOperatorProperty.builder()
   * .tags(List.of(FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * // the properties below are optional
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filterandoperator.html)
   */
  public interface FilterAndOperatorProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filterandoperator.html#cfn-s3outposts-bucket-filterandoperator-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filterandoperator.html#cfn-s3outposts-bucket-filterandoperator-tags)
     */
    public fun tags(): List<FilterTagProperty>

    /**
     * A builder for [FilterAndOperatorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prefix the value to be set.
       */
      public fun prefix(prefix: String)

      /**
       * @param tags the value to be set. 
       */
      public fun tags(tags: List<FilterTagProperty>)

      /**
       * @param tags the value to be set. 
       */
      public fun tags(vararg tags: FilterTagProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty.builder()

      /**
       * @param prefix the value to be set.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param tags the value to be set. 
       */
      override fun tags(tags: List<FilterTagProperty>) {
        cdkBuilder.tags(tags.map(FilterTagProperty.Companion::unwrap))
      }

      /**
       * @param tags the value to be set. 
       */
      override fun tags(vararg tags: FilterTagProperty): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty,
    ) : CdkObject(cdkObject), FilterAndOperatorProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filterandoperator.html#cfn-s3outposts-bucket-filterandoperator-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filterandoperator.html#cfn-s3outposts-bucket-filterandoperator-tags)
       */
      override fun tags(): List<FilterTagProperty> =
          unwrap(this).getTags().map(FilterTagProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterAndOperatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty):
          FilterAndOperatorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FilterAndOperatorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterAndOperatorProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterAndOperatorProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .andOperator(FilterAndOperatorProperty.builder()
   * .tags(List.of(FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * // the properties below are optional
   * .prefix("prefix")
   * .build())
   * .prefix("prefix")
   * .tag(FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html)
   */
  public interface FilterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html#cfn-s3outposts-bucket-filter-andoperator)
     */
    public fun andOperator(): Any? = unwrap(this).getAndOperator()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html#cfn-s3outposts-bucket-filter-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html#cfn-s3outposts-bucket-filter-tag)
     */
    public fun tag(): Any? = unwrap(this).getTag()

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param andOperator the value to be set.
       */
      public fun andOperator(andOperator: IResolvable)

      /**
       * @param andOperator the value to be set.
       */
      public fun andOperator(andOperator: FilterAndOperatorProperty)

      /**
       * @param andOperator the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71659ddade6f7c3414d18dcbd9690daaab2e4c9245360663712d1c20f60dd17")
      public fun andOperator(andOperator: FilterAndOperatorProperty.Builder.() -> Unit)

      /**
       * @param prefix the value to be set.
       */
      public fun prefix(prefix: String)

      /**
       * @param tag the value to be set.
       */
      public fun tag(tag: IResolvable)

      /**
       * @param tag the value to be set.
       */
      public fun tag(tag: FilterTagProperty)

      /**
       * @param tag the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80d2ebc5a1b3d60f9f0c23045a9ce9c9a2ea11ba9bdebca176c617a4bdae06e8")
      public fun tag(tag: FilterTagProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty.builder()

      /**
       * @param andOperator the value to be set.
       */
      override fun andOperator(andOperator: IResolvable) {
        cdkBuilder.andOperator(andOperator.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param andOperator the value to be set.
       */
      override fun andOperator(andOperator: FilterAndOperatorProperty) {
        cdkBuilder.andOperator(andOperator.let(FilterAndOperatorProperty.Companion::unwrap))
      }

      /**
       * @param andOperator the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71659ddade6f7c3414d18dcbd9690daaab2e4c9245360663712d1c20f60dd17")
      override fun andOperator(andOperator: FilterAndOperatorProperty.Builder.() -> Unit): Unit =
          andOperator(FilterAndOperatorProperty(andOperator))

      /**
       * @param prefix the value to be set.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param tag the value to be set.
       */
      override fun tag(tag: IResolvable) {
        cdkBuilder.tag(tag.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tag the value to be set.
       */
      override fun tag(tag: FilterTagProperty) {
        cdkBuilder.tag(tag.let(FilterTagProperty.Companion::unwrap))
      }

      /**
       * @param tag the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("80d2ebc5a1b3d60f9f0c23045a9ce9c9a2ea11ba9bdebca176c617a4bdae06e8")
      override fun tag(tag: FilterTagProperty.Builder.() -> Unit): Unit =
          tag(FilterTagProperty(tag))

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html#cfn-s3outposts-bucket-filter-andoperator)
       */
      override fun andOperator(): Any? = unwrap(this).getAndOperator()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html#cfn-s3outposts-bucket-filter-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html#cfn-s3outposts-bucket-filter-tag)
       */
      override fun tag(): Any? = unwrap(this).getTag()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty):
          FilterProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * FilterTagProperty filterTagProperty = FilterTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filtertag.html)
   */
  public interface FilterTagProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filtertag.html#cfn-s3outposts-bucket-filtertag-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filtertag.html#cfn-s3outposts-bucket-filtertag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [FilterTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key the value to be set. 
       */
      public fun key(key: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty.builder()

      /**
       * @param key the value to be set. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty,
    ) : CdkObject(cdkObject), FilterTagProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filtertag.html#cfn-s3outposts-bucket-filtertag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filtertag.html#cfn-s3outposts-bucket-filtertag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty):
          FilterTagProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterTagProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterTagProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.FilterTagProperty
    }
  }

  /**
   * The container for the lifecycle configuration for the objects stored in an S3 on Outposts
   * bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * Object filter;
   * LifecycleConfigurationProperty lifecycleConfigurationProperty =
   * LifecycleConfigurationProperty.builder()
   * .rules(List.of(RuleProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build())
   * .expirationDate("expirationDate")
   * .expirationInDays(123)
   * .filter(filter)
   * .id("id")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-lifecycleconfiguration.html)
   */
  public interface LifecycleConfigurationProperty {
    /**
     * The container for the lifecycle configuration rules for the objects stored in the S3 on
     * Outposts bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-lifecycleconfiguration.html#cfn-s3outposts-bucket-lifecycleconfiguration-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [LifecycleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules The container for the lifecycle configuration rules for the objects stored in
       * the S3 on Outposts bucket. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules The container for the lifecycle configuration rules for the objects stored in
       * the S3 on Outposts bucket. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules The container for the lifecycle configuration rules for the objects stored in
       * the S3 on Outposts bucket. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty.builder()

      /**
       * @param rules The container for the lifecycle configuration rules for the objects stored in
       * the S3 on Outposts bucket. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rules The container for the lifecycle configuration rules for the objects stored in
       * the S3 on Outposts bucket. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param rules The container for the lifecycle configuration rules for the objects stored in
       * the S3 on Outposts bucket. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty,
    ) : CdkObject(cdkObject), LifecycleConfigurationProperty {
      /**
       * The container for the lifecycle configuration rules for the objects stored in the S3 on
       * Outposts bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-lifecycleconfiguration.html#cfn-s3outposts-bucket-lifecycleconfiguration-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty):
          LifecycleConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LifecycleConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleConfigurationProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty
    }
  }

  /**
   * A container for an Amazon S3 on Outposts bucket lifecycle rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3outposts.*;
   * Object filter;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty.builder()
   * .daysAfterInitiation(123)
   * .build())
   * .expirationDate("expirationDate")
   * .expirationInDays(123)
   * .filter(filter)
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html)
   */
  public interface RuleProperty {
    /**
     * The container for the abort incomplete multipart upload rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-abortincompletemultipartupload)
     */
    public fun abortIncompleteMultipartUpload(): Any? =
        unwrap(this).getAbortIncompleteMultipartUpload()

    /**
     * Specifies the expiration for the lifecycle of the object by specifying an expiry date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-expirationdate)
     */
    public fun expirationDate(): String? = unwrap(this).getExpirationDate()

    /**
     * Specifies the expiration for the lifecycle of the object in the form of days that the object
     * has been in the S3 on Outposts bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-expirationindays)
     */
    public fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

    /**
     * The container for the filter of the lifecycle rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * If `Enabled` , the rule is currently being applied.
     *
     * If `Disabled` , the rule is not currently being applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-status)
     */
    public fun status(): String

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart
       * upload rule.
       */
      public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable)

      /**
       * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart
       * upload rule.
       */
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty)

      /**
       * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart
       * upload rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96181f958b31bd6a63d4a8ee15081defdbe84d97c678af7c257080b87eaa305b")
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit)

      /**
       * @param expirationDate Specifies the expiration for the lifecycle of the object by
       * specifying an expiry date.
       */
      public fun expirationDate(expirationDate: String)

      /**
       * @param expirationInDays Specifies the expiration for the lifecycle of the object in the
       * form of days that the object has been in the S3 on Outposts bucket.
       */
      public fun expirationInDays(expirationInDays: Number)

      /**
       * @param filter The container for the filter of the lifecycle rule.
       */
      public fun filter(filter: Any)

      /**
       * @param id the value to be set.
       */
      public fun id(id: String)

      /**
       * @param status If `Enabled` , the rule is currently being applied. 
       * If `Disabled` , the rule is not currently being applied.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty.Builder =
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty.builder()

      /**
       * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart
       * upload rule.
       */
      override fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart
       * upload rule.
       */
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(AbortIncompleteMultipartUploadProperty.Companion::unwrap))
      }

      /**
       * @param abortIncompleteMultipartUpload The container for the abort incomplete multipart
       * upload rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96181f958b31bd6a63d4a8ee15081defdbe84d97c678af7c257080b87eaa305b")
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit):
          Unit =
          abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty(abortIncompleteMultipartUpload))

      /**
       * @param expirationDate Specifies the expiration for the lifecycle of the object by
       * specifying an expiry date.
       */
      override fun expirationDate(expirationDate: String) {
        cdkBuilder.expirationDate(expirationDate)
      }

      /**
       * @param expirationInDays Specifies the expiration for the lifecycle of the object in the
       * form of days that the object has been in the S3 on Outposts bucket.
       */
      override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      /**
       * @param filter The container for the filter of the lifecycle rule.
       */
      override fun filter(filter: Any) {
        cdkBuilder.filter(filter)
      }

      /**
       * @param id the value to be set.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param status If `Enabled` , the rule is currently being applied. 
       * If `Disabled` , the rule is not currently being applied.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * The container for the abort incomplete multipart upload rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-abortincompletemultipartupload)
       */
      override fun abortIncompleteMultipartUpload(): Any? =
          unwrap(this).getAbortIncompleteMultipartUpload()

      /**
       * Specifies the expiration for the lifecycle of the object by specifying an expiry date.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-expirationdate)
       */
      override fun expirationDate(): String? = unwrap(this).getExpirationDate()

      /**
       * Specifies the expiration for the lifecycle of the object in the form of days that the
       * object has been in the S3 on Outposts bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-expirationindays)
       */
      override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      /**
       * The container for the filter of the lifecycle rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * If `Enabled` , the rule is currently being applied.
       *
       * If `Disabled` , the rule is not currently being applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-rule.html#cfn-s3outposts-bucket-rule-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3outposts.CfnBucket.RuleProperty
    }
  }
}
