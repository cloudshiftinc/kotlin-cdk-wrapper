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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Details about an Amazon AppFlow flow datasource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * AppFlowConfigProperty appFlowConfigProperty = AppFlowConfigProperty.builder()
 * .flowName("flowName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-appflowconfig.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorAppFlowConfigPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.AppFlowConfigProperty.Builder =
        CfnAnomalyDetector.AppFlowConfigProperty.builder()

    /** @param flowName name of the flow. */
    public fun flowName(flowName: String) {
        cdkBuilder.flowName(flowName)
    }

    /**
     * @param roleArn An IAM role that gives Amazon Lookout for Metrics permission to access the
     *   flow.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnAnomalyDetector.AppFlowConfigProperty = cdkBuilder.build()
}
