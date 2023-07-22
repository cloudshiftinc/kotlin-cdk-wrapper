@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnFleet

@CdkDslMarker
public class CfnFleetResourceCreationLimitPolicyPropertyDsl {
  private val cdkBuilder: CfnFleet.ResourceCreationLimitPolicyProperty.Builder =
      CfnFleet.ResourceCreationLimitPolicyProperty.builder()

  /**
   * @param newGameSessionsPerCreator A policy that puts limits on the number of game sessions that
   * a player can create within a specified span of time.
   * With this policy, you can control players' ability to consume available resources.
   *
   * The policy is evaluated when a player tries to create a new game session. On receiving a
   * `CreateGameSession` request, Amazon GameLift checks that the player (identified by `CreatorId` )
   * has created fewer than game session limit in the specified time period.
   */
  public fun newGameSessionsPerCreator(newGameSessionsPerCreator: Number) {
    cdkBuilder.newGameSessionsPerCreator(newGameSessionsPerCreator)
  }

  /**
   * @param policyPeriodInMinutes The time span used in evaluating the resource creation limit
   * policy.
   */
  public fun policyPeriodInMinutes(policyPeriodInMinutes: Number) {
    cdkBuilder.policyPeriodInMinutes(policyPeriodInMinutes)
  }

  public fun build(): CfnFleet.ResourceCreationLimitPolicyProperty = cdkBuilder.build()
}
