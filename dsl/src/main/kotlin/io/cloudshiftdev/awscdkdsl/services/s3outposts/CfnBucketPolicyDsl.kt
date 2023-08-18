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

package io.cloudshiftdev.awscdkdsl.services.s3outposts

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicy
import software.constructs.Construct

/**
 * This resource applies a bucket policy to an Amazon S3 on Outposts bucket.
 *
 * If you are using an identity other than the root user of the AWS account that owns the S3 on
 * Outposts bucket, the calling identity must have the `s3-outposts:PutBucketPolicy` permissions on
 * the specified Outposts bucket and belong to the bucket owner's account in order to use this
 * resource.
 *
 * If you don't have `s3-outposts:PutBucketPolicy` permissions, S3 on Outposts returns a `403 Access
 * Denied` error.
 *
 * The root user of the AWS account that owns an Outposts bucket can *always* use this resource,
 * even if the policy explicitly denies the root user the ability to perform actions on this
 * resource.
 *
 * For more information, see the AWS::IAM::Policy
 * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
 * resource description in this guide and
 * [Access Policy Language Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * Object policyDocument;
 * CfnBucketPolicy cfnBucketPolicy = CfnBucketPolicy.Builder.create(this, "MyCfnBucketPolicy")
 * .bucket("bucket")
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html)
 */
@CdkDslMarker
public class CfnBucketPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBucketPolicy.Builder = CfnBucketPolicy.Builder.create(scope, id)

    /**
     * The name of the Amazon S3 Outposts bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-bucket)
     *
     * @param bucket The name of the Amazon S3 Outposts bucket to which the policy applies.
     */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and
     * [Access Policy Language Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-policydocument)
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
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and
     * [Access Policy Language Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-policydocument)
     *
     * @param policyDocument A policy document containing permissions to add to the specified
     *   bucket.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): CfnBucketPolicy = cdkBuilder.build()
}
