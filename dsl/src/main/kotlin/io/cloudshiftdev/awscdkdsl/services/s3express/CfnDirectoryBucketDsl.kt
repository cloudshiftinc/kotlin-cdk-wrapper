@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3express

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3express.CfnDirectoryBucket
import software.constructs.Construct

/**
 * The `AWS::S3Express::DirectoryBucket` resource creates an Amazon S3 directory bucket in the same
 * AWS Region where you create the AWS CloudFormation stack.
 *
 * To control how AWS CloudFormation handles the bucket when the stack is deleted, you can set a
 * deletion policy for your bucket. You can choose to *retain* the bucket or to *delete* the bucket.
 * For more information, see
 * [DeletionPolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * You can only delete empty buckets. Deletion fails for buckets that have contents.
 * * **Permissions** - The required permissions for CloudFormation to use are based on the
 *   operations that are performed on the stack.
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
 * * [CreateBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html) * [ListDirectoryBuckets](https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListDirectoryBuckets.html)
 * * [DeleteBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3express.*;
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
@CdkDslMarker
public class CfnDirectoryBucketDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDirectoryBucket.Builder =
        CfnDirectoryBucket.Builder.create(scope, id)

    /**
     * A name for the bucket.
     *
     * The bucket name must contain only lowercase letters, numbers, and hyphens (-). A directory
     * bucket name must be unique in the chosen Availability Zone. The bucket name must also follow
     * the format `*bucket_base_name* -- *az_id* --x-s3` (for example, `*DOC-EXAMPLE-BUCKET* --
     * *usw2-az1* --x-s3` ). If you don't specify a name, AWS CloudFormation generates a unique ID
     * and uses that ID for the bucket name. For information about bucket naming restrictions, see
     * [Directory bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     * in the *Amazon S3 User Guide* .
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-bucketname)
     *
     * @param bucketName A name for the bucket.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * The number of Availability Zone that's used for redundancy for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-dataredundancy)
     *
     * @param dataRedundancy The number of Availability Zone that's used for redundancy for the
     *   bucket.
     */
    public fun dataRedundancy(dataRedundancy: String) {
        cdkBuilder.dataRedundancy(dataRedundancy)
    }

    /**
     * The name of the location where the bucket will be created.
     *
     * For directory buckets, the name of the location is the AZ ID of the Availability Zone where
     * the bucket will be created. An example AZ ID value is `usw2-az1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html#cfn-s3express-directorybucket-locationname)
     *
     * @param locationName The name of the location where the bucket will be created.
     */
    public fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
    }

    public fun build(): CfnDirectoryBucket = cdkBuilder.build()
}
