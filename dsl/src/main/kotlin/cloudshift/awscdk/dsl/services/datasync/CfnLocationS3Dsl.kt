@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationS3
import software.constructs.Construct

/**
 * The `AWS::DataSync::LocationS3` resource specifies an endpoint for an Amazon S3 bucket.
 *
 * For more information, see [Create an Amazon S3
 * location](https://docs.aws.amazon.com/datasync/latest/userguide/create-locations-cli.html#create-location-s3-cli)
 * in the *AWS DataSync User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
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
@CdkDslMarker
public class CfnLocationS3Dsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLocationS3.Builder = CfnLocationS3.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The ARN of the Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-s3bucketarn)
   * @param s3BucketArn The ARN of the Amazon S3 bucket. 
   */
  public fun s3BucketArn(s3BucketArn: String) {
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
   * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
   * role that is used to access an Amazon S3 bucket. 
   */
  public fun s3Config(s3Config: IResolvable) {
    cdkBuilder.s3Config(s3Config)
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
   * @param s3Config The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
   * role that is used to access an Amazon S3 bucket. 
   */
  public fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty) {
    cdkBuilder.s3Config(s3Config)
  }

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
   * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when
   * this location is used as a task destination. 
   */
  public fun s3StorageClass(s3StorageClass: String) {
    cdkBuilder.s3StorageClass(s3StorageClass)
  }

  /**
   * A subdirectory in the Amazon S3 bucket.
   *
   * This subdirectory in Amazon S3 is used to read data from the S3 source location or write data
   * to the S3 destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-subdirectory)
   * @param subdirectory A subdirectory in the Amazon S3 bucket. 
   */
  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  /**
   * The key-value pair that represents the tag that you want to add to the location.
   *
   * The value can be an empty string. We recommend using tags to name your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
   * @param tags The key-value pair that represents the tag that you want to add to the location. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The key-value pair that represents the tag that you want to add to the location.
   *
   * The value can be an empty string. We recommend using tags to name your resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locations3.html#cfn-datasync-locations3-tags)
   * @param tags The key-value pair that represents the tag that you want to add to the location. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationS3 {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
