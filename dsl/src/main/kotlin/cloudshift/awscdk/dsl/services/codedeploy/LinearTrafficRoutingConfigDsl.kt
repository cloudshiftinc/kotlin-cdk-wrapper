@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig

@CdkDslMarker
public class LinearTrafficRoutingConfigDsl {
  private val cdkBuilder: LinearTrafficRoutingConfig.Builder = LinearTrafficRoutingConfig.builder()

  public fun linearInterval(linearInterval: Number) {
    cdkBuilder.linearInterval(linearInterval)
  }

  public fun linearPercentage(linearPercentage: Number) {
    cdkBuilder.linearPercentage(linearPercentage)
  }

  public fun build(): LinearTrafficRoutingConfig = cdkBuilder.build()
}
