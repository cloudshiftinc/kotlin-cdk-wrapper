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
public class CfnAlarmModelFirehosePropertyDsl {
    private val cdkBuilder: CfnAlarmModel.FirehoseProperty.Builder =
        CfnAlarmModel.FirehoseProperty.builder()

    public fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    public fun payload(payload: CfnAlarmModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    public fun separator(separator: String) {
        cdkBuilder.separator(separator)
    }

    public fun build(): CfnAlarmModel.FirehoseProperty = cdkBuilder.build()
}
