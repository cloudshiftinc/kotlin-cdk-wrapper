@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * Object resourcePolicy;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .resourceArn("resourceArn")
 * .resourcePolicy(resourcePolicy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html)
 */
public interface CfnResourcePolicyProps {
  /**
   * The Amazon Resource Name (ARN) of the CloudTrail event data store, dashboard, or channel
   * attached to the resource-based policy.
   *
   * Example event data store ARN format:
   * `arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE`
   *
   * Example dashboard ARN format: `arn:aws:cloudtrail:us-east-1:123456789012:dashboard/exampleDash`
   *
   * Example channel ARN format: `arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   *
   * For example resource-based policies, see [CloudTrail resource-based policy
   * examples](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html)
   * in the *CloudTrail User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
   */
  public fun resourcePolicy(): Any

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail event data store,
     * dashboard, or channel attached to the resource-based policy. 
     * Example event data store ARN format:
     * `arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE`
     *
     * Example dashboard ARN format:
     * `arn:aws:cloudtrail:us-east-1:123456789012:dashboard/exampleDash`
     *
     * Example channel ARN format: `arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890`
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     * For example resource-based policies, see [CloudTrail resource-based policy
     * examples](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html)
     * in the *CloudTrail User Guide* .
     */
    public fun resourcePolicy(resourcePolicy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail event data store,
     * dashboard, or channel attached to the resource-based policy. 
     * Example event data store ARN format:
     * `arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE`
     *
     * Example dashboard ARN format:
     * `arn:aws:cloudtrail:us-east-1:123456789012:dashboard/exampleDash`
     *
     * Example channel ARN format: `arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890`
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     * For example resource-based policies, see [CloudTrail resource-based policy
     * examples](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html)
     * in the *CloudTrail User Guide* .
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject),
      CfnResourcePolicyProps {
    /**
     * The Amazon Resource Name (ARN) of the CloudTrail event data store, dashboard, or channel
     * attached to the resource-based policy.
     *
     * Example event data store ARN format:
     * `arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE`
     *
     * Example dashboard ARN format:
     * `arn:aws:cloudtrail:us-east-1:123456789012:dashboard/exampleDash`
     *
     * Example channel ARN format: `arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * For example resource-based policies, see [CloudTrail resource-based policy
     * examples](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html)
     * in the *CloudTrail User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
     */
    override fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps):
        CfnResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourcePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps
  }
}
