@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationS3`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationS3Props cfnLocationS3Props = CfnLocationS3Props.builder()
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
public interface CfnLocationS3Props {
  /**
   * The ARN of the Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3bucketarn)
   */
  public fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

  /**
   * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
   * used to access an Amazon S3 bucket.
   *
   * For detailed information about using such a role, see [Creating a Location for Amazon
   * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
   * in the *AWS DataSync User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
   */
  public fun s3Config(): Any

  /**
   * The Amazon S3 storage class that you want to store your files in when this location is used as
   * a task destination.
   *
   * For buckets in AWS Regions , the storage class defaults to S3 Standard.
   *
   * For more information about S3 storage classes, see [Amazon S3 Storage
   * Classes](https://docs.aws.amazon.com/s3/storage-classes/) . Some storage classes have behaviors
   * that can affect your S3 storage costs. For detailed information, see [Considerations When Working
   * with Amazon S3 Storage Classes in
   * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
   * .
   *
   * Default: - "STANDARD"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3storageclass)
   */
  public fun s3StorageClass(): String? = unwrap(this).getS3StorageClass()

  /**
   * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether
   * the bucket is a source or destination location).
   *
   *
   * DataSync can't transfer objects with a prefix that begins with a slash ( `/` ) or includes `//`
   * , `/./` , or `/../` patterns. For example:
   *
   * * `/photos`
   * * `photos//2006/January`
   * * `photos/./2006/February`
   * * `photos/../2006/March`
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your transfer location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationS3Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3BucketArn The ARN of the Amazon S3 bucket.
     */
    public fun s3BucketArn(s3BucketArn: String)

    /**
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     */
    public fun s3Config(s3Config: IResolvable)

    /**
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     */
    public fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty)

    /**
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36602e23301e64e538ec5a634904ced4b1a4f34987befb7e2042011e2a054ce8")
    public fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty.Builder.() -> Unit)

    /**
     * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when
     * this location is used as a task destination.
     * For buckets in AWS Regions , the storage class defaults to S3 Standard.
     *
     * For more information about S3 storage classes, see [Amazon S3 Storage
     * Classes](https://docs.aws.amazon.com/s3/storage-classes/) . Some storage classes have behaviors
     * that can affect your S3 storage costs. For detailed information, see [Considerations When
     * Working with Amazon S3 Storage Classes in
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * .
     */
    public fun s3StorageClass(s3StorageClass: String)

    /**
     * @param subdirectory Specifies a prefix in the S3 bucket that DataSync reads from or writes to
     * (depending on whether the bucket is a source or destination location).
     *
     * DataSync can't transfer objects with a prefix that begins with a slash ( `/` ) or includes
     * `//` , `/./` , or `/../` patterns. For example:
     *
     * * `/photos`
     * * `photos//2006/January`
     * * `photos/./2006/February`
     * * `photos/../2006/March`
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationS3Props.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationS3Props.builder()

    /**
     * @param s3BucketArn The ARN of the Amazon S3 bucket.
     */
    override fun s3BucketArn(s3BucketArn: String) {
      cdkBuilder.s3BucketArn(s3BucketArn)
    }

    /**
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     */
    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
    }

    /**
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     */
    override fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(CfnLocationS3.S3ConfigProperty::unwrap))
    }

    /**
     * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that is used to access an Amazon S3 bucket. 
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36602e23301e64e538ec5a634904ced4b1a4f34987befb7e2042011e2a054ce8")
    override fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty.Builder.() -> Unit): Unit =
        s3Config(CfnLocationS3.S3ConfigProperty(s3Config))

    /**
     * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when
     * this location is used as a task destination.
     * For buckets in AWS Regions , the storage class defaults to S3 Standard.
     *
     * For more information about S3 storage classes, see [Amazon S3 Storage
     * Classes](https://docs.aws.amazon.com/s3/storage-classes/) . Some storage classes have behaviors
     * that can affect your S3 storage costs. For detailed information, see [Considerations When
     * Working with Amazon S3 Storage Classes in
     * DataSync](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * .
     */
    override fun s3StorageClass(s3StorageClass: String) {
      cdkBuilder.s3StorageClass(s3StorageClass)
    }

    /**
     * @param subdirectory Specifies a prefix in the S3 bucket that DataSync reads from or writes to
     * (depending on whether the bucket is a source or destination location).
     *
     * DataSync can't transfer objects with a prefix that begins with a slash ( `/` ) or includes
     * `//` , `/./` , or `/../` patterns. For example:
     *
     * * `/photos`
     * * `photos//2006/January`
     * * `photos/./2006/February`
     * * `photos/../2006/March`
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationS3Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3Props,
  ) : CdkObject(cdkObject), CfnLocationS3Props {
    /**
     * The ARN of the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3bucketarn)
     */
    override fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is
     * used to access an Amazon S3 bucket.
     *
     * For detailed information about using such a role, see [Creating a Location for Amazon
     * S3](https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location)
     * in the *AWS DataSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3config)
     */
    override fun s3Config(): Any = unwrap(this).getS3Config()

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
     */
    override fun s3StorageClass(): String? = unwrap(this).getS3StorageClass()

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
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationS3Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3Props):
        CfnLocationS3Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationS3Props):
        software.amazon.awscdk.services.datasync.CfnLocationS3Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationS3Props
  }
}
