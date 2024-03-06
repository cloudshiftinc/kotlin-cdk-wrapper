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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ThumbnailConfigurationProperty thumbnailConfigurationProperty =
 * ThumbnailConfigurationProperty.builder()
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-thumbnailconfiguration.html)
 */
@CdkDslMarker
public class CfnChannelThumbnailConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.ThumbnailConfigurationProperty.Builder =
        CfnChannel.ThumbnailConfigurationProperty.builder()

    /** @param state the value to be set. */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnChannel.ThumbnailConfigurationProperty = cdkBuilder.build()
}
