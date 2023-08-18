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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

/**
 * Settings that apply only if the input is a push type of input.
 *
 * The parent of this entity is Input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputDestinationRequestProperty inputDestinationRequestProperty =
 * InputDestinationRequestProperty.builder()
 * .streamName("streamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html)
 */
@CdkDslMarker
public class CfnInputInputDestinationRequestPropertyDsl {
    private val cdkBuilder: CfnInput.InputDestinationRequestProperty.Builder =
        CfnInput.InputDestinationRequestProperty.builder()

    /**
     * @param streamName The stream name (application name/application instance) for the location
     *   the RTMP source content will be pushed to in MediaLive.
     */
    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): CfnInput.InputDestinationRequestProperty = cdkBuilder.build()
}
