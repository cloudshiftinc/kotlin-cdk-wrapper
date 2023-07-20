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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import kotlin.String

@CdkDslMarker
public class CfnAlarmModelSnsPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.SnsProperty.Builder = CfnAlarmModel.SnsProperty.builder()

    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    public fun payload(payload: CfnAlarmModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnAlarmModel.SnsProperty = cdkBuilder.build()
}
