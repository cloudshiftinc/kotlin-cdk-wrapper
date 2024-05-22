@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

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
 * This resource applies a bucket policy to an Amazon S3 on Outposts bucket.
 *
 * If you are using an identity other than the root user of the AWS account that owns the S3 on
 * Outposts bucket, the calling identity must have the `s3-outposts:PutBucketPolicy` permissions on the
 * specified Outposts bucket and belong to the bucket owner's account in order to use this resource.
 *
 * If you don't have `s3-outposts:PutBucketPolicy` permissions, S3 on Outposts returns a `403 Access
 * Denied` error.
 *
 *
 * The root user of the AWS account that owns an Outposts bucket can *always* use this resource,
 * even if the policy explicitly denies the root user the ability to perform actions on this resource.
 *
 *
 * For more information, see the AWS::IAM::Policy
 * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
 * resource description in this guide and [Access Policy Language
 * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * Object policyDocument;
 * CfnBucketPolicy cfnBucketPolicy = CfnBucketPolicy.Builder.create(this, "MyCfnBucketPolicy")
 * .bucket("bucket")
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html)
 */
public open class CfnBucketPolicy(
  cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketPolicyProps,
  ) :
      this(software.amazon.awscdk.services.s3outposts.CfnBucketPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBucketPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBucketPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBucketPolicyProps(props)
  )

  /**
   * The name of the Amazon S3 Outposts bucket to which the policy applies.
   */
  public open fun bucket(): String = unwrap(this).getBucket()

  /**
   * The name of the Amazon S3 Outposts bucket to which the policy applies.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3outposts.CfnBucketPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Amazon S3 Outposts bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-bucket)
     * @param bucket The name of the Amazon S3 Outposts bucket to which the policy applies. 
     */
    public fun bucket(bucket: String)

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-policydocument)
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     */
    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucketPolicy.Builder =
        software.amazon.awscdk.services.s3outposts.CfnBucketPolicy.Builder.create(scope, id)

    /**
     * The name of the Amazon S3 Outposts bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-bucket)
     * @param bucket The name of the Amazon S3 Outposts bucket to which the policy applies. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-policydocument)
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucketPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3outposts.CfnBucketPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucketPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucketPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketPolicy):
        CfnBucketPolicy = CfnBucketPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnBucketPolicy):
        software.amazon.awscdk.services.s3outposts.CfnBucketPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.s3outposts.CfnBucketPolicy
  }
}
