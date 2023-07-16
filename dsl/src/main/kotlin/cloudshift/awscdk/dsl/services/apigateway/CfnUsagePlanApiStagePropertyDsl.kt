@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

@CdkDslMarker
public class CfnUsagePlanApiStagePropertyDsl {
  private val cdkBuilder: CfnUsagePlan.ApiStageProperty.Builder =
      CfnUsagePlan.ApiStageProperty.builder()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  public fun throttle(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.throttle(builder.map)
  }

  public fun throttle(throttle: Map<String, *>) {
    cdkBuilder.throttle(throttle)
  }

  public fun throttle(throttle: IResolvable) {
    cdkBuilder.throttle(throttle)
  }

  public fun build(): CfnUsagePlan.ApiStageProperty = cdkBuilder.build()
}
