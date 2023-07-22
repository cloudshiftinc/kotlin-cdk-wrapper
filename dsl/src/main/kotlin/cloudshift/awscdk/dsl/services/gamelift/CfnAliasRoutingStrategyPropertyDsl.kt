@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnAlias

@CdkDslMarker
public class CfnAliasRoutingStrategyPropertyDsl {
  private val cdkBuilder: CfnAlias.RoutingStrategyProperty.Builder =
      CfnAlias.RoutingStrategyProperty.builder()

  /**
   * @param fleetId A unique identifier for a fleet that the alias points to.
   * If you specify `SIMPLE` for the `Type` property, you must specify this property.
   */
  public fun fleetId(fleetId: String) {
    cdkBuilder.fleetId(fleetId)
  }

  /**
   * @param message The message text to be used with a terminal routing strategy.
   * If you specify `TERMINAL` for the `Type` property, you must specify this property.
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  /**
   * @param type A type of routing strategy. 
   * Possible routing types include the following:
   *
   * * *SIMPLE* - The alias resolves to one specific fleet. Use this type when routing to active
   * fleets.
   * * *TERMINAL* - The alias does not resolve to a fleet but instead can be used to display a
   * message to the user. A terminal alias throws a `TerminalRoutingStrategyException` with the message
   * that you specified in the `Message` property.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAlias.RoutingStrategyProperty = cdkBuilder.build()
}
