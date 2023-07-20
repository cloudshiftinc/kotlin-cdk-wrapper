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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnInput
import kotlin.String

@CdkDslMarker
public class CfnInputMediaConnectFlowRequestPropertyDsl {
    private val cdkBuilder: CfnInput.MediaConnectFlowRequestProperty.Builder =
        CfnInput.MediaConnectFlowRequestProperty.builder()

    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    public fun build(): CfnInput.MediaConnectFlowRequestProperty = cdkBuilder.build()
}
