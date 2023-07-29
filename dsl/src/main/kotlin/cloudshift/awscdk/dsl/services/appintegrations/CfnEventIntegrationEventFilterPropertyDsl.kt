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

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration

/**
 * The event integration filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appintegrations.*;
 * EventFilterProperty eventFilterProperty = EventFilterProperty.builder()
 * .source("source")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-eventintegration-eventfilter.html)
 */
@CdkDslMarker
public class CfnEventIntegrationEventFilterPropertyDsl {
    private val cdkBuilder: CfnEventIntegration.EventFilterProperty.Builder =
        CfnEventIntegration.EventFilterProperty.builder()

    /** @param source The source of the events. */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnEventIntegration.EventFilterProperty = cdkBuilder.build()
}
