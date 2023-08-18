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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Amazon Lookout for Metrics is used as a destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * LookoutMetricsDestinationPropertiesProperty lookoutMetricsDestinationPropertiesProperty =
 * LookoutMetricsDestinationPropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-lookoutmetricsdestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowLookoutMetricsDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.LookoutMetricsDestinationPropertiesProperty.Builder =
        CfnFlow.LookoutMetricsDestinationPropertiesProperty.builder()

    /** @param object The object specified in the Amazon Lookout for Metrics flow destination. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.LookoutMetricsDestinationPropertiesProperty = cdkBuilder.build()
}
