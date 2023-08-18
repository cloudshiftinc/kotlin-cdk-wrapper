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

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Provides information about how AWS Ground Station should track the satellite through the sky
 * during a contact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * TrackingConfigProperty trackingConfigProperty = TrackingConfigProperty.builder()
 * .autotrack("autotrack")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-trackingconfig.html)
 */
@CdkDslMarker
public class CfnConfigTrackingConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.TrackingConfigProperty.Builder =
        CfnConfig.TrackingConfigProperty.builder()

    /**
     * @param autotrack Specifies whether or not to use autotrack. `REMOVED` specifies that program
     *   track should only be used during the contact. `PREFERRED` specifies that autotracking is
     *   preferred during the contact but fallback to program track if the signal is lost.
     *   `REQUIRED` specifies that autotracking is required during the contact and not to use
     *   program track if the signal is lost.
     */
    public fun autotrack(autotrack: String) {
        cdkBuilder.autotrack(autotrack)
    }

    public fun build(): CfnConfig.TrackingConfigProperty = cdkBuilder.build()
}
