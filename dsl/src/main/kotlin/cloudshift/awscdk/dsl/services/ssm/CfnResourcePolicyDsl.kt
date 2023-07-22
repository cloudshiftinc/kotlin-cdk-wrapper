@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnResourcePolicy
import software.constructs.Construct

/**
 * Creates or updates a Systems Manager resource policy.
 *
 * A resource policy helps you to define the IAM entity (for example, an AWS account ) that can
 * manage your Systems Manager resources. Currently, `OpsItemGroup` is the only resource that supports
 * Systems Manager resource policies. The resource policy for `OpsItemGroup` enables AWS accounts to
 * view and interact with OpsCenter operational work items (OpsItems). OpsCenter is a capability of
 * Systems Manager .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * Object policy;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

  /**
   * A policy you want to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
   * @param policy A policy you want to associate with a resource. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * A policy you want to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
   * @param policy A policy you want to associate with a resource. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-resourcearn)
   * @param resourceArn Amazon Resource Name (ARN) of the resource to which you want to attach a
   * policy. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
