@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnBucketPolicy`.
 *
 * Example:
 *
 * ```
 * String bucketName = "my-favorite-bucket-name";
 * Bucket accessLogsBucket = Bucket.Builder.create(this, "AccessLogsBucket")
 * .objectOwnership(ObjectOwnership.BUCKET_OWNER_ENFORCED)
 * .bucketName(bucketName)
 * .build();
 * // Creating a bucket policy using L1
 * CfnBucketPolicy bucketPolicy = CfnBucketPolicy.Builder.create(this, "BucketPolicy")
 * .bucket(bucketName)
 * .policyDocument(Map.of(
 * "Statement", List.of(Map.of(
 * "Action", "s3:*",
 * "Effect", "Deny",
 * "Principal", Map.of(
 * "AWS", "*"),
 * "Resource", List.of(accessLogsBucket.getBucketArn(), String.format("%s/ *",
 * accessLogsBucket.getBucketArn())))),
 * "Version", "2012-10-17"))
 * .build();
 * // 'serverAccessLogsBucket' will create a new L2 bucket policy
 * // to allow log delivery and overwrite the L1 bucket policy.
 * Bucket bucket = Bucket.Builder.create(this, "MyBucket")
 * .serverAccessLogsBucket(accessLogsBucket)
 * .serverAccessLogsPrefix("logs")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html)
 */
public interface CfnBucketPolicyProps {
  /**
   * The name of the Amazon S3 bucket to which the policy applies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html#cfn-s3-bucketpolicy-bucket)
   */
  public fun bucket(): String

  /**
   * A policy document containing permissions to add to the specified bucket.
   *
   * In IAM, you must provide policy documents in JSON format. However, in CloudFormation you can
   * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
   * submitting it to IAM. For more information, see the AWS::IAM::Policy
   * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
   * resource description in this guide and [Access Policy Language
   * Overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html) in
   * the *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html#cfn-s3-bucketpolicy-policydocument)
   */
  public fun policyDocument(): Any

  /**
   * A builder for [CfnBucketPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The name of the Amazon S3 bucket to which the policy applies. 
     */
    public fun bucket(bucket: String)

    /**
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html)
     * in the *Amazon S3 User Guide* .
     */
    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucketPolicyProps.Builder =
        software.amazon.awscdk.services.s3.CfnBucketPolicyProps.builder()

    /**
     * @param bucket The name of the Amazon S3 bucket to which the policy applies. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html)
     * in the *Amazon S3 User Guide* .
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnBucketPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.CfnBucketPolicyProps,
  ) : CdkObject(cdkObject),
      CfnBucketPolicyProps {
    /**
     * The name of the Amazon S3 bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html#cfn-s3-bucketpolicy-bucket)
     */
    override fun bucket(): String = unwrap(this).getBucket()

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html#cfn-s3-bucketpolicy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucketPolicyProps):
        CfnBucketPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBucketPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBucketPolicyProps):
        software.amazon.awscdk.services.s3.CfnBucketPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3.CfnBucketPolicyProps
  }
}
