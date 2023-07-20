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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.String

@CdkDslMarker
public class CfnDeliveryStreamProcessorParameterPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ProcessorParameterProperty.Builder =
        CfnDeliveryStream.ProcessorParameterProperty.builder()

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnDeliveryStream.ProcessorParameterProperty = cdkBuilder.build()
}
