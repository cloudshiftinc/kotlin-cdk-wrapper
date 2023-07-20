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
import kotlin.Number

@CdkDslMarker
public class CfnDeliveryStreamBufferingHintsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.BufferingHintsProperty.Builder =
        CfnDeliveryStream.BufferingHintsProperty.builder()

    public fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
    }

    public fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
    }

    public fun build(): CfnDeliveryStream.BufferingHintsProperty = cdkBuilder.build()
}
