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

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudtrail.CfnChannel

/**
 * Contains information about the destination receiving events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * DestinationProperty destinationProperty = DestinationProperty.builder()
 * .location("location")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-channel-destination.html)
 */
@CdkDslMarker
public class CfnChannelDestinationPropertyDsl {
    private val cdkBuilder: CfnChannel.DestinationProperty.Builder =
        CfnChannel.DestinationProperty.builder()

    /**
     * @param location For channels used for a CloudTrail Lake integration, the location is the ARN
     *   of an event data store that receives events from a channel. For service-linked channels,
     *   the location is the name of the AWS service.
     */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /**
     * @param type The type of destination for events arriving from a channel. For channels used for
     *   a CloudTrail Lake integration, the value is `EventDataStore` . For service-linked channels,
     *   the value is `AWS_SERVICE` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnChannel.DestinationProperty = cdkBuilder.build()
}
