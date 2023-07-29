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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * The scale-in policy for the connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * ScaleInPolicyProperty scaleInPolicyProperty = ScaleInPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-scaleinpolicy.html)
 */
@CdkDslMarker
public class CfnConnectorScaleInPolicyPropertyDsl {
    private val cdkBuilder: CfnConnector.ScaleInPolicyProperty.Builder =
        CfnConnector.ScaleInPolicyProperty.builder()

    /**
     * @param cpuUtilizationPercentage Specifies the CPU utilization percentage threshold at which
     *   you want connector scale in to be triggered.
     */
    public fun cpuUtilizationPercentage(cpuUtilizationPercentage: Number) {
        cdkBuilder.cpuUtilizationPercentage(cpuUtilizationPercentage)
    }

    public fun build(): CfnConnector.ScaleInPolicyProperty = cdkBuilder.build()
}
