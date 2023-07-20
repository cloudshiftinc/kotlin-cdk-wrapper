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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import kotlin.String

@CdkDslMarker
public class CfnAlarmModelSimpleRulePropertyDsl {
    private val cdkBuilder: CfnAlarmModel.SimpleRuleProperty.Builder =
        CfnAlarmModel.SimpleRuleProperty.builder()

    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun inputProperty(inputProperty: String) {
        cdkBuilder.inputProperty(inputProperty)
    }

    public fun threshold(threshold: String) {
        cdkBuilder.threshold(threshold)
    }

    public fun build(): CfnAlarmModel.SimpleRuleProperty = cdkBuilder.build()
}
