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
   * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy.
   *
   * The following is the format of a resource ARN:
   * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   *
   * The following are requirements for the resource policy:
   *
   * * Contains only one action: cloudtrail-data:PutAuditEvents
   * * Contains at least one statement. The policy can have a maximum of 20 statements.
   * * Each statement contains at least one principal. A statement can have a maximum of 50
   * principals.
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
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
     * resource-based policy. 
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     * The following are requirements for the resource policy:
     *
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     * principals.
     */
    public fun resourcePolicy(resourcePolicy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
     * resource-based policy. 
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
     * The following are requirements for the resource policy:
     *
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     * principals.
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
     * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based
     * policy.
     *
     * The following is the format of a resource ARN:
     * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * The following are requirements for the resource policy:
     *
     * * Contains only one action: cloudtrail-data:PutAuditEvents
     * * Contains at least one statement. The policy can have a maximum of 20 statements.
     * * Each statement contains at least one principal. A statement can have a maximum of 50
     * principals.
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
