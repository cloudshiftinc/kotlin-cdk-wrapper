@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.amazon.awscdk.services.gamelift.CfnAliasProps

@CdkDslMarker
public class CfnAliasPropsDsl {
  private val cdkBuilder: CfnAliasProps.Builder = CfnAliasProps.builder()

  /**
   * @param description A human-readable description of the alias.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name A descriptive label that is associated with an alias. 
   * Alias names do not need to be unique.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param routingStrategy The routing configuration, including routing type and fleet target, for
   * the alias. 
   */
  public fun routingStrategy(routingStrategy: IResolvable) {
    cdkBuilder.routingStrategy(routingStrategy)
  }

  /**
   * @param routingStrategy The routing configuration, including routing type and fleet target, for
   * the alias. 
   */
  public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty) {
    cdkBuilder.routingStrategy(routingStrategy)
  }

  public fun build(): CfnAliasProps = cdkBuilder.build()
}
