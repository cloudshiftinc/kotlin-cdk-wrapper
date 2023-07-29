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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when using Trend Micro as a flow source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * TrendmicroSourcePropertiesProperty trendmicroSourcePropertiesProperty =
 * TrendmicroSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-trendmicrosourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowTrendmicroSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.TrendmicroSourcePropertiesProperty.Builder =
        CfnFlow.TrendmicroSourcePropertiesProperty.builder()

    /** @param object The object specified in the Trend Micro flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.TrendmicroSourcePropertiesProperty = cdkBuilder.build()
}
