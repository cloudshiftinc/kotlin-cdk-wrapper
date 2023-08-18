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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnEventStream

/**
 * Details regarding the Kinesis stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * DestinationDetailsProperty destinationDetailsProperty = DestinationDetailsProperty.builder()
 * .status("status")
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventstream-destinationdetails.html)
 */
@CdkDslMarker
public class CfnEventStreamDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnEventStream.DestinationDetailsProperty.Builder =
        CfnEventStream.DestinationDetailsProperty.builder()

    /** @param status The status of enabling the Kinesis stream as a destination for export. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param uri The StreamARN of the destination to deliver profile events to. For example,
     *   arn:aws:kinesis:region:account-id:stream/stream-name.
     */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnEventStream.DestinationDetailsProperty = cdkBuilder.build()
}
