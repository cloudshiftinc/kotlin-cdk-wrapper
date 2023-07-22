@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnRole

/**
 * Contains information about an attached policy.
 *
 * An attached policy is a managed policy that has been attached to a user, group, or role.
 *
 * For more information about managed policies, refer to [Managed Policies and Inline
 * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in the
 * *IAM User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * Object policyDocument;
 * PolicyProperty policyProperty = PolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-role-policy.html)
 */
@CdkDslMarker
public class CfnRolePolicyPropertyDsl {
  private val cdkBuilder: CfnRole.PolicyProperty.Builder = CfnRole.PolicyProperty.builder()

  /**
   * @param policyDocument The entire contents of the policy that defines permissions. 
   * For more information, see [Overview of JSON
   * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
   * .
   */
  public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policyDocument)
    cdkBuilder.policyDocument(builder.map)
  }

  /**
   * @param policyDocument The entire contents of the policy that defines permissions. 
   * For more information, see [Overview of JSON
   * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
   * .
   */
  public fun policyDocument(policyDocument: Any) {
    cdkBuilder.policyDocument(policyDocument)
  }

  /**
   * @param policyName The friendly name (not ARN) identifying the policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun build(): CfnRole.PolicyProperty = cdkBuilder.build()
}
