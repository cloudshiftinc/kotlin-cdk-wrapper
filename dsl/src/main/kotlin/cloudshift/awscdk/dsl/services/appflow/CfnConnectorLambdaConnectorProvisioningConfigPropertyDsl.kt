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
import software.amazon.awscdk.services.appflow.CfnConnector

/**
 * Contains information about the configuration of the lambda which is being registered as the
 * connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * LambdaConnectorProvisioningConfigProperty lambdaConnectorProvisioningConfigProperty =
 * LambdaConnectorProvisioningConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-lambdaconnectorprovisioningconfig.html)
 */
@CdkDslMarker
public class CfnConnectorLambdaConnectorProvisioningConfigPropertyDsl {
    private val cdkBuilder: CfnConnector.LambdaConnectorProvisioningConfigProperty.Builder =
        CfnConnector.LambdaConnectorProvisioningConfigProperty.builder()

    /** @param lambdaArn Lambda ARN of the connector being registered. */
    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    public fun build(): CfnConnector.LambdaConnectorProvisioningConfigProperty = cdkBuilder.build()
}
