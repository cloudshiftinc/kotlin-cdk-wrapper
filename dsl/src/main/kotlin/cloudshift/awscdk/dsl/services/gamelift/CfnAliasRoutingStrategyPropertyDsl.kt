@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnAlias

@CdkDslMarker
public class CfnAliasRoutingStrategyPropertyDsl {
  private val cdkBuilder: CfnAlias.RoutingStrategyProperty.Builder =
      CfnAlias.RoutingStrategyProperty.builder()

  public fun fleetId(fleetId: String) {
    cdkBuilder.fleetId(fleetId)
  }

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAlias.RoutingStrategyProperty = cdkBuilder.build()
}
