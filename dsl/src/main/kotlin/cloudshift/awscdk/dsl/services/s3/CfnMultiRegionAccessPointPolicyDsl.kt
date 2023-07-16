@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnMultiRegionAccessPointPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMultiRegionAccessPointPolicy.Builder =
      CfnMultiRegionAccessPointPolicy.Builder.create(scope, id)

  public fun mrapName(mrapName: String) {
    cdkBuilder.mrapName(mrapName)
  }

  public fun policy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policy(builder.map)
  }

  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun build(): CfnMultiRegionAccessPointPolicy = cdkBuilder.build()
}
