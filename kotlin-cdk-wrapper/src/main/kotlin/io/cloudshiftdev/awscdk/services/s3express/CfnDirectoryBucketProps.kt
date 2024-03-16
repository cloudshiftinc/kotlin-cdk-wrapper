@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDirectoryBucket`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3express.*;
 * CfnDirectoryBucketProps cfnDirectoryBucketProps = CfnDirectoryBucketProps.builder()
 * .dataRedundancy("dataRedundancy")
 * .locationName("locationName")
 * // the properties below are optional
 * .bucketName("bucketName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html)
 */
public interface CfnDirectoryBucketProps {
  /**
   * A name for the bucket.
   *
   * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
   * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
   * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*DOC-EXAMPLE-BUCKET* --
   * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
   * uses that ID for the bucket name. For information about bucket naming restrictions, see [Directory
   * bucket naming
   * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
   * in the *Amazon S3 User Guide* .
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you need to replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-bucketname)
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * The number of Availability Zone that's used for redundancy for the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
   */
  public fun dataRedundancy(): String

  /**
   * The name of the location where the bucket will be created.
   *
   * For directory buckets, the name of the location is the AZ ID of the Availability Zone where the
   * bucket will be created. An example AZ ID value is `usw2-az1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
   */
  public fun locationName(): String

  /**
   * A builder for [CfnDirectoryBucketProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName A name for the bucket.
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
     * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*DOC-EXAMPLE-BUCKET* --
     * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
     * uses that ID for the bucket name. For information about bucket naming restrictions, see
     * [Directory bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param dataRedundancy The number of Availability Zone that's used for redundancy for the
     * bucket. 
     */
    public fun dataRedundancy(dataRedundancy: String)

    /**
     * @param locationName The name of the location where the bucket will be created. 
     * For directory buckets, the name of the location is the AZ ID of the Availability Zone where
     * the bucket will be created. An example AZ ID value is `usw2-az1` .
     */
    public fun locationName(locationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps.Builder =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps.builder()

    /**
     * @param bucketName A name for the bucket.
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
     * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*DOC-EXAMPLE-BUCKET* --
     * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
     * uses that ID for the bucket name. For information about bucket naming restrictions, see
     * [Directory bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     * in the *Amazon S3 User Guide* .
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
     * @param dataRedundancy The number of Availability Zone that's used for redundancy for the
     * bucket. 
     */
    override fun dataRedundancy(dataRedundancy: String) {
      cdkBuilder.dataRedundancy(dataRedundancy)
    }

    /**
     * @param locationName The name of the location where the bucket will be created. 
     * For directory buckets, the name of the location is the AZ ID of the Availability Zone where
     * the bucket will be created. An example AZ ID value is `usw2-az1` .
     */
    override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    public fun build(): software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps,
  ) : CdkObject(cdkObject), CfnDirectoryBucketProps {
    /**
     * A name for the bucket.
     *
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow the
     * format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*DOC-EXAMPLE-BUCKET* --
     * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID and
     * uses that ID for the bucket name. For information about bucket naming restrictions, see
     * [Directory bucket naming
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-bucketname)
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The number of Availability Zone that's used for redundancy for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
     */
    override fun dataRedundancy(): String = unwrap(this).getDataRedundancy()

    /**
     * The name of the location where the bucket will be created.
     *
     * For directory buckets, the name of the location is the AZ ID of the Availability Zone where
     * the bucket will be created. An example AZ ID value is `usw2-az1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
     */
    override fun locationName(): String = unwrap(this).getLocationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDirectoryBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps):
        CfnDirectoryBucketProps = CdkObjectWrappers.wrap(cdkObject) as CfnDirectoryBucketProps

    internal fun unwrap(wrapped: CfnDirectoryBucketProps):
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps
  }
}
