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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * Filter configuration includes settings for manifest filtering, start and end times, and time
 * delay that apply to all of your egress requests for this manifest.
 *
 * </p>
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * FilterConfigurationProperty filterConfigurationProperty = FilterConfigurationProperty.builder()
 * .end("end")
 * .manifestFilter("manifestFilter")
 * .start("start")
 * .timeDelaySeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html)
 */
@CdkDslMarker
public class CfnOriginEndpointFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.FilterConfigurationProperty.Builder =
        CfnOriginEndpoint.FilterConfigurationProperty.builder()

    /**
     * @param end Optionally specify the end time for all of your manifest egress requests. When you
     *   include end time, note that you cannot use end time query parameters for this manifest's
     *   endpoint URL.</p>
     */
    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    /**
     * @param manifestFilter Optionally specify one or more manifest filters for all of your
     *   manifest egress requests. When you include a manifest filter, note that you cannot use an
     *   identical manifest filter query parameter for this manifest's endpoint URL.</p>
     */
    public fun manifestFilter(manifestFilter: String) {
        cdkBuilder.manifestFilter(manifestFilter)
    }

    /**
     * @param start Optionally specify the start time for all of your manifest egress requests. When
     *   you include start time, note that you cannot use start time query parameters for this
     *   manifest's endpoint URL.</p>
     */
    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    /**
     * @param timeDelaySeconds Optionally specify the time delay for all of your manifest egress
     *   requests. Enter a value that is smaller than your endpoint's startover window. When you
     *   include time delay, note that you cannot use time delay query parameters for this
     *   manifest's endpoint URL.</p>
     */
    public fun timeDelaySeconds(timeDelaySeconds: Number) {
        cdkBuilder.timeDelaySeconds(timeDelaySeconds)
    }

    public fun build(): CfnOriginEndpoint.FilterConfigurationProperty = cdkBuilder.build()
}
