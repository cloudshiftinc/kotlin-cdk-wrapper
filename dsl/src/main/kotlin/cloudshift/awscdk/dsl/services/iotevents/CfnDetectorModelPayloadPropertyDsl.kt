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
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import kotlin.String

@CdkDslMarker
public class CfnDetectorModelPayloadPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.PayloadProperty.Builder =
        CfnDetectorModel.PayloadProperty.builder()

    public fun contentExpression(contentExpression: String) {
        cdkBuilder.contentExpression(contentExpression)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDetectorModel.PayloadProperty = cdkBuilder.build()
}
