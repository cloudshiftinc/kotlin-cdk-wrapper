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
public class CfnDeliveryStreamElasticsearchBufferingHintsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder =
        CfnDeliveryStream.ElasticsearchBufferingHintsProperty.builder()

    public fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
    }

    public fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
    }

    public fun build(): CfnDeliveryStream.ElasticsearchBufferingHintsProperty = cdkBuilder.build()
}
