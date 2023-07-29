@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * AmazonOpenSearchServerlessBufferingHintsProperty amazonOpenSearchServerlessBufferingHintsProperty
 * = AmazonOpenSearchServerlessBufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessbufferinghints.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsPropertyDsl {
    private val cdkBuilder:
        CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.Builder =
        CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.builder()

    /** @param intervalInSeconds the value to be set. */
    public fun intervalInSeconds(intervalInSeconds: Number) {
        cdkBuilder.intervalInSeconds(intervalInSeconds)
    }

    /** @param sizeInMBs the value to be set. */
    public fun sizeInMBs(sizeInMBs: Number) {
        cdkBuilder.sizeInMBs(sizeInMBs)
    }

    public fun build(): CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty =
        cdkBuilder.build()
}
