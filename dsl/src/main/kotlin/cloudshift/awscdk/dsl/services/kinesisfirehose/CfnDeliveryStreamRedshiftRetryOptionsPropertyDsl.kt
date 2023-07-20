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
public class CfnDeliveryStreamRedshiftRetryOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.RedshiftRetryOptionsProperty.Builder =
        CfnDeliveryStream.RedshiftRetryOptionsProperty.builder()

    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun build(): CfnDeliveryStream.RedshiftRetryOptionsProperty = cdkBuilder.build()
}
