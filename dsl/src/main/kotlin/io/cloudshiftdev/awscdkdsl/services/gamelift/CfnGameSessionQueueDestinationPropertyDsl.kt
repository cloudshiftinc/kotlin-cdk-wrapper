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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * DestinationProperty destinationProperty = DestinationProperty.builder()
 * .destinationArn("destinationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html)
 */
@CdkDslMarker
public class CfnGameSessionQueueDestinationPropertyDsl {
    private val cdkBuilder: CfnGameSessionQueue.DestinationProperty.Builder =
        CfnGameSessionQueue.DestinationProperty.builder()

    /** @param destinationArn the value to be set. */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun build(): CfnGameSessionQueue.DestinationProperty = cdkBuilder.build()
}
