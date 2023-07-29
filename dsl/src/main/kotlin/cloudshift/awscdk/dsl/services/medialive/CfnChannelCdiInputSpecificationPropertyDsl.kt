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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The input specification for this channel.
 *
 * It specifies the key characteristics of CDI inputs for this channel, when those characteristics
 * are different from other inputs.
 *
 * This entity is at the top level in the channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CdiInputSpecificationProperty cdiInputSpecificationProperty =
 * CdiInputSpecificationProperty.builder()
 * .resolution("resolution")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-cdiinputspecification.html)
 */
@CdkDslMarker
public class CfnChannelCdiInputSpecificationPropertyDsl {
    private val cdkBuilder: CfnChannel.CdiInputSpecificationProperty.Builder =
        CfnChannel.CdiInputSpecificationProperty.builder()

    /** @param resolution Maximum CDI input resolution. */
    public fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
    }

    public fun build(): CfnChannel.CdiInputSpecificationProperty = cdkBuilder.build()
}
