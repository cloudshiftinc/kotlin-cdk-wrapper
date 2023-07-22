@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps

@CdkDslMarker
public class CfnResiliencyPolicyPropsDsl {
  private val cdkBuilder: CfnResiliencyPolicyProps.Builder = CfnResiliencyPolicyProps.builder()

  /**
   * @param dataLocationConstraint Specifies a high-level geographical location constraint for where
   * your resilience policy data can be stored.
   */
  public fun dataLocationConstraint(dataLocationConstraint: String) {
    cdkBuilder.dataLocationConstraint(dataLocationConstraint)
  }

  /**
   * @param policy The resiliency policy. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy The resiliency policy. 
   */
  public fun policy(policy: Map<String, Any>) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param policy The resiliency policy. 
   */
  public fun policy(policy: IResolvable) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param policyDescription The description for the policy.
   */
  public fun policyDescription(policyDescription: String) {
    cdkBuilder.policyDescription(policyDescription)
  }

  /**
   * @param policyName The name of the policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * @param tags The tags assigned to the resource.
   * A tag is a label that you assign to an AWS resource. Each tag consists of a key/value pair.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param tier The tier for this resiliency policy, ranging from the highest severity (
   * `MissionCritical` ) to lowest ( `NonCritical` ). 
   */
  public fun tier(tier: String) {
    cdkBuilder.tier(tier)
  }

  public fun build(): CfnResiliencyPolicyProps = cdkBuilder.build()
}
