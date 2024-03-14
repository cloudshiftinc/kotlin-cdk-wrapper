package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBucketPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3express.CfnBucketPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of the S3 directory bucket to which the policy applies.
   */
  public open fun bucket(): String = unwrap(this).getBucket()

  /**
   * The name of the S3 directory bucket to which the policy applies.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3express.CfnBucketPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the S3 directory bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html#cfn-s3express-bucketpolicy-bucket)
     * @param bucket The name of the S3 directory bucket to which the policy applies. 
     */
    public fun bucket(bucket: String)

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Policies and Permissions in Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html#cfn-s3express-bucketpolicy-policydocument)
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     */
    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3express.CfnBucketPolicy.Builder =
        software.amazon.awscdk.services.s3express.CfnBucketPolicy.Builder.create(scope, id)

    /**
     * The name of the S3 directory bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html#cfn-s3express-bucketpolicy-bucket)
     * @param bucket The name of the S3 directory bucket to which the policy applies. 
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
     * resource description in this guide and [Policies and Permissions in Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-bucketpolicy.html#cfn-s3express-bucketpolicy-policydocument)
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3express.CfnBucketPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucketPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucketPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnBucketPolicy):
        CfnBucketPolicy = CfnBucketPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnBucketPolicy):
        software.amazon.awscdk.services.s3express.CfnBucketPolicy = wrapped.cdkObject
  }
}