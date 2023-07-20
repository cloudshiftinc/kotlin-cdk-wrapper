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

  public fun dataLocationConstraint(dataLocationConstraint: String) {
    cdkBuilder.dataLocationConstraint(dataLocationConstraint)
  }

  public fun policy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policy(builder.map)
  }

  public fun policy(policy: Map<String, Any>) {
    cdkBuilder.policy(policy)
  }

  public fun policy(policy: IResolvable) {
    cdkBuilder.policy(policy)
  }

  public fun policyDescription(policyDescription: String) {
    cdkBuilder.policyDescription(policyDescription)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun tier(tier: String) {
    cdkBuilder.tier(tier)
  }

  public fun build(): CfnResiliencyPolicyProps = cdkBuilder.build()
}
