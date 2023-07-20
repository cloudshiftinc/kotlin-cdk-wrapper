@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnRegistryPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRegistryPolicy.Builder = CfnRegistryPolicy.Builder.create(scope, id)

  public fun policy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policy(builder.map)
  }

  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  public fun revisionId(revisionId: String) {
    cdkBuilder.revisionId(revisionId)
  }

  public fun build(): CfnRegistryPolicy = cdkBuilder.build()
}
