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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * DocumentIdOptionsProperty documentIdOptionsProperty = DocumentIdOptionsProperty.builder()
 * .defaultDocumentIdFormat("defaultDocumentIdFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-documentidoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamDocumentIdOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.DocumentIdOptionsProperty.Builder =
        CfnDeliveryStream.DocumentIdOptionsProperty.builder()

    /** @param defaultDocumentIdFormat the value to be set. */
    public fun defaultDocumentIdFormat(defaultDocumentIdFormat: String) {
        cdkBuilder.defaultDocumentIdFormat(defaultDocumentIdFormat)
    }

    public fun build(): CfnDeliveryStream.DocumentIdOptionsProperty = cdkBuilder.build()
}
