@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnDedicatedIpPool
import software.constructs.Construct

@CdkDslMarker
public class CfnDedicatedIpPoolDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDedicatedIpPool.Builder = CfnDedicatedIpPool.Builder.create(scope, id)

  public fun poolName(poolName: String) {
    cdkBuilder.poolName(poolName)
  }

  public fun scalingMode(scalingMode: String) {
    cdkBuilder.scalingMode(scalingMode)
  }

  public fun build(): CfnDedicatedIpPool = cdkBuilder.build()
}
