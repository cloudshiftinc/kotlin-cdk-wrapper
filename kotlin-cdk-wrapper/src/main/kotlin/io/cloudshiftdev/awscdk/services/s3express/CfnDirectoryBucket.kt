@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::S3Express::DirectoryBucket` resource creates an Amazon S3 directory bucket in the same
 * AWS Region where you create the AWS CloudFormation stack.
 *
 * To control how AWS CloudFormation handles the bucket when the stack is deleted, you can set a
 * deletion policy for your bucket. You can choose to *retain* the bucket or to *delete* the bucket.
 * For more information, see [DeletionPolicy
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 *
 * You can only delete empty buckets. Deletion fails for buckets that have contents.
 *
 *
 * * **Permissions** - The required permissions for CloudFormation to use are based on the
 * operations that are performed on the stack.
 * * Create
 * * s3express:CreateBucket
 * * s3express:ListAllMyDirectoryBuckets
 * * Read
 * * s3express:ListAllMyDirectoryBuckets
 * * Delete
 * * s3express:DeleteBucket
 * * s3express:ListAllMyDirectoryBuckets
 * * List
 * * s3express:ListAllMyDirectoryBuckets
 *
 * The following operations are related to `AWS::S3Express::DirectoryBucket` :
 *
 * * [CreateBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html)
 * *
 * [ListDirectoryBuckets](https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListDirectoryBuckets.html)
 * * [DeleteBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3express.*;
 * CfnDirectoryBucket cfnDirectoryBucket = CfnDirectoryBucket.Builder.create(this,
 * "MyCfnDirectoryBucket")
 * .dataRedundancy("dataRedundancy")
 * .locationName("locationName")
 * // the properties below are optional
 * .bucketName("bucketName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html)
 */
public open class CfnDirectoryBucket internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDirectoryBucketProps,
  ) :
      this(software.amazon.awscdk.services.s3express.CfnDirectoryBucket(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDirectoryBucketProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDirectoryBucketProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDirectoryBucketProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the specified bucket.
   *
   * Example: `arn:aws:s3express: *us-west-2* : *account_id* :bucket/ *DOC-EXAMPLE-BUCKET* --
   * *usw2-az1* --x-s3`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A name for the bucket.
   */
  public open fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * A name for the bucket.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  /**
   * The number of Availability Zone that's used for redundancy for the bucket.
   */
  public open fun dataRedundancy(): String = unwrap(this).getDataRedundancy()

  /**
   * The number of Availability Zone that's used for redundancy for the bucket.
   */
  public open fun dataRedundancy(`value`: String) {
    unwrap(this).setDataRedundancy(`value`)
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
   * The name of the location where the bucket will be created.
   */
  public open fun locationName(): String = unwrap(this).getLocationName()

  /**
   * The name of the location where the bucket will be created.
   */
  public open fun locationName(`value`: String) {
    unwrap(this).setLocationName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3express.CfnDirectoryBucket].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param bucketName A name for the bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * The number of Availability Zone that's used for redundancy for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
     * @param dataRedundancy The number of Availability Zone that's used for redundancy for the
     * bucket. 
     */
    public fun dataRedundancy(dataRedundancy: String)

    /**
     * The name of the location where the bucket will be created.
     *
     * For directory buckets, the name of the location is the AZ ID of the Availability Zone where
     * the bucket will be created. An example AZ ID value is `usw2-az1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
     * @param locationName The name of the location where the bucket will be created. 
     */
    public fun locationName(locationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.Builder =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket.Builder.create(scope, id)

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
     * @param bucketName A name for the bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * The number of Availability Zone that's used for redundancy for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
     * @param dataRedundancy The number of Availability Zone that's used for redundancy for the
     * bucket. 
     */
    override fun dataRedundancy(dataRedundancy: String) {
      cdkBuilder.dataRedundancy(dataRedundancy)
    }

    /**
     * The name of the location where the bucket will be created.
     *
     * For directory buckets, the name of the location is the AZ ID of the Availability Zone where
     * the bucket will be created. An example AZ ID value is `usw2-az1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
     * @param locationName The name of the location where the bucket will be created. 
     */
    override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    public fun build(): software.amazon.awscdk.services.s3express.CfnDirectoryBucket =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectoryBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectoryBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket):
        CfnDirectoryBucket = CfnDirectoryBucket(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryBucket):
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket = wrapped.cdkObject
  }
}
