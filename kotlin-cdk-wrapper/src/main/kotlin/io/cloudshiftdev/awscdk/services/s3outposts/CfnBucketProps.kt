@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnBucket`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * Object filter;
 * CfnBucketProps cfnBucketProps = CfnBucketProps.builder()
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
public interface CfnBucketProps {
  /**
   * A name for the S3 on Outposts bucket.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for the
   * bucket name. The bucket name must contain only lowercase letters, numbers, periods (.), and dashes
   * (-) and must follow [Amazon S3 bucket restrictions and
   * limitations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html) . For
   * more information, see [Bucket naming
   * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html#bucketnamingrules)
   * .
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you need to replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-bucketname)
   */
  public fun bucketName(): String

  /**
   * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
   * lifecycle configuration.
   *
   * Outposts buckets only support lifecycle configurations that delete/expire objects after a
   * certain period of time and abort incomplete multipart uploads.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
   */
  public fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  /**
   * The ID of the Outpost of the specified bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-outpostid)
   */
  public fun outpostId(): String

  /**
   * Sets the tags for an S3 on Outposts bucket. For more information, see [Using Amazon S3 on
   * Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html) .
   *
   * Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to
   * get your AWS account bill with tag key values included. Then, to see the cost of combined
   * resources, organize your billing information according to resources with the same tag key values.
   * For example, you can tag several resources with a specific application name, and then organize
   * your billing information to see the total cost of that application across several services. For
   * more information, see [Cost allocation and
   * tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) .
   *
   *
   * Within a bucket, if you add a tag that has the same key as an existing tag, the new value
   * overwrites the old value. For more information, see [Using cost allocation and bucket
   * tags](https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html) .
   *
   *
   * To use this resource, you must have permissions to perform the `s3-outposts:PutBucketTagging` .
   * The S3 on Outposts bucket owner has this permission by default and can grant this permission to
   * others. For more information about permissions, see [Permissions Related to Bucket Subresource
   * Operations](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources)
   * and [Managing access permissions to your Amazon S3
   * resources](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnBucketProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName A name for the S3 on Outposts bucket. 
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
     */
    public fun bucketName(bucketName: String)

    /**
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration.
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    /**
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration.
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     */
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty)

    /**
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration.
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4f545cb10cb2f65ce997bc739e93d310721197aded2714f4ee46ed8da25f1c")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit)

    /**
     * @param outpostId The ID of the Outpost of the specified bucket. 
     */
    public fun outpostId(outpostId: String)

    /**
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * .
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * .
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
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucketProps.Builder =
        software.amazon.awscdk.services.s3outposts.CfnBucketProps.builder()

    /**
     * @param bucketName A name for the S3 on Outposts bucket. 
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
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration.
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration.
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     */
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(CfnBucket.LifecycleConfigurationProperty::unwrap))
    }

    /**
     * @param lifecycleConfiguration Creates a new lifecycle configuration for the S3 on Outposts
     * bucket or replaces an existing lifecycle configuration.
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4f545cb10cb2f65ce997bc739e93d310721197aded2714f4ee46ed8da25f1c")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleConfiguration(CfnBucket.LifecycleConfigurationProperty(lifecycleConfiguration))

    /**
     * @param outpostId The ID of the Outpost of the specified bucket. 
     */
    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    /**
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * .
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Sets the tags for an S3 on Outposts bucket. For more information, see [Using
     * Amazon S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html)
     * .
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketProps,
  ) : CdkObject(cdkObject), CfnBucketProps {
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
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing
     * lifecycle configuration.
     *
     * Outposts buckets only support lifecycle configurations that delete/expire objects after a
     * certain period of time and abort incomplete multipart uploads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-lifecycleconfiguration)
     */
    override fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

    /**
     * The ID of the Outpost of the specified bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucket.html#cfn-s3outposts-bucket-outpostid)
     */
    override fun outpostId(): String = unwrap(this).getOutpostId()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketProps):
        CfnBucketProps = CdkObjectWrappers.wrap(cdkObject) as CfnBucketProps

    internal fun unwrap(wrapped: CfnBucketProps):
        software.amazon.awscdk.services.s3outposts.CfnBucketProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3outposts.CfnBucketProps
  }
}
