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
import software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps

/**
 * Properties for defining a `CfnBucketPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * Object policyDocument;
 * CfnBucketPolicyProps cfnBucketPolicyProps = CfnBucketPolicyProps.builder()
 * .bucket("bucket")
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html)
 */
@CdkDslMarker
public class CfnBucketPolicyPropsDsl {
    private val cdkBuilder: CfnBucketPolicyProps.Builder = CfnBucketPolicyProps.builder()

    /** @param bucket The name of the Amazon S3 Outposts bucket to which the policy applies. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param policyDocument A policy document containing permissions to add to the specified
     *   bucket. In IAM, you must provide policy documents in JSON format. However, in
     *   CloudFormation, you can provide the policy in JSON or YAML format because CloudFormation
     *   converts YAML to JSON before submitting it to IAM. For more information, see the
     *   AWS::IAM::Policy
     *   [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     *   resource description in this guide and
     *   [Access Policy Language Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     *   .
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * @param policyDocument A policy document containing permissions to add to the specified
     *   bucket. In IAM, you must provide policy documents in JSON format. However, in
     *   CloudFormation, you can provide the policy in JSON or YAML format because CloudFormation
     *   converts YAML to JSON before submitting it to IAM. For more information, see the
     *   AWS::IAM::Policy
     *   [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     *   resource description in this guide and
     *   [Access Policy Language Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     *   .
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): CfnBucketPolicyProps = cdkBuilder.build()
}
