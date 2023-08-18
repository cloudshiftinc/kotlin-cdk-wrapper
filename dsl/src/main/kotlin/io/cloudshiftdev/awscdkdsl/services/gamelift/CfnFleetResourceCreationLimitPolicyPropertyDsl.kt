@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * A policy that limits the number of game sessions a player can create on the same fleet.
 *
 * This optional policy gives game owners control over how players can consume available game server
 * resources. A resource creation policy makes the following statement: "An individual player can
 * create a maximum number of new game sessions within a specified time period".
 *
 * The policy is evaluated when a player tries to create a new game session. For example, assume you
 * have a policy of 10 new game sessions and a time period of 60 minutes. On receiving a
 * `CreateGameSession` request, Amazon GameLift checks that the player (identified by `CreatorId` )
 * has created fewer than 10 game sessions in the past 60 minutes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * ResourceCreationLimitPolicyProperty resourceCreationLimitPolicyProperty =
 * ResourceCreationLimitPolicyProperty.builder()
 * .newGameSessionsPerCreator(123)
 * .policyPeriodInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html)
 */
@CdkDslMarker
public class CfnFleetResourceCreationLimitPolicyPropertyDsl {
    private val cdkBuilder: CfnFleet.ResourceCreationLimitPolicyProperty.Builder =
        CfnFleet.ResourceCreationLimitPolicyProperty.builder()

    /**
     * @param newGameSessionsPerCreator A policy that puts limits on the number of game sessions
     *   that a player can create within a specified span of time. With this policy, you can control
     *   players' ability to consume available resources.
     *
     * The policy is evaluated when a player tries to create a new game session. On receiving a
     * `CreateGameSession` request, Amazon GameLift checks that the player (identified by
     * `CreatorId` ) has created fewer than game session limit in the specified time period.
     */
    public fun newGameSessionsPerCreator(newGameSessionsPerCreator: Number) {
        cdkBuilder.newGameSessionsPerCreator(newGameSessionsPerCreator)
    }

    /**
     * @param policyPeriodInMinutes The time span used in evaluating the resource creation limit
     *   policy.
     */
    public fun policyPeriodInMinutes(policyPeriodInMinutes: Number) {
        cdkBuilder.policyPeriodInMinutes(policyPeriodInMinutes)
    }

    public fun build(): CfnFleet.ResourceCreationLimitPolicyProperty = cdkBuilder.build()
}
