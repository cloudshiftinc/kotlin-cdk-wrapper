@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnAuthPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAuthPolicy.Builder = CfnAuthPolicy.Builder.create(scope, id)

  public fun policy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policy(builder.map)
  }

  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun resourceIdentifier(resourceIdentifier: String) {
    cdkBuilder.resourceIdentifier(resourceIdentifier)
  }

  public fun build(): CfnAuthPolicy = cdkBuilder.build()
}
