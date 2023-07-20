@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.gamelift.CfnFleet
import kotlin.Number

@CdkDslMarker
public class CfnFleetResourceCreationLimitPolicyPropertyDsl {
    private val cdkBuilder: CfnFleet.ResourceCreationLimitPolicyProperty.Builder =
        CfnFleet.ResourceCreationLimitPolicyProperty.builder()

    public fun newGameSessionsPerCreator(newGameSessionsPerCreator: Number) {
        cdkBuilder.newGameSessionsPerCreator(newGameSessionsPerCreator)
    }

    public fun policyPeriodInMinutes(policyPeriodInMinutes: Number) {
        cdkBuilder.policyPeriodInMinutes(policyPeriodInMinutes)
    }

    public fun build(): CfnFleet.ResourceCreationLimitPolicyProperty = cdkBuilder.build()
}
