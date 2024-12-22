@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Applies an Amazon S3 bucket policy to an Amazon S3 bucket.
 *
 * If you are using an identity other than the root user of the AWS account that owns the bucket,
 * the calling identity must have the `PutBucketPolicy` permissions on the specified bucket and belong
 * to the bucket owner's account in order to use this operation.
 *
 * If you don't have `PutBucketPolicy` permissions, Amazon S3 returns a `403 Access Denied` error.
 * If you have the correct permissions, but you're not using an identity that belongs to the bucket
 * owner's account, Amazon S3 returns a `405 Method Not Allowed` error.
 *
 *
 * As a security precaution, the root user of the AWS account that owns a bucket can always use this
 * operation, even if the policy explicitly denies the root user the ability to perform this action.
 *
 *
 * For more information, see [Bucket policy
 * examples](https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html) .
 *
 * The following operations are related to `PutBucketPolicy` :
 *
 * * [CreateBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html)
 * * [DeleteBucket](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html)
 *
 * Example:
 *
 * ```
 * String bucketName = "amzn-s3-demo-bucket";
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
public open class CfnBucketPolicy(
  cdkObject: software.amazon.awscdk.services.s3.CfnBucketPolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketPolicyProps,
  ) :
      this(software.amazon.awscdk.services.s3.CfnBucketPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBucketPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBucketPolicyProps(props)
  )

  /**
   * The name of the Amazon S3 bucket to which the policy applies.
   */
  public open fun bucket(): String = unwrap(this).getBucket()

  /**
   * The name of the Amazon S3 bucket to which the policy applies.
   */
  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A policy document containing permissions to add to the specified bucket.
   */
  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  /**
   * A policy document containing permissions to add to the specified bucket.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnBucketPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Amazon S3 bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html#cfn-s3-bucketpolicy-bucket)
     * @param bucket The name of the Amazon S3 bucket to which the policy applies. 
     */
    public fun bucket(bucket: String)

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
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     */
    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucketPolicy.Builder =
        software.amazon.awscdk.services.s3.CfnBucketPolicy.Builder.create(scope, id)

    /**
     * The name of the Amazon S3 bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucketpolicy.html#cfn-s3-bucketpolicy-bucket)
     * @param bucket The name of the Amazon S3 bucket to which the policy applies. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

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
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnBucketPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnBucketPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucketPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucketPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucketPolicy):
        CfnBucketPolicy = CfnBucketPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnBucketPolicy):
        software.amazon.awscdk.services.s3.CfnBucketPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.s3.CfnBucketPolicy
  }
}
