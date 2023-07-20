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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanActionPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.ActionProperty.Builder =
        CfnResponsePlan.ActionProperty.builder()

    public fun ssmAutomation(ssmAutomation: IResolvable) {
        cdkBuilder.ssmAutomation(ssmAutomation)
    }

    public fun ssmAutomation(ssmAutomation: CfnResponsePlan.SsmAutomationProperty) {
        cdkBuilder.ssmAutomation(ssmAutomation)
    }

    public fun build(): CfnResponsePlan.ActionProperty = cdkBuilder.build()
}
