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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes an potential intermediate component of a feasible path.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AlternatePathHintProperty alternatePathHintProperty = AlternatePathHintProperty.builder()
 * .componentArn("componentArn")
 * .componentId("componentId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-alternatepathhint.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisAlternatePathHintPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.AlternatePathHintProperty.Builder =
        CfnNetworkInsightsAnalysis.AlternatePathHintProperty.builder()

    /** @param componentArn The Amazon Resource Name (ARN) of the component. */
    public fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
    }

    /** @param componentId The ID of the component. */
    public fun componentId(componentId: String) {
        cdkBuilder.componentId(componentId)
    }

    public fun build(): CfnNetworkInsightsAnalysis.AlternatePathHintProperty = cdkBuilder.build()
}
