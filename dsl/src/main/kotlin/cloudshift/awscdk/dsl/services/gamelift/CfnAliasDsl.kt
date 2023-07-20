@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.constructs.Construct

@CdkDslMarker
public class CfnAliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlias.Builder = CfnAlias.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun routingStrategy(routingStrategy: IResolvable) {
    cdkBuilder.routingStrategy(routingStrategy)
  }

  public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty) {
    cdkBuilder.routingStrategy(routingStrategy)
  }

  public fun build(): CfnAlias = cdkBuilder.build()
}
