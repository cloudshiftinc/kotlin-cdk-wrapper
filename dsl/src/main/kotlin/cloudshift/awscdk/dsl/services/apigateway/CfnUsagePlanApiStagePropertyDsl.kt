@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

@CdkDslMarker
public class CfnUsagePlanApiStagePropertyDsl {
  private val cdkBuilder: CfnUsagePlan.ApiStageProperty.Builder =
      CfnUsagePlan.ApiStageProperty.builder()

  /**
   * @param apiId API Id of the associated API stage in a usage plan.
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param stage API stage name of the associated API stage in a usage plan.
   */
  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  /**
   * @param throttle Map containing method level throttling information for API stage in a usage
   * plan.
   */
  public fun throttle(throttle: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(throttle)
    cdkBuilder.throttle(builder.map)
  }

  /**
   * @param throttle Map containing method level throttling information for API stage in a usage
   * plan.
   */
  public fun throttle(throttle: Map<String, Any>) {
    cdkBuilder.throttle(throttle)
  }

  /**
   * @param throttle Map containing method level throttling information for API stage in a usage
   * plan.
   */
  public fun throttle(throttle: IResolvable) {
    cdkBuilder.throttle(throttle)
  }

  public fun build(): CfnUsagePlan.ApiStageProperty = cdkBuilder.build()
}
