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
public class CfnAlarmModelPayloadPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.PayloadProperty.Builder =
        CfnAlarmModel.PayloadProperty.builder()

    public fun contentExpression(contentExpression: String) {
        cdkBuilder.contentExpression(contentExpression)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAlarmModel.PayloadProperty = cdkBuilder.build()
}
