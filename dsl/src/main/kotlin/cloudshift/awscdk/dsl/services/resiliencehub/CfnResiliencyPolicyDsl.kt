@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnResiliencyPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResiliencyPolicy.Builder = CfnResiliencyPolicy.Builder.create(scope,
      id)

  public fun dataLocationConstraint(dataLocationConstraint: String) {
    cdkBuilder.dataLocationConstraint(dataLocationConstraint)
  }

  public fun policy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policy(builder.map)
  }

  public fun policy(policy: Map<String, *>) {
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

  public fun build(): CfnResiliencyPolicy = cdkBuilder.build()
}
