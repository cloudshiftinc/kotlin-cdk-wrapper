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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3express.CfnBucketPolicy
import software.amazon.awscdk.services.s3express.CfnBucketPolicyProps
import software.amazon.awscdk.services.s3express.CfnDirectoryBucket
import software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps
import software.constructs.Construct

public object s3express {
    /**
     * Applies an Amazon S3 bucket policy to an Amazon S3 directory bucket.
     * * **Permissions** - If you are using an identity other than the root user of the AWS account
     *   that owns the bucket, the calling identity must both have the required permissions on the
     *   specified bucket and belong to the bucket owner's account in order to use this operation.
     *   For more information about directory bucket policies and permissions, see
     *   [AWS Identity and Access Management (IAM) for S3 Express One Zone](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-security-iam.html)
     *   in the *Amazon S3 User Guide* .
     *
     * To ensure that bucket owners don't inadvertently lock themselves out of their own buckets,
     * the root principal in a bucket owner's AWS account can perform the `GetBucketPolicy` ,
     * `PutBucketPolicy` , and `DeleteBucketPolicy` API actions, even if their bucket policy
     * explicitly denies the root principal's access. Bucket owner root principals can only be
     * blocked from performing these API actions by VPC endpoint policies and AWS Organizations
     * policies.
     *
     * The required permissions for CloudFormation to use are based on the operations that are
     * performed on the stack.
     * * Create
     * * s3express:GetBucketPolicy
     * * s3express:PutBucketPolicy
     * * Read
     * * s3express:GetBucketPolicy
     * * Update
     * * s3express:GetBucketPolicy
     * * s3express:PutBucketPolicy
     * * Delete
     * * s3express:GetBucketPolicy
     * * s3express:DeleteBucketPolicy
     * * List
     * * s3express:GetBucketPolicy
     * * s3express:ListAllMyDirectoryBuckets
     *
     * For more information about example bucket policies, see
     * [Example bucket policies for S3 Express One Zone](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-security-iam-example-bucket-policies.html)
     * in the *Amazon S3 User Guide* .
     *
     * The following operations are related to `AWS::S3Express::BucketPolicy` :
     * * [PutBucketPolicy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketPolicy.html)
     * * [GetBucketPolicy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicy.html) * [DeleteBucketPolicy](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketPolicy.html) * [ListDirectoryBuckets](https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListDirectoryBuckets.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3express.*;
     * Object policyDocument;
     * CfnBucketPolicy cfnBucketPolicy = CfnBucketPolicy.Builder.create(this, "MyCfnBucketPolicy")
     * .bucket("bucket")
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html)
     */
    public inline fun cfnBucketPolicy(
        scope: Construct,
        id: String,
        block: CfnBucketPolicyDsl.() -> Unit = {},
    ): CfnBucketPolicy {
        val builder = CfnBucketPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBucketPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3express.*;
     * Object policyDocument;
     * CfnBucketPolicyProps cfnBucketPolicyProps = CfnBucketPolicyProps.builder()
     * .bucket("bucket")
     * .policyDocument(policyDocument)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html)
     */
    public inline fun cfnBucketPolicyProps(
        block: CfnBucketPolicyPropsDsl.() -> Unit = {}
    ): CfnBucketPolicyProps {
        val builder = CfnBucketPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::S3Express::DirectoryBucket` resource creates an Amazon S3 directory bucket in the
     * same AWS Region where you create the AWS CloudFormation stack.
     *
     * To control how AWS CloudFormation handles the bucket when the stack is deleted, you can set a
     * deletion policy for your bucket. You can choose to *retain* the bucket or to *delete* the
     * bucket. For more information, see
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
    public inline fun cfnDirectoryBucket(
        scope: Construct,
        id: String,
        block: CfnDirectoryBucketDsl.() -> Unit = {},
    ): CfnDirectoryBucket {
        val builder = CfnDirectoryBucketDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDirectoryBucket`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3express.*;
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
    public inline fun cfnDirectoryBucketProps(
        block: CfnDirectoryBucketPropsDsl.() -> Unit = {}
    ): CfnDirectoryBucketProps {
        val builder = CfnDirectoryBucketPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
