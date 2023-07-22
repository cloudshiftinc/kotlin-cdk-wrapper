@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.constructs.Construct

/**
 * Creates or updates the auth policy.
 *
 * The policy string in JSON must not contain newlines or blank lines.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * Object policy;
 * CfnAuthPolicy cfnAuthPolicy = CfnAuthPolicy.Builder.create(this, "MyCfnAuthPolicy")
 * .policy(policy)
 * .resourceIdentifier("resourceIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html)
 */
@CdkDslMarker
public class CfnAuthPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAuthPolicy.Builder = CfnAuthPolicy.Builder.create(scope, id)

  /**
   * The auth policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-policy)
   * @param policy The auth policy. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * The auth policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-policy)
   * @param policy The auth policy. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is
   * created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-resourceidentifier)
   * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
   * service for which the policy is created. 
   */
  public fun resourceIdentifier(resourceIdentifier: String) {
    cdkBuilder.resourceIdentifier(resourceIdentifier)
  }

  public fun build(): CfnAuthPolicy = cdkBuilder.build()
}
