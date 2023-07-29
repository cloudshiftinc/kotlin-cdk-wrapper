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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

/**
 * Information about a collection scheme that uses a time period to decide how often to collect
 * data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * TimeBasedCollectionSchemeProperty timeBasedCollectionSchemeProperty =
 * TimeBasedCollectionSchemeProperty.builder()
 * .periodMs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timebasedcollectionscheme.html)
 */
@CdkDslMarker
public class CfnCampaignTimeBasedCollectionSchemePropertyDsl {
    private val cdkBuilder: CfnCampaign.TimeBasedCollectionSchemeProperty.Builder =
        CfnCampaign.TimeBasedCollectionSchemeProperty.builder()

    /**
     * @param periodMs The time period (in milliseconds) to decide how often to collect data. For
     *   example, if the time period is `60000` , the Edge Agent software collects data once every
     *   minute.
     */
    public fun periodMs(periodMs: Number) {
        cdkBuilder.periodMs(periodMs)
    }

    public fun build(): CfnCampaign.TimeBasedCollectionSchemeProperty = cdkBuilder.build()
}
