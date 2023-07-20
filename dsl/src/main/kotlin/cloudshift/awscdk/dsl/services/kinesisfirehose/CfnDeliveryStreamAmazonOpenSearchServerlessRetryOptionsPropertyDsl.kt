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
public class CfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.Builder =
        CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.builder()

    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun build(): CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty =
        cdkBuilder.build()
}
