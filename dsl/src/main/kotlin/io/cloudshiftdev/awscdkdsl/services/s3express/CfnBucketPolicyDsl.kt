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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3express.CfnBucketPolicy
import software.constructs.Construct

/**
 * Applies an Amazon S3 bucket policy to an Amazon S3 directory bucket.
 * * **Permissions** - If you are using an identity other than the root user of the AWS account that
 *   owns the bucket, the calling identity must both have the required permissions on the specified
 *   bucket and belong to the bucket owner's account in order to use this operation. For more
 *   information about directory bucket policies and permissions, see
 *   [AWS Identity and Access Management (IAM) for S3 Express One Zone](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-express-security-iam.html)
 *   in the *Amazon S3 User Guide* .
 *
 * To ensure that bucket owners don't inadvertently lock themselves out of their own buckets, the
 * root principal in a bucket owner's AWS account can perform the `GetBucketPolicy` ,
 * `PutBucketPolicy` , and `DeleteBucketPolicy` API actions, even if their bucket policy explicitly
 * denies the root principal's access. Bucket owner root principals can only be blocked from
 * performing these API actions by VPC endpoint policies and AWS Organizations policies.
 *
 * The required permissions for CloudFormation to use are based on the operations that are performed
 * on the stack.
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
@CdkDslMarker
public class CfnBucketPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBucketPolicy.Builder = CfnBucketPolicy.Builder.create(scope, id)

    /**
     * The name of the S3 directory bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html#cfn-s3express-bucketpolicy-bucket)
     *
     * @param bucket The name of the S3 directory bucket to which the policy applies.
     */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and
     * [Policies and Permissions in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html#cfn-s3express-bucketpolicy-policydocument)
     *
     * @param policyDocument A policy document containing permissions to add to the specified
     *   bucket.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and
     * [Policies and Permissions in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html#cfn-s3express-bucketpolicy-policydocument)
     *
     * @param policyDocument A policy document containing permissions to add to the specified
     *   bucket.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): CfnBucketPolicy = cdkBuilder.build()
}
