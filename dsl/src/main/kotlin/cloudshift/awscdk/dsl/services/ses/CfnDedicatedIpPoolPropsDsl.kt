@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps

@CdkDslMarker
public class CfnDedicatedIpPoolPropsDsl {
  private val cdkBuilder: CfnDedicatedIpPoolProps.Builder = CfnDedicatedIpPoolProps.builder()

  public fun poolName(poolName: String) {
    cdkBuilder.poolName(poolName)
  }

  public fun scalingMode(scalingMode: String) {
    cdkBuilder.scalingMode(scalingMode)
  }

  public fun build(): CfnDedicatedIpPoolProps = cdkBuilder.build()
}
