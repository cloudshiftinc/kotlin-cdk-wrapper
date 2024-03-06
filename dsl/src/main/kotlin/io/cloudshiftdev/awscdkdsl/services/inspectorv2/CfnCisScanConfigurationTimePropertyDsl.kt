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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration

/**
 * The time.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * TimeProperty timeProperty = TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-time.html)
 */
@CdkDslMarker
public class CfnCisScanConfigurationTimePropertyDsl {
    private val cdkBuilder: CfnCisScanConfiguration.TimeProperty.Builder =
        CfnCisScanConfiguration.TimeProperty.builder()

    /** @param timeOfDay The time of day in 24-hour format (00:00). */
    public fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
    }

    /** @param timeZone The timezone. */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnCisScanConfiguration.TimeProperty = cdkBuilder.build()
}
